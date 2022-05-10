package com.example.mysqlite;

public class Mountain {

    private long id;
    private String name;
    private int heigt;

    public Mountain(long id, String name, int heigt) {
        this.id = id;
        this.name = name;
        this.heigt = heigt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeigt() {
        return heigt;
    }

}
