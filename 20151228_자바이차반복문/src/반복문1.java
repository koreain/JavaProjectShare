/*
 *  2�� for  (����  �񱳿� �����ϰ� �� �� �ִ�)
 *   ����)	  1	    2    7
 *   	for (�ʱⰪ; ���ǽ�; ������)
 *   	{        3     4    6
 *   		for(�ʱⰪ; ���ǽ�; ������)
 *   		{   
 *   			���๮�� 5
 *   	    }
 *   	}
 *  
 *  	1-2--> 
 *  	 (3-4-5-6, 4-5-6, 4���� false�� 7������ ����)
 *  	  2���� false�� ����
 *  
 *  ****1�� for : �ټ�
 *      2�� for : ���๮��
 *      
 *  ****
 *  ****
 *  ****
 *  ****
 *  
 *  for(int i=1; i<=4; i++)
 *  {
 *  	for (int j=1; j<=4; j++)
 *  	{
 *  	 System.out.print("*");
 *  	}
 *  }
 *  
 *      *
 *     **
 *    ***
 *  *****
 *  
 *  i   j   k
 *  �ټ�  ����    ��ǥ
 *  1   3   1
 *  2   2   2
 *  3   1   3
 *  4   0   4
 *  
 *  i+j=4 ==> j=4-i
 *  
 *  ****
 *   ***
 *    **
 *     *
 *     i j k
 *     i=j+1 ==>  j=i-1
 *     i+k=5 ==>  k=5-i
 *     
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i=1; i<=4; i++)
			   {
			   	for (int j=1; j<=i-1; j++)
			   	{
			   		System.out.print(" ");
			   	}
			   	for (int k=1; k<=5-i; k++)
			   	{
		   		     System.out.print("*");
			   	}
			   	 System.out.println();
			   }
	}

}
