/*
 * 1���� 100���� ���� 3�� ������� ���ϰ� 3�� ��� ����ϱ� (do~while �̿�)
 * ����(Ư�� ���� ���� 3�� ��� ���� ����ϰ� �� ���� ���غ���)
 */
import java.util.Scanner;
public class ����10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">> ���۰��� ���ᰪ ������ 3����� ����ϰ� �� ���� ���մϴ�. <<");
		Scanner scan = new Scanner(System.in);
		System.out.println("���۰� �Է�");
		int start=scan.nextInt();
		System.out.println("���ᰪ �Է�");
		int end=scan.nextInt();
		int sum=0;
		do
		{
			if(start%3==0)
			{
			System.out.print(start+" ");
			sum+=start;
			}
			start++;
		}
		while(start<=end);
		System.out.println();
		System.out.println("3�� �����:"+sum);
	}

}
