package homework4;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {

        //f8?. ���� ��� �����. ������� ������� �������, � ����� ������� �� ���

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>b)
            System.out.println(a+""+b);
        else
            if (a<b)
            System.out.println(b+""+a);*/

        //If10. ���� ��� ���������� ������ ����: A � B. ���� �� �������� �� �����,
        //�� ��������� ������ ���������� ����� ���� ��������, � ���� �����,
        //�� ��������� ���������� ������� ��������. ������� ����� ��������
        //���������� A � B.
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
        //If13. ���� ��� �����. ����� ������� �� ��� (�� ���� �����, �������������
        //����� ���������� � ����������).
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
        System.out.println("������� �� �����: " + res);*/


        //If20. �� �������� ��� ����������� ��� �����: A, B, C. ����������, ����� ��
        //���� ��������� ����� (B ��� C) ����������� ����� � A, � ������� ���
        //����� � �� ���������� �� ����� A.

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

        //If21. ���� ������������� ���������� ����� �� ���������. ���� ����� ��������� � ������� ���������,
        // �� ������� 0. ���� ����� �� ��������� � ������� ���������, �� ����� �� ��� OX ��� OY, �� ������� �������������� 1
        //��� 2. ���� ����� �� ����� �� ������������ ����, �� ������� 3.
       // �� ������!!!
       /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int res=0;
                    if ((x=0) && (y=0)) res=0;
              else if ((x=0) && (y!=0)) res=1;
                    else  if ((x!=0) && (y=0))  res=2;
                            else if ((x!=0) && (y!=0))  res=3;
        System.out.println(res);*/


        //If24. ��� ������� ������������� x ����� �������� ��������� ������� f,
        //����������� ������������ ��������:
        //f (x) = 2�sin(x), ���� x > 0,
        //6 ? x, ���� x ? 0.

       /* Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int res=0;
        if (x>0) res= (int) (2*(Math.sin(x)));
         else if (x<=0) res=6-(x);
        System.out.println(res);*/

        //If26?
        //. ��� ������� ������������� x ����� �������� ��������� ������� f,
        //����������� ������������ ��������:
        //?x, ���� x ? 0,
        //f (x) = x
        //2
        //, ���� 0 < x < 2,
        //4, ���� x ? 2.

        /*Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int res=0;
        if (x<=0) res=-x;
         else if (x>0 && x<2) res=x*x;
          else if (x>=2) res=4;
        System.out.println(res);*/
    }
}
