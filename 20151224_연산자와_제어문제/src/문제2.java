import java.util.Scanner;
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("��������: ");
		int kor=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.println("��������: ");
		int eng=scan.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.println("��������: ");
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("���� : "+total+"��");
		System.out.printf("���: %.2f��",avg);
	}

}
