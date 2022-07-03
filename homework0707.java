package homework0707;  //Щетко Алексей Александрович j2822
import java.util.Scanner;


public class homework0707 {
    public static void main(String[] args) {


        //Integer15 Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа (например, 123 перейдет в213).

       /* Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int sot=number/100;
        int des =(number%100)/10;
        int ed =(number%100)%10;
        int res =des*100+sot*10+ed;
        System.out.println("Результат перестановки цифр сотен и десятков "+ res);*/


        //Integer16 . Дано трехзначное число. Вывести число, полученное при перестановке цифр десятков и единиц исходного числа (например, 123 перейдетв 132)

        Scanner in=new Scanner(System.in);
        System.out.print("введите 3-х значое число:");
        int number=in.nextInt();
        int sot=number/100;
        int des =(number%100)/10;
        int ed =(number%100)%10;
        int res =des+sot*100+ed*10;
        System.out.println("Результат перестановки цифр десятков и единиц "+ res);
    }
}