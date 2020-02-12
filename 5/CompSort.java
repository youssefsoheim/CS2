package task1;

import java.util.Comparator;

public class CompSort implements Comparator<String>{
	public int compare(String s, String r) {
		 if (s.length() == r.length())
        {
            return s.compareTo(r);
        }
        return s.length() - r.length();
    
	}



}
