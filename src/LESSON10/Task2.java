package LESSON10;
import java.util.*;
public class Task2 {
    public static void main(String[] args){
        ArrayList<String> text = new ArrayList<>(List.of("monday", "tuesday", "wednesday", "thursday", "friday",
                "saturday", "sunday", "monday", "tuesday", "wednesday", "monday", "tuesday"));

        HashSet<String > words = new HashSet<>();
        for(  String x  : text) {
            if ( ! words.contains(x)) {
                words.add(x);
            }

        }
        for(String word: words) {
            System.out.printf("New element: %s \n",word);
        }


    }
}

