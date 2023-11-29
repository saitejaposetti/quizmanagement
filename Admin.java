package javaproject4;

import java.util.List;
import java.util.ArrayList;
@SuppressWarnings("unused")
class Admin extends User {
// Constructor for Admin
public Admin(int userId, String username, String password) {
this.userId = userId;
this.username = username;
this.password = password;
}
public void addQuestion(Quiz quiz, String questionText, List<String> options, int
correctOptionIndex) {
Question newQuestion = new Question(quiz.getNextQuestionId(), questionText, options,
correctOptionIndex);
quiz.addQuestion(newQuestion);
}
public void updateQuestion(Quiz quiz, int questionId, String questionText, List<String>
options, int correctOptionIndex) {
Question updatedQuestion = new Question(questionId, questionText, options,
correctOptionIndex);
quiz.updateQuestion(questionId, updatedQuestion);
}
public void deleteQuestion(Quiz quiz, int questionId) {
quiz.deleteQuestion(questionId);
}
public void viewAllQuestions(Quiz quiz) {
List<Question> questions = quiz.viewAllQuestions();
for (Question question : questions) {
System.out.println("Question ID: " + question.questionId);
question.displayQuestion();
System.out.println();
}
}
}
