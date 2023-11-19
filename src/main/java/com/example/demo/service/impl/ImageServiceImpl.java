package com.example.demo.service.impl;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.demo.entity.Image;
import com.example.demo.repository.ImageRepository;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageRepository repository;
    @Autowired
    //Cloudinary
    private Cloudinary cloudinary;


    @Override
    public Boolean deleteImage(Long id) {
        Image image = repository.findById(id).orElse(null);

        if (image != null) {
            try {
                cloudinary.uploader().destroy(image.getPublicId(), ObjectUtils.emptyMap());
                repository.delete(image);
            } catch (IOException e) {
                e.printStackTrace();
            }
            repository.delete(image);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Map<?, ?> upload(MultipartFile file, String foder) throws IOException {
        Map<?, ?> uploadResult = new HashMap<>();
        if (file.isEmpty()) return uploadResult;
        Map<String, Object> params = ObjectUtils.asMap("folder", foder);
         uploadResult = cloudinary.uploader().upload(file.getBytes(), params);
        return uploadResult;
    }

    @Override
    public List<Image> getListanh(Long id) {
        return repository.getListAnh(id);
    }

}
