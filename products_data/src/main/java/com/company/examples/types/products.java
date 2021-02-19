
package com.company.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PogId",
    "Supc",
    "Brand",
    "Description",
    "Size",
    "Category",
    "SubCategory",
    "Price",
    "Quantity",
    "Country",
    "SellerCode",
    "Creationtime",
    "Stock"
})
public class products {

    @JsonProperty("PogId")
    private String pogId;
    @JsonProperty("Supc")
    private String supc;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Size")
    private String size;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("SubCategory")
    private String subCategory;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("SellerCode")
    private String sellerCode;
    @JsonProperty("Creationtime")
    private Object creationtime;
    @JsonProperty("Stock")
    private Integer stock;

    @JsonProperty("PogId")
    public String getPogId() {
        return pogId;
    }

    @JsonProperty("PogId")
    public void setPogId(String pogId) {
        this.pogId = pogId;
    }

    public products withPogId(String pogId) {
        this.pogId = pogId;
        return this;
    }

    @JsonProperty("Supc")
    public String getSupc() {
        return supc;
    }

    @JsonProperty("Supc")
    public void setSupc(String supc) {
        this.supc = supc;
    }

    public products withSupc(String supc) {
        this.supc = supc;
        return this;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public products withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public products withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("Size")
    public String getSize() {
        return size;
    }

    @JsonProperty("Size")
    public void setSize(String size) {
        this.size = size;
    }

    public products withSize(String size) {
        this.size = size;
        return this;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    public products withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("SubCategory")
    public String getSubCategory() {
        return subCategory;
    }

    @JsonProperty("SubCategory")
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public products withSubCategory(String subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    @JsonProperty("Price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public products withPrice(Double price) {
        this.price = price;
        return this;
    }

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public products withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    public products withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("SellerCode")
    public String getSellerCode() {
        return sellerCode;
    }

    @JsonProperty("SellerCode")
    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public products withSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
        return this;
    }

    @JsonProperty("Creationtime")
    public Object getCreationtime() {
        return creationtime;
    }

    @JsonProperty("Creationtime")
    public void setCreationtime(Object creationtime) {
        this.creationtime = creationtime;
    }

    public products withCreationtime(Object creationtime) {
        this.creationtime = creationtime;
        return this;
    }

    @JsonProperty("Stock")
    public Integer getStock() {
        return stock;
    }

    @JsonProperty("Stock")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public products withStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pogId", pogId).append("supc", supc).append("brand", brand).append("description", description).append("size", size).append("category", category).append("subCategory", subCategory).append("price", price).append("quantity", quantity).append("country", country).append("sellerCode", sellerCode).append("creationtime", creationtime).append("stock", stock).toString();
    }

}
