package com.example.demo.dto;

public class ProductDto {
    // 1 . malai chahine variables banauxu private
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    private String imageUrl;

    // constructor banaune
    public ProductDto(Long id , String name , Double price , Integer stock , String imageUrl){
        this.id = id;
        this.name = name ;
        this.price = price ;
        this.stock = stock;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
            return id ;
    }
    public String getName(){
        return name;
    }

    public Double getPrice() {
        return price ;
    }

    public Integer getStock() {
        return stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }



    public void setName(String name) {
        this.name =name ;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setPrice(Double price){
        this.price = price ;
    }
    public void setStock(Integer stock){
        this.stock = stock;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
