public class Main {
    public static void main(String[] args) {
//task 1
        System.out.println("task 1");
        int toBank = 15000;
        int totalWithPercents = 0;
        int month = 1;
        while (totalWithPercents < 2_459_000) {
            totalWithPercents += (totalWithPercents / 100);
            totalWithPercents += toBank;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            month++;
        }
        System.out.println();

        //task 2
        System.out.println("task 2");
        int obsrve = 1;
        while (obsrve <= 10) {
            System.out.printf(obsrve + " ");
            obsrve++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--)
            System.out.printf(j + " ");
        System.out.println();
        System.out.println();

        //task 3
        System.out.println("task 3");
        int population = 12_000_000;
        int year = 2025; // Текущий год
        for (obsrve = 1; obsrve <= 10; obsrve++) {
            year++; // нас интересуют результаты в следующем году, поэтому сразу плюсуем год
            population = population + ((population * 17) / 1000) - ((population * 9) / 1000);
            System.out.println("Год " + (year) + ", численность населения составляет " + population);
        }
        System.out.println();

        //task 4
        System.out.println("task 4");
        toBank = 15000; // переменная объявлена в предыдущих примерах
        totalWithPercents = toBank; // переменная объявлена в предыдущих примерах
        month = 1; // переменная объявлена в предыдущих примерах
        while (totalWithPercents < 12_000_000) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            month++;
        }
        System.out.println();

        //task 5
        System.out.println("task 5");
        toBank = 15000; // переменная объявлена в предыдущих примерах
        totalWithPercents = toBank; // переменная объявлена в предыдущих примерах
        month = 1; // переменная объявлена в предыдущих примерах
        while (totalWithPercents < 12_000_000) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            month++;
        }
        System.out.println();

        //task 6
        System.out.println("task 6");
        toBank = 15000; // переменная объявлена в предыдущих примерах
        totalWithPercents = toBank; // переменная объявлена в предыдущих примерах
        month = 1; // переменная объявлена в предыдущих примерах
        year = 1; // переменная объявлена в предыдущих примерах
        while (year <= 9) {
            totalWithPercents += (totalWithPercents / 100) * 7;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalWithPercents + " рублей");
            if (month % 12 == 0)
                year++;
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
        year = 2025; // переменная объявлена в предыдущих примерах
        for (obsrve = 0; obsrve < (year + 100); obsrve += period) {
            if (obsrve > (year - 200))
                System.out.println(obsrve);
        }
        System.out.println();
    }
}