package ru.geekbrains.lesson1;

public class Lesson2HomeWork {

    static int[] arr = {0, 1, 1, 1, 0, 0};
    static int[] arr2 = new int[8];
    static int[] arrMult = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    static int[] arrCompare={1,1,1,2,5};



    public static void main(String[] args) {
        opposite(arr);
        fillArray(arr2);
        //multiplication();
        fillDiagonal();
        System.out.println(minMax(arrMult));
        System.out.println(compare(arrCompare));
    }

    public static void opposite(int[] arr) // Задание 1
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else if (arr[i] == 0) arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println(" ");

    }

    public static void fillArray(int[] arr2) {
        arr2[0] = 0;
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);
        System.out.println(" ");
    }


    public static void multiplication() {
        for (int i = 0; i < arrMult.length; i++) {
            if (arrMult[i] < 6) {
                arrMult[i] = arrMult[i] * 2;
            }
        }
        for (int i = 0; i < arrMult.length; i++)
            System.out.print(arrMult[i] + ", ");
        System.out.println(" ");
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][(arr.length - 1) - i] = 1;
        }
        for(int j=0;j<4;j++) {
            System.out.println();
            for (int i = 0; i < 4; i++) {
                System.out.print(arr[i][j]);

            }
        }

    }
    public static String minMax(int[]arr)
    {
        int min,max;
        min=arr[0];
        max=arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<=min)min=arr[i];
            if(arr[i]>=max)max=arr[i];
        }
        return "минимальное значение " + min+" Максимальное значение "+max;
    }

    public static boolean compare(int[]arr)
    {
        int leftPart, rightPart;

        for(int i=0;i<arr.length;i++)
        {
            leftPart=0;
            rightPart=0;
           for(int j=0;j<=i;j++)
           {
              leftPart=leftPart+arr[j];

           }
           for(int k=i+1;k<arr.length; k++)
            {
                rightPart=rightPart+arr[k];
            }
           if (leftPart==rightPart)
           {
               System.out.println(i);
               return true;
           }

        }
        return false;
    }
}