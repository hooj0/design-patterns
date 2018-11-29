package io.github.hooj0.mediator.party.support;

/**
 * party interface defined 
 * 派对接口定义
 * 
 * @author hoojo
 * @createDate 2018年11月29日 下午11:02:55
 * @file Party.java
 * @package io.github.hooj0.mediator.party.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface Party {

	public void addMember(PartyMember member);
	
	// 狂欢
	public void revel(PartyMember actor, ShowType type);
}
