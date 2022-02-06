package treeBSTskewed;

public class Tree {
		public int data;
		public Tree left, right;

		public Tree(int data) {
			this.data = data;
		}
	

	public static void main(String[] args) {
		Tree root = new Tree(50);
		root.left = new Tree(30);
		root.right = new Tree(60);
		root.left.left = new Tree(10);
		root.right.left = new Tree(55);

		RightSkewedTree skewedTree = new RightSkewedTree();
		Tree rightSkewedTree = skewedTree.convertToRightSkewedTree(root);
		skewedTree.traverseRightSkewedTree(rightSkewedTree);
	}
}

	

