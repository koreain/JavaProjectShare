import java.util.Scanner;
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int old=scan.nextInt();
		
		if(old>=19){
			System.out.println("��ȭ�� ������ �� �ֽ��ϴ�");
		}
		else if(old>=15 && old<19){
			System.out.println("������ ������ ��� ��ȭ�� ������ �� �ֽ��ϴ�.");
		}
		else if(old<15){
			System.out.println("��ȭ�� ������ �� �����ϴ�.");
		}
	}

}
