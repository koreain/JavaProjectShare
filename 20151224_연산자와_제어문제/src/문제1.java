/*
 * 278970��(int�� ������ ����)
 */
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin=278970;
		int man=coin/10000;
		int och=(coin%10000)/5000;
		int ch=(coin%5000)/1000; //int ch=((coin%10000)%5000)/1000;
		int ob=(coin%1000)/500; //int ob=(((coin%10000)%5000)%1000)/500;
		int b =(coin%500)/100; //int b =((((coin%10000)%5000)%1000)%500)/100;
		int os=(coin%100)/50; //int os=(((((coin%10000)%5000)%1000)%500)%100)/50;
		int s=(coin%50)/10;  //int s=((((((coin%10000)%5000)%1000)%500)%100)%50)/10;
		
		System.out.println("�����ݾ� ="+coin);
		System.out.println("10000�� ="+man);
		System.out.println("5000�� ="+och);
		System.out.println("1000�� ="+ch);
		System.out.println("500�� ="+ob);
		System.out.println("100�� ="+b);
		System.out.println("50�� ="+os);
		System.out.println("10�� ="+s);
		
	}

}
