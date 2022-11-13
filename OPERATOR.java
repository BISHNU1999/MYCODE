import java.util.Scanner;

public class OPERATOR {
	public static void main( String[] args) {
		Scanner s=new Scanner (System.in);
		int f=s.nextInt();
		// WRONG int cel=(5/9)*(f-32); INT  ANS IS 0
		 int cel= (int)((5.00/9)*(f-32));
		  int vel =(5*(f-32))/9;// both are correct
		  
		
		System.out.println(cel);
		System.out.println(vel);
		
		
		
		
	}
	

}
