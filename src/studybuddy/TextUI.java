package studybuddy;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {

    Scanner scanner;
    QuestionDatabase questionDatabase;

    public TextUI(Scanner scanner, QuestionDatabase questionDatabase) {
        this.scanner = scanner;
        this.questionDatabase = questionDatabase;
    }

    public void start() {
        while (true) {

            String command = readString(commandList());

            if ("x".equals(command)) {
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

    private String commandList() {
        return "Please enter a valid command:\n\n"
                + "[1] Enter question\n"
                + "[2] List questions\n"
                + "[3] Randomize question list\n"
                + "[x] Exits program\n\n";
    }

    private void addQuestion() {
        String question = readString("\nEnter a question: ");
        String answer = readString("Enter the answer: ");
        questionDatabase.addQuestion(question, answer);
        System.out.println("");
    }

    private void printQuestions() {
        System.out.println("");
        questionDatabase.printQuestions();
        System.out.println("");
    }

    private void invalidCommand() {
        System.out.println("\nInvalid Command!!!\n");
    }

    private void printRandomList() {
        System.out.println("");
        if (questionDatabase.getQuestions().isEmpty()) {
            System.out.println("List is empty!\n");
        } else {
            ArrayList<Question> randomList = QuestionRandomizer.shuffle(questionDatabase.getQuestions());
            for (Question q : randomList) {
                System.out.println(q);
            }
        }
    }

    public String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
