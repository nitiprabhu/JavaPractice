import javax.xml.stream.events.EndDocument;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char pp[] = new char[10];
		Integer a=123456789;
       String s= a.toString();
		System.out.println(s);
	    char p = s.charAt(0);
	    System.out.println(p);
		 s.getChars(0, 6, pp, 3);
		System.out.println(pp);
	}}
