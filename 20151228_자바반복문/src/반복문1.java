/*
 *  �ݺ���
 *   = for : ������ Ƚ��
 *     ����)
 *     			1     2    4
 *         for(�ʱⰪ; ���ǽ�; ������)
 *         		���๮�� 3
 *              1-2-3-4
 *                2-3-4
 *                2-3-4
 *                2=>false�� ����
 *         for(int i=1; i<=10; i++)
 *          {
 *           System.out.println("i="+i);
 *          }
 *          
 *         for(;;) => ���� ����(break �ʿ�)
 *               
 *   = while : ������ ���� Ƚ��
 *     ����)
 *         �ʱⰪ ==>1
 *         while(���ǽ�) ==>2
 *         {
 *         	���๮��; ==>3
 *          ������; ==>4
 *         }
 *         
 *         1-2-3-4
 *         4====> 2-3-4
 *         4====> 2-3-4
 *         2���� false�� ����
 *         
 *         int i=1;
 *         while(i<=10)
 *         {
 *         	System.out.println("i="+i);
 *         i++;
 *         }
 *         ==> ���� ����
 *         
 *         while(true)
 *         {
 *           
 *         } ==> break
 *         
 *   = do~while : �ѹ��̻� ����
 *     ����)
 *     	   �ʱⰪ ==> 1
 *       do
 *       {
 *       	�ݺ����๮��;	==> 2
 *       	������; ==> 3
 *       }
 *       while(���ǽ�); ==>4
 *       
 *       int i=1;
 *       do
 *       {
 *       	System.out.println("i="+i);
 *       	i++;
 *       }
 *       while(i<=10);
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for�� ����");
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("While�� ����");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		System.out.println("dowhile�� ����");
		i=1;
		do
		{
			System.out.print(i+"\t");
			i++;
		}
		while(i<=10);
	}

}
