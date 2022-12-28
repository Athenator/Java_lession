package urok3;
import java.util.*;;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            integerList.add(index);
            integerList.add(index);
        }
        System.out.println("integerList = " + integerList);
        System.out.println("integerListNoDuble= " + unicCollection(integerList));

    }

    public static Collection unicCollection(Collection collection) {
        return new HashSet<>(collection);
    }
}
