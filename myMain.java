package garyfenton;

public class myMain {

	public static void main(String[] args) {
		DictionaryBST test1 = new DictionaryBST();
		test1.insertNode("apple");
		test1.insertNode("date");
		test1.insertNode("cherry");
		test1.insertNode("banana");
		test1.insertNode("apricot");
		test1.displayInOrder();
		test1.spellCheck("banana");
//------------------------------------------------------------------
		System.out.println("------------------------");
		DictionaryBST test2 = new DictionaryBST();
		test2.insertNode("apple");
		test2.displayInOrder();
		test2.spellCheck("banana");
//------------------------------------------------------------------
		System.out.println("------------------------");
		DictionaryBST test3 = new DictionaryBST();
		//test3.displayInOrder(); #gives error root is null by assertion
		test3.spellCheck("banana");
	
//------------------------------------------------------------------
		System.out.println("------------------------");
		DictionaryBST test4 = new DictionaryBST();
		test4.displayInOrder();
		test4.spellCheck("banana");
	}

}
