package com.xml.entity;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Set;

@XmlType(name="shop",propOrder = {"name","number","describe","address","orders"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlRootElement(name = "MyShop",namespace = "http://www.zsl.com/")
public class Shop{

    @XmlAttribute
    private String name;

    @XmlElement(name = "count")
    private String number;

    @XmlElement
    private String describe;

    @XmlElementWrapper(name = "orders")
    @XmlElement(name = "order")
    private Set<Order> orders;

    @XmlElement
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shop(String name, String number, String describe,  Address address) {
        this.name = name;
        this.number = number;
        this.describe = describe;
        this.address = address;
    }

    public Shop() {
    }
}
