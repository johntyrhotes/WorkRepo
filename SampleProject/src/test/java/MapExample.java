import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExample {

	public static void main(String[] args) {
		
		String sentence="// Online Java Compiler";
        String arr[] = sentence.split(" ");
        
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        String output=sentence.replace(" ","$");
        System.out.println(output);
        // ArrayList<String> list1=new ArrayList<String>();
        
        HashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
        
        int count=0;
        for(int i=0;i<sentence.length();i++)
        {
            if(lhm.containsKey(sentence.charAt(i)))
            {
                count = lhm.get(sentence.charAt(i));
                lhm.put(sentence.charAt(i),count+1);
            }
            else
            {
                lhm.put(sentence.charAt(i),1);
            }
            
        }
	}

}
