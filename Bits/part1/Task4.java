//Euclidean algorithm implemented with binary operations

public class Task4{
    private static int euclidean(int a, int b){
		if(a == 0)
			return b;
		while(b != 0)
		{
			if(a > b){
				a -= b;
			}else{
				b -= a;
			}
		}
		
		return a;
	}
	
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(euclidean(a, b));
	}
}