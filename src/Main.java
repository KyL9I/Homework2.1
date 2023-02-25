public class Main {
    public static void main(String[] args) {
        int check = 111;
        int refill = 2222;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        }else {
            bonus = 0;
        }
        System.out.println("Бонус =");
        System.out.println(bonus);

        int grandtotal = check + refill + bonus;
        System.out.println("Итоговый счет =");
        System.out.println(grandtotal);

    }
}