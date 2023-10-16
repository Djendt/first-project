public class Converter {
    int kmInCm = 100000;
    int stepInCm = 75;
    int caloriesInOneKilocalorie = 1000;
    int stepInCalories = 50;
    int convertToKm(int steps) {
        int convertToKm = steps * stepInCm / kmInCm;
        return convertToKm;
    }

    int convertStepsToKilocalories(int steps) {
        int convertStepsToKilocalories = steps * stepInCalories / caloriesInOneKilocalorie;
        return convertStepsToKilocalories;
    }
}