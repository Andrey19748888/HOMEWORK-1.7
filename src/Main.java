import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        // String newName = fullName.replace("ё","е");
        String[] letters = fullName.split("");		// ["И","в", …
        String newName = "";
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals("ё")) {
                letters[i] = "е";
                newName = newName + "е";
            } else {
                newName = newName + letters[i];
            }
            System.out.println("ФИО сотрудника - " + newName + ".");

        }

    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

    }

    private static void task1() {
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName + ".");
    }
}