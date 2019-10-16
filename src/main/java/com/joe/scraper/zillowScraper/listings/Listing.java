package com.joe.scraper.zillowScraper.listings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="listings_tb")
public class Listing {
    @Id
    int id;
    int price;
    String street;
    String city;
    String state;
    int zipcode;
    int sqft;
    int bdr;
    int bath;
    Date dateGathered;

    public Listing(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getBdr() {
        return bdr;
    }

    public void setBdr(int bdr) {
        this.bdr = bdr;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public Date getDateGathered() {
        return dateGathered;
    }

    public void setDateGathered(Date dateGathered) {
        this.dateGathered = dateGathered;
    }
}
