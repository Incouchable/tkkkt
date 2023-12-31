package fr.vlik.grandfantasia.customequip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.charac.Grade.GradeName;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.equip.Weapon;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.equipupgrade.Enchantment;
import fr.vlik.grandfantasia.loader.customequip.LoaderCustom;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;

public class CustomWeapon extends CustomEquipment {
	
	private static final String PATH = Tools.RESOURCE + Weapon.class.getSimpleName().toLowerCase() + Tools.SEPARATOR;
	private static final Map<String, ImageIcon> ICONS = new HashMap<>();
	public static CustomWeapon[][] data = LoaderCustom.getCustomWeapon();
	public static final double INCREASE_VALUE_GREEN = 1.21;
	public static final double INCREASE_VALUE_BLUE = 1.60;
	
	protected WeaponType type;
	
	public CustomWeapon(CustomWeapon weapon) {
		super(weapon);
		
		this.type = weapon.getType();
		this.icon = weapon.getIcon();
		this.iconName = weapon.getIconName();
	}
	
	public CustomWeapon(Map<Language, String> name, GradeName[] grades, int lvl, WeaponType type, String path, Calculable[] effects) {
		super(name, grades, lvl, effects);
		
		this.type = type;
		this.icon = setIcon(path != null ? path : "null");
	}
	
	@Override
	public WeaponType getType() {
		return this.type;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(CustomWeapon.class.getResource(Tools.PATH32 + Quality.WHITE.index + Tools.PNG));
		ImageIcon object = null;
		
		try {
			object = ICONS.computeIfAbsent(path, i -> new ImageIcon(CustomWeapon.class.getResource(PATH + path + Tools.PNG)));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.iconName = path;
		
		return Tools.constructIcon(back, object);
	}
	
	public Weapon transformToWeapon(Quality quality, Enchantment[] enchant) {
		CustomWeapon newCustom = new CustomWeapon(this);
		
		Calculable[] tabEffects = newCustom.constructEffects(quality, enchant);
		
		Calculable[] mergeEffect = new Calculable[newCustom.getEffects().length + tabEffects.length];
		
		for(int i = 0; i < newCustom.getEffects().length; i++) {
			if(quality == Quality.GREEN) {
				if(newCustom.getEffects()[i] instanceof Effect e) {
					if(e.getType().isUpgradable) {
						e.changeValue(CustomWeapon.INCREASE_VALUE_GREEN);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else if(quality == Quality.BLUE) {
				if(newCustom.getEffects()[i] instanceof Effect e) {
					if(e.getType().isUpgradable) {
						e.changeValue(CustomWeapon.INCREASE_VALUE_BLUE);
					}
					
					mergeEffect[i] = e;
				} else {
					mergeEffect[i] = newCustom.getEffects()[i];
				}
			} else {
				mergeEffect[i] = newCustom.getEffects()[i];
			}
		}
		
		for(int i = 0; i < tabEffects.length; i++) {
			mergeEffect[newCustom.getEffects().length + i] = tabEffects[i];
		}
		
		return new Weapon(newCustom.name, newCustom.grades, newCustom.lvl, quality, newCustom.type, newCustom.iconName, mergeEffect, newCustom.signature);
	}
	
	public static CustomWeapon get(String name, Language lang) {
		for(CustomWeapon[] type : CustomWeapon.data) {
			for(CustomWeapon custom : type) {
				if(custom.getName(lang).equals(name)) {
					return custom;
				}
			}
		}
		
		return null;
	}
	
	public static CustomWeapon[] getPossibleWeapon(WeaponType type, int lvl) {
		List<CustomWeapon> result = new ArrayList<>();
		
		for(int i = 0; i < data[type.index].length; i++) {
			CustomWeapon weapon = data[type.index][i];
			
			if(weapon.getLvl() == lvl) {
				result.add(weapon);
			}
		}
		
		return result.toArray(new CustomWeapon[result.size()]);
	}
	
	public static boolean constructCustom(String name, Quality quality, String enchants) {
		CustomWeapon custom = CustomWeapon.get(CustomEquipment.deleteNumber(name), Language.FR);
		
		if(custom == null) {
			return false;
		}
		
		String[] enchantSplit = enchants.split("/");
		Enchantment[] tabEnchant = new Enchantment[6];
		
		if(quality == Quality.GREEN) {
			for(int i = 0; i < 3; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		} else if(quality == Quality.BLUE) {
			for(int i = 0; i < 6; i++) {
				tabEnchant[i] = Enchantment.get(custom, quality, enchantSplit[i]);
				
				if(tabEnchant[i] == null) {
					return false;
				}
			}
		}
		
		Weapon weapon = custom.transformToWeapon(quality, tabEnchant);
		
		Weapon.addCustom(weapon);
		
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomWeapon other = (CustomWeapon) obj;
		return this.type == other.type;
	}
}
