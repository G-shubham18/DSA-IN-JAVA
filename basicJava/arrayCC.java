public class arrayCC {

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");

        }

    }

    // update the element of array with adding index with element ;
    static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + i;
        }
    }

}
