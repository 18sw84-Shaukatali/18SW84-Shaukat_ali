import java.util.Scanner;
class Operatation {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int j=x.nextInt();
		System.out.println("Enter 2st number: ");
		int k=x.nextInt();
		System.out.println("Enter 1 for addition, 2 for subtraction, 3 for product, 4 for divide. ");
		int l=x.nextInt();
		if(l==1){
			System.out.println("sum of numbers: " +(j+k));
		}
		else if(l==2){
			System.out.println("difference of numbers: "+(j-k));
		}
		else if(l==3){
			System.out.println("product of numbers: "+(j*k));
		}
		else if(l==4){
			System.out.println("divide of numbers: "+(j/k));
		}
		else if(l==5 && l>5){
			System.out.print("Please Enter a valid number!");

		}
		
		
		
		
		
			
		
		
}
}		
		