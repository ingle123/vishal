package ifelse;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FirstName = "Jobbers";
	    String Org = "joBbers ";
	    
	    String Stat = "    Hello Jobbers Cafe !!!!    ";
	    FirstName = FirstName.toUpperCase() ;
	    Org = Org.toUpperCase().trim();
	    
	    System.out.println(FirstName);
	    System.out.println(Org);
	    System.out.println("Before trim"+Stat);
	    Stat =Stat.trim();
	    System.out.println("After trim"+Stat);
	   // System.out.println(FirstName.equals(Org));
	    
	    if(FirstName.equals(Org)) {
	    	
	    	System.out.println("Both the name are same with First name and Org with "+FirstName);
	    }
	    else {
	    	System.out.println("Both the name are not same "+FirstName+" "+Org);



hi vishal
	    }
	}
	

}
