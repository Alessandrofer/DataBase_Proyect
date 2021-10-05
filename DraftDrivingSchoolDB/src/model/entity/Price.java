package model.entity;

public class Price {
    private Integer idPrice;
    private Double pricePrice;

    public Price(){

    }

    public Price(Integer idPrice, Double pricePrice) {
        this.idPrice = idPrice;
        this.pricePrice = pricePrice;
    }

    public Integer getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(Integer idPrice) {
        this.idPrice = idPrice;
    }

    public Double getPricePrice() {
        return pricePrice;
    }

    public void setPricePrice(Double pricePrice) {
        this.pricePrice = pricePrice;
    }
}
