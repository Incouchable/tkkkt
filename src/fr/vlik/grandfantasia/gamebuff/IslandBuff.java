package fr.vlik.grandfantasia.gamebuff;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;

public class IslandBuff extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Divination Île des Sprites");
		put(Language.EN, "Isle Sprite Divination");
	}};
	
	private static IslandBuff[] data = Loader.getIslandBuff();
	
	public IslandBuff(Map<Language, String> name, Calculable[] effects) {
		super(name, effects);
	}
	
	public static IslandBuff get(String name) {
		return get(IslandBuff.data, name, Language.FR);
	}
	
	public static IslandBuff[] getData() {
		return IslandBuff.data;
	}
}
