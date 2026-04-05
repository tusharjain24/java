package quizconsoleapp.services;

import quizconsoleapp.models.QuestionModel;

public class QuestionService {
    // We are referencing the QuestionModel class
    QuestionModel[] questions = new QuestionModel[5];

    public QuestionService() {
        questions[0] = new QuestionModel(1, "What is the capital of India?",
                new String[] { "Delhi", "Mumbai", "Kolkata", "Chennai" }, "Delhi");
        questions[1] = new QuestionModel(2, "What is the largest state in India?",
                new String[] { "Rajasthan", "Maharashtra", "Uttar Pradesh", "Madhya Pradesh" }, "Rajasthan");
        questions[2] = new QuestionModel(3, "What is the smallest state in India?",
                new String[] { "Goa", "Sikkim", "Arunachal Pradesh", "Manipur" }, "Goa");
        questions[3] = new QuestionModel(4, "What is the most populous state in India?",
                new String[] { "Maharashtra", "Uttar Pradesh", "Bihar", "West Bengal" }, "Uttar Pradesh");
        questions[4] = new QuestionModel(5, "What is the least populous state in India?",
                new String[] { "Sikkim", "Arunachal Pradesh", "Manipur", "Mizoram" }, "Sikkim");
    }

    public void displayQuestions() {
        for (QuestionModel q : questions) {
            System.out.println(q);
            System.out.println();
        }
    }
}
