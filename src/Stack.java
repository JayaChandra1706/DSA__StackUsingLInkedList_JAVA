import java.util.Scanner;
public class Stack {
	Scanner scan=new Scanner(System.in);
    public class Node{
        int data;
        Node link;
        public Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    private Node first=null;
    public void push(){
        System.out.print("Enter Element to Push");
        int ele=scan.nextInt();
        Node newNode=new Node(ele);
        if(first==null){
            first=newNode;
        }else{
            newNode.link=first;
            first=newNode;
        }
    }
    public void pop(){
        if(first==null){
            System.out.println("Deletion is not Possible No Elements Present in LinkedList");
        }else if(first.link==null){
            System.out.println("Deleted Element is"+first.data);
            first=null;
        }else{
            System.out.println("Deleted Element is"+first.data);
            first=first.link;
             
        }
    }
    public void display(){
        Node temp;
        if(first==null){
            System.out.println("There is No Elements to Dispaly");
        }else if(first.link==null){
            System.out.println(first.data);
        }else{
            temp=first;
            while(temp != null){
                System.out.println(temp.data);
                temp=temp.link;
            }
            System.out.println();
        }
    }

}
