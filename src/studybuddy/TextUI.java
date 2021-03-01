package studybuddy;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    Scanner scanner;
    Topic questionDatabase;

    public TextUI(Scanner scanner, Topic questionDatabase) {
        this.scanner = scanner;
        this.questionDatabase = questionDatabase;
    }

    public void start() {
        while (true) {

            String command = readString(commandList());

            if ("x".equals(command)) {
                goodbyeMessage();
                break;
            }

            switch (command) {
                case "1":
                    addQuestion();
                    break;
                case "2":
                    printQuestions();
                    break;
                case "3":
                    printRandomList();
                    break;
                default:
                    invalidCommand();
                    break;
            }

        }
    }
    
    private void goodbyeMessage() {
        System.out.println("\nThank you for playing!!\n");
    }

    private String commandList() {
        return "Please choose a valid command:\n\n"
                + "[1] Enter question\n"
                + "[2] List questions\n"
                + "[3] Randomize question list\n"
                + "[x] Exits program\n\n>";
    }

    private void addQuestion() {
        String question = readString("\nEnter a question: ");
        String answer = readString("Enter the answer: ");
        questionDatabase.addQuestionToTopic(question, answer);
        System.out.println("");
    }

    private void printQuestions() {
        System.out.println("");
        questionDatabase.printTopicQuestions();
        System.out.println("");
    }

    private void invalidCommand() {
        System.out.println("\nInvalid Command!!!\n");
    }

    private void printRandomList() {
        System.out.println("");
        if (questionDatabase.getTopicQuestions().isEmpty()) {
            System.out.println("List is empty!");
        } else {
            ArrayList<Question> randomList = QuestionRandomizer.shuffle(questionDatabase.getTopicQuestions());
            for (Question q : randomList) {
                System.out.println(q);
            }
        }
        System.out.println("");
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
