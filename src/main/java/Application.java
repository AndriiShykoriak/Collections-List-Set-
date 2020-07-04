import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> listRemove = new ArrayList<>();
        listRemove.add(3);
        listRemove.add(9);
        listRemove.add(11);
        listRemove.add(18);
        listRemove.add(20);
        listRemove.add(22);
        listRemove.forEach(number -> System.out.print(" " + number));
        System.out.print("\nremove numbers which are divisible by 3\n");
        listRemove.removeIf(i -> i % 3 == 0);
        listRemove.forEach(number -> System.out.print(" " + number));

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Orange");
        fruits.add("Blueberry");
        System.out.println();
        fruits.forEach(str -> System.out.print(" " + str));
        System.out.println("\nreplace Orange on Grapefruit");
        Collections.replaceAll(fruits, "Orange", "Grapefruit");
        fruits.forEach(str -> System.out.print(" " + str));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(20d);
        doubleList.add(88.00);
        doubleList.add(34D);
        doubleList.add(100.0);
        System.out.println("\nFirst list");
        doubleList.forEach(num -> System.out.print(" " + num));

        List<Double> doubleListTwo = new ArrayList<>();
        doubleListTwo.add(20d);
        doubleListTwo.add(878.00);
        doubleListTwo.add(345.0);
        doubleListTwo.add(100.0);
        System.out.println("\nSecond list");
        doubleListTwo.forEach(num -> System.out.print(" " + num));
        System.out.println("\nSimilar elements");
        doubleList.retainAll(doubleListTwo);
        doubleList.forEach(number -> System.out.print(" " + number));

        Set<Integer> set = new TreeSet<>(new MyComparator());
        set.add(1000);
        set.add(2344);
        set.add(4563);
        set.add(34);
        set.add(456);
        set.add(5687);
        set.add(4367);
        System.out.println("\nPrint DESC TreeSet");
        set.forEach(num -> System.out.print(" " + num));
    }
}
