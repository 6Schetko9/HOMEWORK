package L3006;
//import java.util.Scanner;


import java.util.Scanner;

public class L3006 {
    public static void main(String[] args) {
        //Дано расстояние L в сантиметрах. Используя операцию деления
        //нацело, найти количество полных метров в нем (1 метр = 100 см).
 /* Scanner in =new Scanner(System.in);
        System.out.println(" Ввыедите целое число в см:");
  int L = in.nextInt ();
        System.out.println(L/100 + "метра/ов");*/


        //Integer3◦
        //. Дан размер файла в байтах. Используя операцию деления нацело,
        //найти количество полных килобайтов, которые занимает данный файл
        //(1 килобайт = 1024 байта).
      /*  Scanner in= new Scanner(System.in);
        System.out.println("Введите число байтов: ");
        int bytes =in.nextInt ();
        System.out.println(bytes/1024 + "килобайтов");*/


       // Integer6◦ Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). Для нахождения десятков
        //использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.

       /* Scanner in=new Scanner(System.in);
        System.out.print("введите 2-х значое число:");
        int a=in.nextInt();
        System.out.println("Десятки" + a/10);
        System.out.println("Единицы" + a%10);*/
//Integer7◦
//. Дано двузначное число. Найти сумму и произведение его цифр.

       /* Scanner in=new Scanner(System.in);
        System.out.print("введите 2-х значое число:");
        int a=in.nextInt();
        int b=a/10;
        int c=a%10;

        System.out.println("Сумма"+(b+c));
        System.out.println("Произведение"+(b*c));*/

      //  Integer8◦
//Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
        /*
        Scanner in=new Scanner(System.in);
        System.out.print("введите 2-х значое число:");
        int number=in.nextInt();
        int a=number/10;
        int b=number%10;
        System.out.println(b*10+a );*/

        // Integer9◦. Дано трехзначное число. Используя одну операцию деления нацело,
        //вывести первую цифру данного числа (сотни)
        /*Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int a=number/100;
        System.out.println(a);*/

        //Integer10◦Дано трехзначное число. Вывести вначале его последнюю цифру
        //(единицы), а затем — его среднюю цифру (десятки).
        /*Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        System.out.println(number%10);
        int des = (number/10)%10;
        System.out.println(des);*/
      //  Integer11◦ Дано трехзначное число. Найти сумму и произведение его цифр.
        /*Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int cot=number/100;//1
        int des=(number/10)%10;//
        int ed=number%10;
        System.out.println("сумма" + (ed+des+cot));
        System.out.println("произведение" + (cot*des*ed));*/

       // Integer12◦
        //. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.

       /* Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int cot=number/100;
        int des=(number/10)%10;
        int ed=number%10;
        int res= 100*ed+10*des+cot;
        System.out.println("Результат в обратном порядке"+ res);*/

        //Integer13◦
 //Дано трехзначное число. В нем зачеркнули первую слева цифру и
     //   приписали ее справа. Вывести полученное число.

     /*   Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int cot=number/100;
        int des=(number/10)%10;
        int ed=number%10;
        int res= 10*ed+100*des+cot;
        System.out.println("вывод получнного числа"res);*/
        Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int sot=number/100;
        int ost =number%100;
        int res =ost*10+sot;
        System.out.println(res);
    }
}
