/*
 * ������ �߻� 5 >> �ִ밪, �ּҰ�
 * 
 * ================
 * 0  0  0  0  0
 * ================
 * 
 * 
 */ 
public class �迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		for(int i=0; i<score.length;i++)
		{
			 score[i]=(int)(Math.random()*100+1);
		}
		// 10 20 30 80 90 
		int max=0;
		int min=100;
		for(int i=0; i<score.length; i++)
		{
			if(max<score[i])
				max = score[i];
			if(min>score[i])
				min = score[i];
		}
		System.out.println("���� ������");
		for(int i=0; i<score.length;i++)
		{
			System.out.print(score[i]+" ");
		}
			System.out.println();
			System.out.println("�ִ밪: "+max);
			System.out.println("�ּҰ�: "+min);
		}
	}

