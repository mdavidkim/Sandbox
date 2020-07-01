package sandbox;

public class HelloTest {

	public static void main(String[] args) {
       String testString = "HappyBirthday";
       System.out.println(testString);
       
       if(isThreeChar(testString)) {
    	   System.out.println(lastThreeChar(testString));
       }
       else {
    	   System.out.println("ERROR: Given string is less than 3 characters");
       }
    }
	
	public static String lastThreeChar(String testingWord) {
		
		if(testingWord.length() > 3) {
			return testingWord.substring(testingWord.length()-3, testingWord.length());
		}
		return "";
	}
	
	public static Boolean isThreeChar(String checkString) {
		if(checkString.length() > 3) {
			return true;	
		}
		return false;
	}
}
