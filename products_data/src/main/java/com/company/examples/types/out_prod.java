
package com.company.examples.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PogId",
    "Supc",
    "Price",
    "Quantity"
})
public class out_prod {

    @JsonProperty("PogId")
    private String pogId;
    @JsonProperty("Supc")
    private String supc;
    @JsonProperty("Price")
    private Double price;
    @JsonProperty("Quantity")
    private Integer quantity;

    @JsonProperty("PogId")
    public String getPogId() {
        return pogId;
    }

    @JsonProperty("PogId")
    public void setPogId(String pogId) {
        this.pogId = pogId;
    }

    public out_prod withPogId(String pogId) {
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

    public out_prod withSupc(String supc) {
        this.supc = supc;
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

    public out_prod withPrice(Double price) {
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

    public out_prod withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pogId", pogId).append("supc", supc).append("price", price).append("quantity", quantity).toString();
    }

}
