//������ �Է��� �޾Ƽ� 
/*
 * 
 * 3*9=27
 */


import java.util.Scanner;
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan= new Scanner(System.in);
		System.out.print("����(2~9)�Է�: ");
		int dan=scan.nextInt();
		for(int i=1; i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			}
		}
	*/
     //for�� �̿��ؼ� 1~100������ ������ ������ ���� ���
		/*
		int sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;
		}
		System.out.println("������:"+sum);
		*/
	// 1~100 : ¦���� ��, Ȧ���� �հ� ��ü�� ���� ���
/*
		int even=0;
		int odd=0;
		int sum=0;
		for (int i=1; i<=100; i++){
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
			sum+=i
		)
		System.out.println("1~100��  ¦����: "+even);
		System.out.println("1~100��  Ȧ����: "+odd);
		System.out.println("1~100��  ������: "+sum);
*/	
	int n3=0;
	int n5=0;
	int n7=0;
	for(int i=1; i<=100; i++)
	{
	if(i%3==0)
		n3+=i;
	if(i%5==0)
		n5+=i;
	if(i%7==0)
		n7+=i;
	}
	
	System.out.println("3�����: "+n3);
	System.out.println("5�����: "+n5);
	System.out.println("7�����: "+n7);
	
	}
}