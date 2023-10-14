package garyfenton;


public class DictionaryBST {
Node root;
	
	public DictionaryBST() {
		root = null;
	}
//--------------------------------------------------------------------------------------
	
	public void insertNode(String word) {
		
        Node node = new Node(word);
        node.setParent(null);
        node.setLeft(null);
        node.setRight(null);

      
        if(this.root == null) {
            this.root = node;
        } else {
            Node parentNode = null;
            Node temp = this.root;
            while(temp != null) {
                parentNode = temp;
                int compareValue = node.getWord().compareTo(temp.getWord());
                if(compareValue <= 0) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }

            assert node != null: "Node is null";
            assert parentNode != null: "Parent is null";
            node.setParent(parentNode);
            if(node.getWord().compareTo(parentNode.getWord()) <= 0) {
                parentNode.setLeft(node);
            } else {
                parentNode.setRight(node);
            }
        }
    }
//--------------------------------------------------------------------------------------	
					
	public void inOrder(Node travel) {
		
		if (travel!= null) {
			inOrder(travel.left);
			System.out.println(travel.getWord());
			inOrder(travel.right);
		}
		
		
	}
	
	
	public void displayInOrder() {
		assert root != null: "root is null";
		inOrder(root);
	}
//--------------------------------------------------------------------------------------
	 public void spellCheck(String word) {
	        boolean bool = false;
		 	Node temp = this.root;
	        while(temp != null) {
	        	if(word.compareTo(temp.getWord()) == 0) {
	        		bool = true;
	        	}
	        	if(word.compareTo(temp.getWord()) < 0) {
	                temp = temp.getLeft();
	            } else {
	                temp = temp.getRight();
	            }
	        }
	        
	       
	        System.out.println(bool);
	    }
	 
	
}


