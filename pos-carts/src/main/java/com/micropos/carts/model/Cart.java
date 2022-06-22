package com.micropos.carts.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart implements Serializable {

    private List<Item> items = new ArrayList<>();
    public List<Item> getItems() {
        return items;
    }
    public Item getItem(String id) {
        for(Item i : items) {
            if(i.getProduct().getId().equals(id)) {
                return i;
            }
        }
        return null;
    }
    public boolean emptyList() {
        items.clear();
        return true;
    };

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
        }
        return total;
    }

}
