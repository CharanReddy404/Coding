package com.company;

public class Main {

    public static void main(String[] args) {
        String name ;
        int position;
        int score;
        int finalScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Charan", finalScore);

        finalScore = calculateHighScorePosition(900);
        displayHighScorePosition("Cherry", finalScore);

        finalScore = calculateHighScorePosition(400);
        displayHighScorePosition("Lucky", finalScore);

        finalScore = calculateHighScorePosition(50);
        displayHighScorePosition("Reddy", finalScore);

    }

    public static void displayHighScorePosition(String name, int finalScore){
        System.out.println(name+" managed ot get into position #"+finalScore+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
//        if(score>=1000){
//            System.out.println("the score is grater than 1000");
//            return 0;
//        }else if(score>=500 && score<1000){
//            System.out.println("the score is lesser than 1000 and greater than 500 ");
//            return 0;
//        }else if(score>=100 && score=500){
//            System.out.println("the score is lesser than 500 and greater than 100");
//            return 0;
//        }else if(score<100){
//            System.out.println("the score is lesser than 100");
//            return 0;
//        }else {
//            System.out.println("Invalid Score!!");
//            return 0;
//        }

        if(score>=1000){
            return 1;
        }else if(score>=500){
            return 2;
        }else if(score>=100){
            return 3;
        }else {
            return 4;
        }
    }
}
