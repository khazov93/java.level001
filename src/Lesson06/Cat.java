package src.Lesson06;

// класс кошек
public class Cat extends Animals
{

    public static int catCounter = 0;

    public Cat (String name, int maxDistanceRun, int maxDistanceSwim)
    {
        super(name, maxDistanceRun, maxDistanceSwim);

        voice = "meaw - meaw";
        catCounter++;
    }

    // методы для класса "кот"

    //бег
    @Override
    public void run (int distanceRun)
    {
        if (distanceRun > maxDistanceRun)
        {
            System.out.println(name + " cant ran more 200 meters ");
        }
        else System.out.println(name + " ran " + distanceRun + " meters.");
    }

    //плавание
    @Override
    public void swim (int distanceSwimming)
    {
        if (distanceSwimming >= maxDistanceSwim)
        {
            System.out.println(name + " cant swam.");
        }

    }
}
