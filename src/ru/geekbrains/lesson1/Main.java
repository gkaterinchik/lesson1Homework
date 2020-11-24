package ru.geekbrains.lesson1;

public class Main {



    public static void main(String[] args) {
        byte e=127;
        short f=32000;
        int a=0;
        float z= 3.14f;
        double c=2.15;
        long d=9223372036854775807L;
        boolean bool=true;
        char q='c';
        System.out.println(isLeapYear(400));
        System.out.println(calculation(1,2,3,4));
        System.out.println(compare(5,6));
        checkNumber(10);
        System.out.println(checkNegative(6));
        hello("Илья");


    }

    public static String isLeapYear(int year)
    {
        String isleap="";
        if (year<100)
        {
            if((year%4)!=0){
                isleap="обычный";
            }
            else isleap="Високосный";
        }
        else if(year==100){
            isleap="обычный";
        }
        else if((year>100)&&(year<400))
        {
            if((year%4)!=0||(year%100==0)){
                isleap="обычный";
            }else
            isleap="Високосный";

        }
        else if (year>=400)
        {

            if((year%4!=0)||(year%100==0)&&(year%400!=0)){
                isleap="обычный";

            }else
                isleap="Високосный";

        }
        return isleap ;
    }


    public static double calculation (double a, double b, double c, double d)
    {

        return  a * (b + (c / d));

    }
    public static boolean compare(double a, double b)
    {
        double sum=a+b;
        if(sum>=10&&sum<=20)
        {
            return true;
        }
        else
            {
            return false;
            }
    }

    public static void checkNumber(int a)
    {
     if(a>=0)   {
         System.out.println(a+" -Положительное число");
     }
     else {
         System.out.println(a+" -Отрицательное число");
     }
    }

    public static boolean checkNegative(int a)
    {
        if(a<0)
        {
            return true;
        }
        else

        {
            return false;
        }

    }

public static void hello(String name)
{
    System.out.println("Привет, "+name+"!");
}
}
