package com.xml.entity;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlType(propOrder = {"state","province","city","street"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class Address {

    @XmlAttribute
    private String state;

    @XmlElement
    private String province;

    @XmlElement
    private String city;

    @XmlElement
    private String street;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address() {
    }

    public Address(String state, String province, String city, String street) {
        this.state = state;
        this.province = province;
        this.city = city;
        this.street = street;
    }
}
