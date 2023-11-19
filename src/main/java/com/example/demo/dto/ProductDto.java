package com.example.demo.dto;


import com.example.demo.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductDto {

    private Long id;
    private String maSp;
    private String name;
    private String image;
    private Integer quantity;
    private String status;
    private String fabric;
    private String descriptionProduct;
    private String manual;
    private String style;
    private String pattern;
    private Category category;
    private Brand brand;
    private TypeProduct typeProduct;
    private List<Image> images;
    private String qrCode;


    public ProductDto(Product x) {
        Optional<Image> img = (Optional<Image>) x.getImages().stream().findFirst();
        Image image = img.orElse(new Image(new Product(),"https://phutungnhapkhauchinhhang.com/wp-content/uploads/2020/06/default-thumbnail.jpg",""));
        this.id = x.getId();
        this.maSp = x.getMaSp();
        this.name = x.getProductName();
        this.image = image.getUrl();
        this.typeProduct = x.getTypeProduct();
        this.quantity = x.getProductDetails().stream().mapToInt(ProductDetail::getQuantity).sum();
        this.status = x.getStatus();
        this.images = x.getImages();
        this.descriptionProduct = x.getDescription().getDescriptionProduct();
        this.fabric = x.getDescription().getFabric();
        this.manual = x.getDescription().getManual();
        this.style = x.getDescription().getStyle();
        this.pattern = x.getDescription().getPattern();
        this.category = x.getTypeProduct().getCategory();
        this.brand = x.getBrand();
    }


}
