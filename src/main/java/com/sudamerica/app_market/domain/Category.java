package com.sudamerica.app_market.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Category {

    private int categoryId;
    private String category;
    private boolean active;

}
