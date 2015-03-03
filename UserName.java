import java.util.Scanner;
public class UserName {
public static void main (String[] args){
	
	Scanner keyboard = new Scanner (System.in);
	String UserName , Password , User , Pass;
	UserName = "hamza";  Password = "wutang21";
	User = "H";
	Pass = "wu";
	
	while (!UserName.equals(User) || ! Password.equals(Pass)){
		
		System.out.println("Enter username");
	User = keyboard.next();
	    System.out.println("Enter password ");
	Pass = keyboard.next();
     }
	System.out.println("Welcome" + UserName);
	 
}
}
