package model;

import java.util.Date;

public class Product {
    private int id;
    private String name;
//    private String vendor;
    private String description;
    private long price;

    public Product(int id, String name, String description, long price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getVendor() {
//        return vendor;
//    }
//
//    public void setVendor(String vendor) {
//        this.vendor = vendor;
//    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
