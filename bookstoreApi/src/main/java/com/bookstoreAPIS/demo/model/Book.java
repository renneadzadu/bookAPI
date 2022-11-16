package com.bookstoreAPIS.demo.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String authorName;
    private  String bookDescription;
    private Double price;
    private String image;
    private String stock;
    private String sku;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;


    public Book() {

    }

    public Book(Long id, String title, String authorName, String bookDescription, Double price, String image, String stock, String sku, Category category) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.bookDescription = bookDescription;
        this.price = price;
        this.image = image;
        this.stock = stock;
        this.sku = sku;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", stock='" + stock + '\'' +
                ", sku='" + sku + '\'' +
                ", category=" + category +
                '}';
    }
}
