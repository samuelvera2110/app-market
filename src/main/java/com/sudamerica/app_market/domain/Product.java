package com.sudamerica.app_market.domain;

import lombok.Data;

@Data
public class Product {

    private Integer productId;
    private String name;
    private Integer categoryId;
    private Double price;
    private Integer stock;
    private Boolean active;
    private Category category;

}
