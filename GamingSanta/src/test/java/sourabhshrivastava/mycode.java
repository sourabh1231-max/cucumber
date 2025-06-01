package sourabhshrivastava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mycode{

		public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println ("enter a new string : ");
		String input = null;
		try {
			input = scanner.nextLine();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int result= firstNonRepeatingCharIndex(input);

		System.out.println( "dfsfIndex" + result);


		}

		private static  int firstNonRepeatingCharIndex(String s){

		Map<Character,Integer> Charcount = new HashMap<>();


		for (char c: s.toCharArray()){
		Charcount.put(c, Charcount.getOrDefault(c, 0)+1);
		}

		for(int i=0; i<s.length();i++)
		{

		if(Charcount.get(s.charAt(i))==1){
		return i;

		}}
		return -1 ;
		}
	
	}