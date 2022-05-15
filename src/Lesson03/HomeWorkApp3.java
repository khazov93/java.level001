package Lesson03;

import javax.swing.*;
import java.sql.SQLOutput;

public class HomeWorkApp3 {

    public static void main (String[] args)
    {
        // 1. Переворот чисел в массиве

        int [] firstArray = {1, 0, 1, 0, 1, 0, 1};
        simplePrintArray(firstArray);
        simpleChangeArray(firstArray);
        simplePrintArray(firstArray);
        System.out.println("---------------------------");

        // 2. Заполнение массива числами

        int [] secondArray = new int[100];
        simpleFillingArray(secondArray);
        simplePrintArray(secondArray);
        System.out.println("---------------------------");

        // 3. Умножение чисел (меньше 6) на 2.

        int [] thirdArray = {4, 8, 3, 7, 5, 89, 2, 35, 1, 9};
        simplePrintArray(thirdArray);
        doubleNumbers(thirdArray);
        simplePrintArray(thirdArray);
        System.out.println("---------------------------");

        // 4. Заполнение двумерного массива 1 по диагонали

        int number = 5;
        int [][] fourthArray = new int [number][number];
        doubleFillingArray(fourthArray);
        printDoubleArray(fourthArray);
        System.out.println("---------------------------");

        // 5. Метод возвращающий массив со значениями

        int[] returned = returnArray(10,73);
        simplePrintArray(returned);
        System.out.println("---------------------------");

        //6. Задать массив и найти в нём минимальные и максимальные знаения

        int[] taskSix = {1, 3, 5, 6, 43, 32, 74, 29,};
        simplePrintArray(taskSix);
        findMaxMin(taskSix);
        System.out.println("---------------------------");

    }


    public static void simplePrintArray(int [] array) // вывод одномерного массива
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void printDoubleArray(int [][] doubleArray) //вывод двумерного массива
    {
        for (int i = 0; i < doubleArray.length; i++)
        {
            for (int j = 0; j < doubleArray[i].length; j++)
            {
                System.out.print(doubleArray[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // 1. Замена чисел 1 на 0
        public static void simpleChangeArray(int [] array)
        {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0)
                {
                    array[i] = 1;
                }
                else
                {
                    array[i] = 0;
                }
            }
        }

    // 2. Заполнение массива числами до 100

    public static void simpleFillingArray(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
        }
    }

    // 3. Умножение чисел в массиве на 2

    public static void doubleNumbers(int [] array)
    {
        for (int i = 0; i<array.length; i++)
        {
            if (array[i] < 6)
            {
                array[i] = array[i]*2;
            }
        }
    }

    // 4. Заполнение двумерного массива по диагонали числом 1

    public static void doubleFillingArray (int [][] dArray)
    {
        int index = dArray.length - 1;
        for (int i = 0; i < dArray.length; i++)
        {
            dArray[i][i] = 1;
            dArray [i][index - i] = 1;
        }
    }

    // 5. Возвращающий метод

    public static int [] returnArray(int len, int initValue)
    {
        int[] tmpArray = new int[len];
        for (int i = 0; i<tmpArray.length; i++)

        {
                tmpArray[i] = initValue;
        }

        return tmpArray;
    }

    // 6. Найти минимальное и максимальное значение из массива

    public static void findMaxMin (int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        System.out.println(min);

        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println(max);
    }


}
