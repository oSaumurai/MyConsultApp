package com.kirara.consultapp.model;

import android.util.Log;

import java.util.ArrayList;

public class QuestionLists {

    public static ArrayList<Question> question_List;
//
//
//    private static final QuestionLists instance = new QuestionLists();
//    private QuestionLists(){
//        Log.d("QuestionList", "QuestionLists: created ");
//        fillQuestions();
//    }
//    public static QuestionLists getInstance(){return instance;}
//
//    public static void fillQuestions(){
//        ArrayList<String> question1 = new ArrayList<>();
//        question1.add("我现在感到放送");
//        question1.add("我现在感到开心");
//        question1.add("我现在感到满意");
//        question1.add("我现在感到热情");
//        question1.add("我现在感到孤单");
//        question1.add("我现在感到没有安全感");
//        question1.add("我现在感到焦虑");
//        question1.add("我现在感到沮丧");
//        question1.add("我现在感到内疚");
//        Question que1 = new Question(1, question1);
//        question_List.add(que1);
//    }

    public static ArrayList<Question> getQuesitonList(){
        ArrayList<Question> result = new ArrayList<>();

        ArrayList<String> question1 = new ArrayList<>();
        question1.add("我现在感到放送");
        question1.add("我现在感到开心");
        question1.add("我现在感到满意");
        question1.add("我现在感到热情");
        question1.add("我现在感到孤单");
        question1.add("我现在感到没有安全感");
        question1.add("我现在感到焦虑");
        question1.add("我现在感到沮丧");
        question1.add("我现在感到内疚");
        Question que1 = new Question(1, question1);
        result.add(que1);
        return result;
    }
}
