package ru.geekbrains.lesson1;

public class Employees {
private String FullName;
private String post;
private String email;
private String phone;
private int salary;
private int age;

    public static void main(String[] args) {
        Employees[] persArray = new Employees[5];
        persArray[0]=new Employees("Иванов Иван Иванович", "Инженер","zzz@mail.ru", "89200000000",100000, 18);
        persArray[1]=new Employees("Пушкин Александр Сергеевич", "Писатель","Pushkin@mail.ru", "***",1000000, 30);
        persArray[2]=new Employees("Глушко Валентин Петрович", "Главный конструктор","zzz@mail.ru", "89200000000",9000000, 40);
        persArray[3]=new Employees("Черток Борис Евсеевич", "Инженер","zzz@mail.ru", "89200000000",9000000, 80);
        persArray[4]=new Employees("Королев Сергей Павлович", "Главный конструктор","Korol@mail.ru", "89200000000",9000000, 50);
        for (int i = 0; i <persArray.length ; i++) {
            if(persArray[i].getAge()>40)
            {persArray[i].showInfo();}

        }
    }

    public   Employees(String FullName, String post, String email, String phone, int salary, int age ){
this.FullName=FullName;
this.post=post;
this.email=email;
this.salary=salary;
this.age=age;
    }

public int getAge(){
   return this.age;
}
public void showInfo(){

    System.out.println("ФИО: "+this.FullName);
    System.out.println("Должность: "+this.post);
    System.out.println("email: "+this.email);
    System.out.println("З/П: "+this.salary);
    System.out.println("Возраст: "+this.age);
    System.out.println();

}


}
