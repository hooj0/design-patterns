package io.github.hooj0.mediator.party.support;

/**
 * party member mediator interface class
 * 派对成员接口定义
 * @author hoojo
 * @createDate 2018年11月29日 下午10:52:10
 * @file PartyMember.java
 * @package io.github.hooj0.mediator.party.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public interface PartyMember {

	public void joinParty(Party party);
	
	public void partyShow(ShowType type);
	
	// 狂欢
	public void revel(ShowType type);
}
