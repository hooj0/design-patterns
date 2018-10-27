package io.github.hooj0.composite;

import io.github.hooj0.composite.support.Tree;
import io.github.hooj0.composite.support.TreeNode;

/**
 * composite pattern application clien class
 * 
 * @author hoojo
 * @createDate 2018年10月26日 下午10:58:53
 * @file App.java
 * @package io.github.hooj0.composite.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		Tree tree = new Tree("Java");
		tree.getRoot().addChild(new TreeNode(1, 1, "io"));
		tree.getRoot().addChild(new TreeNode(1, 2, "net"));
		
		TreeNode thread = new TreeNode(1, 3, "thread");
		thread.addChild(new TreeNode(2, 31, "NEW"));
		thread.addChild(new TreeNode(2, 32, "RUNNABLE"));
		thread.addChild(new TreeNode(2, 33, "BLOCKED"));
		thread.addChild(new TreeNode(2, 34, "WAITING"));
		thread.addChild(new TreeNode(2, 35, "TERMINATED"));
		
		// tree.print(thread);
		tree.getRoot().addChild(thread);
		
		tree.print();
	}
}
