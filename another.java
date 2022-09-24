import java.util.*;


public class Shortt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Short> ls = new ArrayList<>();
        Set<Integer> si = new HashSet<>();
        for (int i = 0; i<5; i++){
            Short x = scanner.nextShort();
            ls.add(x);
        }
        ls.stream()
                .filter(n -> n > 10).mapToInt(Short::intValue)
                .forEachOrdered(si::add);
        for (int i = 0; i<15; i++){
            Integer y = scanner.nextInt();
            si.add(y);

        System.out.println(si);
        }
    }
}
