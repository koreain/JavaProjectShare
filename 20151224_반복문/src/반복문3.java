/*
 *  up-down ����
 */
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// ������ ������ �߻� => 1~100
		int com=(int)(Math.random()*100)+1;
		int count=0; //�õ� Ƚ�� ī���� ����.
		
		
		
		for(;;) //���ѷ���
		{
			System.out.print("1~100���� ������ ���� �Է�: ");
			int user=scan.nextInt();

			if(user<1 || user>=100)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				continue; //continue�� ó������ �ٽ� ���ư��� ���̰�, break�� ������ ��.
			}
			
			//��
			count++;  //�õ�Ƚ�� ����������
			
			if(com>user)
			{
				System.out.println("�� ���� ���ڸ� �Է��غ�����!!!");
			}
			else if(com<user)
			{
				System.out.println("�� ���� ���ڸ� �Է��غ�����!!!");
			}
			else
			{
				System.out.println("�����Դϴ�!!!");
				System.out.println("�� �õ�Ƚ��:"+count+"��");
				break;
			}
		}
		
		
		
	}

}
