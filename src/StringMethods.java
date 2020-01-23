

/*
 * 
 *  @ Author - Sam Keim
 */

public class StringMethods {

	public String capitalize(String word) {
		word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		return word;
	}
	
	public int wheresWaldo(String phrase) {
		int indx = phrase.toLowerCase().indexOf("waldo");
		return indx;
	}
	
	public String firstThingsFirst(String a, String b) {
//		a = a.toLowerCase();
//		b = b.toLowerCase();
//		
		if(a.compareToIgnoreCase(b) < 0) {
			return a + " " + b;
		}
		else {
			return b + " " + a;
		}
	}
	
	public String reverse(String s) {
		String[] arr = s.split("");
		String reversed = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += arr[i];
		}
		
		return reversed;
	}
	
	public String soLong(String a, String b) {
		
		if (a.length() > b.length()) {
			return a;
		} else if (b.length() > a.length()) {
			return b;
		} else {
			return a + " " + b;
		}
	}
	
	public String afterMath(String phrase) {
		String ret = "";
		if (phrase.contains("math")) {
			ret = phrase.substring(phrase.indexOf("math"));
			return ret;
		} else {
			return "Dud";
		}
	}
	
	public String letterize(String word) {
		String retString = "";
		
		for (int i = 0; i < word.length() - 1; i++) {
			retString += word.substring(i, i + 1) + "\n";
		}
		retString += word.substring(word.length() - 1);
		return retString;
	}
	
	public String camelCase(String phrase) {
		String arr[] = phrase.split(" ");
		String arrReturn[] = new String[arr.length];
		String returnString = "";
		
		arrReturn[0] = arr[0].toLowerCase();
		for (int i = 1; i < arr.length; i++) {
			arrReturn[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
		}
		
		for (int i = 0; i < arr.length; i++) {
			returnString += arrReturn[i];
		}
		
		return returnString;
	}
}
