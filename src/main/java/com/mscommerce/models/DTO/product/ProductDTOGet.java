package com.mscommerce.models.DTO.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTOGet {

    private Integer id;

    private String name;

    private String description;

    private String image;

    private Integer year;

    private Double price;

    private Integer stock;

    private String nameWinery;

    private String nameVariety;

    private String nameType;

}
