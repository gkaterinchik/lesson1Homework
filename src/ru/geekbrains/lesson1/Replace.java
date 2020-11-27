package ru.geekbrains.lesson1;

public class Replace {

    static int[] arr = {1,2,3,4};

    public static void main(String[] args) {

        arrReplace(7);

    }


    public static void arrReplace(int n)
    {
        int a, b, c;
        int pos;
        c = arr[0];
        for (int i = 0; i <= arr.length-1; i++) {
            pos = i + n;
            pos = recPos(pos);
            a = arr[pos];
            b = c;
            arr[pos] = b;
            c = a;
        }
        for(int i=0; i<=arr.length-1; i++)
            System.out.println(arr[i]);
    }

    public static int recPos(int pos)
    {
        if(pos>=arr.length)
        {
            pos=pos-arr.length;
            recPos(pos);

        }

        return pos;
    }
}


