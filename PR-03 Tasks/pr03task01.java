import java.util.Scanner;
class Marksheet {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter marks obtained in C++.");
		int a=x.nextInt();
		if (a>100){
			System.out.println("Invalid input,try a value less than 101");
		}
		else{
		System.out.println("Enter marks obtained in data structure.");
		int b=x.nextInt();
		if (b>100){
			System.out.println("Invalid input,try a value less than 101");
		}
		else{
		System.out.println("Enter marks obtained in Operating System.");
		int c=x.nextInt();
		if (c>100){
			System.out.println("Invalid input,try a value less than 101");
		}
		else{
		int d=a+b+c;
		if(d>300){
			System.out.println("Invalid input Total sum can't exceed 300." );

		}
		else if(d<301){
System.out.println("Total obtained marks: "+d);
double p=(d*100.0)/300.0;
System.out.println("Eqivalent percentage: "+p+"%");
if(p>0 && p<60){
	System.out.println("Grade obtained: F ");
}
else if(p>60 && p<70){
	System.out.println("Grade obtained: D");
}
else if(p>69 && p<80){
	System.out.println("Grade obtained: C");
}
else if (p>79 && p<90){
	System.out.println("Grade obtained: B");
}
else if(p>89){
	System.out.println("Grade obtained: A");
}
}
}
}


}
			}
		}

		
