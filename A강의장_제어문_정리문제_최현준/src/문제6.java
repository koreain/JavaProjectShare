/*
 * ����, ���� ������ �޾� ���� ���ϱ� (switch)
 * ��� 90 �̻�  A����
 * ��� 80 �̻�  B����
 * ��� 70 �̻�  C����
 * ��� 60 �̻�  D����
 * ��� 60 �̸�  F����
 * 
 * ��°��
 * ����: 90
 * ����: 80
 * ����: B
 */

import java.util.Scanner;
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("��������:");
		int kor = scan.nextInt();
		System.out.println("��������:");
		int eng = scan.nextInt();
		int avg = (kor+eng)/2;
		int i;
		char grd[]={'A','B','C','D','F'};
		
		switch(avg/10)
		{
		case 10:
		case 9:
			i=0;
			break;

		case 8:
			i=1;
			break;

		case 7:
			i=2;
			break;

		case 6:
			i=3;
			break;
		default :
			i=4;
		}
		System.out.println("����:"+grd[i]);

	}

}
