/*
 * A
 * BC
 * DEF
 * GHIJ
 * 
 * A
 * AB
 * ABC
 * ABCD
 * 
 * 1###
 * #2##
 * ##3#
 * ###4
 * 
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=1; i<=4; i++)
		{	
			//char ch='A';
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

}
