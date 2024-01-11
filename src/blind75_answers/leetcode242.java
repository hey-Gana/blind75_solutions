package blind75_answers;
import java.util.Arrays;
//Solution for Leetcode242 - Checking Anagram
import java.util.HashSet;

public class leetcode242 {
	
	//solution1
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false; //if both string's lengths dont match, it cant be an anagram;
		
		char[] array1 = s.toCharArray(); //converting each string into character array
		char[] array2 = t.toCharArray();		
		
		//sorting them
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
	}
	
	//solution2
	public static boolean isAnagram2(String s, String t) {
		
		if(s.length() != t.length()) return false; //if both string's lengths dont match, it cant be an anagram;
		
		int[] count = new int[26]; //creating an array for the 26 alphabets.
		for (int i=0;i<s.length();i++) {
			count[s.charAt(i)-'a']++; //increasing the count each time the alphabet is encountered. 
			//'a' is converted into ASCII value and gets subtracted and then count value increases in that position.
			//eg: a-a = 0;  n-a = 13;
			
			count[t.charAt(i)-'a']--; //decreases the value of count each time the alphabet is encountered.
		}
		for (int c : count) {
			if (c!=0) {return false;} //if count is not 0, it is not anagram as there are different alphabets in both strings.
		}
		return true; 
	}
	
	
	public static void main(String[] args) {
		String s = "racecar";
		String t = "carrace";
		System.out.println(isAnagram(s,t));
		
		String q= "qwerty";
		String w= "poiuyt";
		System.out.println(isAnagram(q,w));
	}

}
