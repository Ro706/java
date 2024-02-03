public class Fibb{
	public static void main(String[] args){
		int num1=0,num2=1,num3;
		for(int i = 0;i<10;i++){
			System.out.print(num1 +" ");
			num3 = num1 + num2;
			num1 = num2 ;
			num2 = num3 ;
		}
	}
}
