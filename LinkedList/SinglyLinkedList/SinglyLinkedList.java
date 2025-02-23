package LinkedList.SinglyLinkedList;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class SLL
{   
    public Node head;
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void delete(int key)
    {
        if(head==null)
        {
            System.out.println("List is Empty Da !");
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=key)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("Element Not found bhaiya");
        }
        temp.next=temp.next.next;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Inga ena pakura , Ulla onnum ila");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class SinglyLinkedList
{
    public static void main(String args[])
    {
        SLL list= new SLL();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Linked List: ");
        list.display();

        list.delete(20);
        System.out.print("After deletion: ");
        list.display();

        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 50: " + list.search(50));
        System.out.println("Size of the list: " + list.size());

    }
}