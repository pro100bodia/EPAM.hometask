//Task5 gets 3 parameters: 
//	args[0] - digit
//	args[1] - position

public class Task5 {
    public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
        int changer = (int)Math.pow(2, Integer.parseInt(args[1]));
        System.out.println(input ^ changer);
    }

}