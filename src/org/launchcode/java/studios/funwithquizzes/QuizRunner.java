package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("1. CSS", "2. C#", "3. Java", "4. HTML"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
        Checkbox newQuestion1 = new Checkbox(2,"Which of these are object-oriented languages?", possAns1, correctAns1);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("1. JavaScript", "2. HTML", "3. COBOL", "4. Java"));
        ArrayList<Integer> correctAns2 = new ArrayList<>(Arrays.asList(3));
        MultipleChoice newQuestion2 = new MultipleChoice(1,"Which of these languages is the oldest?", 3, possAns2);
        myQuiz.addQuestion(newQuestion2);
        TrueOrFalse newQuestion3 = new TrueOrFalse(1, "Grace Hopper, was the first female computer scientist and a U.S. Navy Admiral?", true);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();
    }
}
