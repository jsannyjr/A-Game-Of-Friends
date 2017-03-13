package com.agameoffriends.agameoffriends;

import java.util.ArrayList;

public class QuestionLibrary {
    public String nQuestions[] = {
            "What is the first thing Player 1 touches in the morning?",
            "What does Player 1 say to get ready for whoopee?"
};

    public String nChoices[][] = {
            {"A) Their phone;", "B) The lights;", "C) The newspaper", "D) Themselves??"},
            {"A) My anaconda wants some of that.", "B) Have you ever seen the Eiffel Tower this close?",
                    "C) Call me Big Daddy.", "D) You’re kidding right?"}
    };

    private ArrayList <String> nAnswers = new ArrayList<>();

    public String getQuestion (int a){
        String question = nQuestions[a];
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
        return answer;
    }
}
