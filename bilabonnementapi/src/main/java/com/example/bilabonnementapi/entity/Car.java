package com.example.bilabonnementapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String img;
    //@Column(name = "bilmaerke")
    private String brand;

    //@Column(name = "model")
    private String model;

    //@Column(name = "indkoebspris")
    private int price;

    //@Column(name = "braendstof")
    private String fueltype;
    private String regNr;
    private String nummerplade;
    private Boolean isCarFree;

    @OneToMany(mappedBy = "car") // "car" refererer til feltet i Subscription-klassen
    @JsonIgnore
    private List<Subscription> subscriptions;

    public Car( String img, String brand, String model, int price, String fueltype, String regNr, String nummerplade, Boolean isCarFree) {
        this.img = img;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fueltype = fueltype;
        this.regNr = regNr;
        this.nummerplade = nummerplade;
        this.isCarFree = isCarFree;
    }

    public Car(String img, String brand, String model, int price, String fueltype, Boolean isCarFree, List<Subscription> subscriptions) {
        this.img = img;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fueltype = fueltype;
        this.isCarFree = isCarFree;
        this.subscriptions = subscriptions;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getNummerplade() {
        return nummerplade;
    }

    public void setNummerplade(String nummerplade) {
        this.nummerplade = nummerplade;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Boolean getCarFree() {
        return isCarFree;
    }

    public void setCarFree(Boolean carFree) {
        isCarFree = carFree;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fueltype='" + fueltype + '\'' +
                ", regNr='" + regNr + '\'' +
                ", nummerplade='" + nummerplade + '\'' +
                ", isCarFree=" + isCarFree +
                ", subscriptions=" + subscriptions +
                '}';
    }
}
