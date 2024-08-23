public class BmiService {
    public static int calculate(double heightm, int weightkg) {
        double bmi = weightkg / (heightm * heightm);
        return (int) bmi;
    }
}

