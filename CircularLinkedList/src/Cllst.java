

public class Cllst {
	
	public class Node{
		
		public String data;
		public Node nextData;
		public Node(String data ) {
			this.data=data;
		}
	}
	 public Node headNode=null;
	 public Node tailNode=null; 
	 public void createNode(String data) {
		    Node newNode = new Node(data);
		 
		    if (headNode == null) {
		        headNode = newNode;
		        tailNode = newNode;
		    } else {
		        tailNode.nextData = newNode; 
		        tailNode = newNode;
			    tailNode.nextData = headNode;
		    }
		 
		    
		}
	 
	 
		public void displayNode() {
         Node currentNode = headNode;
         if(headNode == null) {
             System.out.println("Circular Linked List is empty");
             return;
         }
         System.out.println("Nodes in Circular Linked List: ");
          do{
             System.out.print(currentNode.data + " ");
             currentNode = currentNode.nextData;
         } while(currentNode != headNode);
     }
		

	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cllst cllst=new Cllst();
		cllst.createNode("aslam");
		cllst.createNode("aqeel");
		cllst.createNode("anwar");
		cllst.createNode("salman");
		cllst.createNode("farook");
		cllst.createNode("rafeek raja");
		cllst.createNode("rafeek");
		cllst.createNode("yazar");
		cllst.createNode("pradeep");
		cllst.createNode("arun");
		cllst.createNode("jaffer");
		cllst.displayNode();

	}

}
