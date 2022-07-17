package homework4;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {

        //f8?. Даны два числа. Вывести вначале большее, а затем меньшее из них

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b)
            System.out.println(a+""+b);
        else
            if (a<b)
            System.out.println(b+""+a);*/

        //If10. Даны две переменные целого типа: A и B. Если их значения не равны,
        //то присвоить каждой переменной сумму этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.
        /*Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int S = A+B;
        if (A!=B){
            A=S;
            B=S;}
            else{
                if (A==B){

                A=0;
                B=0;}}
        System.out.println(A+" "+B);*/
        //If13. Даны три числа. Найти среднее из них (то есть число, расположенное
        //между наименьшим и наибольшим).
      /*  Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a<b && b<c)  res=b;
             else
                 if (c<b && b<a)  res=b;
                    else
                        if (b<a && a<c) res=a;
                        else
                            if (c<a && a<b) res=a;
        else
        if (a<c && c<b)res=c;
            else
                if (b<c && c<a) res=c;
        System.out.println("среднее из чисел: " + res);*/


        //If20. На числовой оси расположены три точки: A, B, C. Определить, какая из
        //двух последних точек (B или C) расположена ближе к A, и вывести эту
        //точку и ее расстояние от точки A.

       /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;

         if ((Math.abs (a-b)) > (Math.abs (a-c))) res=c;
                                 else
                         if ((Math.abs (a-c)) > (Math.abs (a-b))) res =b;
        int L = 0;
        if ((Math.abs (a-b)) > (Math.abs (a-c))) L=Math.abs (a-c);
        else
        if ((Math.abs (a-c)) > (Math.abs (a-b))) L =Math.abs (a-b);


        System.out.println(res+ "  " + L);*/

        //If21. Даны целочисленные координаты точки на плоскости. Если точка совпадает с началом координат,
        // то вывести 0. Если точка не совпадает с началом координат, но лежит на оси OX или OY, то вывести соответственно 1
        //или 2. Если точка не лежит на координатных осях, то вывести 3.
       // НЕ РЕШЕНО!!!
       /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int res=0;
                    if ((x=0) && (y=0)) res=0;
              else if ((x=0) && (y!=0)) res=1;
                    else  if ((x!=0) && (y=0))  res=2;
                            else if ((x!=0) && (y!=0))  res=3;
        System.out.println(res);*/


        //If24. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //f (x) = 2·sin(x), если x > 0,
        //6 ? x, если x ? 0.

       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int res=0;
        if (x>0) res= (int) (2*(Math.sin(x)));
         else if (x<=0) res=6-(x);
        System.out.println(res);*/

        //If26?
        //. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //?x, если x ? 0,
        //f (x) = x
        //2
        //, если 0 < x < 2,
        //4, если x ? 2.

        /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int res=0;
        if (x<=0) res=-x;
         else if (x>0 && x<2) res=x*x;
          else if (x>=2) res=4;
        System.out.println(res);*/
    }
}
