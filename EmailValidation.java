package validation;

import java.util.regex.*;    
import java.util.*; 

public class EmailValidation {

    public static void main(String args[]){  
    	LinkedHashSet<String> emails = new LinkedHashSet<String>();  
          
        emails.add("allisheik@yahoo.in");  
        emails.add("alli@sasi.ac.in");  
        emails.add("alli.sheik@yahoo.in");  
        emails.add("alli@gmail.com"); 
        
        // Adding duplicate mail below
        emails.add("alli@gmail.com");  
        
        //Adding invalid mails below  
        emails.add("alli@gmail.com@yahoo.com");  
        emails.add("alli#gmail.com");  
        emails.add("alli$gmail.com");  
        emails.add("alli@gmail..com");
        
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*"
        		+ "@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
        
        Pattern pattern = Pattern.compile(regex);   
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}