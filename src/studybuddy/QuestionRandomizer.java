package studybuddy;

import java.util.ArrayList;
import java.util.Random;

public class QuestionRandomizer {

    public static ArrayList<Question> shuffle(ArrayList<Question> list) {
        Random random = new Random();

        ArrayList<Question> listClone = (ArrayList<Question>) list.clone();
        ArrayList<Question> randomList = new ArrayList();
        
        // Removes a random question from cloned list and
        // adds question to randomList
        while (!listClone.isEmpty()) {
            int questionIndex = random.nextInt(listClone.size());
            Question question = listClone.get(questionIndex);
            listClone.remove(question);
            randomList.add(question);
        }
        
        return randomList;
    }
}
