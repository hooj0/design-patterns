package io.github.hooj0.mediator.party;

import io.github.hooj0.mediator.party.support.Boss;
import io.github.hooj0.mediator.party.support.Client;
import io.github.hooj0.mediator.party.support.Party;
import io.github.hooj0.mediator.party.support.PartyImpl;
import io.github.hooj0.mediator.party.support.PartyMember;
import io.github.hooj0.mediator.party.support.Shareholder;
import io.github.hooj0.mediator.party.support.ShowType;
import io.github.hooj0.mediator.party.support.Staff;

/**
 * party mediator application client
 * @author hoojo
 * @createDate 2018年11月29日 下午10:47:20
 * @file App.java
 * @package io.github.hooj0.mediator.party
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		Party party = new PartyImpl();
		
		PartyMember staff = new Staff();
		PartyMember boss = new Boss();
		PartyMember shareholder = new Shareholder();
		PartyMember client = new Client();
		
		// add member
		party.addMember(staff);
		party.addMember(boss);
		party.addMember(shareholder);
		party.addMember(client);
		
		// party show start
		staff.revelShow(ShowType.TRUTH_OR_DARE);
		boss.revelShow(ShowType.DESKTOP_GAME);
		shareholder.revelShow(ShowType.DANCE);
		client.revelShow(ShowType.FOOD);
	}
}
