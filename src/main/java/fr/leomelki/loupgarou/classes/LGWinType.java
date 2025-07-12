package fr.leomelki.loupgarou.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LGWinType {
	VILLAGEOIS("§6§l§oThe game was won by §2§lVillage§6§l§o!"),
	LOUPGAROU("§6§l§oThe game was won by the §c§lWerewolves§6§l§o!"),
	LOUPGAROUBLANC("§6§l§oThe game was won by the §c§lWhite Werewolf§6§l§o!"),
	COUPLE("§6§l§oThe game was won by the §d§lCouple§6§l§o!"),
	ANGE("§6§l§oThe game was won by the §d§lAngel§6§l§o!"),
	EQUAL("§7§l§oTie§6§l§o, no one won the game!"),
	SOLO("§6§l§oA lone player won the game!"),//bug si ça s'affiche
	ASSASSIN("§6§l§oThe game was won by the §1§lAssassin§6§l§o!"),
	PYROMANE("§6§l§oThe game was won by the §6§lPyromaniac§6§l§o!"),
	VAMPIRE("§6§l§oThe game was won by the §5§lVampires§6§l§o!"),
	NONE("§4Error: §no one won the game.");
	
	@Getter private final String message;
}
