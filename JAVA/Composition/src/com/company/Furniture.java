package com.company;

public class Furniture {
    private String bed;
    private String table;
    private String mirror;

    public Furniture(String bed, String table, String mirror){
        this.bed = bed;
        this.table = table;
        this.mirror = mirror;
    }

    public String getBed() {
        return bed;
    }

    public String getTable() {
        return table;
    }

    public String getMirror() {
        return mirror;
    }
}
