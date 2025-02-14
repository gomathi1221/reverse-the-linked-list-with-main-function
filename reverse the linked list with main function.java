import java.util.*;
class Node{
    int data;
    Node next;
   public Node(int data){
       this.data=data;
       this.next=null;
   }
   
}
class linkedlist{
    Node head;
    public void add(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=n;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node nextnode;
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head=prev;
        
    }
}
   class Main{
    public static void main(String[] args){
        linkedlist l=new linkedlist();
        l.add(60);
        l.add(90);
        l.add(70);
        l.display();
        l.reverse();
        System.out.println();
        l.display();
    }
   }

