import java.util.Scanner;
class SumUp {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int[][]A=new int[3][3];
		int[][]B=new int[3][3];
		int[][]Sum=new int[3][3];
		System.out.println("Matrix A");
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				System.out.print("A ("+i+","+j+")");
				A[i][j]=x.nextInt();
			}

			}
			System.out.println("Matrix B");
			for(int i=0;i<B.length;i++){
				for(int j=0; j<B.length;j++){
					System.out.print("B("+i+","+j+")");
					B[i][j]=x.nextInt();
				}

				}
				System.out.println("Sum of Matrices is:");
				for(int i=0; i<Sum.length;i++){
					for(int j=0;j<Sum.length;j++){
						Sum[i][j]=A[i][j]+B[i][j];
						System.out.print("("+i+","+j+")"+Sum[i][j]+" ");
					}
					System.out.println();
				}
			}
		}

		
