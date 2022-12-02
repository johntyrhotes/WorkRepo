package InterviewBOA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arr {

	public static void main(String[] args) {
		
		String word="johntyrhotes";
		
		List<Character> l=new ArrayList<Character>();
		
		for(int i=0;i<word.length();i++)
		{
			l.add(word.charAt(i));
		}
		
		Collections.sort(l);
		
	
		Collections.reverse(l);

	
		
		System.out.println(l);

	}

}
