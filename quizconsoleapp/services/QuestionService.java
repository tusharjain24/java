package quizconsoleapp.services;

import java.util.Scanner;
import quizconsoleapp.models.QuestionModel;

public class QuestionService {
    // We are referencing the QuestionModel class
    QuestionModel[] questions = new QuestionModel[5];
    String[] userSelections = new String[5];

    public QuestionService() {
        questions[0] = new QuestionModel(1, "What is the capital of India?",
                new String[] { "Delhi", "Mumbai", "Kolkata", "Chennai" }, "1");
        questions[1] = new QuestionModel(2, "What is the largest state in India?",
                new String[] { "Rajasthan", "Maharashtra", "Uttar Pradesh", "Madhya Pradesh" }, "1");
        questions[2] = new QuestionModel(3, "What is the smallest state in India?",
                new String[] { "Goa", "Sikkim", "Arunachal Pradesh", "Manipur" }, "1");
        questions[3] = new QuestionModel(4, "What is the most populous state in India?",
                new String[] { "Maharashtra", "Uttar Pradesh", "Bihar", "West Bengal" }, "2");
        questions[4] = new QuestionModel(5, "What is the least populous state in India?",
                new String[] { "Sikkim", "Arunachal Pradesh", "Manipur", "Mizoram" }, "Sikkim");
    }

    public void displayQuestions() {
        for (QuestionModel q : questions) {
            System.out.println(q);
            System.out.println();
        }
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (QuestionModel q : questions) {
            System.out.println("Question " + q.getQuestionId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOptions());
            System.out.println("Select the correct option: ");
            userSelections[i] = sc.nextLine();
            i++;
        }
        // Closes the scanner to avoid the resource leak warning
        sc.close();
    }

    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getCorrectAnswer().equals(userSelections[i])) {
                score++;
            }
        }
        return score;
    }

    public String displayScore() {
        return "Your score is " + calculateScore();
    }
}
