/*
 * ������ �Է¹޾� �� ���� ���� ū���� ���� ������.
 */

import java.util.Scanner;
public class ����9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("ù��° ���� �Է�:");
		nums[0]=scan.nextInt();
		System.out.println("�ι�° ���� �Է�:");
		nums[1]=scan.nextInt();
		System.out.println("����° ���� �Է�:");
		nums[2]=scan.nextInt();
		int max=0;
		//�� �� ����
		for(int i=0; i<nums.length;i++)
		{
		  if(nums[i]>max)
			  max=nums[i];
		}
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
	}

}
