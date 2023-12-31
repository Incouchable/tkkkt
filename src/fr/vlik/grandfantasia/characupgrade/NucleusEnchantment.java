package fr.vlik.grandfantasia.characupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.characupgrade.LoaderCharacUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.InnerEffect;

public class NucleusEnchantment extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Enchantement de nucléus");
		put(Language.EN, "Nucleus enchantment");
	}};
	
	protected static NucleusEnchantment[] data = LoaderCharacUpgrade.getNucleusEnchantment();
	
	private InnerEffect[] lvlEffect;
	
	public NucleusEnchantment(Map<Language, String> name, Calculable[][] lvlEffect) {
		super(name, null);
		
		this.lvlEffect = new InnerEffect[lvlEffect.length];
		for(int i = 0; i < lvlEffect.length; i++) {
			int lvl = i+1;
			this.lvlEffect[i] = new InnerEffect(name, lvl, lvlEffect[i]);
		}
	}
	
	public InnerEffect getInnerEffect(int lvl) {
		if(lvl == 0) {
			return null;
		}
		
		for(InnerEffect inner : this.lvlEffect) {
			if(lvl == inner.getLvlbuff()) {
				return inner;
			}
		}
		
		return null;
	}
	
	public InnerEffect[] getInnerLvlEffect(int star) {
		List<InnerEffect> result = new ArrayList<>();
		
		switch (star) {
			case 0:
				break;
			case 1:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				break;
			case 2:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				result.add(this.lvlEffect[2]);
				break;
			case 3:
				result.add(this.lvlEffect[0]);
				result.add(this.lvlEffect[1]);
				result.add(this.lvlEffect[2]);
				result.add(this.lvlEffect[3]);
				result.add(this.lvlEffect[4]);
				break;
			default:
				break;
		}
		
		return result.toArray(new InnerEffect[result.size()]);
	}
	
	@Override
	public String getFullInfo(Language lang) {
		return this.lvlEffect[0].getFullInfo(lang);
	}
	
	public static NucleusEnchantment get(String name) {
		return get(NucleusEnchantment.data, name, Language.FR);
	}
	
	public static NucleusEnchantment[] getPossibleNucleusEnchant(NucleusEnchantment... ignore) {
		List<NucleusEnchantment> result = new ArrayList<>();
		result.addAll(Arrays.asList(NucleusEnchantment.data));
		result.removeAll(Arrays.asList(ignore));
		
		return result.toArray(new NucleusEnchantment[result.size()]);
	}
	
	public static NucleusEnchantment[] getData() {
		return NucleusEnchantment.data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(this.lvlEffect);
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
		NucleusEnchantment other = (NucleusEnchantment) obj;
		return Arrays.equals(this.lvlEffect, other.lvlEffect);
	}
	
}
