package io.github.hooj0.composite.support;

/**
 * composite pattern —— tree class defined
 * 树形对象定义
 * 
 * @author hoojo
 * @createDate 2018年10月26日 下午11:14:33
 * @file Tree.java
 * @package io.github.hooj0.composite.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Tree {

	private TreeNode root = new TreeNode();
	
	public Tree() {
		root.setId(0);
		root.setName("root");
	}
	
	public Tree(String name) {
		root.setId(0);
		root.setName(name);
	}
	
	public TreeNode getRoot() {
		return root;
	}
	
	private String copySpace(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}
		
		return sb.toString();
	}
	
	public void print(TreeNode node) {
		
		if (node != null) {
			String space = copySpace("  ", node.getLevel());
			
			if (node.isLeaf()) {
				System.out.println(space + "- " + node.getName() + " /" + node.getParentId() + "-" + node.getId());
			} else {
				System.out.println(space + "+ " + node.getName() + " /" + node.getParentId() + "-" + node.getId());
				
				for (TreeNode currentNode : node.getChild()) {
					print(currentNode);
				}
			}
		}
	}
}
