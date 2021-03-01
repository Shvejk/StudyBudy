package studybuddy.domain;

import java.util.ArrayList;

public class Topic implements Listable {

    ArrayList<Listable> questions;

    public Topic() {
        this.questions = new ArrayList();
    }
    
    public ArrayList<Listable> getTopicQuestions() {
        return this.questions;
    } 

    public void addQuestionToTopic(String question, String answer) {
        Listable newQuestion = new Question(question, answer);
        questions.add(newQuestion);
    }

    public void printTopicQuestions() {
        if (questions.isEmpty()) {
            System.out.println("No questions in database!!");
        } else {
            for (Listable question : questions) {
                System.out.println(question);
            }
        }
    }

    @Override
    public void display() {
       printTopicQuestions();
    }
}
