import java.util.Scanner;
public class StackApp {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stack s=new Stack();
        while(true){
            System.out.println("Enter 1 to PUSH");
            System.out.println("Enter 2 to POP");
            System.out.println("Enter 3 to Display");
            System.out.println("Enter other Number to EXIT");
            System.out.print("Enter your choice:");
            int choice=scan.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.exit(0);        
            }
        }
    }
}
