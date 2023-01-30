public class Main {
    public static void main(String[] args) {
        int account = 300;
        int deposit = 1300;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = account + deposit + bonus;
        System.out.print("Итоговая сумма на счете: ");
        System.out.print(totalAmount);
        System.out.println(" Руб.");
        System.out.print("Бонус за пополнение счета: ");
        System.out.print(bonus);
        System.out.print(" Руб.");

    }
}

