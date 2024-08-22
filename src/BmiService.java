public class BmiService {
    public static double calculateBMI(double height, double weight) {
        if (height > 0 || weight > 0) {
        }
        double bmi = weight / (height * height);

        return (int) bmi;
    }
}

