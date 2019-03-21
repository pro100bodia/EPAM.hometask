//Task2 takes a number and converts it to negative and vice versa using bit operations

public class Task2{
	public static void main(String[] args){
		int input = Integer.parseInt(args[0]);
		
		input = ~input + 1;
		
		System.out.println(input);
	}
}