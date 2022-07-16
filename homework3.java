package Homework3; // Щетко Алексей Александрович J2822

import java.util.Scanner;


public class homework3 {
    public static void main(String[] args) {


        /*//Boolean17 Дано целое положительное число. Проверить истинность высказывания:
        // «Данное число является нечетным трехзначным».

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        boolean res = (A%2 != 0) && (A >= 100 && A <= 999);
        System.out.println(res);*/

        //Boolean19?Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».

        /*Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        boolean res = A==-B ||B==-C || C==-A;
        System.out.println(res);*/

        //Boolean21?Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую последовательность»
      /*  Scanner in = new Scanner(System.in);
        System.out.println("Введите 3-х значное число :");
        int a=in.nextInt();
        int sotni=a/100;
        int des =(a%100)/10;
        int ed =a%10;
        boolean res= (sotni>des) && (des>ed);
        System.out.println(res);*/

        //Boolean24?Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант D = B
        //2 ? 4·A·C,
        //проверить истинность высказывания: «Квадратное уравнение A·x^2 + B·x + C = 0 имеет вещественные корни».
       Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        D>=0;
        boolean res=((B*B) -(4*A*C));
        System.out.println(res);

        //Boolean25?
        //. Даны числа x, y. Проверить истинность высказывания: «Точка с
        //координатами (x, y) лежит во второй координатной четверти».
       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        boolean res = x<=0 && y>=0;
        System.out.println(res);*/
    }
}
