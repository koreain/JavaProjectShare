import java.util.Scanner;
public class ����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���� �Է�: ");
		int num=scan.nextInt();
		if(num%3==0){
			System.out.println("3�� ����Դϴ�.");
		}
		if(num%5==0){
			System.out.println("5�� ����Դϴ�.");			
		}
		if(num%8==0){
			System.out.println("8�� ����Դϴ�.");
		}
		else{
			System.out.println("3,5,8 ��� ���� ����� �ƴմϴ�");
		}
	}

}
