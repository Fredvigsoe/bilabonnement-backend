package com.example.bilabonnementapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "car_id") // Dette er den fremmednøglekolonne i Subscription-tabellen
    private Car car;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne(mappedBy = "subscription")
    @JsonIgnore
    private DamageReport damageReport;

    //@Column(name = "dataindkoeb")
    private String buydate;

    //@Column(name = "abonnementstart")
    private String substart;

    //@Column(name = "abonnementslut")
    private String subend;

    //@Column(name = "kmkoertstart")
    private int kmstart;


    //@Column(name = "kmkoert")
    @Nullable
    private int kmdone;

    //@Column(name = "kmaftalt")
    private int kmplanned;

    //@Column(name = "abonnementsperiode")
    private int subtime;

    private int subcost;

    public Subscription(String buydate, String substart, String subend, int kmstart, int kmdone, int kmplanned, int subtime, int subcost) {
        this.buydate = buydate;
        this.substart = substart;
        this.subend = subend;
        this.kmstart = kmstart;
        this.kmdone = kmdone;
        this.kmplanned = kmplanned;
        this.subtime = subtime;
        this.subcost = subcost;
    }

    public Subscription(String buydate, String substart, String subend, int kmstart, int kmdone, int kmplanned, int subtime,int subcost, Car car) {
        this.car = car;
        this.buydate = buydate;
        this.substart = substart;
        this.subend = subend;
        this.kmstart = kmstart;
        this.kmdone = kmdone;
        this.kmplanned = kmplanned;
        this.subtime = subtime;
        this.subcost = subcost;
    }

    public Subscription(String buydate, String substart, String subend, int kmstart, int kmdone, int kmplanned, int subtime, int subcost, Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
        this.buydate = buydate;
        this.substart = substart;
        this.subend = subend;
        this.kmstart = kmstart;
        this.kmdone = kmdone;
        this.kmplanned = kmplanned;
        this.subtime = subtime;
        this.subcost = subcost;
    }

    public Subscription(String buydate, String substart, String subend, int kmstart, int kmdone, int kmplanned, int subtime, int subcost, Car car, Customer customer, DamageReport damageReport) {
        this.car = car;
        this.customer = customer;
        this.damageReport = damageReport;
        this.buydate = buydate;
        this.substart = substart;
        this.subend = subend;
        this.kmstart = kmstart;
        this.kmdone = kmdone;
        this.kmplanned = kmplanned;
        this.subtime = subtime;
        this.subcost = subcost;
    }

    public Subscription() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }

    public String getSubstart() {
        return substart;
    }

    public void setSubstart(String substart) {
        this.substart = substart;
    }

    public String getSubend() {
        return subend;
    }

    public void setSubend(String subend) {
        this.subend = subend;
    }

    public int getKmstart() {
        return kmstart;
    }

    public void setKmstart(int kmstart) {
        this.kmstart = kmstart;
    }

    public int getKmdone() {
        return kmdone;
    }

    public void setKmdone(int kmdone) {
        this.kmdone = kmdone;
    }

    public int getKmplanned() {
        return kmplanned;
    }

    public void setKmplanned(int kmplanned) {
        this.kmplanned = kmplanned;
    }

    public int getSubtime() {
        return subtime;
    }

    public void setSubtime(int subtime) {
        this.subtime = subtime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DamageReport getDamageReport() {
        return damageReport;
    }

    public void setDamageReport(DamageReport damageReport) {
        this.damageReport = damageReport;
    }

    public int getSubcost() {
        return subcost;
    }

    public void setSubcost(int subcost) {
        this.subcost = subcost;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", car=" + car +
                ", customer=" + customer +
                ", damageReport=" + damageReport +
                ", buydate='" + buydate + '\'' +
                ", substart='" + substart + '\'' +
                ", subend='" + subend + '\'' +
                ", kmstart=" + kmstart +
                ", kmdone=" + kmdone +
                ", kmplanned=" + kmplanned +
                ", subtime=" + subtime +
                ", subcost=" + subcost +
                '}';
    }
}
