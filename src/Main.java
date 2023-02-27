public class Main {
    public static void main(String[] args) {
        int initAmount = 250;
        int deposit = 1200;
        int bonusThreshold = 1000;
        int bonusStep = 100;
        int bonusAmount = 1;
        int bonus = 0;

        if (deposit > bonusThreshold) {
            bonus = (deposit / bonusStep) * bonusAmount;
        }

        int totalAmount = initAmount + deposit + bonus;


        System.out.println("Сумма пополнения: " + deposit + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговый счёт: " + totalAmount + " руб.");
    }
}