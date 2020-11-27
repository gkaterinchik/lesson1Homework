package ru.geekbrains.lesson1;

public class Replace {

    static int[] arr = {1,2,3,4,5,6,7};

    public static void main(String[] args) {

        arrReplace(4);

    }


    public static void arrReplace(int n)
    {
        int a, b, c;
        int pos=0;
        a=arr[0];
        for (int i = 0; i <= arr.length-1; i++) {

            pos = pos+ n;
            pos = pos%arr.length;
           b=arr[pos] ;
           arr[pos]=a;
            a=b;



        }
        for(int i=0; i<=arr.length-1; i++)
            System.out.println(arr[i]);
    }


}


