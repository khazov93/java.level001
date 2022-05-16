package src.Lesson06;

public class HomeWork06 {

    public static void main (String[] args)
    {
        Dog dog = new Dog("Bobik",34,10);

        Dog dog2 = new Dog("Muchtar", 24, 2);

        Cat cat = new Cat("Pushok", 2, 200);

        // массив из животных

        Animals [] zoo = {dog, dog2, cat};

        for (int i = 0; i < zoo.length; i++)
        {
            zoo[i].speak();
            zoo[i].run(200);
            zoo[i].swim(9);
        }

        // подсчёт животных. Сначала сложил и вывел инты, чтобы они не конкатенировались в дальнейшем

        System.out.println ( dog.dogCounter + cat.catCounter + " - total number of animals, " + " of which dogs - " + dog.dogCounter + ", " +
                " cats - " + cat.catCounter + ". "
        );

    }

}
