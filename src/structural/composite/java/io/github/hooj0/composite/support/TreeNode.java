package io.github.hooj0.composite.support;

import java.util.ArrayList;
import java.util.List;

/**
 * composite pattern —— tree node class defined 
 * 树形节点元素对象定义
 * 
 * @author hoojo
 * @createDate 2018年10月26日 下午11:14:46
 * @file TreeNode.java
 * @package io.github.hooj0.composite.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class TreeNode {

	private int id;
	private int parentId;
	private String name;
	
	private int level;
	private boolean leaf = true;
	private List<TreeNode> child;

	public TreeNode() {
	}
	
	public TreeNode(int level, int id, int parentId, String name) {
		this.level = level;
		this.id = id;
		this.parentId = parentId;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLeaf() {
		return leaf;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<TreeNode> getChild() {
		return child;
	}

	public void addChild(TreeNode node) {
		if (this.child == null) {
			this.child = new ArrayList<TreeNode>();
		}
		
		this.child.add(node);
		
		if (this.child != null && !this.child.isEmpty()) {
			this.leaf = false;
		}
	}
}
