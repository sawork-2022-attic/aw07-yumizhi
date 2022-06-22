package com.micropos.carts.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Item implements Serializable {
    private Product product;
    private int quantity;
    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
    public Item(Product product,int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

}
