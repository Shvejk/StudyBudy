package studybuddy;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Topic implements Listable {

    ArrayList<Question> questions;

    public Topic() {
        this.questions = new ArrayList();
    }
    
    public ArrayList<Question> getTopicQuestions() {
        return this.questions;
    } 

    public void addQuestionToTopic(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
    }

    public void printTopicQuestions() {
        if (questions.isEmpty()) {
            System.out.println("No questions in database!!");
        } else {
            for (Question question : questions) {
                System.out.println(question);
            }
            System.out.println("");
        }
    }

    @Override
    public void display() {
       printTopicQuestions();
    }
}
