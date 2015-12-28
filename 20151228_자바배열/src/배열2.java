/*
 * 	5���� ���� �����ϰ�
 *  ����� ������� ó�� (����) DESC, ASC
 *  �������� (�˰���)
 *  
 *  	10  30  50  40  20 ==> 10  20  30  40  50 (ASC)
 *  	==  ==  
 *  	==      ==
 *      ==          ==
 *      ==              ==
 *      
 *      10  30  50  40  20
 *      	==  ==
 *          ==      ==
 *          ==          ==
 *          
 *     10   20  50  40  30
 *     			==  ==
 *     10   20  40  50  30
 *              ==      ==
 *              
 *     10   20  30  50  40
 *     				==  ==
 *     10   20  30  40  50    
 *     
 *     i   j
 *     1   4
 *     2   3
 *     3   2
 *     4   1
 *     
 *     i+j=5 ==> j=5-i
 *     
 *     
 */
public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={45, 56, 73, 34, 21};
		System.out.println("������:");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("������:");
		for(int i=0; i<4; i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
