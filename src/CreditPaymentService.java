public class CreditPaymentService {
    public double calculate(double creditAmount, int time) {
        double percent = 9.99;
        double monthlyPercent = percent / (100 * 12);
        double pow = Math.pow((1 + monthlyPercent), time);
        double monthlyPayment = creditAmount * ((monthlyPercent * pow) / (pow - 1));
        // double monthlyPayment = creditAmount * (monthlyPercent / (1 - (Math.pow((1 + monthlyPercent), -time))));
        return monthlyPayment;
    }
}
