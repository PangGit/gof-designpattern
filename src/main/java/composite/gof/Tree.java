package composite.gof;

/**
 * @Description :
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");

        TreeNode nodeB1 = new TreeNode("B1");
        TreeNode nodeB2 = new TreeNode("B2");

        TreeNode nodeC = new TreeNode("C");

        nodeB1.add(nodeC);

        tree.root.add(nodeB1);
        tree.root.add(nodeB2);

        System.out.println("build the tree finished!\n");

        tree.root.display(1);
    }
}
