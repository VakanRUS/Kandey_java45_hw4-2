public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("task 1");
        int toBank = 15000;
        int totalWithPercents = 0;
        int month = 0;
        while (totalWithPercents < 2_459_000) {
            totalWithPercents += toBank;
            totalWithPercents = totalWithPercents + (totalWithPercents / 100);
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
        }
        System.out.println();

        //task 2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.printf(j + " ");
        }
        System.out.println();
        System.out.println();

        //task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int year = 2025; // Текущий год
        for (i = 1; i <= 10; i++) {
            year++; // нас интересуют результаты в следующем году, поэтому сразу плюсуем год
            population = population + ((population * 17) / 1000) - ((population * 9) / 1000);
            System.out.println("Год " + (year) + ", численность населения составляет " + population);
        }
        System.out.println();

        //task 4
        System.out.println("task 4");
        toBank = 15000; // Переменные объявлены в примерах выше
        totalWithPercents = toBank;
        month = 1;
        while (totalWithPercents < 12_000_000) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            month++;
        }
        System.out.println();

        //task 5
        System.out.println("task 5");
        toBank = 15000; // Переменные объявлены в примерах выше
        totalWithPercents = toBank;
        month = 1;
        while (totalWithPercents < 12_000_000) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            }
            month++;
        }
        System.out.println();

        //task 6
        System.out.println("task 6");
        toBank = 15000; // Переменные объявлены в примерах выше
        totalWithPercents = toBank;
        month = 1;
        year = 1;
        while (year <= 9) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            }
            if (month % 12 == 0) {
                year++;
            }
            month++;
        }
        System.out.println();

        //task 7
        System.out.println("task 7");
        int day = 1;
        int friday = 3;
        while (day <= 31) {
            if (day == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
            day++;
        }
        System.out.println();

        //task 8
        System.out.println("task 8");
        int period = 79;
        year = 2025;
        for (i = 0; i < (year + 100); i += period) {
            if (i > (year - 200)) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}