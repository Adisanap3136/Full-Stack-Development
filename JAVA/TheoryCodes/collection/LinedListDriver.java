package collection;

class Node
{
	Object val;
	Node prevRef;
	Node nextRef;
	Node currRef;
	
	private Node()
	{}
	
	public Node(Object o)
	{
		val = o;
		currRef = this;
	}
	public Node next()
	{
		return nextRef;
	}
	public Node previous()
	{
		return prevRef;
	}
	public boolean hasNext()
	{
		return nextRef!=null;
	}
	public boolean hasPrevious()
	{
		return prevRef!=null;
	}
}

class Linkedlist
{
	Node head;
	Node bhagwan;
	
	public Linkedlist() 
	{}
	
	public boolean addVal(Object val)
	{
		if(head==null)
		{
			head  = new Node(val);
			bhagwan = head;
		}
		else
		{
			Node temp = new Node(val);
			
			bhagwan.nextRef = temp;
		
			temp.prevRef = temp;
			
			bhagwan = temp;
		}
		return true;
	}
	public Node iterate()
	{
		return head;
	}
}

public class LinedListDriver 
{
	public static void main(String []args)
	{
		Linkedlist l = new Linkedlist();
		l.addVal(10);
		l.addVal(20);
		l.addVal(30);
		l.addVal(40);
		
		Node head  = l.iterate();
		
		do
		{
			System.out.println(head.val);
			head = head.next();
		}
		while(head.hasNext());
	}
}