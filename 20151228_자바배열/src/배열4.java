/*
 *   �� �� ���� �޾Ƽ� �ش� ������ ��� 
 *   1) ���� ����
 *   	4��  366��
 *   	100�� 364��
 *   	400�� 366��
 *   
 *   2) �ѳ���  1�⵵ 1�� 1�� ~~~ 2015��� 12�� 28�� ==> %7
 */
import java.util.Scanner;
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�⵵ �Է�:");
		int year=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int month=scan.nextInt();
		
		System.out.println("�� �Է�:");
		int day=scan.nextInt();
		// ���⵵ ����
		int total = (year-1)*365
					 +(year-1)/4
					 -(year-1)/100
					 +(year-1)/400;
		//���翬������
		int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		//2015�� 12�� 28��  ���ޱ���
		for(int i=0; i<month-1;i++)
		{
			total+=lastDay[i];
		}
		total+=day;
		System.out.println();
		
		total+=1;
		int week=total%7;
		
		char[] strWeek={'��','��','ȭ','��','��','��','��'};
		//System.out.println(strWeek[week]);
		System.out.println(year+"�⵵"+month+"��");
		for(int i=0; i<7; i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1; i<=lastDay[month-1];i++)
		{
		 if(i==1)
		 {
			 for(int j=1; j<week; j++)
			 {
			 System.out.print("\t");
			 }
		 }
		 System.out.print(i+"\t");
		 week++;
		 if(week>6)
		 {
			 System.out.println();
			 week=0;
		 }
		}
	/*	switch(week)
		{
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("ȭ");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
		break;
		}*/
		
	}

}
