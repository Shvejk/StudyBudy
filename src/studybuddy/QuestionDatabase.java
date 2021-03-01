package studybuddy;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class QuestionDatabase {

    Map<String, String> questionAndAnswerMap;
    ArrayList<Question> questions;

    public QuestionDatabase() {
        questionAndAnswerMap = new HashMap();
        questions = new ArrayList();
    }
    
    public ArrayList<Question> getQuestions() {
        return this.questions;
    } 

    public void addQuestion(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questionAndAnswerMap.put(question, answer);
        questions.add(newQuestion);
    }

    public void printQuestions() {
        if (questions.isEmpty()) {
            System.out.println("No questions in database!!");
        } else {
            for (Question question : questions) {
                System.out.println(question);
            }
        }
    }
}
