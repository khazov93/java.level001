package src.Lesson06;

 // родитильский класс
public abstract class Animals
{
    protected String name;
    protected String voice;
    protected int maxDistanceRun;
    protected int maxDistanceSwim;

    public Animals (String name, int maxDistanceRun,
                   int maxDistanceSwim)
    {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }

    // методы
    public void speak()
    {
        System.out.println(name + " says " + voice);
    } // звуки животных

    public abstract void run (int distanceRun); // бег

    public abstract void swim (int distanceSwimming); // плавание

}

