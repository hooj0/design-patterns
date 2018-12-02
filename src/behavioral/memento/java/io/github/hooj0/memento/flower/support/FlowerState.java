package io.github.hooj0.memento.flower.support;

/**
 * flower open bloom state
 * 花儿开放的状态
 * @author hoojo
 * @createDate 2018年12月2日 下午9:09:48
 * @file FlowerState.java
 * @package io.github.hooj0.memento.flower.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public enum FlowerState {

	BUD("花蕾"), OPEN("绽开"), FULL_BLOOM("盛放"), WITHERED("枯萎"), DROP("凋谢");
	
	private String description;
	
	FlowerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return this.description;
	}
}
