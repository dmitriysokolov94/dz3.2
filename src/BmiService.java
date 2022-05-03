public class BmiService {
    public double calculate(int weight, int growth) {
        double growthMetr = growth / 100.0;
        double total = weight / (growthMetr * growthMetr);
        return total;
    }
}