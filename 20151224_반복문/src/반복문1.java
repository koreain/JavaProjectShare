/*
 *  �ڹ� => �ݺ���
 *  for : �ݺ� Ƚ���� ������ ���
 *  while : �ݺ� Ƚ���� ������ ���� ��쿡 
 *  do~while : ������ �ѹ� �̻��� ������ ���
 *  
 	do{
 	*���๮�� ==>1 => ��
 	 while (���ǹ�) 
 	 : ����
 	 {
 	 
 	 
 *  
 * ==> for ��
 * 	 	 	 1��	   2��   4��
 * ����) for (�ʱⰪ; ���ǽ�;������)
 * 	   {
 * 		�ݺ� ���� ���� 3
 * 	   }
 * 	
 * 		1 > 2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 *  	    2���� false�� �Ǹ� for�� �ߴ�
 *  
 *  for(int i=1; i<=10, i++)
 *  {
 *  	i=1 ==> i<=10 true ==> ������� (i++)
 *  				.
 *  				.
 *  				.
 *      i=11 ==> i<=10 false ==> false ����
 *  }
 *  
 *  
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++){
			System.out.println("i="+i+"\t");
		}
	}

}
