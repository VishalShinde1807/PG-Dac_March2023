/*
    A
   A B
  A B C
 A B C D
A B C D E
*/

class Pattern9{
	public static void main(String args[]){
		int u=64;
		for(int i=1;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)(u+k)+" ");
			}
			System.out.println();
		}
	}
}