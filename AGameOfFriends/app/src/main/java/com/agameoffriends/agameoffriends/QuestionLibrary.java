package com.agameoffriends.agameoffriends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionLibrary {
    public List<String> nQuestions = new ArrayList<>(Arrays.asList(
            "What is the first thing Player 1 touches in the morning?",
            "What does Player 1 say to get ready for whoopee?"));

    public List<List<String>> mChoices; //finish this for choices to remove some.
    public String nChoices[][] = {
            {"Their phone", "The lights", "The newspaper", "Themselves??"},
            {"My anaconda wants some of that.", "Have you ever seen the Eiffel Tower this close?",
                    "Call me Big Daddy.", "You’re kidding right?"}
    };

    List<String> nAnswers = new ArrayList<>(Arrays.asList("A) Their phone;", "NaN"));

    public void makeQuestion (String a){
        nQuestions.add(a);
    }

    public void makeChoices(String a, String b, String c, String d){

    }
    public String getQuestion (int a){
        String question = nQuestions.get(a);
        return question;
    }

    public String getChoice0(int a){
        String choice0 = nChoices[a][0];
        return choice0;
    }

    public String getChoice1(int a){
        String choice1 = nChoices[a][1];
        return choice1;
    }

    public String getChoice2(int a){
        String choice2 = nChoices[a][2];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = nChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = nAnswers.get(a);
        System.out.println(answer);
        return answer;
    }
}
