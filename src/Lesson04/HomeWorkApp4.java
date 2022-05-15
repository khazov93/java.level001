package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    // вспомогательные методы
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // характеристики персонажа
    public static String playerName = "Zorro";
    public static char player = 'Z';
    public static int playerHealthMax = 100;
    public static int playerHealth = playerHealthMax;
    public static int playerCoins = 0;
    public static int playerPosX;
    public static int playerPosY;
    public static int playerAllValueCoins;
    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;

    // характеристики врага
    public static char enemy = 'E';
    public static int enemyHealth;
    public static int enemyPower;
    public static int enemiesCount;
    public static int enemyValueMin = 10;
    public static int enemyValueMax = 10;
    public static int enemyPosX;
    public static int enemyPosY;

    // характеристики монеток
    public static char coin = 'O';
    public static int coinsCount;
    public static int coinsPosx;
    public static int coinsPosy;
    public static int coinsValueMin = 10;
    public static int coinsValueMax = 100;


    // карта
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 3;
    public static char[][] map;
    public static char emptyCell = '_';

    //количество уровней
    public static int countLevels = 0;
    public static int levels = 2;


    public static void main (String[] args)
    {
        while (isPlayerAlive() && isLevesOver())
        {
            makeMap();
            playerPosition();
            enemyPosition();
            coinsPosition();
            crossLevel();
            countLevels++;
        }

            printMap();
            System.out.println("Game over!");
    }

    // прохождение уровня
    public static void crossLevel()
    {
            while (true)
            {
                printMap();
                playerMoveAction();

                if (!isPlayerAlive())
                {
                    System.out.println(playerName + " is dead. Count coins = " + playerCoins + ". All value = " + playerAllValueCoins);
                    break;
                }

                if (!isEnemyExist())
                {
                    System.out.println("Levels is over. " + playerName + " is win. Count coins = " + playerCoins + ". All value = " + playerAllValueCoins);
                    break;
                }
                if (!isCoinsExist())
                {
                    System.out.println(playerName + " get all cons.");
                }

            }
    }


    // создание карты
    public static void makeMap ()
    {
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++)
        {
            for ( int x = 0; x < mapWidth; x++)
         map[y][x] = emptyCell;
        }
        System.out.println("LEVEL = " + (countLevels + 1) );
        System.out.println("Check you map " + mapWidth + "x" + mapHeight);
        System.out.println("Check you HP = " + playerHealthMax);
        playerHealth = playerHealthMax;
    }

    // вывод карты
    public static void printMap ()
    {
        for (int y = 0; y < mapHeight; y++)
        {
            for ( int x = 0; x < mapWidth; x++)
            {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // позиция игрока
    public static void playerPosition ()
    {
        playerPosY = (mapHeight - 1);
        playerPosX = (mapWidth - 1);
        map[playerPosY][playerPosX] = player;
    }

    //позиция противника
    public static void enemyPosition ()
    {
        enemyHealth = randomValue(enemyValueMin, enemyValueMax);
        enemyPower = randomValue(enemyValueMin, enemyValueMax);
        enemiesCount = (mapWidth + mapHeight) / 2;

        for (int i = 1; i <= enemiesCount; i++)
        {
            do
            {
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);
            } while (!emptyCell (enemyPosY, enemyPosX));
            map[enemyPosY][enemyPosX] = enemy;

        }
        System.out.println("Check enemy : " + enemiesCount + "| Health: " + enemyHealth + "| Power:" + enemyPower );
    }

    //позиции монеток
    public static void coinsPosition ()
    {
        coinsCount = (mapHeight + mapWidth) / 3;

        for (int i = 1; i <= coinsCount; i++)
        {
            do
            {
                coinsPosx = random.nextInt(mapWidth);
                coinsPosy = random.nextInt(mapHeight);
            } while (!emptyCell (coinsPosy, coinsPosx));
            map[coinsPosy][coinsPosx] = coin;
        }
        System.out.println("Check coins : " + coinsCount);
    }


    //движение игрока
    public static void playerMoveAction() {
        int playerLastPositionX = playerPosX;
        int playerLastPositionY = playerPosY;

        int playerMoveCode;

        do {
            System.out.print("Enter destination: (UP-" + playerMoveUp + " |DOWN-" + playerMoveDown +
                    " |LEFT-" + playerMoveLeft + " |RIGHT-" + playerMoveRight + ") > ");

            playerMoveCode = scanner.nextInt();

            switch (playerMoveCode) {
                case playerMoveUp:
                    playerPosY -= 1;
                    break;
                case playerMoveDown:
                    playerPosY += 1;
                    break;
                case playerMoveLeft:
                    playerPosX -= 1;
                    break;
                case playerMoveRight:
                    playerPosX += 1;
                    break;
                default:
                    System.out.println("You pressed wrong button, try again.");
                    return;
            }

        } while (!allowableMove(playerLastPositionX, playerLastPositionY, playerPosX, playerPosY));

        playerNextCellAction();

        map[playerPosY][playerPosX] = player;
        map[playerLastPositionY][playerLastPositionX] = emptyCell;

    }

    // наступление игрока
    public static void playerNextCellAction() {
        if (map[playerPosY][playerPosX] == enemy) {
            System.out.println("<<<CHOOSE YOUR DESTINY>>>");
            System.out.println("Press 0 - 9  for battle with enemy: ");
            scanner.nextInt();
            System.out.println(playerName + " killed " + "enemy in first round! FATALATY! Muhahaha !!!");
            playerHealth -= enemyPower;
            enemiesCount--;
            System.out.println(playerName + " get damage " + enemyPower + ". " + playerName + " HP = " + playerHealth + ". " );
        }
        if (map[playerPosY][playerPosX] == coin) {
            int coinsValue = randomValue(coinsValueMin, coinsValueMax);
            playerAllValueCoins +=coinsValue;
            coinsCount --;
            playerCoins += 1;
            System.out.println(playerName + " get coin. Value of coins = " + coinsValue + ". Player coins = " + playerCoins + ". All value = " + playerAllValueCoins);
        }
    }

    //ходы
    public static boolean allowableMove(int lastX, int lastY, int nextX, int nextY) {
        if (cellAllowable(nextX, nextY)) {
            System.out.println(playerName + " move to [" + nextY + ":" + nextX + "]");
            return true;
        } else {
            System.out.println(playerName + " move to [" + nextY + ":" + nextX + "] denied");
            printMap();
            playerPosX = lastX;
            playerPosY = lastY;
            return false;
        }
    }

    //вспомогательные методы
    public static boolean cellAllowable (int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean emptyCell(int y, int x)
    {
        return map[y][x] == emptyCell;
    }

    public static int randomValue(int min, int max)
    {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isPlayerAlive() {
        return playerHealth > 0;
    }

    public static boolean isEnemyExist() {
        return enemiesCount > 0;
    }

    public static boolean isCoinsExist() { return coinsCount > 0; }

    public static boolean isLevesOver() {return levels > countLevels;}
}
