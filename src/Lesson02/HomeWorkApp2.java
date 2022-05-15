package Lesson02;

public class HomeWorkApp2
{

    public static void main (String[] args)
    {
        System.out.println (checkSum(10, 3));
        checkNumber1(0);
        System.out.println (checkNumber2(-5));
        counter("kyky", 5);
        visokosniy();
    }

    public static boolean checkSum(int a, int b)
    {
        int result = a + b;
        if (result >= 10 && result <= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void checkNumber1(int a)
    {
        if (a>=0)
        {
            System.out.println("POSITIVE");
        }
          else
          { System.out.println("NEGATIVE");
            }
    }

    public static boolean checkNumber2(int a)
    {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void counter (String stroka, int chislo)
    {
        for (int i = 1; i < chislo; i++ )
        { System.out.println(stroka);}

    }

        public static void visokosniy()
        {
            int i = 2016;
            if (i % 4 == 0)
            {
                if ((i % 100 != 0) || (i % 400 == 0))
                {
                    System.out.println("VISOKOSNIY");
                }

            }
            else {
                System.out.println("NE VISOKOSNIY");
            }
        }


}
