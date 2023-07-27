import java.util.Scanner;
/*Program to enter 3 employee details*/
public class Employee{

	 String name;
	 int year;
	 String Addr;
	 
	 public void getInput() {
	 
	  @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	  System.out.println("Enter the name : ");
	  name = in.next();
	  System.out.println("Enter the year : ");
	  year = in.nextInt();
	  System.out.println("Enter the address : ");
	  Addr = in.next();
	  System.out.println();
	 }
	 
	 public void display() {
	  
	  System.out.print("" + name);
	  System.out.print("	" + year);
	  System.out.println("	" + Addr);
	 }
	 
	 public static void main(String[] args) {
	 
	  Employee e[] = new Employee[5];
	  
	  for(int i=0; i<3; i++) {
	   
	   e[i] = new Employee();
	   e[i].getInput();
	  }
	  
	  System.out.println( "Name	Year	Address ");
	  
	  for(int i=0; i<3; i++) {
	   
	   e[i].display();
	  }
	 }
	}