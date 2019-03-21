//Task5 gets 3 parameters: 
//	args[0] - digit
//	args[1] - position
//	args[2] - value to change to
import java.math.BigInteger;

public class Task5 {
    public static void main(String[] args) {
		BigInteger input = new BigInteger(args[0]); 

		if(args[2].equals("1")){
			input = input.setBit(new Integer(args[1]));
		}else{
			input = input.clearBit(new Integer(args[1]));
		}
	
		System.out.println(input);
    }
}