package composite.gof;

import base.util.StringUtil;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Description :
 */
public class TreeNode {
    private String name;
    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    //添加孩子节点
    public void add(TreeNode node) {
        children.add(node);
    }

    //删除孩子节点
    public void remove(TreeNode node) {
        children.remove(node);
    }

    //取得孩子节点
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }

    public void display(int depth) {
        System.out.println(StringUtil.repeatableString("-", depth) + this.name);

        Enumeration enumeration = children.elements();
        while (enumeration.hasMoreElements()) {
            TreeNode treeNode = (TreeNode) enumeration.nextElement();
            treeNode.display(depth + 2);
        }
    }
}
