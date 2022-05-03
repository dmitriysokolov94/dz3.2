public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 56;
        int growth = 174;
        double bmi = service.calculate(weight, growth);
        System.out.printf("%.1f", bmi);
    }
}