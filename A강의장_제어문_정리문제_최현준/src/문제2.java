/*
 * 2������
 * ������ ���� �Է¹޾� ¦������ Ȧ������ ����� ������
 */

import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ������ �Է����ּ���:");
		int num = scan.nextInt();
		//¦�� Ȧ�� �Ǵ�
		if(num%2==0)
		System.out.println(num+"��(��)¦�� �Դϴ�.");
		else
		System.out.println(num+"��(��)Ȧ�� �Դϴ�.");
	}

}
