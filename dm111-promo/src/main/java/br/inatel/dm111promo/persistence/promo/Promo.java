package br.inatel.dm111promo.persistence.promo;

import java.util.List;

public class Promo {
    private String id;
    private String name;
    private String starting;
    private String expiration;
    private List<String> productsForYou;
    private List<String> products;

    public Promo() {
    }

    public Promo(String id, String name, String starting, String expiration, List<String> productsForYou, List<String> products) {
        this.id = id;
        this.name = name;
        this.starting = starting;
        this.expiration = expiration;
        this.productsForYou = productsForYou;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarting() {
        return starting;
    }

    public void setStarting(String starting) {
        this.starting = starting;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public List<String> getProductsForYou() {
        return productsForYou;
    }

    public void setProductsForYou(List<String> productsForYou) {
        this.productsForYou = productsForYou;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
