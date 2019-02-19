
public class Iterations {

	public static void main(String[] args) {
		

		int num = 9;
		int i = 111;
		

		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println();
		
		num = 7;
		i = 111;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10);
		
		System.out.println();
		
		for(int n=5,j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		

	}

}
