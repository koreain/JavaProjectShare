/*
 * 1������
 * 
 * ���� 90
 * ���� 78
 * ���� 85
 * ���� 256
 * ��� 85
 * 
 * (�κ������� ����Ͽ� �Ǽ��Է� �� ������� �ڵ��� ���ҽ��ϴ�.)
 */
import java.util.Scanner;
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("��������:");
		double kor = scan.nextDouble();
		System.out.println("��������:");
		double eng = scan.nextDouble();
		System.out.println("��������:");
		double math = scan.nextDouble();
		
		double total=kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("����:"+total+"�� �Դϴ�.");
		System.out.printf("���:%.2f�� �Դϴ�.",avg);

	}

}
