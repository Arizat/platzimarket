package com.platzi.platzimarket.domain;

import jakarta.persistence.Entity;

@Entity
public class PurchaseItem {

    private int ProductId;
    private int productId;
    private int total;
    private boolean active;


    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
