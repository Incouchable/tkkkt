package fr.vlik.grandfantasia.loader.characupgrade;

import java.util.EnumMap;

import fr.vlik.grandfantasia.characupgrade.CombiTalent;
import fr.vlik.grandfantasia.characupgrade.Energy;
import fr.vlik.grandfantasia.characupgrade.Nucleus;
import fr.vlik.grandfantasia.characupgrade.NucleusEnchantment;
import fr.vlik.grandfantasia.characupgrade.ProSkill;
import fr.vlik.grandfantasia.characupgrade.Skill;
import fr.vlik.grandfantasia.characupgrade.Speciality;
import fr.vlik.grandfantasia.characupgrade.Stone;
import fr.vlik.grandfantasia.characupgrade.Talent;
import fr.vlik.grandfantasia.characupgrade.Title;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.RegenEffect;
import fr.vlik.grandfantasia.stats.RegenEffect.TypeRegen;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderCharacUpgrade extends LoaderTemplate {
	
	public static Title[] getTitle() {
		return LoaderTitle.getTitle();
	}
	
	public static Talent[][] getTalent() {
		return new Talent[][] {
			LoaderTalent.getClass0(),
			LoaderTalent.getClass1(),
			LoaderTalent.getClass2(),
			LoaderTalent.getClass3(),
			LoaderTalent.getClass4(),
			LoaderTalent.getClass5(),
			LoaderTalent.getClass6(),
			LoaderTalent.getClass7(),
			LoaderTalent.getClass8(),
			LoaderTalent.getClass9(),
			LoaderTalent.getClass10(),
			LoaderTalent.getClass11(),
		};
	}
	
	public static Talent[] getVoidTalent() {
		return new Talent[] {
			new Talent("void-0"),
			new Talent("void-1"),
			new Talent("void-2"),
			new Talent("void-3"),
			new Talent("void-4"),
			new Talent("void-5"),
			new Talent("void-6"),
			new Talent("void-7"),
		};
	}
	
	public static CombiTalent[][] getCombiTalent() {
		return new CombiTalent[][] {
			LoaderCombiTalent.getClass0(),
			LoaderCombiTalent.getClass1(),
			LoaderCombiTalent.getClass2(),
			LoaderCombiTalent.getClass3(),
			LoaderCombiTalent.getClass4(),
			LoaderCombiTalent.getClass5(),
			LoaderCombiTalent.getClass6(),
			LoaderCombiTalent.getClass7(),
			LoaderCombiTalent.getClass8(),
			LoaderCombiTalent.getClass9(),
			LoaderCombiTalent.getClass10(),
			LoaderCombiTalent.getClass11(),
		};
	}
	
	public static Speciality[][] getSpeciality() {
		return new Speciality[][] {
			LoaderSpeciality.getClass0(),
			LoaderSpeciality.getClass1(),
			LoaderSpeciality.getClass2(),
			LoaderSpeciality.getClass3(),
			LoaderSpeciality.getClass4(),
			LoaderSpeciality.getClass5(),
			LoaderSpeciality.getClass6(),
			LoaderSpeciality.getClass7(),
			LoaderSpeciality.getClass8(),
			LoaderSpeciality.getClass9(),
			LoaderSpeciality.getClass10(),
			LoaderSpeciality.getClass11(),
		};
	}
	
	public static Skill[][] getPassiveSkill() {
		return LoaderSkill.getPassiveSkill();
	}
	
	public static Skill[] getUpgradeSkill() {
		return LoaderSkill.getUpgradeSkill();
	}
	
	public static ProSkill[][] getProSkill() {
		return new ProSkill[][] {
			LoaderProSkill.getClass0(),
			LoaderProSkill.getClass1(),
			LoaderProSkill.getClass2(),
			LoaderProSkill.getClass3(),
			LoaderProSkill.getClass4(),
			LoaderProSkill.getClass5(),
			LoaderProSkill.getClass6(),
			LoaderProSkill.getClass7(),
			LoaderProSkill.getClass8(),
			LoaderProSkill.getClass9(),
			LoaderProSkill.getClass10(),
			LoaderProSkill.getClass11(),
		};
	}
	
	public static Nucleus[][] getNucleus() {
		return LoaderNucleus.getNucleus();
	}
	
	public static NucleusEnchantment[] getNucleusEnchantment() {
		return LoaderNucleusEnchantment.getNucleusEnchantment();
	}
	
	public static Stone[] getStone() {
		return new Stone[] {
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Doctrines bien-aimées de Werther"); put(Language.EN, "Werther's Beloved Gospel"); }}, Quality.WHITE, "doctrine", new Calculable[] {
				new Effect(TypeEffect.RegenPM, false, 250),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Griffe de la Brute cristalline magique"); put(Language.EN, "Magic Crystal Brute's Claw"); }}, Quality.WHITE, "griffe", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 5),
				new Effect(TypeEffect.DegStdD, false, 5),
				new Effect(TypeEffect.VitAtk, false, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre de Bénédiction de la Baie Bleue"); put(Language.EN, "Blue Bay Blessing Stone"); }}, Quality.GREEN, "blueBay", new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gri-Gri porte-bonheur pour loterie"); put(Language.EN, ""); }} , Quality.WHITE, "grigri", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Carte de type bien manchot"); put(Language.EN, "Cute Penguin Nice Guy Card"); }}, Quality.WHITE, "manchot", new Calculable[] {
				new Effect(TypeEffect.Loot, false, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corne du Roi Triomphant"); put(Language.EN, "Victory King's Horn"); }}, Quality.WHITE, "corne", new Calculable[] {
				new Effect(TypeEffect.DegSkillP, false, 5),
				new Effect(TypeEffect.DegSkillM, false, 5),
				new Effect(TypeEffect.RegenPV, false, 250),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre d'Invocation de Robolol de Hawk"); put(Language.EN, "Hawk Gehe's Robotol Summoning Stone"); }}, Quality.WHITE, "robolol", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sac Trésor du Zéphyr"); put(Language.EN, "Wind Treasure Bag"); }}, Quality.WHITE, "sac", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 15),
				new Effect(TypeEffect.ESQ, false, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal magique du Chronodériveur"); put(Language.EN, "Time Traveler Magic Crystal"); }}, Quality.GREEN, "chrono", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
				new Effect(TypeEffect.VIT, true, 1),
				new Effect(TypeEffect.INT, true, 1),
				new Effect(TypeEffect.VOL, true, 1),
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre de chance du Mauvais esprit"); put(Language.EN, "Fox Demon Lucky Stone"); }}, Quality.WHITE, "esprit", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 5),
				new Effect(TypeEffect.TCCM, false, 5),
				new Effect(TypeEffect.ToucherP, false, 5),
				new Effect(TypeEffect.ToucherD, false, 5),
				new Effect(TypeEffect.ESQ, true, 5),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corne de Bataille de Smulca"); put(Language.EN, "Smulca's Battle Horn"); }}, Quality.WHITE, "smulca", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 5),
				new Effect(TypeEffect.DefM, true, 5),
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Branche verte"); put(Language.EN, "Green Branch"); }}, Quality.WHITE, "branche", new Calculable[] {
				new RegenEffect(TypeEffect.PM, true, 1, TypeRegen.REGENERATION, 3),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Serment de 400 ans"); put(Language.EN, ""); }}, Quality.WHITE, "serment", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 40),
				new RegenEffect(TypeEffect.PV, true, -6, TypeRegen.REGENERATION, 1),
			}),
			new Stone(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pierre du Roi des Océans"); put(Language.EN, ""); }}, Quality.WHITE, "ocean", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 3),
				new Effect(TypeEffect.Ombre, false, 3),
				new Effect(TypeEffect.Foudre, false, 3),
				new Effect(TypeEffect.Feu, false, 3),
				new Effect(TypeEffect.Glace, false, 3),
				new Effect(TypeEffect.Nature, false, 3),
			}),
		};
	}
	
	public static Energy[] getEnergy() {
		return new Energy[] {
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Écarlate"); put(Language.EN, "Crimson"); }}, "red", new Effect[] {
				new Effect(TypeEffect.PV, false, 24, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Indigo"); put(Language.EN, "Azure"); }}, "blue", new Effect[] {
				new Effect(TypeEffect.PM, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Orange"); put(Language.EN, "Citrus"); }}, "orange", new Effect[] {
				new Effect(TypeEffect.Atk, false, 13, TypeCalcul.ADDITIONAL),
				new Effect(TypeEffect.AtkD, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Violette"); put(Language.EN, "Violet"); }}, "purple", new Effect[] {
				new Effect(TypeEffect.AtkM, false, 10, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Émeraude"); put(Language.EN, "Emerald"); }}, "green", new Effect[] {
				new Effect(TypeEffect.DefP, false, 6, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rose"); put(Language.EN, "Peach"); }}, "pink", new Effect[] {
				new Effect(TypeEffect.DefM, false, 5, TypeCalcul.ADDITIONAL),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume de FCE"); put(Language.EN, ""); }}, "FCE1", new Effect[] {
				new Effect(TypeEffect.FCE, false, 1),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume de VIT"); put(Language.EN, ""); }}, "VIT1", new Effect[] {
				new Effect(TypeEffect.VIT, false, 1),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume d'INT"); put(Language.EN, ""); }}, "INT1", new Effect[] {
				new Effect(TypeEffect.INT, false, 1),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume de VOL"); put(Language.EN, ""); }}, "VOL1", new Effect[] {
				new Effect(TypeEffect.VOL, false, 1),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume d'AGI"); put(Language.EN, ""); }}, "AGI1", new Effect[] {
				new Effect(TypeEffect.AGI, false, 1),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de FCE ultime"); put(Language.EN, ""); }}, "FCE3", new Effect[] {
				new Effect(TypeEffect.FCE, false, 3),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de VIT ultime"); put(Language.EN, ""); }}, "VIT3", new Effect[] {
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal d'INT ultime"); put(Language.EN, ""); }}, "INT3", new Effect[] {
				new Effect(TypeEffect.INT, false, 3),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de VOL ultime"); put(Language.EN, ""); }}, "VOL3", new Effect[] {
				new Effect(TypeEffect.VOL, false, 3),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal d'AGI ultime"); put(Language.EN, ""); }}, "AGI3", new Effect[] {
				new Effect(TypeEffect.AGI, false, 3),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de FCE ultime avancé"); put(Language.EN, ""); }}, "FCE6", new Effect[] {
				new Effect(TypeEffect.FCE, false, 6),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de VIT ultime avancé"); put(Language.EN, ""); }}, "VIT6", new Effect[] {
				new Effect(TypeEffect.VIT, false, 6),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal d'INT ultime avancé"); put(Language.EN, ""); }}, "INT6", new Effect[] {
				new Effect(TypeEffect.INT, false, 6),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal de VOL ultime avancé"); put(Language.EN, ""); }}, "VOL6", new Effect[] {
				new Effect(TypeEffect.VOL, false, 6),
			}),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal d'AGI ultime avancé"); put(Language.EN, ""); }}, "AGI6", new Effect[] {
				new Effect(TypeEffect.AGI, false, 6),
			}),
		};
	}
	
	public static Energy[] getVoidEnergy() {
		return new Energy[] {
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crystal de plume"); put(Language.EN, ""); }}, "void1"),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal ultime"); put(Language.EN, ""); }}, "void3"),
			new Energy(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristal ultime avancé"); put(Language.EN, ""); }}, "void6"),
		};
	}
}
