/*
 * ����, ���� �����Է¹޾� �������ϱ� (if)
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
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�����:");
		int kor = scan.nextInt();
		System.out.println("�����:");
		int eng = scan.nextInt();
		double avg = (kor+eng)/2.0;
		int i;
		char grd[]={'A','B','C','D','F'};
		if(avg>=90)
			i=0;
		else if(avg>=80 && avg<90)
			i=1;
		else if(avg>=70 && avg<80)
			i=2;
		else if(avg>=60 && avg<70)
			i=3;
		else 
			i=4;
		System.out.println("����:"+grd[i]);
	}

}
