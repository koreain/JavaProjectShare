/*
 * for ���� ����ؼ� 1���� 50���� �� �� 5�� ����� ����ϰ� 5�� ����� �յ� ���غ�����
 * 
 * ���
 * 5 10 15 20 --- 50
 * 5�� �����: xx
 * 
 */
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("5�� �����");
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
			 System.out.print(i+" ");
			 sum+=i;		
			}
		}
		System.out.println();
		System.out.println("5�� �����:"+sum);
	}

}
