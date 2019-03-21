//count bits for byte short int long
//Doesn`t work

/*public class Test{
	public static void main(String[] args){
		byte val = 1;
		val = (byte)-val;
		val <<= 1;
		System.out.println(val);
	}
}                    */

public class Task3{
	private static<T extends Number> byte bitsCount(T dataType){
		byte size = 0;
		T step = new T("1");

		while(dataType != 0)
		{
			dataType <<= step;
			size++;
		}

		return size;
	}

	public static void main(String[] args){
		
		String type = args[0];

		switch(type)
		{
			case "byte":
				System.out.println(bitsCount(new Byte(("-1"))));
				
		}
	}
}                   