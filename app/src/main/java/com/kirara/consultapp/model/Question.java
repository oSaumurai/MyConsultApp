package com.kirara.consultapp.model;

import java.util.ArrayList;

public class Question {
    public Question (int id, ArrayList<String> str){
        id=id;
        question=str;
    }
    public int id;
    public ArrayList<String> question;

    public ArrayList<String> getQuestion() {
        return question;
    }


}
