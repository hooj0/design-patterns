package io.github.hooj0.composite.support;

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
	private boolean leaf;
	
	private List<TreeNode> child;

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

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public List<TreeNode> getChild() {
		return child;
	}

	public void setChild(List<TreeNode> child) {
		this.child = child;
	}
}
