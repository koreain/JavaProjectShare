/*
 *  ���� �߻� ==> o,x 
 *  ����Ƚ�� x 10
 * 
 */
import java.util.Scanner;
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for (int i=1; i<=10; i++)
		{
			int dap=(int)(Math.random()*2);
			//1(x),0(o)
			Scanner scan=new Scanner(System.in);
			System.out.print("X(0),O(1)�Է�:");
			int user=scan.nextInt();
			if(dap==0)
			{
				System.out.println("��: O");
			}
			if(dap==1)
			{
				System.out.println("��: X");				
			}
			if(user==0)
			{
				System.out.println("��: O");				
			}
			if(user==1)
			{
				System.out.println("��: X");				
			}
			//�����
			if(dap==user){
				count++;
			}
			System.out.println("ä�����: "+(count*10)+"��");
		}
	}

}
