package Homework3; // ����� ������� ������������� J2822

import java.util.Scanner;


public class homework3 {
    public static void main(String[] args) {


        /*//Boolean17 ���� ����� ������������� �����. ��������� ���������� ������������:
        // ������� ����� �������� �������� �����������.

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        boolean res = (A%2 != 0) && (A >= 100 && A <= 999);
        System.out.println(res);*/

        //Boolean19?��������� ���������� ������������: ������ ���� ������ �����
        //����� ���� ���� �� ���� ���� ������� ����������������.

        /*Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        boolean res = A==-B ||B==-C || C==-A;
        System.out.println(res);*/

        //Boolean21?���� ����������� �����. ��������� ���������� ������������:
        //������ ������� ����� �������� ������������ �������������������
      /*  Scanner in = new Scanner(System.in);
        System.out.println("������� 3-� ������� ����� :");
        int a=in.nextInt();
        int sotni=a/100;
        int des =(a%100)/10;
        int ed =a%10;
        boolean res= (sotni>des) && (des>ed);
        System.out.println(res);*/

        //Boolean24?���� ����� A, B, C (����� A �� ����� 0). ���������� ������������ D = B
        //2 ? 4�A�C,
        //��������� ���������� ������������: ����������� ��������� A�x^2 + B�x + C = 0 ����� ������������ �����.
       Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        D>=0;
        boolean res=((B*B) -(4*A*C));
        System.out.println(res);

        //Boolean25?
        //. ���� ����� x, y. ��������� ���������� ������������: ������ �
        //������������ (x, y) ����� �� ������ ������������ ��������.
       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        boolean res = x<=0 && y>=0;
        System.out.println(res);*/
    }
}
