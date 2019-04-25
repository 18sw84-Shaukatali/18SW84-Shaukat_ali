import java.util.Scanner;
class ELCBill {
	public static void main(String[] args) {
		System.out.println("Please enter the number of units used to estimate Bill:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>0 && x<51){
			int a=x*10;
			System.out.println("price of entered unit is:"+a);
		}
		else if(x>50 && x<101){
			int b=(x-50)*15+50*10;
			System.out.println("price of entered unit is:"+b);

		}
		else if(x>100 && x<201){
			int c=(x-100)*20+50*10+50*15;
			System.out.println("price of entered unit is:"+c);
		}
		else if(x>200 && x<301){
			int d=(x-200)*25+50*10+50*15+100*20;
			System.out.println("price of entered unit is:"+d);
		}
		else if(x>300){
			int e=(x-300)*30+50*10+50*15+100*20+100*25;
			System.out.println("price of entered unit is:"+e);
		}
}
	}
