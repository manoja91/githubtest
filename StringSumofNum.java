public class StringSumofNum
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int finalSum=0;
		String testVal ="Man1oja52391";
		String numberVal = testVal.replaceAll("\\D","");
		System.out.println(numberVal);
		for(int i=0; i<numberVal.length();i++){
		    //System.out.println(numberVal.charAt(i));
		    finalSum= finalSum+numberVal.charAt(i);
		}
	 System.out.println(finalSum);	
	}
}
