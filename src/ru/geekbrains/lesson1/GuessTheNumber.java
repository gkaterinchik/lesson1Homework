package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        startGame();
        //System.out.println(randWord);


    }
    static String randWord;
    static String playerWord;
    static int counter;
    static String[] guessedLetters = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


    public static void startGame()
    {
        System.out.println("Вы играете в игру \"Угадай слово\"! ");
        System.out.println("Цель - угадать слово загаданное компьютером за минимальное число ходов.");
       getWord();
       playerTurn();
    }


    public static void getWord()
 {
     Random rand =new Random();
     int randWordIndex=rand.nextInt(words.length+1);
     randWord=words[randWordIndex];
 }



public static void playerTurn()
{
    boolean trueConditions=false;
    Scanner inputWord = new Scanner(System.in);
    System.out.println("Угаданные буквы:");
    for (String guessedLetter : guessedLetters) System.out.print(guessedLetter + " ");

        System.out.println();

    while (!trueConditions)
    {
        counter++;
        System.out.println("Введите предполагаемое слово");
        playerWord = inputWord.nextLine();
        String[] tmpWord=playerWord.split("");

        if(tmpWord.length>15||tmpWord.length==1)
        {
            System.out.println("Некорректный ввод");
        }
        else
        {
            trueConditions = true;

        }

    }
    checkWin();
}

public static void checkWin()
{

    String[] randWordArr=randWord.split("");
    String[] playerWordArr=playerWord.split("");

    if(Arrays.equals(playerWordArr,randWordArr))
    {
        System.out.println("Вы угадали! Загаданное слово - "+ randWord);
        System.out.println("Число попыток - "+counter);
        counter=0;
    }
    else
    {
        int count = Math.min(playerWordArr.length, randWordArr.length);
        for(int i = 0; i<count;i++)
       {
        if (playerWordArr[i].equals(randWordArr[i]))
        {guessedLetters[i]=playerWordArr[i];}

       }
        playerTurn();
    }

}

}
