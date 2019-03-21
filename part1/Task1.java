//Task1 converts number from binary form to decimal

public class Task1{
	public static void main(String[] args){
		try{
        	System.out.println(Integer.parseInt(args[0], 2));
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}