/*
 * ���� �Է¹޾� for���� ����ؼ� �ش� �������� ����غ�����
 */

import java.util.Scanner;
public class ����8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int dan = scan.nextInt();
		System.out.println(dan+"�� ���");
		for(int i=1; i<=9; i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
}
