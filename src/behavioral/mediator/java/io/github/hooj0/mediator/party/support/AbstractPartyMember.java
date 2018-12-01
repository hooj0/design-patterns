package io.github.hooj0.mediator.party.support;

/**
 * party member mediator interface class, members need to join the party and participate in party shows and party carnivals.
 * 派对成员接口定义，成员需要加入派对，并且参与派对秀和派对狂欢
 * 
 * @author hoojo
 * @createDate 2018年11月29日 下午10:46:58
 * @file AbstractPartyMember.java
 * @package io.github.hooj0.mediator.party.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public abstract class AbstractPartyMember implements PartyMember {

	private Party party;
	
	@Override
	public void joinParty(Party party) {
		this.party = party;
		
		System.out.println(this + " join the party.");
	}

	@Override
	public void partyShow(ShowType type) {
		System.out.println(this + " enjoy " + type.getDescription());
	}

	@Override
	public void revelShow(ShowType type) {
		if (party != null) {
			System.out.println(this + " " + type + " " + type.getDescription());
			party.revel(this, type);
		}
	}
	
	@Override
	public abstract String toString();
}
