package com.example.denis.myapplication.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by denis on 4/11/17.
 */
@DatabaseTable
class Category {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField
    private String name;

    public Category(){
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name){
        this.name = name;
    }
}
