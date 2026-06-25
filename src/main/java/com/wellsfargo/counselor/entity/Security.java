package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private Long security_id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchase_date;

    @Column(nullable = false)
    private Float purchase_price;

    @Column(nullable = false)
    private Float quantity;

    protected Security () {}

    public Security(Portfolio portfolio, String name, String category, Date purchase_date, Float purchase_price, Float quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return security_id;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchase_date;
    }

    public void setPurchaseDate(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Float getPurchasePrice() {
        return purchase_price;
    }

    public void setPurchasePrice(Float purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
}
