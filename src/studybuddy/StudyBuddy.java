package studybuddy;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class StudyBuddy {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Map<String, String> questionAndAnswerMap = new HashMap();
        
        questionAndAnswerMap.put("cow", "moo");
        questionAndAnswerMap.put("cat", "meow");
        questionAndAnswerMap.put("dog", "woof");
        questionAndAnswerMap.put("bird", "tweet");
        questionAndAnswerMap.put("pig", "oink");
        
        
        System.out.println(questionAndAnswerMap);
        
        System.out.println("");
        */
        
        Scanner scanner = new Scanner(System.in);
        QuestionDatabase questionDatabase = new QuestionDatabase();
        TextUI ui = new TextUI(scanner, questionDatabase);
        ui.start();
        
        
    }
    
}
