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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    private static void task6() {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        System.out.println("Вес первого боксера — " + boxer1Weight + " кг!");
        var boxer2Weight = 82.7;
        System.out.println("Вес второго боксера — " + boxer2Weight + " кг!");
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров — " + totalWeight + " кг!");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами боксеров — " + weightDifference + " кг!");

    }
    private static void task7() {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        System.out.println("Вес первого боксера — " + boxer1Weight + " кг!");
        var boxer2Weight = 82.7;
        System.out.println("Вес второго боксера — " + boxer2Weight + " кг!");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами боксеров — " + weightDifference + " кг!");
        var weightDifference1 = boxer2Weight % boxer1Weight;
        System.out.println("Разница между весами боксеров — " + weightDifference1 + " кг!");
    }
    private static void task8() {
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        System.out.println("Общее количество рабочих часов — " + totalWorkingHours + " ч");
        var workingHoursPerEmployee = 8;
        System.out.println("Каждый сотрудник посвящает работе " + workingHoursPerEmployee + " ч");
        var totalEmployees = totalWorkingHours / workingHoursPerEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");

        var totalEmployees1 = totalEmployees + 94;
        var totalWorkingHours1 = totalEmployees1 * workingHoursPerEmployee;
        System.out.println("Если в компании работает " +  totalEmployees1 + " человека, то всего " + totalWorkingHours1 + " часа работы может быть поделено между сотрудниками.");
    }
}