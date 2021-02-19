import java.util.*;

class Zoho {
	public static void main (String[] args) {
	    Scanner inp = new Scanner(System.in);
	    String text = inp.nextLine();
	    int startingPoint = text.length()/2;
	    int iteration = startingPoint;
	    int tab = 0;
	    String outPut = "";
	    do {  
	        outPut += ""+text.charAt(iteration);
	        for(int i = tab; i < text.length(); i++)
	        System.out.print(" ");
	        System.out.println(outPut);
	        iteration++;
	        tab++;
	        if(iteration == text.length())
	               iteration = 0;
	    }while(!(iteration == startingPoint));
	}
}
