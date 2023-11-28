public class CreditPaymentService {

    //public int calculate(int S, double P, int N) {
    // S - сумма кредита;
    // P - размер годовой процентной ставки;
    // N - количество месяцев, в течении которых проводятся выплаты
    public int calculate(int summCredit, double annualInterestRate, int creditTerm) {

        // double Se;
        double annuityPayment;
        // Se = S * P / 12 * (Math.pow((1 + P / 12), N)) / (Math.pow((1 + P / 12), N-1));
        annuityPayment = summCredit * ((annualInterestRate / 12 /100 *
                Math.pow((1 + annualInterestRate / 12/100), creditTerm)) /
                (Math.pow((1 + annualInterestRate / 12/100), creditTerm) - 1));

        // Х = С * К, К = М * (1 + М) ^ S / ((1 + М) ^ S — 1)
        // M = Mc / 12 - годовая процентная ставка по кредиту,
        // где, annuity payment — аннуитетный платеж,
        //     summCredit — сумма кредита,
        //     К — коэффициент аннуитета,
        //     monthlyInterestRate — месячная процентная ставка по кредиту,
        //     credit term — срок кредита в месяцах.

        //return (int) Se;
        return (int) annuityPayment;
    }

}
