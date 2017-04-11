package com.example.denis.myapplication.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by denis on 4/11/17.
 */
@DatabaseTable
class Answer {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "id q", foreign = true)
    private Question question;
    @DatabaseField
    private String value;
    @DatabaseField
    private boolean correct;

    public Answer(){
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Question getQuestion(){
        return question;
    }

    public void setQuestion(Question question){
        this.question = question;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public boolean getCorrect(){
        return correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question=" + question +
                ", value='" + value + '\'' +
                ", correct=" + correct +
                '}';
    }

    public void setCorrect(boolean correct){
        this.correct =correct;
    }
}
