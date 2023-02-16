public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" ");
        System.out.println("Задание 1");
        byte byteAmount = 127;
        System.out.println("Значение переменной byteAmount с типом byte равно " + byteAmount);
        short shortAmount = 32767;
        System.out.println("Значение переменной shortAmount с типом short равно " + shortAmount);
        int intAmount = 2147483647;
        System.out.println("Значение переменной intAmount с типом int равно " + intAmount);
        long longAmount = 9223372036854775807L;
        System.out.println("Значение переменной longAmount с типом long равно " + longAmount);
        float floatAmount = 340282356779733661637539395458142568441.321F;
        System.out.println("Значение переменной floatAmount с типом float равно " + floatAmount);
        double doubleAmount = 34028235677973366163753939545814256844942176543265436958436258943627965.321D;
        System.out.println("Значение переменной doubleAmount с типом double равно " + doubleAmount);
    }
    public static void task2(){
        float floNumber = 27.12F;
        long lonNumber = 987678965549L;
        double douNumber = 2.786;
        char chaNumber = 569;
        short shoNumber = -159;
        int intNumber = 27897;
        byte bitNumber = 67;
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Задание 3");
        byte ludmilaClass = 23;
        byte annaClass = 27;
        byte ekaterinaClass = 30;
        int paper = 480;
        int forOne = paper / (ludmilaClass+ annaClass + ekaterinaClass);
        System.out.println("На каждого ученика рассчитано " + forOne + " листов бумаги");
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Задание 4");
        byte bottleForMin = 16/2;
        int firstTime = 20 * bottleForMin;
        System.out.println("За 20 минут машина произвела " + firstTime + " штук бутылок");
        int secondTime = 24 * 60 * bottleForMin;
        System.out.println("За сутки машина произвела " + secondTime + " штук бутылок");
        int thirdTime = 24 * 3 * 60 * bottleForMin;
        System.out.println("За 3 суток машина произвела " + thirdTime + " штук бутылок");
        int fourthTime = 28*24*60*bottleForMin; // 1 месяц какой ?? не хочу брать 30 или 31, а вот возьму февраль.
        System.out.println("За Февраль машина произвела " + fourthTime + " штук бутылок");
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Задание 5");
        byte allTins = 120; // 120 банок с белой и коричневой краской на всю школу.
        int classesInSchool = allTins / 6; // Количество классов в школе.
        // так как на один класс идет 2 белой и 4 коричневых, то выходит это соотношение 1/3 белой и 2/3 коричневой краски на весь класс.
        int tinOfWithePaint = allTins/3; // вся белая краска
        int tinOfBrownPaint = allTins/3*2; // вся коричневая краска
        System.out.println("В школе, где "+classesInSchool+" классов, нужно "+tinOfWithePaint+" банок белой краски и "+tinOfBrownPaint+" банок коричневой краски");
    }
    public static void task6(){
        System.out.println(" ");
        System.out.println("Задание 6");
        //Бананы — 5 штук (1 банан — 80 грамм).
        byte weightBanana = 80;
        byte countBanana = 5;
        //Молоко — 200 мл (100 мл = 105 грамм).
        byte countMilk = 2;
        byte weightMilk = 105;
        //Мороженое-пломбир — 2 брикета по 100 грамм.
        byte weightIceCream = 100; // 1 брикет 100 грамм
        byte countIceCream = 2;
        //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        byte weightEgg = 70; // 1 яйцо — 70 грамм
        byte countEgg = 4;
        int sportsBreakfast = (weightBanana * countBanana)+(weightMilk*countMilk)+(weightIceCream*countIceCream)+(weightEgg*countEgg);
        double sportsBreakfastInKg = sportsBreakfast / 1000D;
        System.out.println("Вес спортивного завтрака составляет "+sportsBreakfast+"гр. или " + sportsBreakfastInKg +"кг." );
    }
    public static void task7(){
        System.out.println(" ");
        System.out.println("Задание 7");
        int excessWeightInKg = 7;
        double weightLossInDayMin = 0.250D;
        double weightLossInDayMax = 0.500D;
        double minFrameTime = excessWeightInKg / weightLossInDayMax;
        double maxFrameTime = excessWeightInKg / weightLossInDayMin;
        double averageTime = (minFrameTime+maxFrameTime) /2;
        System.out.println("Спортсмену чтобы добиться результата похудения потребуется от "+(int)minFrameTime+" до "+(int)maxFrameTime+" дней. В среднем "+(int)averageTime+ " день.");
    }
    public static void task8(){
        System.out.println(" ");
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        double indexing = 0.1;
        double newSalaryMasha = salaryMasha+(salaryMasha*indexing);
        int oldAnnualIncome = salaryMasha * 12;
        int newAnnualIncome = (int)newSalaryMasha * 12;
        int difAnnualIncomeMasha = newAnnualIncome % oldAnnualIncome;
        System.out.println("Маша теперь получает "+(int)newSalaryMasha+" рублей. Годовой доход вырос на "+difAnnualIncomeMasha+" рублей");
        int salaryDenis = 83690;
        double newSalaryDenis = salaryDenis+(salaryDenis*indexing);
        int oldAnnualIncomeDenis = salaryDenis * 12;
        int newAnnualIncomeDenis = (int)newSalaryDenis * 12;
        int difAnnualIncomeDenis = newAnnualIncomeDenis % oldAnnualIncomeDenis;
        System.out.println("Денис теперь получает "+(int)newSalaryDenis+" рублей. Годовой доход вырос на "+difAnnualIncomeDenis+" рублей");
        int salaryKristine = 76230;
        double newSalaryKristine = salaryKristine+(salaryKristine*indexing);
        int oldAnnualIncomeKristine = salaryKristine * 12;
        int newAnnualIncomeKristine = (int)newSalaryKristine * 12;
        int difAnnualIncomeKristine = newAnnualIncomeKristine % oldAnnualIncomeKristine;
        System.out.println("Кристина теперь получает "+(int)newSalaryKristine+" рублей. Годовой доход вырос на "+difAnnualIncomeKristine+" рублей");
    }
}