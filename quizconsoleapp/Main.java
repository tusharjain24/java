package quizconsoleapp;

import quizconsoleapp.services.QuestionService;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
    }
}
