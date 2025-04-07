import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next().toUpperCase();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < temp.length(); i++) {
            list.add(temp.charAt(i));
        }
        Collections.sort(list);
        Set<Character> set = new HashSet<>(list);
        List<Character> setList = new ArrayList<>(set);

        Map<Character, Integer> map = new HashMap<>();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < set.size(); i++) {
            map.put(setList.get(i), Collections.frequency(list, setList.get(i)));
        }
        if (set.size() == 1) {
            System.out.println(setList.get(0));
        } else {
            int num = Collections.max(map.values());
            for (Character key : map.keySet()) {
                if (map.get(key).equals(num)) {
                    characterList.add(key);
                }
            }
            if (characterList.size() > 1) {
                System.out.println("?");
            } else {
                System.out.println(characterList.get(0));
            }
        }


    }
}