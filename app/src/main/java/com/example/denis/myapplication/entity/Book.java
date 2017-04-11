package com.example.denis.myapplication.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by denis on 4/11/17.
 */
@DatabaseTable(tableName = "book")
public class Book {
    @DatabaseField(generatedId = true)
    private String id;
    @DatabaseField(columnName = "title")
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book() {
    }
}
