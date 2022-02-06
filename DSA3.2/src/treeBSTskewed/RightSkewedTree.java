package treeBSTskewed;

import java.util.ArrayList;

public class RightSkewedTree {
	void inOrderTraversal(Tree root, ArrayList<Integer> tree) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.left, tree);
		tree.add(root.data);
		inOrderTraversal(root.right, tree);
	}

	public Tree convertToRightSkewedTree(Tree root) {
		if (root != null) {
			ArrayList<Integer> tree = new ArrayList<Integer>();
			inOrderTraversal(root, tree);

			Tree rightSkewedTree = new Tree(tree.get(0));
			Tree temp = rightSkewedTree;

			for (int i = 1; i < tree.size(); i++) {
				temp.right = new Tree(tree.get(i));
				temp = temp.right;
			}

			return rightSkewedTree;
		}

		return null;
	}

	public void traverseRightSkewedTree(Tree rightSkewedTree) {
		Tree temp = rightSkewedTree;
		while (temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.right;
			
		}
	}
}


