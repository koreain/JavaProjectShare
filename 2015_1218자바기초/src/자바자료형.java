/*
 *  �ڷ��� : �޸� ũ�� ==> ������ ����ø��� �޸� ũ�⸦ ����
 *   (1byte, 2byte, 4byte, 8byte)
 *   
 *   1) ���� ����
 *       byte (1byte) -128 ~ 127        2��7�±���
 *       short (2byte) -32768 ~ 32767   2��16��
 *       int (4byte) -21�� 4õ ~ 21��4õ            2��64�� (default) �ֳ�, �޸𸮰� ��κ� 4byte�� �Ǿ��ֱ⶧����
 *       long (8byte) 100L, 100 100L�� 8����Ʈ Long����, 100�� 4����Ʈ int�� �ν�  
 *   2) �Ǽ� ����
 *       float (4byte)  10.5F => �Ҽ��� 6�ڸ�
 *       double (8byte) 10.5 (default) => �Ҽ��� 15�ڸ�
 *   3) ���� ���� (2byte) => �������� ����. (0~65535)
 *       �̱۹���Ʈ (1byte) : ASC
 *       ��Ƽ����Ʈ (2byte) : Unicode (�ڹٴ� �����ڵ带 ����Ѵ�)
 *       char
 *   4) �� ����
 *       boolean => true/false
 *   5) ���� ==> Ŭ����, �迭 (�����͸� ��Ƽ� ����ϴ� ��) �����ʹ� ���� ���� Ȱ���ϱ� ������
 */
public class �ڹ��ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double d=123456.78;
		float d =123456.78F; // float�� ��� double�� �ٸ��� �ε��Ҽ����� ������ ���� �ʾƼ� 78�� ���´�
		int i=(int)((d-123456)*100);//(int)0.78 * 100 = 0*100 = 0
									//(int)(0.78*100) = (int)(77) �ε��Ҽ��� ������
		System.out.println(i);
		System.out.println((int)'A');
		System.out.println((char)65);
		System.out.println((int)10.5);
	/*
	 * byte < short < int < long < float < double
	 *        char
	 * = ��ȯ
	 *   UP DOWN
	 *   (char)65 down ��ȯ
	 *   (int)10.5 down ��ȯ
	 *   (double)10 up ��ȯ
	 *   
	 *   �ڵ�����ȯ
	 *   10 + 10.5 = 20.5
	 *   int  double  double
	 *   
	 *   ===
	 *   10.0 (���� int�� double���·� �ڵ� ����ȯ �� �Ŀ� ����ȴ�.)
	 *        + 10.5 = 20.5
	 *        
	 *  'A' + 1 ==> 66
	 *  ==
	 *  65 (char�� int�� �ڵ� ����ȯ �ȴ�)
	 *      + 1 ==> 66      
	 *      
	 *  byte+byte = int
	 *  short+byte = int
	 *  short+short = int
	 *  char+char = int
	 */ 
		char ch1=0x41;
		System.out.println(ch1);
		double e1=7.125;
		
		long n1=10000000000L;
		
		System.out.println(e1);
		System.out.println(n1);
		
	}

}
