package Lesson01;

public class HomeWorkApp {

    public static void main (String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign()
    {
        int a = 10;
        int b = 20;
        int result = a + b;

        if (result >= 0)
        { System.out.println("Summa polojitelnaya");
        }
        else { System.out.println("Summa otricatelnaya");
            }
    }
    public static void printColor()
    {
        int value = 101;

        if (value <= 0) { System.out.println("RED");}
        if (value > 0 && value <=100) { System.out.println("YELLOW"); }
        if (value > 100) { System.out.println("GREEN"); }

    }
    public static void compareNumbers() {
        int a = 6;
        int b = 10;
        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else
        {
            System.out.println("a < b");
        }
    }

}
