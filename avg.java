import java.util.Scanner;
public class avg {
	public static  void main(String[] args) {
		System.out.println(" enter the student name ");
		Scanner s= new Scanner(System.in);
		
		String p = s.nextLine();
		//System.out.println(" ener the marks of all subjects")	;
		int a= s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
	    int n= (a+b+c)/3;
	    System.out.println(" the student name is "+p);
	    System.out.println(" the avg marks is  "+n);
	}


}
