package fr.vlik.grandfantasia.subequip;

import java.util.EnumMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.loader.subequip.LoaderSubEquip;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.template.CompleteBuff;

public class Bague extends CompleteBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Bague de mariage");
		put(Language.EN, "Wedding ring");
	}};
	
	private static final String PATH = Tools.RESOURCE + Bague.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static Bague[] data = LoaderSubEquip.getBague();
	
	public Bague(Map<Language, String> name, Quality quality, String path, Effect[] effects) {
		super(name, quality, effects);
		this.icon = setIcon(path);
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Bague.class.getResource(Tools.PATH32 + (this.quality != null ? this.quality.index : 0) + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(Bague.class.getResource(PATH + path + Tools.PNG));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	public static Bague[] getData() {
		return Bague.data;
	}
	
	public static Bague get(String name, Language lang) {
		return get(Bague.data, name, lang);
	}
}
