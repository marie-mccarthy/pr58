package pr58;

	import java.util.*;
	import java.io.*;
	    
	class pr58
	{
	   public static void main (String[] args) throws IOException
	   {
	      Scanner file = new Scanner( new File( "pr58.dat" ) );
	     int times = file.nextInt();
	     file.nextLine();
	     for(int i = 0; i < times; i++)
	     {
	         
	       char [] alph = file.nextLine().toCharArray();
	        
	        Arrays.sort(alph);
	        String sorted = new String(alph);
	        String sorted1 = new String();
	        for (int m =0; m<sorted.length()-1; m++)
	        {
	          if(sorted.substring(m,m+1).equals(sorted.substring(m+1,m+2)))
	          {}
	            
	          else
	          {
	            sorted1 = sorted1 + sorted.substring(m,m+1);
	          }
	        }

}
	   }
	}
