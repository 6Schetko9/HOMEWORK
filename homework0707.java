package homework0707;  //����� ������� ������������� j2822
import java.util.Scanner;


public class homework0707 {
    public static void main(String[] args) {


        //Integer15 ���� ����������� �����. ������� �����, ���������� ��� ������������ ���� ����� � �������� ��������� ����� (��������, 123 �������� �213).

       /* Scanner in=new Scanner(System.in);
        System.out.print("������� 3-� ������ �����:");
        int number=in.nextInt();
        int sot=number/100;
        int des =(number%100)/10;
        int ed =(number%100)%10;
        int res =des*100+sot*10+ed;
        System.out.println("��������� ������������ ���� ����� � �������� "+ res);*/


        //Integer16 . ���� ����������� �����. ������� �����, ���������� ��� ������������ ���� �������� � ������ ��������� ����� (��������, 123 ��������� 132)

        Scanner in=new Scanner(System.in);
        System.out.print("������� 3-� ������ �����:");
        int number=in.nextInt();
        int sot=number/100;
        int des =(number%100)/10;
        int ed =(number%100)%10;
        int res =des+sot*100+ed*10;
        System.out.println("��������� ������������ ���� �������� � ������ "+ res);
    }
}