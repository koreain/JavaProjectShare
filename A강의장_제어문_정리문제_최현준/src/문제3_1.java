/*
 * 1~101
 * ¦�� / Ȧ�� ����
 * 
 */
public class ����3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		
		for(int i=1; i<=101;i++)
		{
			if(i%2==0)
				even++;
			if(i%2!=0)
				odd++;
			
		}
			System.out.println("¦�� ����: "+even);
			System.out.println("Ȧ�� ����: "+odd);
			/*
			 *  ���׿�����
			 *  = ���������� (++, --)
			 *    �Ѱ� ����, ����
			 *    => ��ġ ������
			 *       ++a => ���� �����Ŀ� �ٸ� ���� ����
			 *       int a=10;
			 *       int b=++a;
			 *        1) ++a;
			 *        2) b=a
			 *    => ��ġ ������
			 *    	 a++ => �ٸ� ���� ������ �����Ѵ�.
			 *    	 int a=10; 
			 *       int b=a++;
			 *       1)b=a
			 *       2)a++
			 *  = ���������� (!) : boolean
			 *  	true => false
			 *  	false => true
			 */
	}

}
