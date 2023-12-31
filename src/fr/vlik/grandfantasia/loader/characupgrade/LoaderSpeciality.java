package fr.vlik.grandfantasia.loader.characupgrade;

import java.util.EnumMap;

import fr.vlik.grandfantasia.characupgrade.Speciality;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.enums.TypeMultipleHit;
import fr.vlik.grandfantasia.equip.Weapon.WeaponType;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.stats.Effect;
import fr.vlik.grandfantasia.stats.Effect.TypeCalcul;
import fr.vlik.grandfantasia.stats.MultipleHit;
import fr.vlik.grandfantasia.stats.Proc;
import fr.vlik.grandfantasia.stats.Proc.Activation;

@SuppressWarnings("serial")
public class LoaderSpeciality extends LoaderTemplate {
	
	static Speciality[] getClass0() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force Frénétique"); put(Language.EN, "Furious Force"); }}, 45, "0-0", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coup Critique Mortelle"); put(Language.EN, ""); }}, 45, "0-1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.8),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître dans l'Usage de la Hache"); put(Language.EN, "Axe Grinder"); }}, 45, "0-2", new Calculable[] {
				new Effect(TypeEffect.DegHa, false, 1),
				new Effect(TypeEffect.DegHa2M, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Confession Brutable"); put(Language.EN, ""); }}, 45, "0-3", new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 1),
				new Effect(TypeEffect.DegMa2M, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armes à Vacillement"); put(Language.EN, ""); }}, 45, "0-4", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tatouage Ardent"); put(Language.EN, "Burning Tattoo"); }}, 45, "0-5", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1),
				new Effect(TypeEffect.DegEp2M, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Détection de Défaut"); put(Language.EN, "Chink in the Armor"); }}, 60, "0-6", new Calculable[] {
				new Effect(TypeEffect.DegEp2M, false, 2),
				new Effect(TypeEffect.DegMa2M, false, 2),
				new Effect(TypeEffect.DegHa2M, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cœur Féroce"); put(Language.EN, ""); }}, 60, "0-7", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté Tenace"); put(Language.EN, "Steadfast Will"); }}, 60, "0-8", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 2),
				new Effect(TypeEffect.RTCCM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Forme Rapide"); put(Language.EN, "Lightning Slasher"); }}, 60, "0-9", new Calculable[] {
				new Effect(TypeEffect.VitAtkDuo, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Carrure de Fer"); put(Language.EN, "Iron Fury"); }}, 75, "0-10", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Peau Lumineuse"); put(Language.EN, "Luminous Shroud"); }}, 75, "0-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre Sanguinaire"); put(Language.EN, "Blood Mirage"); }}, 75, "0-12", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Figure de Proue"); put(Language.EN, "Front Guard Stance"); }}, 75, "0-13", new Calculable[] {
				new Effect(TypeEffect.Parade, false, 1),
				//Add Rparade
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Exploration du Cerveau"); put(Language.EN, "Mental Fortitude"); }}, 75, "0-14", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut"); put(Language.EN, ""); }}, 75, "0-15", new Calculable[] {
				new Effect(TypeEffect.Toucher, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Endurance"); put(Language.EN, "Stamina"); }}, 91, "0-16", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "La réponse"); put(Language.EN, "Answerer"); }}, 91, "0-17", new Calculable[] {
				new Effect(TypeEffect.VitAtkDuo, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Abus de faiblesse"); put(Language.EN, "Weakness Breakthrough"); }}, 91, "0-18", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bain de sang"); put(Language.EN, "Bloodbath"); }}, 91, "0-19", new Calculable[] {
				new Effect(TypeEffect.RegenCB, false, 0.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transformation du pouvoir"); put(Language.EN, ""); }}, 100, "0-20", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.FCE, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force frénétique ultime"); put(Language.EN, ""); }}, 100, "0-21", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat de mêlée"); put(Language.EN, ""); }}, 100, "0-22", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe de fer"); put(Language.EN, ""); }}, 100, "0-23", new Calculable[] {
				new Effect(TypeEffect.DegSkillP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste du bouclier"); put(Language.EN, ""); }}, 100, "0-24", new Calculable[] {
				new Effect(TypeEffect.ShieldDefP, false, 1),
				new Effect(TypeEffect.ShieldDefM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure solide"); put(Language.EN, ""); }}, 100, "0-25", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 1),
			}),
		};
	}
	
	static Speciality[] getClass1() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Inébranlable"); put(Language.EN, ""); }}, 45, "1-0", new Calculable[] {
				new Effect(TypeEffect.HealD, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maitre dans l'usage du bouclier"); put(Language.EN, ""); }}, 45, "1-1", new Calculable[] {
				new Effect(TypeEffect.Parade, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entrainement à la résistance"); put(Language.EN, ""); }}, 45, "1-2", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pas de lumière"); put(Language.EN, ""); }}, 45, "1-3", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Connaitre son ennemi"); put(Language.EN, ""); }}, 45, "1-4", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Foi en la lumière sacrée"); put(Language.EN, ""); }}, 45, "1-5", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 4),
				new Effect(TypeEffect.Ombre, false, 4),
				new Effect(TypeEffect.Foudre, false, 4),
				new Effect(TypeEffect.Feu, false, 4),
				new Effect(TypeEffect.Glace, false, 4),
				new Effect(TypeEffect.Nature, false, 4),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chevalerie"); put(Language.EN, ""); }}, 60, "1-6", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier résistant"); put(Language.EN, ""); }}, 60, "1-7", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Injection de force"); put(Language.EN, ""); }}, 60, "1-8", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection du sprite"); put(Language.EN, ""); }}, 60, "1-9", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
				new Effect(TypeEffect.ReducSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Meneur"); put(Language.EN, ""); }}, 75, "1-10", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1),
				new Effect(TypeEffect.DegMa, false, 1),
				new Effect(TypeEffect.DegHa, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection divine"); put(Language.EN, ""); }}, 75, "1-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sans merci"); put(Language.EN, ""); }}, 75, "1-12", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Alerte"); put(Language.EN, ""); }}, 75, "1-13", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mouvement lucide"); put(Language.EN, ""); }}, 75, "1-14", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Frappe du juge"); put(Language.EN, ""); }}, 75, "1-15", new Calculable[] {
				new Effect(TypeEffect.DegEp2M, false, 1.5),
				new Effect(TypeEffect.DegMa2M, false, 1.5),
				new Effect(TypeEffect.DegHa2M, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Immense Lumière"); put(Language.EN, ""); }}, 91, "1-16", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Présence d'Esprit"); put(Language.EN, ""); }}, 91, "1-17", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, 10),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Provocation dogmatique"); put(Language.EN, ""); }}, 91, "1-18", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 4),
				new Effect(TypeEffect.RTCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hardiesse"); put(Language.EN, ""); }}, 91, "1-19", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 3),
				new Effect(TypeEffect.RDCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Croissance physique"); put(Language.EN, ""); }}, 100, "1-20", new Calculable[] {
				new Effect(TypeEffect.VIT, 4, TypeEffect.FCE, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement d'élite"); put(Language.EN, ""); }}, 100, "1-21", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
				new Effect(TypeEffect.INT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réflexes travaillés"); put(Language.EN, ""); }}, 100, "1-22", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 5),
				new Effect(TypeEffect.AGI, false, 12),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Auto-défense"); put(Language.EN, ""); }}, 100, "1-23", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Barrière de défense"); put(Language.EN, ""); }}, 100, "1-24", new Calculable[] {
				new Effect(TypeEffect.ShieldDefP, true, 2),
				new Effect(TypeEffect.ShieldDefM, true, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement à l'armure lourde"); put(Language.EN, ""); }}, 100, "1-25", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, true, 2),
				new Effect(TypeEffect.ReducPeneM, true, 1),
			}),
		};
	}
	
	static Speciality[] getClass2() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ruée"); put(Language.EN, ""); }}, 45, "2-0", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1.3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des Bêtes"); put(Language.EN, ""); }}, 45, "2-1", new Calculable[] {
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegBete, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle du Vent"); put(Language.EN, ""); }}, 45, "2-2", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tireur Expérimenté"); put(Language.EN, ""); }}, 45, "2-3", new Calculable[] {
				new Effect(TypeEffect.ToucherD, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Survivant des Terres Enneigées"); put(Language.EN, ""); }}, 45, "2-4", new Calculable[] {
				new Effect(TypeEffect.Glace, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître dans l'Usage des Flèches"); put(Language.EN, ""); }}, 45, "2-5", new Calculable[] {
				new Effect(TypeEffect.DegArc, false, 1.5),
				new Effect(TypeEffect.VitAtkArc, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voyage dans la Forêt"); put(Language.EN, ""); }}, 60, "2-6", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste Poudre à Canon"); put(Language.EN, ""); }}, 60, "2-7", new Calculable[] {
				new Effect(TypeEffect.TCCGun, false, 0.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sniper"); put(Language.EN, ""); }}, 60, "2-8", new Calculable[] {
				new Effect(TypeEffect.DCCArc, false, 3),
				new Effect(TypeEffect.DCCGun, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle"); put(Language.EN, ""); }}, 60, "2-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robustesse Physique"); put(Language.EN, ""); }}, 75, "2-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force Naturelle"); put(Language.EN, ""); }}, 75, "2-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tatouage Magique"); put(Language.EN, ""); }}, 75, "2-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Visée Zen"); put(Language.EN, ""); }}, 75, "2-13", new Calculable[] {
				new Effect(TypeEffect.TCCArc, false, 1),
				new Effect(TypeEffect.TCCGun, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combat Rapproché"); put(Language.EN, ""); }}, 75, "2-14", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 2.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ballistics Research"); put(Language.EN, ""); }}, 75, "2-15", new Calculable[] {
				new Effect(TypeEffect.AtkD, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tir tranchant"); put(Language.EN, ""); }}, 91, "2-16", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Capacité vitale"); put(Language.EN, ""); }}, 91, "2-17", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration des munitions"); put(Language.EN, ""); }}, 91, "2-18", new Calculable[] {
				new Effect(TypeEffect.DegGun, false, 1.5),
				new Effect(TypeEffect.DCCGun, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Exercice"); put(Language.EN, ""); }}, 91, "2-19", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.AGI, false, 4),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasse de vitesse"); put(Language.EN, ""); }}, 100, "2-20", new Calculable[] {
				new Effect(TypeEffect.VitAtkD, 3, TypeEffect.TCCP, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Potentiel caché"); put(Language.EN, ""); }}, 100, "2-21", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Flexibilité extrême"); put(Language.EN, ""); }}, 100, "2-22", new Calculable[] {
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chasse sans fin"); put(Language.EN, ""); }}, 100, "2-23", new Calculable[] {
				new Proc(1, Activation.Standard, new Calculable[] {
					new MultipleHit(TypeMultipleHit.Double, 3),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure à pointes"); put(Language.EN, ""); }}, 100, "2-24", new Calculable[] {
				new Proc(1, Activation.Attacked, new Calculable[] {
					new MultipleHit(TypeMultipleHit.ReflectP, 2),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ténacité"); put(Language.EN, ""); }}, 100, "2-25", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
			}),
		};
	}
	
	static Speciality[] getClass3() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vivacité Tourbillonnante"); put(Language.EN, ""); }}, 45, "3-0", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aussi Lent qu'une Fôret"); put(Language.EN, ""); }}, 45, "3-1", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rapine Ardente"); put(Language.EN, ""); }}, 45, "3-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Inébranlable comme une Montagne"); put(Language.EN, ""); }}, 45, "3-3", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mise au Point"); put(Language.EN, ""); }}, 45, "3-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Position Accroupie"); put(Language.EN, ""); }}, 45, "3-5", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cœur du Combattant"); put(Language.EN, ""); }}, 60, "3-6", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.FCE, false, 4),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Démon de Boucher"); put(Language.EN, ""); }}, 60, "3-7", new Calculable[] {
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître de Kendo"); put(Language.EN, ""); }}, 60, "3-8", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1.5),
				new Effect(TypeEffect.DegEp2M, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Main du Revers de l'Ombre"); put(Language.EN, ""); }}, 60, "3-9", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement de Spartiate"); put(Language.EN, ""); }}, 75, "3-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté du Survivant"); put(Language.EN, ""); }}, 75, "3-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Regard Perçant"); put(Language.EN, ""); }}, 75, "3-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection du Visage"); put(Language.EN, ""); }}, 75, "3-13", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque aux Tripes"); put(Language.EN, ""); }}, 75, "3-14", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouquet Final"); put(Language.EN, ""); }}, 75, "3-15", new Calculable[] {
				new Effect(TypeEffect.DegDuo, false, 1.2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Art des couteaux fusants"); put(Language.EN, ""); }}, 91, "3-16", new Calculable[] {
				new Effect(TypeEffect.VitAtkDuo, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissante taillade"); put(Language.EN, ""); }}, 91, "3-17", new Calculable[] {
				new Effect(TypeEffect.DegEp, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Raffinement de l'esprit"); put(Language.EN, ""); }}, 91, "3-18", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance de l'ombre"); put(Language.EN, ""); }}, 91, "3-19", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 6),
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épées d'ombre et de lumière"); put(Language.EN, ""); }}, 100, "3-20", new Calculable[] {
				new Effect(TypeEffect.VitAtk, 3, TypeEffect.TCCP, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement au poids"); put(Language.EN, ""); }}, 100, "3-21", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Réflexe rapide"); put(Language.EN, ""); }}, 100, "3-22", new Calculable[] {
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assaut explosif"); put(Language.EN, ""); }}, 100, "3-23", new Calculable[] {
				new Proc(1, Activation.Standard, new Calculable[] {
					new MultipleHit(TypeMultipleHit.Double, 3),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Piège raffiné"); put(Language.EN, ""); }}, 100, "3-24", new Calculable[] {
				new Proc(1, Activation.Attacked, new Calculable[] {
					new MultipleHit(TypeMultipleHit.ReflectP, 2),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Formation mentale"); put(Language.EN, ""); }}, 100, "3-25", new Calculable[] {
				new Effect(TypeEffect.ReducSkillM, false, 1),
			}),
		};
	}
	
	static Speciality[] getClass4() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Assassin de Démon"); put(Language.EN, ""); }}, 45, "4-0", new Calculable[] {
				new Proc(1, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegDemon, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection de l'Eglise"); put(Language.EN, ""); }}, 45, "4-1", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 2),
				new Effect(TypeEffect.Ombre, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement de Clerc Martial"); put(Language.EN, ""); }}, 45, "4-2", new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 1),
				new Effect(TypeEffect.DegMa2M, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement de la Volonté"); put(Language.EN, ""); }}, 45, "4-3", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ecole des Morts Sacrés"); put(Language.EN, ""); }}, 45, "4-4", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Impact de Clerc Martial"); put(Language.EN, ""); }}, 45, "4-5", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 0.8),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître de Protection"); put(Language.EN, ""); }}, 60, "4-6", new Calculable[] {
				new Effect(TypeEffect.Parade, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Couverture Magique"); put(Language.EN, ""); }}, 60, "4-7", new Calculable[] {
				new Effect(TypeEffect.ReducSkillM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Etude du Sénateur"); put(Language.EN, ""); }}, 60, "4-8", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Oeil Sacré"); put(Language.EN, ""); }}, 60, "4-9", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arts Martiaux"); put(Language.EN, ""); }}, 75, "4-10", new Calculable[] {
				new Effect(TypeEffect.Atk, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Incantation Hâtée"); put(Language.EN, ""); }}, 75, "4-11", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rédemption"); put(Language.EN, ""); }}, 75, "4-12", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Souffle d'Éternité"); put(Language.EN, ""); }}, 75, "4-13", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Spécialiste de Défense"); put(Language.EN, ""); }}, 75, "4-14", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Conseil Divin"); put(Language.EN, ""); }}, 75, "4-15", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prière mantrique"); put(Language.EN, ""); }}, 91, "4-16", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Foi en la lumière"); put(Language.EN, ""); }}, 91, "4-17", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Solide volonté"); put(Language.EN, ""); }}, 91, "4-18", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 12),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Prophétie divine"); put(Language.EN, ""); }}, 91, "4-19", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bénédiction de la foi"); put(Language.EN, ""); }}, 100, "4-20", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ode sacrée"); put(Language.EN, ""); }}, 100, "4-21", new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Larmes d'adieu"); put(Language.EN, ""); }}, 100, "4-22", new Calculable[] {
				new Effect(TypeEffect.HealD, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure cristalline"); put(Language.EN, ""); }}, 100, "4-23", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cape Runique"); put(Language.EN, ""); }}, 100, "4-24", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier des Psaumes Sacrés"); put(Language.EN, ""); }}, 100, "4-25", new Calculable[] {
				new Effect(TypeEffect.ShieldDefP, false, 1),
				new Effect(TypeEffect.ShieldDefM, false, 1.5),
			}),
		};
	}
	
	static Speciality[] getClass5() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit de l'Aigle Majestueux"); put(Language.EN, ""); }}, 45, "5-0", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit de Loup Spectral"); put(Language.EN, ""); }}, 45, "5-1", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit de Singe Géant"); put(Language.EN, ""); }}, 45, "5-2", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
				new Effect(TypeEffect.ReducSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître dans l'Usage des Plantes"); put(Language.EN, ""); }}, 45, "5-3", new Calculable[] {
				new Proc(1, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegPlante, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Totem d'Autorité"); put(Language.EN, ""); }}, 45, "5-4", new Calculable[] {
				new Effect(TypeEffect.DegMa, false, 1),
				new Effect(TypeEffect.DegMa2M, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arc-en-Ciel"); put(Language.EN, ""); }}, 45, "5-5", new Calculable[] {
				new Effect(TypeEffect.Sacre, false, 1),
				new Effect(TypeEffect.Ombre, false, 1),
				new Effect(TypeEffect.Foudre, false, 1),
				new Effect(TypeEffect.Feu, false, 1),
				new Effect(TypeEffect.Glace, false, 1),
				new Effect(TypeEffect.Nature, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Déclaration de la Tête Tribale"); put(Language.EN, ""); }}, 60, "5-6", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Physique Robuste"); put(Language.EN, ""); }}, 60, "5-7", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Main Supersonique"); put(Language.EN, ""); }}, 60, "5-8", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Murmures du Vent"); put(Language.EN, ""); }}, 60, "5-9", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Béatitude du Dieu du Vent"); put(Language.EN, ""); }}, 75, "5-10", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Miracle des Rochers"); put(Language.EN, ""); }}, 75, "5-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Héritage des Arcanes"); put(Language.EN, ""); }}, 75, "5-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Anticipation Stellaire"); put(Language.EN, ""); }}, 75, "5-13", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 2),
				new Effect(TypeEffect.ToucherD, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Force des Ancêtres"); put(Language.EN, ""); }}, 75, "5-14", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Arts Tribaux"); put(Language.EN, ""); }}, 75, "5-15", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 3),
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Griffe de loup démoniaque"); put(Language.EN, ""); }}, 91, "5-16", new Calculable[] {
				new Effect(TypeEffect.DegSkillP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Appel du fier faucon"); put(Language.EN, ""); }}, 91, "5-17", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pranayama de la nature"); put(Language.EN, ""); }}, 91, "5-18", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rage du singe"); put(Language.EN, ""); }}, 91, "5-19", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 1),
				new Effect(TypeEffect.RTCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Foi indéfectible"); put(Language.EN, ""); }}, 100, "5-20", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pouvoir sacré"); put(Language.EN, ""); }}, 100, "5-21", new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Explosion mentale"); put(Language.EN, ""); }}, 100, "5-22", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 12),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défense de Lumière Sacrée"); put(Language.EN, ""); }}, 100, "5-23", new Calculable[] {
				new Effect(TypeEffect.ReducPeneP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pluie protectrice"); put(Language.EN, ""); }}, 100, "5-24", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Psalmodie"); put(Language.EN, ""); }}, 100, "5-25", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -5),
			}),
		};
	}
	
	static Speciality[] getClass6() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître dans l'Usage de la Magie"); put(Language.EN, ""); }}, 45, "6-0", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance des Éléments"); put(Language.EN, ""); }}, 45, "6-1", new Calculable[] {
				new Effect(TypeEffect.Foudre, false, 2),
				new Effect(TypeEffect.Feu, false, 2),
				new Effect(TypeEffect.Glace, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Masque des Éléments"); put(Language.EN, ""); }}, 45, "6-2", new Calculable[] {
				new Effect(TypeEffect.ReducSkillM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sort des Éléments"); put(Language.EN, ""); }}, 45, "6-3", new Calculable[] {
				new Proc(1, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegElem, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté de la Sorcellerie"); put(Language.EN, ""); }}, 45, "6-4", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Parler Clairement"); put(Language.EN, ""); }}, 45, "6-5", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Connaissance Runique"); put(Language.EN, ""); }}, 60, "6-6", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Etude de la magie"); put(Language.EN, ""); }}, 60, "6-7", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ombre Magique"); put(Language.EN, ""); }}, 60, "6-8", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Expert en Explosion Magique"); put(Language.EN, ""); }}, 60, "6-9", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Existence des Éléments"); put(Language.EN, ""); }}, 75, "6-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chamana du Vide"); put(Language.EN, ""); }}, 75, "6-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
				new Effect(TypeEffect.MEN, false, -1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure des Arcanes"); put(Language.EN, ""); }}, 75, "6-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Perspicacité"); put(Language.EN, ""); }}, 75, "6-13", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 2),
				new Effect(TypeEffect.ToucherD, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Redimensionnement"); put(Language.EN, ""); }}, 75, "6-14", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chamana de Gravité"); put(Language.EN, ""); }}, 75, "6-15", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie transcendée"); put(Language.EN, ""); }}, 91, "6-16", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement de l'esprit"); put(Language.EN, ""); }}, 91, "6-17", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Inscriptions ultimes"); put(Language.EN, ""); }}, 91, "6-18", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 6),
				new Effect(TypeEffect.INT, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bâton gravé"); put(Language.EN, ""); }}, 91, "6-19", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1, WeaponType.BATON),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transformation spirituelle"); put(Language.EN, ""); }}, 100, "6-20", new Calculable[] {
				new Effect(TypeEffect.INT, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Grand archimage"); put(Language.EN, ""); }}, 100, "6-21", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 1.2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Résistance Bénie"); put(Language.EN, ""); }}, 100, "6-22", new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement des Arcanes"); put(Language.EN, ""); }}, 100, "6-23", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sceptre magique"); put(Language.EN, ""); }}, 100, "6-24", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1, WeaponType.BATON),
				new Effect(TypeEffect.ReducStdD, false, 1, WeaponType.BATON),
				new Effect(TypeEffect.ReducSkillP, false, 1, WeaponType.BATON),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection de l'Archimage"); put(Language.EN, ""); }}, 100, "6-25", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 1),
			}),
		};
	}
	
	static Speciality[] getClass7() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Connaissance en Magie Noire"); put(Language.EN, ""); }}, 45, "7-0", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Menace"); put(Language.EN, ""); }}, 45, "7-1", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rituel de l'Âme Sanguinaire"); put(Language.EN, ""); }}, 45, "7-2", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Eclatement de l'Esprit"); put(Language.EN, ""); }}, 45, "7-3", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corrosion du Métal"); put(Language.EN, ""); }}, 45, "7-4", new Calculable[] {
				new Proc(1, Activation.Mag, new Calculable[] {
					new Effect(TypeEffect.DegMeca, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Maléfique"); put(Language.EN, ""); }}, 45, "7-5", new Calculable[] {
				new Effect(TypeEffect.Ombre, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coeur de la Sorcière"); put(Language.EN, ""); }}, 60, "7-6", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Envoûtement Rapide"); put(Language.EN, ""); }}, 60, "7-7", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.7),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renforcement Physique"); put(Language.EN, ""); }}, 60, "7-8", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Brume Fantôme Noire"); put(Language.EN, ""); }}, 60, "7-9", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coeur de Sorcière"); put(Language.EN, ""); }}, 75, "7-10", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection des Os"); put(Language.EN, ""); }}, 75, "7-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Barrière Spirituelle"); put(Language.EN, ""); }}, 75, "7-12", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Attaque Psychique"); put(Language.EN, ""); }}, 75, "7-13", new Calculable[] {
				new Effect(TypeEffect.Toucher, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection de la Chair"); put(Language.EN, ""); }}, 75, "7-14", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Invocation interdite"); put(Language.EN, ""); }}, 75, "7-15", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sang du démon"); put(Language.EN, ""); }}, 91, "7-16", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction des ombres"); put(Language.EN, ""); }}, 91, "7-17", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dissipation d'énergie"); put(Language.EN, ""); }}, 91, "7-18", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dissolution de Brume noire"); put(Language.EN, ""); }}, 91, "7-19", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1, WeaponType.BATON),
				new Effect(TypeEffect.ReducStdD, false, 1, WeaponType.BATON),
				new Effect(TypeEffect.ReducSkillP, false, 1, WeaponType.BATON),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Malédiction des ténèbres"); put(Language.EN, ""); }}, 100, "7-20", new Calculable[] {
				new Effect(TypeEffect.INT, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Archimage ténébreux"); put(Language.EN, ""); }}, 100, "7-21", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Consommation maléfique"); put(Language.EN, ""); }}, 100, "7-22", new Calculable[] {
				new Effect(TypeEffect.INT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sorcellerie Améliorée"); put(Language.EN, ""); }}, 100, "7-23", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Obscure Magie"); put(Language.EN, ""); }}, 100, "7-24", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1, WeaponType.BATON),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardiens de l'aura maléfique"); put(Language.EN, ""); }}, 100, "7-25", new Calculable[] {
				new Effect(TypeEffect.ReducPeneM, false, 1.2),
			}),
		};
	}
	
	static Speciality[] getClass8() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration d'Impact"); put(Language.EN, ""); }}, 45, "8-0", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Correction réticule"); put(Language.EN, ""); }}, 45, "8-1", new Calculable[] {
				new Effect(TypeEffect.ToucherP, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc de Surcadençage"); put(Language.EN, ""); }}, 45, "8-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître Arme mécanique"); put(Language.EN, ""); }}, 45, "8-3", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie à Neutrons"); put(Language.EN, ""); }}, 45, "8-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étude robotique"); put(Language.EN, ""); }}, 45, "8-5", new Calculable[] {
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMec, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accélération Mécanique"); put(Language.EN, ""); }}, 60, "8-6", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Mouvement"); put(Language.EN, ""); }}, 60, "8-7", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame de Phase"); put(Language.EN, ""); }}, 60, "8-8", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître d'Armes mécaniques doubles"); put(Language.EN, ""); }}, 60, "8-9", new Calculable[] {
				new Effect(TypeEffect.DegDuo, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cœur d'Acier"); put(Language.EN, ""); }}, 75, "8-10", new Calculable[] {
				new Effect(TypeEffect.PV, true, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure du Cœur"); put(Language.EN, ""); }}, 75, "8-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté aggressive"); put(Language.EN, ""); }}, 75, "8-12", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1.5),
				new Effect(TypeEffect.ReducStdD, false, 1.5),
				new Effect(TypeEffect.ReducSkillP, false, 1.5),
				new Effect(TypeEffect.ReducSkillM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier à Neutrons"); put(Language.EN, ""); }}, 75, "8-13", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Recherche Mécanique"); put(Language.EN, ""); }}, 75, "8-14", new Calculable[] {
				new Effect(TypeEffect.FCE, false, 5),
				new Effect(TypeEffect.VIT, false, 4),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration d'Arme mécanique"); put(Language.EN, ""); }}, 75, "8-15", new Calculable[] {
				new Effect(TypeEffect.DegMeca2M, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Neutrons"); put(Language.EN, ""); }}, 91, "8-16", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.FCE, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification de Phase"); put(Language.EN, ""); }}, 91, "8-17", new Calculable[] {
				new Effect(TypeEffect.VitAtk, 3, TypeEffect.TCCP, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Camouflage Optique"); put(Language.EN, ""); }}, 91, "8-18", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissance Nucléaire"); put(Language.EN, ""); }}, 91, "8-19", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Signal Amélioré"); put(Language.EN, ""); }}, 100, "8-20", new Calculable[] {
				new Effect(TypeEffect.AGI, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration nucléaire"); put(Language.EN, ""); }}, 100, "8-21", new Calculable[] {
				new Effect(TypeEffect.FCE, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amplification neutronique"); put(Language.EN, ""); }}, 100, "8-22", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie Améliorée"); put(Language.EN, ""); }}, 100, "8-23", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Protection externe"); put(Language.EN, ""); }}, 100, "8-24", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vol à basse altitude"); put(Language.EN, ""); }}, 100, "8-25", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1),
			}),
		};
	}
	
	static Speciality[] getClass9() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration de Réaction"); put(Language.EN, ""); }}, 45, "9-0", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement Tireur d'élite"); put(Language.EN, ""); }}, 45, "9-1", new Calculable[] {
				new Effect(TypeEffect.ToucherD, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc Haute Fréquence"); put(Language.EN, ""); }}, 45, "9-2", new Calculable[] {
				new Effect(TypeEffect.TCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître Canon Lourd"); put(Language.EN, ""); }}, 45, "9-3", new Calculable[] {
				new Effect(TypeEffect.DegStdD, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie à Neutrons"); put(Language.EN, ""); }}, 45, "9-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étude robotique"); put(Language.EN, ""); }}, 45, "9-5", new Calculable[] {
				new Proc(1, Activation.Phys, new Calculable[] {
					new Effect(TypeEffect.DegMec, false, 50),
				}),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chargement Rapide"); put(Language.EN, ""); }}, 60, "9-6", new Calculable[] {
				new Effect(TypeEffect.VitAtkGun, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert Nucléaire"); put(Language.EN, ""); }}, 60, "9-7", new Calculable[] {
				new Effect(TypeEffect.Depla, false, 1.2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Changement de Phase"); put(Language.EN, ""); }}, 60, "9-8", new Calculable[] {
				new Effect(TypeEffect.PeneP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Interférence Magnétique"); put(Language.EN, ""); }}, 60, "9-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Coeur de Feu"); put(Language.EN, ""); }}, 75, "9-10", new Calculable[] {
				new Effect(TypeEffect.PM, true, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure Coeur de Feu"); put(Language.EN, ""); }}, 75, "9-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Détermination Spéciale"); put(Language.EN, ""); }}, 75, "9-12", new Calculable[] {
				new Effect(TypeEffect.DegStdP, false, 1),
				new Effect(TypeEffect.DegStdD, false, 1),
				new Effect(TypeEffect.DegSkillP, false, 1),
				new Effect(TypeEffect.DegSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier de Plasma"); put(Language.EN, ""); }}, 75, "9-13", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Recherches sur les Munitions"); put(Language.EN, ""); }}, 75, "9-14", new Calculable[] {
				new Effect(TypeEffect.AGI, false, 5),
				new Effect(TypeEffect.VOL, false, 4),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration Canon Lourd"); put(Language.EN, ""); }}, 75, "9-15", new Calculable[] {
				new Effect(TypeEffect.TCCGun, false, 1.5, WeaponType.CANON),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Plasma"); put(Language.EN, ""); }}, 91, "9-16", new Calculable[] {
				new Effect(TypeEffect.VOL, 3, TypeEffect.AGI, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accélération de Phase"); put(Language.EN, ""); }}, 91, "9-17", new Calculable[] {
				new Effect(TypeEffect.VitAtkD, 3, TypeEffect.TCCP, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Suivi Optique"); put(Language.EN, ""); }}, 91, "9-18", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 2),
				new Effect(TypeEffect.ToucherD, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ressource Nucléaire"); put(Language.EN, ""); }}, 91, "9-19", new Calculable[] {
				new Effect(TypeEffect.DCCP, false, 1),
				new Effect(TypeEffect.DCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Énergie de transformation"); put(Language.EN, ""); }}, 100, "9-20", new Calculable[] {
				new Effect(TypeEffect.FCE, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Équilibrage de l'équipement"); put(Language.EN, ""); }}, 100, "9-21", new Calculable[] {
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Choc éducatif"); put(Language.EN, ""); }}, 100, "9-22", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Économiser ses forces"); put(Language.EN, ""); }}, 100, "9-23", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Recherche magique"); put(Language.EN, ""); }}, 100, "9-24", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Écailles miroir"); put(Language.EN, ""); }}, 100, "9-25", new Calculable[] {
				new Effect(TypeEffect.ESQ, true, 1),
			}),
		};
	}
	
	static Speciality[] getClass10() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fortifier Magie"); put(Language.EN, ""); }}, 45, "10-0", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Contrôle du Royaume"); put(Language.EN, ""); }}, 45, "10-1", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 1),
				new Effect(TypeEffect.ToucherD, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combustion Cristalline"); put(Language.EN, ""); }}, 45, "10-2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise de la lame"); put(Language.EN, ""); }}, 45, "10-3", new Calculable[] {
				new Effect(TypeEffect.DegLa, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Drainage Magique"); put(Language.EN, ""); }}, 45, "10-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accumulation Cristalline"); put(Language.EN, ""); }}, 45, "10-5", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse des Lames"); put(Language.EN, ""); }}, 60, "10-6", new Calculable[] {
				new Effect(TypeEffect.VitAtk, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Contrôle de Pouvoir Magique"); put(Language.EN, ""); }}, 60, "10-7", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lame Briseuse de Royaume"); put(Language.EN, ""); }}, 60, "10-8", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien du Royaume"); put(Language.EN, ""); }}, 60, "10-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Gardien Briseur de Magie"); put(Language.EN, ""); }}, 75, "10-10", new Calculable[] {
				new Effect(TypeEffect.ReducSkillM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier Magique"); put(Language.EN, ""); }}, 75, "10-11", new Calculable[] {
				new Effect(TypeEffect.DefM, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté du Néant"); put(Language.EN, ""); }}, 75, "10-12", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1.5),
				new Effect(TypeEffect.ReducStdD, false, 1.5),
				new Effect(TypeEffect.ReducSkillP, false, 1.5),
				new Effect(TypeEffect.ReducSkillM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Épée Magique Gardienne"); put(Language.EN, ""); }}, 75, "10-13", new Calculable[] {
				new Effect(TypeEffect.RTCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ascension de Lame Magique"); put(Language.EN, ""); }}, 75, "10-14", new Calculable[] {
				new Effect(TypeEffect.VIT, false, 4),
				new Effect(TypeEffect.INT, false, 5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Position"); put(Language.EN, ""); }}, 75, "10-15", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Échange de Capacité"); put(Language.EN, ""); }}, 91, "10-16", new Calculable[] {
				new Effect(TypeEffect.FCE, 3, TypeEffect.INT, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Échange de Cristal"); put(Language.EN, ""); }}, 91, "10-17", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cristallisation du Sang"); put(Language.EN, ""); }}, 91, "10-18", new Calculable[] {
				new Effect(TypeEffect.PV, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Combustion Temporelle"); put(Language.EN, ""); }}, 91, "10-19", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Absorption mentale"); put(Language.EN, ""); }}, 100, "10-20", new Calculable[] {
				new Effect(TypeEffect.INT, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Entraînement d'exorciste"); put(Language.EN, ""); }}, 100, "10-21", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Croissance cristalline"); put(Language.EN, ""); }}, 100, "10-22", new Calculable[] {
				new Effect(TypeEffect.VIT, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sacrifice du Cristal magique"); put(Language.EN, ""); }}, 100, "10-23", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 1.2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cercle cristallin"); put(Language.EN, ""); }}, 100, "10-24", new Calculable[] {
				new Effect(TypeEffect.RDCCM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tatouage de sang maudit"); put(Language.EN, ""); }}, 100, "10-25", new Calculable[] {
				new Proc(1, Activation.Attacked, new Calculable[] {
					new MultipleHit(TypeMultipleHit.ReflectM, 2),
				}),
			}),
		};
	}
	
	static Speciality[] getClass11() {
		return new Speciality[] {
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fortifier Cristal"); put(Language.EN, ""); }}, 45, "11-0", new Calculable[] {
				new Effect(TypeEffect.INT, false, 9),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Contrôle du Royaume"); put(Language.EN, ""); }}, 45, "11-1", new Calculable[] {
				new Effect(TypeEffect.ToucherP, false, 1),
				new Effect(TypeEffect.ToucherD, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vibration Cristalline"); put(Language.EN, ""); }}, 45, "11-2", new Calculable[] {
				new Effect(TypeEffect.TCCM, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise du Baton-Clé"); put(Language.EN, ""); }}, 45, "11-3", new Calculable[] {
				new Effect(TypeEffect.DegCle, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Drainage Magique"); put(Language.EN, ""); }}, 45, "11-4", new Calculable[] {
				new Effect(TypeEffect.CostComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Accumulation de Magie"); put(Language.EN, ""); }}, 45, "11-5", new Calculable[] {
				new Effect(TypeEffect.PM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Danse du cristal"); put(Language.EN, ""); }}, 60, "11-6", new Calculable[] {
				new Effect(TypeEffect.VitComp, false, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Contrôle du Pouvoir Magique"); put(Language.EN, ""); }}, 60, "11-7", new Calculable[] {
				new Effect(TypeEffect.AtkM, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Déformation Temporele"); put(Language.EN, ""); }}, 60, "11-8", new Calculable[] {
				new Effect(TypeEffect.PeneM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Royaume de Chronos"); put(Language.EN, ""); }}, 60, "11-9", new Calculable[] {
				new Effect(TypeEffect.MEN, false, -1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier Cristal Gardien"); put(Language.EN, ""); }}, 75, "11-10", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 2),
				new Effect(TypeEffect.ReducStdD, false, 2),
				new Effect(TypeEffect.ReducSkillP, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier Temporel"); put(Language.EN, ""); }}, 75, "11-11", new Calculable[] {
				new Effect(TypeEffect.DefP, true, 1.5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Volonté du Maître du Temps"); put(Language.EN, ""); }}, 75, "11-12", new Calculable[] {
				new Effect(TypeEffect.ReducStdP, false, 1),
				new Effect(TypeEffect.ReducStdD, false, 1),
				new Effect(TypeEffect.ReducSkillP, false, 1),
				new Effect(TypeEffect.ReducSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Marionnette de Gardien"); put(Language.EN, ""); }}, 75, "11-13", new Calculable[] {
				new Effect(TypeEffect.RTCCP, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Amélioration de la Clé Magique"); put(Language.EN, ""); }}, 75, "11-14", new Calculable[] {
				new Effect(TypeEffect.VOL, false, 4),
				new Effect(TypeEffect.INT, false, 5),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Position"); put(Language.EN, ""); }}, 75, "11-15", new Calculable[] {
				new Effect(TypeEffect.ESQ, false, 2),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Transfert de Chronos"); put(Language.EN, ""); }}, 91, "11-16", new Calculable[] {
				new Effect(TypeEffect.AGI, 3, TypeEffect.INT, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Echange de Cristal"); put(Language.EN, ""); }}, 91, "11-17", new Calculable[] {
				new Effect(TypeEffect.VIT, 3, TypeEffect.VOL, TypeCalcul.CONVERTALL),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Esprit Gardien"); put(Language.EN, ""); }}, 91, "11-18", new Calculable[] {
				new Effect(TypeEffect.IntComp, false, -3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rupture Temporelle"); put(Language.EN, ""); }}, 91, "11-19", new Calculable[] {
				new Effect(TypeEffect.DCCM, false, 3),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Conversion d'énergie magique"); put(Language.EN, ""); }}, 100, "11-20", new Calculable[] {
				new Effect(TypeEffect.INT, 0.2, TypeEffect.PM, TypeCalcul.CONVERTBASE),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maîtrise de la Lumière divine"); put(Language.EN, ""); }}, 100, "11-21", new Calculable[] {
				new Effect(TypeEffect.AGI, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Polyvalence de la poupée vaudou"); put(Language.EN, ""); }}, 100, "11-22", new Calculable[] {
				new Effect(TypeEffect.VOL, true, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Clef de l'esprit"); put(Language.EN, ""); }}, 100, "11-23", new Calculable[] {
				new Effect(TypeEffect.DegSkillM, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bouclier du temps"); put(Language.EN, ""); }}, 100, "11-24", new Calculable[] {
				new Effect(TypeEffect.RDCCP, false, 1),
			}),
			new Speciality(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Retour de bâton magique"); put(Language.EN, ""); }}, 100, "11-25", new Calculable[] {
				new Proc(1, Activation.Attacked, new Calculable[] {
					new MultipleHit(TypeMultipleHit.ReflectM, 2),
				}),
			}),
		};
	}
}
