package io.github.hooj0.prototype.support;

/**
 * prototype pattern product class support
 * @author hoojo
 * @createDate 2018年10月16日 下午10:45:46
 * @file PrototypePatternProduct.java
 * @package io.github.hooj0.prototype.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class PrototypePatternProduct implements Cloneable {

	private long id;
	private String name;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PrototypePatternProduct(String name) {
		this.name = name;
	}
	
	@Override
	public PrototypePatternProduct clone() throws CloneNotSupportedException {
		
		PrototypePatternProduct clone = new PrototypePatternProduct(this.name);
		clone.setId(System.currentTimeMillis());
		
		return clone;
	}
}
