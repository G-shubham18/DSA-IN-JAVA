import java.util.*;

public class javaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the integer number");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.add(45);
        list.add(462);
        list.add(412);
        list.add(40);
        list.add(41);
        list.set(3, null);
        list.add(29);
        list.add(10);
        list.add(0145);
        list.add(45);
        list.add(45);
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list.size());

    }
}
