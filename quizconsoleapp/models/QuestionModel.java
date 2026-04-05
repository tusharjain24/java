package quizconsoleapp.models;

import java.util.Arrays;

public class QuestionModel {
    private int questionId;
    private String question;
    private String options[];
    private String correctAnswer;

    public QuestionModel(int questionId, String question, String[] options, String correctAnswer) {
        this.questionId = questionId;
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return "option 1: " + this.options[0] + " option 2: " + this.options[1] + " option 3: " + this.options[2]
                + " option 4: " + this.options[3];
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "QuestionModel [questionId=" + questionId + ", question=" + question + ", options="
                + Arrays.toString(options) + ", correctAnswer=" + correctAnswer + "]";
    }
}
