import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class Collections {
	
	
	public static void printlst(List<String> llst) {
		Iterator<String> i=llst.iterator();
		while(i.hasNext()) {
			System.out.println("Elements are "+i.next());
		}
		
		
	}
	
	public static void printlst(PriorityQueue<String> llst) {
		Iterator<String> i=llst.iterator();
		while(i.hasNext()) {
			System.out.println("Elements are "+i.next());
		}
	}

	public static void main(String[] args) {
		
		//arraylist
		List<String> lst=new ArrayList<String>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
		lst.add("grapes");
		lst.add("lemon");
		lst.add("sugarcane");
		System.out.println("before removing"+lst);
		lst.remove(1);
		System.out.println("after removing"+lst);
		System.out.println("======================================");
		
		//linked list
		LinkedList<String> llst=new LinkedList<String>();
		llst.add("dosa");
		llst.add("idly");
		llst.add("vada");
		llst.add("poori");
		llst.add("bajji");
		printlst(llst);
		System.out.println("========================================");
		llst.remove(0);
		System.out.println("after removing");
		printlst(llst);
		System.out.println("======================================");
		
		//vector
		Vector<String> vec=new Vector<String>();
		vec.add("dosa with chutney");
		vec.add("idly with sambar");
		vec.add("vada with chutney and sambar");
		vec.add("poori with potato");
		vec.add("bajji with tea");
		printlst(vec);
		System.out.println("========================================");
		vec.remove(0);
		System.out.println("after removing");
		printlst(vec);
		System.out.println("===========================================");
		
		//Stack
		Stack<String> stk=new Stack<String>();
		stk.push("A");
		stk.push("B");
		stk.push("C");
		stk.push("D");
		stk.push("E");
		printlst(stk);
		System.out.println("========================================");
		stk.pop();
		System.out.println("after removing");
		printlst(stk);
		System.out.println("===========================================");
		
		//PriorityQueue
		PriorityQueue<String> que=new PriorityQueue<String>();
		que.add("carrot");
		que.add("beans");
		que.add("beetroot");
		que.add("potato");
		que.add("brinjal");
		printlst(que);
		System.out.println("========================================");
		System.out.println("head: "+que.element());
		que.poll();
		System.out.println("after removing head");
		printlst(que);
		System.out.println("===========================================");
		



		
	}

}
