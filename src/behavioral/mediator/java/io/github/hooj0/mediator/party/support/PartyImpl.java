package io.github.hooj0.mediator.party.support;

import java.util.ArrayList;
import java.util.List;

/**
 * Queued interface for various carnival activities and joining party members
 * 排队接口实现各种狂欢节目活动和加入派对成员
 * 
 * @author hoojo
 * @createDate 2018年12月1日 上午9:41:10
 * @file PartyImpl.java
 * @package io.github.hooj0.mediator.party.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class PartyImpl implements Party {
	
	private List<PartyMember> members;
	
	public PartyImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void addMember(PartyMember member) {
		members.add(member);
		member.joinParty(this);
	}

	@Override
	public void revel(PartyMember actor, ShowType type) {
		for (PartyMember member : members) {
			if (!member.equals(actor)) {
				member.partyShow(type);
			}
		}
	}
}
