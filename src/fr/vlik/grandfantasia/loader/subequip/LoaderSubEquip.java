package fr.vlik.grandfantasia.loader.subequip;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeStaticEffect;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;
import fr.vlik.grandfantasia.subequip.Anima;
import fr.vlik.grandfantasia.subequip.Bague;
import fr.vlik.grandfantasia.subequip.CombiRunway;
import fr.vlik.grandfantasia.subequip.Costume;
import fr.vlik.grandfantasia.subequip.Runway;
import fr.vlik.grandfantasia.subequip.Souvenir;
import fr.vlik.grandfantasia.subequip.SouvenirEnchantment;
import fr.vlik.grandfantasia.subequip.Synthesis;
import fr.vlik.grandfantasia.stats.StaticEffect;

@SuppressWarnings("serial")
public class LoaderSubEquip extends LoaderTemplate {
	
	public static Map<Quality, Synthesis[]> getRideSynthesis() {
		return new EnumMap<Quality, Synthesis[]>(Quality.class) {{
			put(Quality.GOLD, LoaderSynthesis.getRideGold());
			put(Quality.ORANGE, LoaderSynthesis.getRideOrange());
			put(Quality.BLUE, LoaderSynthesis.getRideBlue());
			put(Quality.GREEN, LoaderSynthesis.getRideGreen());
			put(Quality.WHITE, LoaderSynthesis.getRideWhite());
		}};
	}
	
	public static Map<Quality, Synthesis[]> getThroneSynthesis() {
		return new EnumMap<Quality, Synthesis[]>(Quality.class) {{
			put(Quality.GOLD, LoaderSynthesis.getThroneGold());
			put(Quality.ORANGE, LoaderSynthesis.getThroneOrange());
			put(Quality.BLUE, LoaderSynthesis.getThroneBlue());
			put(Quality.GREEN, LoaderSynthesis.getThroneGreen());
			put(Quality.WHITE, LoaderSynthesis.getThroneWhite());
		}};
	}
	
	public static Map<Quality, Costume[]> getCostume() {
		return new EnumMap<Quality, Costume[]>(Quality.class) {{
			put(Quality.GOLD, LoaderCostume.getGold());
			put(Quality.BLUE, LoaderCostume.getBlue());
			put(Quality.GREEN, LoaderCostume.getGreen());
			put(Quality.WHITE, LoaderCostume.getWhite());
		}};
	}
	
	public static Bague[] getBague() {
		return new Bague[] {
			new Bague(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aucun"); put(Language.EN, "None"); }}, Quality.GREY, "null", null),
			new Bague(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Magique"); put(Language.EN, "Magical Passion Ring"); }}, Quality.BLUE, "blue", new Effect[] {
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Atk, false, 10, true),
				new Effect(TypeEffect.AtkD, false, 10, true),
				new Effect(TypeEffect.AtkM, false, 10, true),
			}),
			new Bague(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bague Magique 5 carats"); put(Language.EN, "5-Carat Magical Passion Ring"); }}, Quality.GOLD, "gold", new Effect[] {
				new Effect(TypeEffect.FCE, false, 10, true),
				new Effect(TypeEffect.VIT, false, 10, true),
				new Effect(TypeEffect.INT, false, 10, true),
				new Effect(TypeEffect.VOL, false, 10, true),
				new Effect(TypeEffect.AGI, false, 10, true),
				new Effect(TypeEffect.Atk, false, 20, true),
				new Effect(TypeEffect.AtkD, false, 20, true),
				new Effect(TypeEffect.AtkM, false, 20, true),
			}),
		};
	}
	
	public static Anima[] getAnima() {
		return LoaderAnima.getAnima();
	}
	
	public static Runway[] getRunway() {
		return new Runway[] {
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Archimage"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.Atk, true, 1),
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aurore"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 4),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Balance"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 4),
				new Effect(TypeEffect.INT, false, 4),
				new Effect(TypeEffect.VOL, false, 4),
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de l'univers"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 15),
				new Effect(TypeEffect.VIT, false, 15),
				new Effect(TypeEffect.INT, false, 15),
				new Effect(TypeEffect.VOL, false, 15),
				new Effect(TypeEffect.AGI, false, 15),
				new Effect(TypeEffect.PV, true, 4),
				new Effect(TypeEffect.PM, true, 4),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction rapide"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 6),
				new Effect(TypeEffect.Toucher, false, 6),
				new Effect(TypeEffect.Depla, false, 10),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Berserker"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
				new Effect(TypeEffect.PM, true, 2),
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
				new Effect(TypeEffect.ReducSkillM, false, 3),
				new Proc(0, Activation.Attacked, new Calculable[] {
					new Effect(TypeEffect.ReflectP_old, false, 100),
					new Effect(TypeEffect.ReflectM_old, false, 100),
				}),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bravoure"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 7),
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.Atk, true, 2),
				new Effect(TypeEffect.AtkD, true, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chance"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 2),
				new Effect(TypeEffect.TCCM, false, 2),
				new Effect(TypeEffect.RTCCP, false, 2),
				new Effect(TypeEffect.RTCCM, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Enchantement"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert des arcanes"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 8),
				new Effect(TypeEffect.PeneM, false, 4),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert en physique"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.DegSkillP, false, 8),
				new Effect(TypeEffect.PeneP, false, 4),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Folie"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 10),
				new Effect(TypeEffect.VIT, false, 10),
				new Effect(TypeEffect.INT, false, 10),
				new Effect(TypeEffect.VOL, false, 10),
				new Effect(TypeEffect.AGI, false, 10),
				new Effect(TypeEffect.BoostCraft, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 3),
				new Effect(TypeEffect.ReducStdD, false, 3),
				new Effect(TypeEffect.ReducSkillP, false, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hymne"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 4),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Illusion"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 3),
				new Effect(TypeEffect.VitComp, false, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "L'art de la cupidité"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 4),
				new Effect(TypeEffect.VitComp, false, 5),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lutte"); put(Language.EN, ""); }}, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2STD_old, 5),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Magistrat"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.INT, false, 6),
				new Effect(TypeEffect.VOL, false, 6),
				new Effect(TypeEffect.AGI, false, 6),
				new Effect(TypeEffect.DefP, true, 3),
				new Effect(TypeEffect.DefM, true, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction"); put(Language.EN, ""); }}, new Calculable[] {
				new StaticEffect(TypeStaticEffect.x2Skill_old, 5),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prêtre"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.ReducSkillM, false, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ranger"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 5),
				new Effect(TypeEffect.ESQ, false, 3),
				new Effect(TypeEffect.Toucher, false, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rapidité"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 5),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sang"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 1),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sagesse"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.INT, false, 7),
				new Effect(TypeEffect.VOL, false, 7),
				new Effect(TypeEffect.AtkM, true, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sceau de VOL"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VOL, false, 14),
				new Effect(TypeEffect.DefM, true, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sorcier"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 3),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Synthétisation"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.BoostCraft, false, 2),
				new Effect(TypeEffect.RTCCP, false, 4),
				new Effect(TypeEffect.RTCCM, false, 4),
				new Effect(TypeEffect.RDCCP, false, 8),
				new Effect(TypeEffect.RDCCM, false, 8),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tempête"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.VIT, false, 7),
				new Effect(TypeEffect.AGI, false, 7),
				new Effect(TypeEffect.VitAtk, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Turbo"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.Depla, false, 2),
				new Effect(TypeEffect.VitAtk, false, 2),
				new Effect(TypeEffect.VitComp, false, 2),
			}),
			new Runway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vive la cupidité"); put(Language.EN, ""); }}, new Calculable[] {
				new Effect(TypeEffect.Atk, true, 4),
				new Effect(TypeEffect.AtkD, true, 4),
				new Effect(TypeEffect.VitAtk, false, 4),
				new Effect(TypeEffect.VitAtkD, false, 4),
			}),
		};
	}
	
	public static CombiRunway[] getCombiRunway() {
		return new CombiRunway[] {
			new CombiRunway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runway Arme"); put(Language.EN, "Weapon Runway"); }},
				new Runway[] {
					Runway.get("Lutte"),
					Runway.get("Malédiction"),
				}),
			new CombiRunway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runway Tête"); put(Language.EN, "Head Runway"); }},
				new Runway[] {
					Runway.get("Prêtre"),
					Runway.get("Hymne"),
				}),
			new CombiRunway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runway Tenue"); put(Language.EN, "Body Runway"); }},
				new Runway[] {
					Runway.get("Sceau de VOL"),
					Runway.get("Tempête"),
				}),
			new CombiRunway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runway Dos"); put(Language.EN, "Back Runway"); }},
				new Runway[] {
					Runway.get("Turbo"),
					Runway.get("Synthétisation"),
				}),
			new CombiRunway(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Runway Nouveauté"); put(Language.EN, "New Runway"); }},
				new Runway[] {
					Runway.get("Expert en physique"),
					Runway.get("Chance"),
					Runway.get("Magistrat"),
				}),
		};
	}

	public static Souvenir[] getSouvenir() {
		return new Souvenir[] {
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lézard des glaces en peluche"); put(Language.EN, "Chillclaw Lizard Doll"); }}, 73, Quality.ORANGE, "73orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 460, true),
				new Effect(TypeEffect.FCE, false, 7, true),
				new Effect(TypeEffect.INT, false, 7, true),
				new Effect(TypeEffect.AGI, false, 7, true),
				new Effect(TypeEffect.Sacre, false, 15),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Singe de métal dur en peluche"); put(Language.EN, "Golden Armored Ape Doll"); }}, 68, Quality.GREEN, "68green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 402, true),
				new Effect(TypeEffect.VIT, false, 3, true),
				new Effect(TypeEffect.VOL, false, 4, true),
				new Effect(TypeEffect.Foudre, false, 13),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fée Joyau du Val en peluche"); put(Language.EN, "Snow Faerie Sprite Doll"); }}, 63, Quality.WHITE, "63white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 347, true),
				new Effect(TypeEffect.PV, false, 480),
				new Effect(TypeEffect.Glace, false, 10),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Géant diabolique en peluche"); put(Language.EN, "Evil Eye Doll"); }}, 58, Quality.ORANGE, "58orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 394, true),
				new Effect(TypeEffect.FCE, false, 6, true),
				new Effect(TypeEffect.INT, false, 6, true),
				new Effect(TypeEffect.AGI, false, 6, true),
				new Effect(TypeEffect.Nature, false, 14),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gobelin masqué en peluche"); put(Language.EN, "Masked Goblin Doll"); }}, 53, Quality.GREEN, "53green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 340, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 3, true),
				new Effect(TypeEffect.Ombre, false, 11),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chèvre cornue en peluche"); put(Language.EN, "Crook-Horned Goat Doll"); }}, 48, Quality.WHITE, "48white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 272, true),
				new Effect(TypeEffect.PV, false, 400),
				new Effect(TypeEffect.Feu, false, 9),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grosse chauve-souris vampire en peluche"); put(Language.EN, "Fat Vampire Bat Doll"); }}, 43, Quality.ORANGE, "43orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 322, true),
				new Effect(TypeEffect.FCE, false, 4, true),
				new Effect(TypeEffect.INT, false, 4, true),
				new Effect(TypeEffect.AGI, false, 4, true),
				new Effect(TypeEffect.Glace, false, 12),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Araignée sanguinaire en peluche"); put(Language.EN, "Blood Spider Doll"); }}, 38, Quality.GREEN, "38green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 271, true),
				new Effect(TypeEffect.VIT, false, 2, true),
				new Effect(TypeEffect.VOL, false, 2, true),
				new Effect(TypeEffect.Sacre, false, 10),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grosse larve en peluche"); put(Language.EN, "Pinchworm Doll"); }}, 33, Quality.WHITE, "33white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 224, true),
				new Effect(TypeEffect.PV, false, 240),
				new Effect(TypeEffect.Foudre, false, 7),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ourson en peluche"); put(Language.EN, "Honey Bear Doll"); }}, 28, Quality.ORANGE, "28orange", new Effect[] {
				new Effect(TypeEffect.DefM, false, 240, true),
				new Effect(TypeEffect.FCE, false, 3, true),
				new Effect(TypeEffect.INT, false, 3, true),
				new Effect(TypeEffect.AGI, false, 3, true),
				new Effect(TypeEffect.Feu, false, 11),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cerf noctambule en peluche"); put(Language.EN, "Woodland Deer Doll"); }}, 23, Quality.GREEN, "23green", new Effect[] {
				new Effect(TypeEffect.DefM, false, 191, true),
				new Effect(TypeEffect.VIT, false, 1, true),
				new Effect(TypeEffect.VOL, false, 1, true),
				new Effect(TypeEffect.Nature, false, 8),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Crabe à Carapace en peluche"); put(Language.EN, "Shell Crab Doll"); }}, 18, Quality.WHITE, "18white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 145, true),
				new Effect(TypeEffect.PV, false, 160),
				new Effect(TypeEffect.Ombre, false, 6),
			}),
			new Souvenir(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Poupée de Gélapin"); put(Language.EN, "Jelly Rabbit Doll"); }}, 12, Quality.WHITE, "12white", new Effect[] {
				new Effect(TypeEffect.DefM, false, 103, true),
				new Effect(TypeEffect.PV, false, 80),
				new Effect(TypeEffect.Sacre, false, 5),
			}),
		};
	}
	
	public static SouvenirEnchantment[] getSouvenirEnchantment() {
		return LoaderSouvenirEnchantment.getSouvenirEnchantment();
	}
}
