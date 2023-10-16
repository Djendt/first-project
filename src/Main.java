import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();
        MonthData monthData = new MonthData();
        StepTracker stepTracker = new StepTracker();

        changeStepGoal();


        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                addNewNumberStepsPerDay();
            } else if (command == 2) {

            } else if (command == 3) {

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды нет.");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выйти из приложения");
    }
}