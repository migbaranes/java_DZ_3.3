public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate(1_000_000, 9.99, 12));
        System.out.println();
        System.out.println(service.calculate(1_000_000, 9.99, 24));
        System.out.println();
        System.out.println(service.calculate(1_000_000, 9.99, 36));
        // S - сумма кредита (рублей);
        // P - размер годовой процентной ставки (%);
        // N - количество месяцев, в течении которых проводятся выплаты.


    }
}