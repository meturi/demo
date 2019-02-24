import java.util.Scanner;
import java.util.regex.*;
public class RegexEx {
public void Stringno(String no)
{
	boolean p = Pattern.matches("as", no);
	System.out.println(no.matches("(\\d+)"));
}
public static boolean Patmatch(String line)
{
	Pattern p = Pattern.compile(".s");
	Matcher m = p.matcher("as"); 
	boolean  b1 = m.matches();
	
	boolean b2 = p.matches("[a-zA-Z0-9]{6}", "Man777");
	System.out.println("output is" +p +b1 +b2);
	return b1;

	
}
public static void main(String args[])
{
	/*RegexEx r = new RegexEx();
//	String line = "My name is Manasa. My number is 9165476776";
	r.Stringno("Manasa");
	r.Stringno("12445");
	r.Stringno(" ");r.Stringno("Manasa@123");
	r.Patmatch("I am practising regex expressions Manasa");
	Pattern p = Pattern.compile("Manasa");
	Matcher m = p.matcher( line); 
	boolean  b1 = Pattern.matches("a", line);
	
	boolean b2 = p.matches("[abc]", line);
	System.out.println("output is" +p +b1 +b2);*/
	Scanner s = new Scanner(System.in);
	System.out.println("Enter regex pattern");
	Pattern p = Pattern.compile(s.nextLine());
	System.out.println("Enter text");
	Matcher m = p.matcher(s.nextLine());
	boolean found = false;
	while(m.find())
	{
		System.out.println("I found the text"+m.group()+"starting at index" 
	+m.start()+"at ending index" +m.end());
		found = true;
	}
	if(!found)
	{
		System.out.println("RegexEx.main()");
	}
}
}
