public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double paymentOneYear = service.calculate(1_000_000, 12);
        System.out.println("Ваш ежемесячный платеж на год составляет " + paymentOneYear + " р.");

        double paymentTwoYear = service.calculate(1_000_000, 24);
        System.out.println("Ваш ежемесячный платеж на два года составляет " + paymentTwoYear + " р.");

        double paymentThreeYear = service.calculate(1_000_000, 36);
        System.out.println("Ваш ежемесячный платеж на три года составляет " + paymentThreeYear + " р.");

    }
}
