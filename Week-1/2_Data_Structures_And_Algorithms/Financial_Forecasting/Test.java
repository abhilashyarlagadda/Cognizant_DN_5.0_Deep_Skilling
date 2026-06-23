public class Test {

    public static void main(String[] args) {

        double currentValue = 50000;
        double growthRate = 0.12;
        int years = 5;

        double futureValue =
                FinancialForecasting.predictFutureValue(
                        currentValue,
                        growthRate,
                        years);

        System.out.println("Current Value : " + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + futureValue);
    }
}