package ru.geekbrains.lesson1;

public class Replace {

    static int[] arr = {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {


        replace(arr,-2);
    }

    public static int[] replace(int[] arr, int n)
    {
        if (n==0) return arr;
        if (n<0) n=arr.length+n;
        for(int i=0;i<n; i++)
        {
            arrReplace();
        }
        for(int j=0; j<=arr.length-1; j++)
            System.out.println(arr[j]);
        return arr;
    }
     private static void arrReplace() {
        int a, b, c;
        int pos = 0;
        a = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {

            pos = pos + 1;
            pos = pos % arr.length;
            b = arr[pos];
            arr[pos] = a;
            a = b;


        }




}

}


