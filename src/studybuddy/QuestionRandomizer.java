package studybuddy;

import studybuddy.domain.Question;
import java.util.ArrayList;
import java.util.Random;
import studybuddy.domain.Listable;

public class QuestionRandomizer {

    public static ArrayList<Listable> shuffle(ArrayList<Listable> list) {
        Random random = new Random();

        ArrayList<Listable> listClone = (ArrayList<Listable>) list.clone();
        ArrayList<Listable> randomList = new ArrayList();
        
        // Removes a random question from cloned list and
        // adds question to randomList
        while (!listClone.isEmpty()) {
            int questionIndex = random.nextInt(listClone.size());
            Listable question = listClone.get(questionIndex);
            listClone.remove(question);
            randomList.add(question);
        }
        
        return randomList;
    }
}
