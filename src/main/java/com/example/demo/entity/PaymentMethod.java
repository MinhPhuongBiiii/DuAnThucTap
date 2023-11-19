package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "PaymentMethods")

public class PaymentMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "paymentMethod", cascade = CascadeType.ALL)
    private Set<Invoice> invoices;

    @Column(name = "method_name",columnDefinition = ("nvarchar(255)"))
    private String methodName;

    @Column(name = "description",columnDefinition = ("nvarchar(255)"))
    private String description;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "edit_date")
    private Date editDate;

    @Column(name = "status",columnDefinition = ("nvarchar(255)"))
    private String status;
}
