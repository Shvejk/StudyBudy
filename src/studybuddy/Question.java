package studybuddy;

public class Question {

    String question;
    String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String toString() {
        return "Q: " + this.question + " A: " + this.answer;
    }
}
