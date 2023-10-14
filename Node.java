package garyfenton;

public class Node {
	public String word;
	Node left;
	Node right;
	Node parent;
	
	public Node(String word) {
		this.word = word;
		left = null;
		right = null;
	}
	
	public String getWord() {
		return word;
	}
	 public void setKey(String word) {
	        this.word = word;
	    }

	    public Node getParent() {
	        return parent;
	    }
	    public void setParent(Node parent) {
	        this.parent = parent;
	    }

	    public Node getLeft() {
	        return left;
	    }
	    public void setLeft(Node left) {
	        this.left = left;
	    }

	    public Node getRight() {
	        return right;
	    }
	    public void setRight(Node right) {
	        this.right = right;
	    }
	
	
	
	
	

}


