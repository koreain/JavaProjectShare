/*
 * 5�� �л��� 
 * ����, ����, ���������� �Է¹޾� 
 * ����, 
 * ����� ���ϼ��� (�迭���)
 */
import java.util.Scanner;
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char id[]={'A','B','C','D','E'};
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];

		for(int i=0; i<id.length;i++)
		{
			System.out.println(id[i]+"�л������Է�");
			
				System.out.println("��������:");
				kor[i]=scan.nextInt();
				System.out.println("��������:");
				eng[i]=scan.nextInt();
				System.out.println("��������:");
				math[i]=scan.nextInt();
				sum[i]=kor[i]+eng[i]+math[i];
				avg[i]=sum[i]/3.0;
			if(i==id.length-1)
				{
			    	System.out.println("����\t����\t����\t����\t���");
					for(int j=0; j<id.length;j++)
					{
						System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",kor[j],eng[j],math[j],sum[j],avg[j]);
					}
				}
					
		}
	}
}
