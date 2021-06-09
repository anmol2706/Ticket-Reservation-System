import java.util.*; //Imports all JAVA Packages
import java.io.BufferedWriter; // Package for Buffer Writer
import java.io.FileWriter; // package for File Writer
import java.io.IOException; //Package use to handle Exception Cases 

public class TicRev
{
    public static ArrayList<String> namearr = new ArrayList<String>();
	public static ArrayList<String> mobilearr = new ArrayList<String>();
	public static ArrayList<String> addressarr = new ArrayList<String>();

	public static void main(String args[]) throws IOException
	{
		Scanner  in = new Scanner(System.in);
		
		int op,choice;
		
		System.out.println("Welcome to AJMJ Ticket Reservation");
                System.out.println("----------------------------------------------");
		do
		{
		System.out.println("\t\tMAIN MENU");
                System.out.println("----------------------------------------------");
		System.out.println("1.Book Tickets\n3.Cancel Ticket\n4.Exit Portal\n");
		System.out.println("Enter The Operation to be performed : ");
		op=in.nextInt();
		
		switch (op)
		{
			case 1 : System.out.println("----------------------------------------------");
                                 System.out.println("Select your comfort of travel\n\n 1.Normal\n 2.Deluxe\n 3.Air Coach");
				 choice=in.nextInt();
		
					switch (choice)
					{
						case 1 : book();
                         		 		 BookNormal();
					 	  	 break;
			
					        case 2 : book();
			    	        		 BookDeluxe();
			        	 		 break;
			
			    			case 3 : book();
			                		 BookAirCoach();
				    	 		 break;
			
			       			default : System.out.println("Invalid Choice\n");
					 		  break;
		        		}
	    		
			case 2 : System.out.println("----------------------------------------------");
                                 view();
				 break; 
		
			case 3 : System.out.println("----------------------------------------------");
                                 cancel();
				 break;
	
			case 4 : System.out.println("----------------------------------------------");
                                 System.out.println("Thank you for using our portal");
                                 System.out.println("----------------------------------------------");
				 break;
		}
		}while(op!=4);
	}


private static void BookNormal()
{
	 int ns;
	 Scanner  in = new Scanner(System.in);
	 
	 System.out.println("Enter number of seats you want to book : ");
	 ns = in.nextInt();
	
	 if(ns>50)
	 {
		System.out.println("Insufficient Seats\n");
	 }

	 else
	 if(ns<1)
	 {
		System.out.println("Invalid Figure\n");	
	 }

	 else
	 {
		System.out.println(ns+" tickets have been booked successfully\n");
		ns=ns*50;
		System.out.println("Kindly pay "+ns+" rupees at counter");
	 }
} 		


private static void BookDeluxe()
{
	 int ns;
	 Scanner  in = new Scanner(System.in);
	 
	 System.out.println("Enter number of seats you want to book : ");
	 ns = in.nextInt();
	
	 if(ns>50)
	 {
		System.out.println("Insufficient Seats\n");
	 }

	 else
	 if(ns<1)
	 {
		System.out.println("Invalid Figure\n");	
	 }

	 else
	 {
		System.out.println(ns+" tickets have been booked successfully\n");
		ns=ns*150;
		System.out.println("Kindly pay "+ns+" rupees at counter");
	 }
} 		

private static void BookAirCoach()
{
	 int ns;
	 Scanner  in = new Scanner(System.in);
	 
	 System.out.println("Enter number of seats you want to book : ");
	 ns = in.nextInt();
	
	 if(ns>50)
	 {
		System.out.println("Insufficient Seats\n");
	 }

	 else
	 if(ns<1)
	 {
		System.out.println("Invalid Figure\n");	
	 }

	 else
	 {
		System.out.println(ns+" tickets have been booked successfully\n");
		ns=ns*300;
		System.out.println("Kindly pay "+ns+" rupees at counter\n");
	 }
} 		

private static void book() throws IOException
{
        
	Scanner  in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fill-in your details dear Passenger");
        System.out.println("----------------------------------------------");
	System.out.println("Enter your Name");
	String name = in.nextLine();

	System.out.println("Enter your Mobile number");
	String mobile = in.nextLine();

	System.out.println("Enter your District");
	String address = in.nextLine();	
        
        
        FileWriter fWriter = null; 
        BufferedWriter writer = null;
        try 
        {
          fWriter = new FileWriter("text1.txt"); //Creates the file
          writer = new BufferedWriter(fWriter); //Allows us to write in file
          writer.write(name); 
          writer.newLine();
          writer.write(mobile);
          writer.newLine();
          writer.write(address);
          writer.newLine();
          writer.close();
          System.out.println("----------------------------------------------");
          System.err.println("Database Updated");
        }
        catch (Exception e) 
        {
            System.out.println("Error!");
        }
        
	namearr.add(name);

	mobilearr.add(mobile);

	addressarr.add(address);
        
        

}

private static void view()
{
        System.out.println("\t\tSummary");
        System.out.println("----------------------------------------------");
	for(int i=0;i<namearr.size();i++)
	{

		System.out.println("Name : " + namearr.get(i));
		System.out.println("Mobile : " + mobilearr.get(i));
		System.out.println("District : " + addressarr.get(i));
                System.out.println("\n");
                System.out.println("----------------------------------------------");
	}
}

private static void cancel()
{
    Scanner  sc = new Scanner(System.in);
    
	System.out.println("Enter Mobile Number");
	String mobilenum = sc.next();

	int index = mobilearr.indexOf(mobilenum);
	            namearr.remove(index);
	            addressarr.remove(index);
	
        System.out.println("----------------------------------------------");
	System.out.println("Ticket Cancelled");
        System.out.println("Please Collect your Amount from Counter");
        System.out.println("----------------------------------------------\n");
}

}
