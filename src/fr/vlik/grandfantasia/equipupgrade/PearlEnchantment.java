package fr.vlik.grandfantasia.equipupgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.equipupgrade.LoaderEquipUpgrade;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.InnerEffect;

public class PearlEnchantment extends Buff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Enchantement de perle");
		put(Language.EN, "Pearl enchantment");
	}};
	
	protected static PearlEnchantment[] data = LoaderEquipUpgrade.getPearlEnchantment();
	
	private InnerEffect[] lvlEffect;
	
	public PearlEnchantment(Map<Language, String> name, Calculable[][] lvlEffect) {
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
	
	public static InnerEffect[] cumulConstraint(List<InnerEffect> innerEffect) {
		List<InnerEffect> result = new ArrayList<>();
		
		for(InnerEffect current : innerEffect) {
			InnerEffect toAdd = current;
			InnerEffect toRemove = null;
			
			for(InnerEffect calculated : result) {
				
				if(calculated.getName(Language.FR).equals(current.getName(Language.FR))) {
					if(calculated.getLvlbuff() < current.getLvlbuff()) {
						toRemove = calculated;
					} else {
						toAdd = null;
					}
				}
			}
			
			if(toRemove != null) {
				result.remove(toRemove);
			}
			
			if(toAdd != null) {
				result.add(toAdd);
			}
		}
		
		return result.toArray(new InnerEffect[result.size()]);
	}
	
	public static PearlEnchantment get(String name) {
		return get(PearlEnchantment.data, name, Language.FR);
	}
	
	public static PearlEnchantment[] getPossiblePearlEnchant(PearlEnchantment... ignore) {
		List<PearlEnchantment> result = new ArrayList<>();
		result.addAll(Arrays.asList(PearlEnchantment.data));
		result.removeAll(Arrays.asList(ignore));
		
		return result.toArray(new PearlEnchantment[result.size()]);
	}
	
	public static PearlEnchantment[] getData() {
		return PearlEnchantment.data;
	}
}
