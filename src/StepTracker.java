import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.lenght; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month <= 12 & month <= 1) {
            System.out.println("Не верное значение, введите номер месяца от 1 до 12");
                    return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (month <= 30 & month <= 1) {
            System.out.println("Не верное значение, введите номер дня от 1 до 30");
                    return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (month < 0) {
            System.out.println("Не верное значение, количество шагов не может иметь отрицательное значение");
                    return;
        }

        MonthData monthData = monthtoData[month - 1];
        monthData.days[day - 1] = monthData.days[day - 1] + steps;
        System.out.println("Значение сохранено!");

    }

    void changeStepGoal() {
        System.out.println("Введите цель шагов в день:");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Выбрано некорректное значение цели");
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        // ввод и проверка номера месяца

        monthData = // получение соответствующего месяца
        int sumSteps = // получение суммы шагов за месяц
                // вывод общей статистики по дням
                // вывод суммы шагов за месяц
                // вывод максимального пройденного количества шагов за месяц
                // вывод среднего пройденного количества шагов за месяц
                // вывод пройденной за месяц дистанции в км
                // вывод количества сожжённых килокалорий за месяц
                // вывод лучшей серии
                System.out.println(); //дополнительный перенос строки
    }

}