//count bits for byte short int long

import java.math.BigInteger;

public class Task3{
	private static int bitsCount(long dataType){
		int size = 0;

		while(dataType != 0)
		{
			dataType >>= 1;
			size++;
		}

		return size;
	}

	public static void main(String[] args){
		
		String type = args[0];

		switch(type)
		{
			case "byte":
				System.out.println(bitsCount(255l));
				break;

			case "short":
				System.out.println(bitsCount(65535l));
				break;

			case "int":
				System.out.println(bitsCount(4294967295l));
				break;

			case "long":
				System.out.print(bitsCount((long)Math.pow(2, 64)) + 1);
				break;

			default:
				System.out.println("unknown data type");
		}
	}
}                   