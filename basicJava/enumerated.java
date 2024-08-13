public class enumerated {

    public enum day {
        sunday, mondey, tueday, thurstday, friday, saturday
    }

    public static void main(String[] args) {

        day today = day.sunday;
        day ram = day.tueday;
        System.out.println(today + " " + ram);

    }
}
