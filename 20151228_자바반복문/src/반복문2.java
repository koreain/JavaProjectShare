/*
 * 2~9��
 */
import java.util.Scanner;
public class �ݺ���2 {
	static void gugudan(){
		Scanner scan = new Scanner(System.in);
		System.out.print("���Է�: ");
		int dan=scan.nextInt();
		//���� �޾Ƽ� ������ ���
		System.out.println("While ó��");
		int i=1;
		while(i<=9)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		
		System.out.println("do~While ó��");
		i=1;
		do
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		while(i<=9);
		
		//==> ������ ��� �Ŀ� ������ ���� 
	};
	 //���⼭ ������ ����Ǹ� ���� ������ �ȴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();
	}

}
