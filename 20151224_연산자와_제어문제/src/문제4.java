import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("10000������ ���� �Է�:");
		int num=scan.nextInt();
		int a=num/2;
		if(num<0 || num>10000){
			System.out.println("10000������ ������ �Է��� �ֽñ� �ٶ��ϴ�.");
		}
		else{
			if(num%2==0){
				System.out.println("Ȧ���� ¦�� ��� "+a+"�� �Դϴ�.");
			}
			else{
				System.out.println("Ȧ�� ������"+(a+1)+"���̸�, ¦�� ������"+a+"�� �Դϴ�.");
			}
		}
			
	}

}
