public class CreditPaymentService {

    //public int calculate(int S, double P, int N) {
    // S - сумма кредита;
    // P - размер годовой процентной ставки;
    // N - количество месяцев, в течении которых проводятся выплаты
    public int calculate(int C, double M, int S) {

       // double Se;
        double X;
        // Se = S * P / 12 * (Math.pow((1 + P / 12), N)) / (Math.pow((1 + P / 12), N-1));
        X = C * ((M * (Math.pow((1 + M), S)))/(Math.pow((1 + M), S - 1)));
        // Х = С * К, К = (М * (1 + М) ^ S) / ((1 + М) ^ S — 1)
        // где X — аннуитетный платеж,
        //     С — сумма кредита,
        //     К — коэффициент аннуитета,
        //     М — месячная процентная ставка по кредиту,
        //     S — срок кредита в месяцах.

        //return (int) Se;
        return (int) X;
    }

}
