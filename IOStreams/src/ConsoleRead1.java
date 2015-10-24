import java.io.Console;

public class ConsoleRead1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Console c = System.console();
    if (c == null) {
        System.err.println("No console.");
        System.exit(1);
    }

    String login = c.readLine("Enter your login: ");

	
	}
	
}
