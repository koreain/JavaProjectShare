/*
 * 10�� �л��� ������ �Է¹޾� �迭�� �����ϰ� 
 * ������ 
 * ����, ���, �ִ�����, �ּ����� ���ϱ�
 */

import java.util.Scanner;
public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//�迭 
		char id[]={'A','B','C','D','E','F','G','H','I','J'};
		int[] score=new int[10];
		//����, �ִ�, �ּҰ� ���� ����
		int sum=0;
		int max=0;
		int min=1000;
		
		for(int i=0; i<id.length;i++)
		{
			System.out.println(id[i]+"�л�����:");
			score[i]=scan.nextInt();
		}

		for(int i=0; i<score.length; i++)
		{
			if(min>score[i])
				min=score[i];
			if(max<score[i])
				max=score[i];
			sum+=score[i];
		}
		System.out.println("����:"+sum);
		System.out.printf("���:%.2f\n",(sum/10.0));
		System.out.println("�ְ�����:"+max);
		System.out.println("��������:"+min);
	}

}
