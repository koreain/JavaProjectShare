import java.util.Scanner;
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ù���� �Ǽ� �Է�: ");
		double first=scan.nextDouble();
		System.out.println("�ι��� �Ǽ� �Է�: ");
		double second=scan.nextDouble();
		double sum=first+second;
		double dif=first-second;
		double exp=first*second;
		System.out.println("��: "+sum);
		System.out.println("��: "+dif);
		System.out.println("��: "+exp);
	}

}
