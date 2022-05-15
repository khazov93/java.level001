package Lesson05;

public class HomeWork5 { public static void main(String[] args)
{

    Sotrudnick singleSotrudnick = new Sotrudnick
            (
            "Gerasim",
            "Turgenev",
            "Boatman",
            "www.mymy@net",
            "112",
            35000,
            1980
            );

    //Массив сотрудников
    Sotrudnick[] fivePersons = {singleSotrudnick,
            new Sotrudnick("Ivan", "Ivanov", "Manager",
                    "www.leningrad.ru", "499480", 540000, 1979),
            new Sotrudnick("Petr", "Petrov", "Driver",
                    "www.kyky.net", "+796065444", 38000, 1990),
            new Sotrudnick("Grigory", "Grishin", "Teacher",
                    "hohoho.com", "546785", 46000, 1975),
            new Sotrudnick("Nikolay", "Nikolaev", "Policeman",
                    "www.police.ru", "+798046785", 49000, 1989)
    };

    printSotrudnicks(fivePersons);
    getOlderSotrudnick(fivePersons, 40);


}

    // вывод всех сотрудников
    private static void printSotrudnicks(Sotrudnick[] fivePersons)
    {
        for (int i = 0; i < fivePersons.length; i++)
            System.out.println((i+1) + ") " + fivePersons[i].getInfo());
    }

    private static void getOlderSotrudnick(Sotrudnick[] fivePersons, int getAge)
    {
        for (int i = 0; i < fivePersons.length; i++)
        {
            if (fivePersons[i].getAge() > 40)
            {System.out.println((i + 1) + ")* Person older 40 years over - " + fivePersons[i].getInfo());}
        }
    }

}


