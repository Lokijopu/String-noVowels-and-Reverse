/**
 * 
 * @author Kevin Guo Period 6 StringManipulator class
 *
 */
public class StringManipulator {

	public String noVowels(String result) {
		String temp1 = "";
		for (int i = 0; i < result.length(); i++) {
			if (result.toLowerCase().charAt(i) == 'a' || result.toLowerCase().charAt(i) == 'e' || result.toLowerCase().charAt(i) == 'i' || result.toLowerCase().charAt(i) == 'o' || result.toLowerCase().charAt(i) == 'u') {
				temp1 += "*";
			} else {
				temp1 += result.charAt(i);
			}
		}
		return temp1;
	}
	public String reverse(String result) {
		String temp2 = "";
		for (int i = result.length() - 1; i >= 0; i--) {
			temp2 += result.charAt(i);
		}
		
		return temp2;
	}
}
