public class Main {
    public static void main(String[] args) {
        int balans = 154;
        int popol = 1900;
        int itogbal;

        if (popol <= 100) {
            itogbal = balans + popol;
            System.out.println("Начальный баланс " + balans + " рублей");
            System.out.println("Пополение баланса " + popol + " рублей");
            System.out.println("Итоговый баланс = " + itogbal + " рублей");
        } else {
            int raschet;
            raschet = popol / 100;
            itogbal = balans + popol + raschet;
            System.out.println("Начальный баланс " + balans + " рублей");
            System.out.println("Пополение баланса " + popol + " рублей");
            System.out.println("Итоговый баланс = " + itogbal + " рублей");
        }
    }
}



