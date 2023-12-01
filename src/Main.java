public class Main {
    public static void main(String[] args) {
        //---   Задача № 1
        System.out.println("---   Задача № 1");
        int moneyAccumPerMonth = 15_000;
        float moneyAccumAmount = 0, i = 0;
        while (moneyAccumAmount < 2_459_000) {
            i++;
            moneyAccumAmount += moneyAccumAmount * 0.01 + moneyAccumPerMonth;
            System.out.println("Месяц " + (int) i + ", сумма накоплений равна " + moneyAccumAmount);
        }
        System.out.println();

        //---   Задача № 2
        System.out.println("---   Задача № 2");
        int j = 1;
        while (j <= 10) {
            if (j == 10) {
                System.out.println(j);
                break;
            }
            System.out.print(j + " ");
            j++;
        }
        for (; j >= 1; j--) {
            if (j == 1) {
                System.out.println(j);
                break;
            }
            System.out.print(j + " ");
        }
        System.out.println();


        //---   Задача № 3
        System.out.println("---   Задача № 3");
        long populationAmount = 12_000_000L;
        int i1 = 1, birthRate = 17, mortality = 8;
        for (; i1 <= 10; i1++) {
            populationAmount += populationAmount + (birthRate - mortality) * 12000000 / 1000;
            System.out.println("Год " + i1 + ", численность населения составляет " + populationAmount);
        }
        System.out.println();

        //---   Задача № 4
        System.out.println("---   Задача № 4");
        i = 0;
        int startMoney = 15_000;
        float moneyAccum = startMoney;
        do {
            i++;
            moneyAccum += moneyAccum * 0.07;
            System.out.println("Месяц " + (int) i + ". Сумма накоплений = " + moneyAccum);
        }
        while (moneyAccum < 12_000_000);
        System.out.println();

        //---   Задача № 5
        System.out.println("---   Задача № 5");
        i = 0;
        int startMoneyTsk5 = 15_000;
        float moneyAccumTsk5 = startMoneyTsk5;
        do {
            i++;
            moneyAccumTsk5 += moneyAccumTsk5 * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + (int) i + ". Сумма накоплений = " + moneyAccumTsk5);
            }
        }
        while (moneyAccumTsk5 < 12_000_000);
        System.out.println();

        //---   Задача № 6
        System.out.println("---   Задача № 6");
        int startMoneyTsk6 = 15_000, moneyAccumTsk6 = startMoneyTsk6;
        i = 1;
        for (; i <= 108; i++) {
            moneyAccumTsk6 += moneyAccumTsk6 * 0.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + (int) i + ". Сумма накоплений = " + moneyAccumTsk6);
            }
        }
        System.out.println();

        //---   Задача № 7
        System.out.println("---   Задача № 7");
        for (int i2 = 5; i2 <= 31; i2 += 7) {
            System.out.println("Сегодня пятница " + i2 + "е. Необходимо подготовить отчет.");
        }
        System.out.println();

        //---   Задача № 8
        System.out.println("---   Задача № 8");
        int currentYear = 2023;
        for (int i3 = currentYear - 200; i3 <= currentYear + 100; i3++) {
            if (i3 % 79 == 0) {
                System.out.println(i3);
            }
        }
        System.out.println();

    }
}