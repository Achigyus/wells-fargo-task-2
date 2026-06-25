package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolio_id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date created_at;

    @Column()
    private String description;

    protected Portfolio() {

    }

    public Portfolio(Client client, String description) {
        this.client = client;
        this.created_at = new Date();
        this.description = description;
    }

    public Long getPortfolioId() {
        return this.portfolio_id;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreated_at(Date date) {
        this.created_at = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
