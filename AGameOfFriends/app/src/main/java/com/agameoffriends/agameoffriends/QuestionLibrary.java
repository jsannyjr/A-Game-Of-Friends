package com.agameoffriends.agameoffriends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionLibrary {
    //List<String> nQuestions = new ArrayList<String>();

    List<String> nQuestions = new ArrayList<String>(Arrays.asList(
                "What is the first thing Player 1 touches in the morning?",
                "What does Player 1 say to get ready for whoopee?",
                "What movie best describes Player 1’s bed skills?",
                "If Player 1 had to fight anyone, who would kick their a** the best?",
                "What would Player 1’s porn movie most likely be called?",
                "If Player 1 was a toy, how would he or she be turned on?",
                "When Player 1 was born, what was their first words?",
                "What song would describe Player 1’s dating skills? ",
                "Which of the following candies best describes Player 1's irst kiss",
                "What would Player's 1 ideal date would be?"

            ));

    public ArrayList<ArrayList<String>> mChoice = new ArrayList<ArrayList<String>>(); //finish this for choices to optimize code later;
    public ArrayList<String> singleList = new ArrayList<String>(Arrays.asList("Their phone", "The lights", "The newspaper", "Themselves??"));
    //("Their phone");

    public String nChoices[][] = {
            {"Their phone", "The lights", "The newspaper", "Themselves??"},
            {"My anaconda wants some of that.", "Have you ever seen the Eiffel Tower this close?", "Call me Big Daddy.", "You’re kidding right?"},
            {"Man of Steel", "Gone in Sixty Seconds", "Mission Impossible", "Home Alone"},
            {"Frodo", "Easter Bunny", "Jesus", "Buddha"},
            {"Return of the Tentacle Monster Part 15", "Faster and more Furious", "Coming out of the Closet", "Charlie Sheen’s Birthday"},
            {"Ride like the wind Bullseye!", "I'm always on", "Everything is awesome!!!", "Don't worry, I'm all plastic."},
            {"System.out.println('Hello World')", "10 more minutes, mom.", "Show me dem boobs", "I want my money back."},
            {"Beat It", "All By Myself","Superfreak", "Santa Claus is Coming to Town"},
            {"Starburst", "Hot Tamales", "Milk Duds", "Zero"},
            {"Netflix and Chill", "Hulu and Woohoo", "IMAX and Climax", "Buzzfeed and Bukkake"}
    };

    List<String> nAnswers = new ArrayList<>();

    public void makeQuestion (String a){
        nQuestions.add(a);
    }

    public void makeChoice(String a, String b, String c, String d){
        //nChoices
    }
    public String getQuestion (int a){
        //System.out.println(nQuestions.size());
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
