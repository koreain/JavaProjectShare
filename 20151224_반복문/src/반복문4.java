/*
 * 
 * for
 *  ����)
 *  			  6		5
 *   		1     2     4
 *     for(�ʱ�ȭ; ���ǽ�; ������)
 *      {
 *             ���๮��1
 *             ���๮��2 
 * 			==========3 7
 * 
 *	1 => 2 (���� �˻�)
 *		   => true ==> 3 ==> 4.������
 *         => false ==> ����
 *      �����Ŀ� ==> 2 (���ǰ˻�) 
 * 
 *////////////////////////////////////////*
 /* ���ѷ���!!!
 * 
 * for(;;)
 * �ȿ� break ���� �� �־�����Ѵ�.
 * (continue��  Ư�� �κ��� ���� ����ȴ�.)
 * 
 * 1~5�����ϰ� break �ɸ� 1,2,3,4 ��
 *         continue �ɸ� 1,2,3,4,6,7,8,9,10
 *  
 */
// 1-2+3-4+5-6+7-8+9-10
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int val=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				val-=i;
			if(i%2!=0) //else
				val+=i;
		}
		System.out.println(val);*/
		
		for(char i='A'; i<='Z'; i++){ //�ʱⰪ��  ����,�Ǽ�,���ڰ� �� �� �ִ�.
			System.out.print((char)(i+32)+" ");
		}
	}

}
