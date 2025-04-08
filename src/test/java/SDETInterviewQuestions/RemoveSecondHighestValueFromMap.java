package SDETInterviewQuestions;

import java.util.*;

public class RemoveSecondHighestValueFromMap {
    public static void removeSecondHighestValueFromMap(HashMap<String, Integer> map){
        if (map.size()<=2){
            System.out.println("Map is having only Two values");
            return;
        }
        List<Integer> values =  new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        int secondHighest = values.get(1);
        for (Map.Entry<String,Integer> entry: map.entrySet()){
            if (entry.getValue().equals(secondHighest)){
                map.remove(entry.getKey());
                break;
            }

        }
        System.out.println("After Removing the Second Highes values "+ map);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ramana", 10);
        map.put("Sanju", 90);
        map.put("Mahi", 70);
        map.put("Rammi",80);
        System.out.println("Given Map is "+ map);
        removeSecondHighestValueFromMap(map);

    }
}
