public class StringSumofNum
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int finalSum=0;
		int finalSumVal=0;
		String testVal ="Man1oja52391";
		String numberVal = testVal.replaceAll("\\D","");
		System.out.println(numberVal);
		for(int i=0; i<numberVal.length();i++){
		    System.out.println(numberVal.charAt(i));
		    finalSum= finalSum+Character.getNumericValue(numberVal.charAt(i));
		}
	 System.out.println(finalSum);
	 for(int j=0; j<testVal.length(); j++){
	     if(Character.isDigit(testVal.charAt(j))){
	         finalSumVal = finalSumVal+testVal.charAt(j);
	         }
	        }System.out.println(finalSum);
	}
}