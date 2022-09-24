import java.util.*;

public class Zachet {
        public static void main(String[] args) {

            List<String> list = new ArrayList();
            Scanner scanner = new Scanner(System.in);
            Map<Integer, List<String>> map = new HashMap<>();
            for (int j = 0; j<4; j++){
                list.add(scanner.nextLine());
            }
            for(int i = 0; i<list.size(); i++){
                map.put(list.get(i).length(), Collections.singletonList(list.get(i)));
            }
            map.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }
