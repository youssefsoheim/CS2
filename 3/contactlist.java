import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class contactlist {
	ArrayList<contact>contlist = new ArrayList<contact>();
	Scanner sc;
	
	
	public contactlist(String c) throws FileNotFoundException {
		loadfromfile(c);
	}
public void loadfromfile(String c) throws FileNotFoundException{
		sc = new Scanner(new File(c));
		
		while (sc.hasNext()) {
			sc.useDelimiter(",|\n");
			String last = sc.next().trim();
		    String first = sc.next().trim();
			String num =sc.next().trim();
			String email = sc.next().trim();
			contact n = new contact(last, first, num, email);
			contlist.add(n);
		}
		
	}
public contact getcont(int i) {
	        return contlist.get(i);
	    }
		
		
public int arrsize() {
		return contlist.size();
		
	}
public int contindex(String lastn) {
	return contlist.indexOf(lastn);
	
}
	
public contact search(String s) {
    for(contact c : contlist) {
        if(c.getLastName().equalsIgnoreCase(s)) {
            return c;
        }
    }
    return null;
}
	}
	
	

