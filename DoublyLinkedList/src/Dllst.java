
public class Dllst {
	
	public class Node{
		
		public String data;
		public Node prevData;
		public Node nextData;
		public Node(String data ) {
			this.data=data;
		}
	}	
		
	
	    public Node headNode,tailNode; 
		public void createNode(String data) {
			Node newNode=new Node(data);
			if(headNode==null) {
				headNode=newNode;
				tailNode=newNode;
				headNode.prevData=null;
				tailNode.nextData=null;
			}else {
				tailNode.nextData=newNode;
				newNode.prevData=tailNode;
				tailNode=newNode;
				newNode.nextData=null;
			}
		}
		public void displayNode() {
            Node currentNode = headNode;
            if(headNode == null) {
                System.out.println("Doubly Linked List is empty");
                return;
            }
            System.out.println("Nodes in Doubly Linked List: ");
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.nextData;
            }
        }
		

	public static void main(String[] args) {
		Dllst dllst=new Dllst();
		dllst.createNode("aslam");
		dllst.createNode("aqeel");
		dllst.createNode("anwar");
		dllst.createNode("salman");
		dllst.createNode("farook");
		dllst.createNode("rafeek raja");
		dllst.createNode("rafeek");
		dllst.createNode("yazar");
		dllst.createNode("pradeep");
		dllst.createNode("arun");
		dllst.createNode("jaffer");
		dllst.displayNode();
				

	}

}
