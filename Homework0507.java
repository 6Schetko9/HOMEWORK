package homework0507; //����� ������� ������������� j2822

        public class Homework0507 {

    public static void main(String[] args) {
//Begin13
//���� ��� ����� � ����� ������� � ��������� R1 � R2 (R1 > R2).
//����� ������� ���� ������ S1 � S2, � ����� ������� S3 ������, �������
//������ �������� ����� R1, � ���������� ������ ����� R2:
//S1 = ?�(R1)^2
//S2 = ?�(R2)^2
//S3 = S1 ? S2
        /*double R1 = 10;
        double R2 = 5;
        final double pi = 3.14;
        double s1 = pi * R1*R1;
        double s2 = pi * R2*R2;
        System.out.println(s1);
        System.out.println(s2);
        double s3 = s1 - s2;
        System.out.println(s3);*/



        //Begin16. ����� ���������� ����� ����� ������� � ��������� ������������ x1 � x2 �� �������� ���: |x2 ? x1|.
      /*  double x1 = -5;
        double x2 = 7;
        double L= Math.abs(x1-x2);
        System.out.println("���������� ����� ����� �������" + L);*/

       // Begin19. ���� ���������� ���� ��������������� ������ ��������������:
        //(x1, y1), (x2, y2). ������� �������������� ����������� ���� ���������.
       //  ����� �������� � ������� ������� ��������������.
       /* double x1 = -5;
        double x2 = 7;
        double y1 = 3;
        double y2 = 1;
        double L1= Math.abs(x1-x2);
        double L2= Math.abs(y1-y2);
        double P=(L1+L2)*2;
        System.out.println("��������" +P);
        double S=(L1*L2);
        System.out.println("�������" +S);*/

        //Begin20 ����� ���������� ����� ����� ������� � ��������� ������������
        //(x1, y1) � (x2, y2) �� ���������. ���������� ����������� �� �������
      //?(x2 ? x1)^2 + (y2 ? y1)^2

        /*double x1 = -5;
        double x2 = 7;
        double y1 = 3;
        double y2 = 1;
        double L=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("���������� ����� ����� ������� " + L);*/

        //Begin21. ���� ���������� ���� ������ ������������: (x1, y1), (x2, y2), (x3, y3).
       // ����� ��� �������� � �������, ��������� ������� ��� ���������� ����� ����� ������� �� ��������� (��. ������� Begin20). ��� ����������
      //  ������� ������������ �� ��������� a, b, c ������������ ������� ������:
        // S =?p�(p ? a)�(p ? b)�(p ? c),

       /* double x1 = -5;
        double x2 = 7;
        double x3 = -2;
        double y1 = 7;
        double y2 = 3;
        double y3 = -4;
        double a=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double b=Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));
        double c=Math.sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)));
        double P=a+b+c;
        System.out.println("�������� ������������ "+ P);
        double p=P/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("������� ������������ " +S);*/



    }
}
