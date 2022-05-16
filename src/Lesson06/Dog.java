package src.Lesson06;

// класс собак
public class Dog extends Animals
{

    public static int dogCounter = 0;

    public Dog (String name, int maxDistanceRun, int maxDistanceSwim)
    {
        super(name, maxDistanceRun, maxDistanceSwim);

        voice = "gav - gav";
        dogCounter++;
    }

    // методы для класса "собака"

    // бег
    @Override
    public void run(int distanceRun)
    {
        if (distanceRun > maxDistanceRun)
        {
            System.out.println(name + " cant ran more 500 meters ");
        }
        else System.out.println(name + " ran " + distanceRun + " meters.");
    }

    // плавание
    @Override
    public void swim (int distanceSwimming)
    {
        if (distanceSwimming > maxDistanceSwim)
        {
            System.out.println(name + " cant swam more 10 meters ");
        }
        else System.out.println(name + " swam " + distanceSwimming + " meters.");
    }

}
