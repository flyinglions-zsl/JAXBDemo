package com.xml.entity;

import com.xml.adapter.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.util.Date;

@XmlType(propOrder = {"shopName","orderNumber","price","purDate","amount","customer"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Order{


    private String shopName;

    @XmlAttribute
    private String orderNumber;

    private String price;

    @XmlJavaTypeAdapter(value = DateAdapter.class)
    private Date purDate;

    private Integer amount;

    private Customer customer;

    public Order(String shopName, String orderNumber, String price, Date purDate, Integer amount, Customer customer) {
        this.shopName = shopName;
        this.orderNumber = orderNumber;
        this.price = price;
        this.purDate = purDate;
        this.amount = amount;
        this.customer = customer;
    }

    public Order() {
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
