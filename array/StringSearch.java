import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String name = "shubham Gupta";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(search(name, ' '));
    }

    static int search(String str, char target) {
        int count = -1;

        for (char ch : str.toCharArray()) {
            count++;
            if (ch == target)
                return count;
        }
        return -1;
    }
}
