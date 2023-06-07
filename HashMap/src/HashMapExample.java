import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> examScores = new HashMap<String, Integer>();

        // To add key, value pair in HashMap HashMap.put method can be used
        examScores.put("a",10);
        examScores.put("b",12);

        examScores.put("c",15);
        System.out.println(examScores);
        examScores.put("c",16); // It will replace the old value
        System.out.println(examScores);
        System.out.println(examScores.toString());

        // To get the value against a key
        System.out.println(examScores.get("a")); // output: 10
        System.out.println(examScores.get("d")); // it will throw an exception if an Error occurs

        // Try to get value with a default value if key does not exists
        System.out.println(examScores.getOrDefault("d",-1));


        // HashMap.putIfAbsent(key,value) put only if the key does not already exists
        examScores.putIfAbsent("a",-1);
        System.out.println(examScores);

        // HashMap.replace() method to update the value of the key
        examScores.replace("g",-1);
        System.out.println(examScores);

        // HashMap.containsKey to check if the dict contains the specific key or not
        System.out.println(examScores.containsKey("a"));
        // HashMap.containsValue to check if the dict contains the specific value or not
        System.out.println(examScores.containsValue(16));

        // HashMap.size() to calculate the size of the HashMap
        System.out.println(examScores.size());


        // for each loop to iterate over the dict
        for(Map.Entry<String, Integer>  entry: examScores.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key+":"+value);
        }

        System.out.println("Using HashMap.forEach() method to iterate over the map");
        // HashMap.forEach() method is more efficient way to iterate over the HashMap
        examScores.forEach((key,value) ->{
            System.out.println(key+":"+value);
            // update the vale
            examScores.replace(key,value*10);
        });

        System.out.println("Updated Map:\n"+examScores);

        // HashMap.remove to delete an element from the
        System.out.println(examScores.remove("a"));
        System.out.println(examScores);

        //  to remove all the elements in the HashMap use HashMap.clear()
        examScores.clear();
        System.out.println(examScores);


    }
}
