package fr.vlik.grandfantasia.loader.equip;

import java.util.EnumMap;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equip.Ride;
import fr.vlik.grandfantasia.equip.Ride.RideType;
import fr.vlik.grandfantasia.loader.LoaderTemplate;
import fr.vlik.grandfantasia.stats.Effect;

@SuppressWarnings("serial")
public class LoaderRide extends LoaderTemplate {
	
	private LoaderRide() {
		throw new IllegalStateException("Utility class");
	}


	static Ride[] getRide() {
		return new Ride[] {
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Mordragon spectral de guerre"); put(Language.EN, ""); }}, 1, true, "reinca", new Effect[] { new Effect(TypeEffect.Depla, false, 50), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Goldo-Lion de Guerre"); put(Language.EN, "Iron War Lion Combat Mount"); }}, 60, false, RideType.NERF, "goldo3", new Effect[] { new Effect(TypeEffect.Depla, false, 60), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Spectral de Combat"); put(Language.EN, ""); }}, 60, false, RideType.NERF, "loup0", new Effect[] { new Effect(TypeEffect.Depla, false, 60), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Aérowing de combat"); put(Language.EN, "Skylord Wing Combat Mount"); }}, 40, false, "airwing1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Alpaga Étincelant de combat"); put(Language.EN, "Radiant Sanctified Alpaca Combat Mount"); }}, 40, false, "alpaga", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Canidé osseux de combat"); put(Language.EN, "Skeleton Hellhound Combat Mount"); }}, 40, false, "loup8", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chat-citrouille gentleman de combat"); put(Language.EN, ""); }}, 40, false, "chat3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chat malin à cloche noire de combat"); put(Language.EN, "Darkbell Demon Cat Combat Mount"); }}, 40, false, "chat2", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Cheval de Guerre des Flammes Sombres"); put(Language.EN, "Fire General's War Horse Mount"); }}, 40, false, "cheval0", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Couple de renards rose printemps de combat"); put(Language.EN, "Springcherry Fox Couple's Combat Mount"); }}, 40, false, "renard3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dents-de-sabre de Glace Suprême"); put(Language.EN, "Glacial Tiger Combat Mount"); }}, 40, false, "tigre7", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dents-de-sabre Enragé Suprême"); put(Language.EN, "Valentine Tiger Combat Mount"); }}, 40, false, "tigre8", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dents-de-sabre Féroce Suprême"); put(Language.EN, "Void Tiger Combat Mount"); }}, 40, false, "tigre6", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon améthyste de combat"); put(Language.EN, "Amethyst Dragon Combat Mount"); }}, 40, false, "dragon7", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon ardent de combat"); put(Language.EN, "Fiery Dragon Combat Mount"); }}, 40, false, "dragon11", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon cyan Griffes de ciel de combat"); put(Language.EN, ""); }}, 40, false, "dragon4", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon de Citrine de combat"); put(Language.EN, "Citrine Dragon Combat Mount"); }}, 40, false, "dragon8", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon des ombres"); put(Language.EN, "Shadow Dragon"); }}, 40, false, "dragon12", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon doré impérial"); put(Language.EN, "Empyrean Dragon"); }}, 40, false, "dragon13", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon infernal"); put(Language.EN, "Purgatory Dragon Combat Mount"); }}, 40, false, "dragon9", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon mécanique de combat"); put(Language.EN, "Mecha Dragon Combat Mount"); }}, 40, false, "meca0", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon prestigieux"); put(Language.EN, "Prestigious Dragon"); }}, 40, false, "dragon10", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon ténébreux de combat"); put(Language.EN, "Obscurity Dragon Combat Mount"); }}, 40, false, "dragon3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Écureuil de Guerre"); put(Language.EN, "Autumn Red-leaf Squirrel Combat Mount"); }}, 40, false, "ecureuil", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étalon de combat flamboyant"); put(Language.EN, "Blazing Aura Warhorse Combat Mount"); }}, 40, false, "cheval6", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étalon enflammé de combat"); put(Language.EN, "Blazing Stallion Combat Mount"); }}, 40, false, "cheval4", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Félin flamboyant de combat"); put(Language.EN, "Scarlet Flame Nyan Battle Mount"); }}, 40, false, "chat1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fenrir enragé de combat"); put(Language.EN, "Blazing Wolf Combat Mount"); }}, 40, false, "renard5", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fléau de l'ombre"); put(Language.EN, "Shadowbane"); }}, 40, false, "tigre9", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Goldo-Lion de Guerre"); put(Language.EN, "Iron War Lion Combat Mount"); }}, 40, false, "goldo3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Kurama à Neuf Queues de Bataille"); put(Language.EN, "Radiant Nine-Tailed Fox Battle Mount"); }}, 40, false, "kurama", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Licorne Cosmique de combat"); put(Language.EN, "Celestial Combat Unicorn"); }}, 40, false, "cheval1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion cramoisi de combat"); put(Language.EN, "Bloodthirst Lion Combat Mount"); }}, 40, false, "lion2", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup de Combat de la Flamme mystique"); put(Language.EN, "Mystic Flame Wolf Combat Mount"); }}, 40, false, "loup6", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup de Combat de la Flamme opaline"); put(Language.EN, "Silver Wolf Combat Mount"); }}, 40, false, "loup5", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup des ténèbres"); put(Language.EN, "Frostfire Wolf"); }}, 40, false, "loup3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de Combat : Artillerie Mobile Baroque"); put(Language.EN, ""); }}, 40, false, "canon", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de Combat - Chariot du Dessert"); put(Language.EN, "Dessert Cart Combat Mount"); }}, 40, false, "chariot", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de Combat : Scorpions Jumeaux de Bataille"); put(Language.EN, "Battle Scorpion Twin Combat Mount"); }}, 40, false, "scorpion3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de combat de Miyamoto"); put(Language.EN, "Miyamoto Battle Mount"); }}, 40, false, "chevalier1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de combat de Sprite précurseur"); put(Language.EN, "Sprite Pioneer Combat Mount"); }}, 40, false, "tank1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de Combat Lion Céleste"); put(Language.EN, "Celestial Lion Combat Mount"); }}, 40, false, "lion0", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de Combat Otto des Abîmes"); put(Language.EN, "Infernal Hound Combat Mount"); }}, 40, false, "loup7", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture épique du GM Garuda"); put(Language.EN, "Dragon Overlord Combat Mount"); }}, 40, false, "GFWT", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture Loup Lotus rouge"); put(Language.EN, "Bloodred Wolf Mount"); }}, 40, false, "loup4", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture volante de combat de Ronin"); put(Language.EN, "Flying Dimensionalist Combat Mount"); }}, 40, false, "volant", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Parchemin paint Papillon floral de combat"); put(Language.EN, ""); }}, 40, false, "parchemin", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard bleu ultime de combat"); put(Language.EN, "Lightning Cyan Fox Couple's Combat Mount"); }}, 40, false, "renard1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard noir ultime rapide de combat"); put(Language.EN, "Midnight Fox Couple's Combat Mount"); }}, 40, false, "renard4", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard rouge ultime de combat"); put(Language.EN, "Lightning Red Fox Couple's Combat Mount"); }}, 40, false, "renard0", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renne du Père Noël féroce"); put(Language.EN, "Jolly Reindeer Combat Mount"); }}, 40, false, "renne", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Rosa l'hélicoptère de combat"); put(Language.EN, "Rosa the Combat Helicopter"); }}, 40, false, "helico2", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Scorpion de combat de cristal pourpre à double place"); put(Language.EN, "Purple Crystal Battle Scorpion"); }}, 40, false, "scorpion1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Super charrette de combat"); put(Language.EN, ""); }}, 40, false, "caddie1", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Vilain pingouin de combat"); put(Language.EN, "Naughty Penguin Combat Mount"); }}, 40, false, "manchot3", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voiture de sport « Pluie de météores » de combat"); put(Language.EN, "Night Meteor Sports Car Combat Mount"); }}, 40, false, "voiture2", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voiture rapide de combat"); put(Language.EN, "Roadster Combat Mount"); }}, 40, false, "voiture0", new Effect[] { new Effect(TypeEffect.Depla, false, 100), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon de combat en armure"); put(Language.EN, "Armored Dragon Combat Mount"); }}, 40, false, "dragon5", new Effect[] { new Effect(TypeEffect.Depla, false, 95), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Bodor vif spectral de combat"); put(Language.EN, ""); }}, 40, false, "yggdra3", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon de combat blindé"); put(Language.EN, "Plated Dragon Combat Mount"); }}, 40, false, "dragon6", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Élégante Alice spectrale de combat"); put(Language.EN, "Elegant Alice Phantom Combat Mount"); }}, 40, false, "yggdra1", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Goldo-Tigre rapide de Combat"); put(Language.EN, "Quick Supreme Lotus Tiger Mount"); }}, 40, false, "tigre1", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture Ronto de combat digne"); put(Language.EN, "Darkly Dignified Ronto Combat Mount"); }}, 40, false, "yggdra2", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard bleu ultime rapide de combat"); put(Language.EN, "Cyan Fox Couple's Combat Mount"); }}, 40, false, "renard1", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard rouge ultime rapide de combat"); put(Language.EN, "Red Fox Couple's Combat Mount"); }}, 40, false, "renard0", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre des Glaces Rapide de Combat"); put(Language.EN, "Quick Ice Blue Tiger Combat Mount"); }}, 40, false, "tigre3", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre des Ombres Rapide de Combat"); put(Language.EN, "Quick Shadow Tiger Combat Mount"); }}, 40, false, "tigre5", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre Rouge rapide de Combat"); put(Language.EN, "Quick Red Tiger Combat Mount"); }}, 40, false, "tigre2", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre Vert Rapide de Combat"); put(Language.EN, "Quick Green Tiger Combat Mount"); }}, 40, false, "tigre4", new Effect[] { new Effect(TypeEffect.Depla, false, 90), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lapin Sauteur de Combat"); put(Language.EN, "Bouncy Bunny Combat Mount"); }}, 40, false, "lapin", new Effect[] { new Effect(TypeEffect.Depla, false, 85), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion de Guerre d'Onyx"); put(Language.EN, "Hasty Onyx Lion Combat Mount"); }}, 40, false, "goldo1", new Effect[] { new Effect(TypeEffect.Depla, false, 85), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manchot Dodu de Combat Rapide"); put(Language.EN, "Hasty Roly-Poly Penguin Combat Mount"); }}, 40, false, "manchot0", new Effect[] { new Effect(TypeEffect.Depla, false, 85), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Puissant Loup de Combat"); put(Language.EN, "Hasty Wolfrage Combat Mount"); }}, 40, false, "loup1", new Effect[] { new Effect(TypeEffect.Depla, false, 85), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon violet de combat"); put(Language.EN, "Violet Dragon Combat Mount"); }}, 40, false, "dragon14", new Effect[] { new Effect(TypeEffect.Depla, false, 80), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Sanglant de Combat"); put(Language.EN, "Wolfrage Combat Mount"); }}, 40, false, "loup1", new Effect[] { new Effect(TypeEffect.Depla, false, 80), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Airwing de combat"); put(Language.EN, "Broken Air Wing Combat Mount"); }}, 40, false, "airwing0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Babama musclé de combat"); put(Language.EN, ""); }}, 40, false, "human", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Caddie de combat pour Sprite"); put(Language.EN, "Sprite Shopping Cart Combat Mount"); }}, 40, false, "caddie0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon mécanique enflammé de combat"); put(Language.EN, "Flame Mecha Dragon Combat Mount"); }}, 40, false, "meca1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Dragon Noir de Combat"); put(Language.EN, "Scarlet Lumin Mechanical Dragon Mount"); }}, 40, false, "dragon1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étalon d'argent démoniaque"); put(Language.EN, "Dark Silver Stallion Mount"); }}, 40, false, "cheval3", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étalon de guerre de Morgoth"); put(Language.EN, ""); }}, 40, false, "cheval5", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Étalon doré de combat"); put(Language.EN, "Golden Steed Combat Mount"); }}, 40, false, "cheval2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fantôme d'Hattori de combat"); put(Language.EN, "Hattori Mount"); }}, 40, false, "chevalier0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Félin de l'Aria Nocturne"); put(Language.EN, "Starry Night Nyan"); }}, 40, false, "chat0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Fléau de l'ombre la panthère"); put(Language.EN, "Dark Shadowbane Leopard Mount"); }}, 40, false, "tigre10", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Goldo-Tigre de Combat"); put(Language.EN, "Supreme Lotus Tiger Mount"); }}, 40, false, "tigre1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Guetteur de tombe d'ombre de combat"); put(Language.EN, ""); }}, 40, false, "aigle", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hélicoptère à vapeur blindé"); put(Language.EN, "Steampunk Combat Helicopter"); }}, 40, false, "helico0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Hélicoptère solaire de combat"); put(Language.EN, "Solar Combat Helicopter"); }}, 40, false, "helico1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Jeune Dragon de Combat"); put(Language.EN, "Prosperous Eternal Dragon Mount"); }}, 40, false, "dragon0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lapin Sauteur de Combat"); put(Language.EN, "Bouncy Bunny Combat Mount"); }}, 40, false, "lapin", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion ailé de combat"); put(Language.EN, "Astral Lion Combat Mount"); }}, 40, false, "lion1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion de Guerre Noir"); put(Language.EN, "Onyx Lion Combat Mount"); }}, 40, false, "goldo1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion Doré de Combat"); put(Language.EN, "Golden Lion Combat Mount"); }}, 40, false, "goldo0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Lion Violet de Combat"); put(Language.EN, "Lavender Lion Combat Mount"); }}, 40, false, "goldo2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Maître des poulpes de combat"); put(Language.EN, "Octopus Master Combat Mount"); }}, 40, false, "poulpe", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manchot Dodu de Combat"); put(Language.EN, "Roly-Poly Penguin Combat Mount"); }}, 40, false, "manchot0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manchot jaune de combat"); put(Language.EN, "Yellow Penguin Combat Mount"); }}, 40, false, "manchot2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manchot rubis de combat"); put(Language.EN, ""); }}, 40, false, "manchot4", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Manchot Soldat du Cœur"); put(Language.EN, "Rosy Penguin Combat Mount"); }}, 40, false, "manchot1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Méca-monture de combat Noirflamme"); put(Language.EN, "Darkflame Mechasprite Combat Mount"); }}, 40, false, "robot1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de combat de Sprite pionnier"); put(Language.EN, "Sprite Coupe Combat Mount"); }}, 40, false, "tank0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Monture de combat scorpion mécanique"); put(Language.EN, "Mecha Scorpion Couple's Combat Mount"); }}, 40, false, "scorpion0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Ours Polaire de combat"); put(Language.EN, "Polar Bear Combat Mount"); }}, 40, false, "ours", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Pyrodragon démoniaque de combat"); put(Language.EN, "Demonic Pyrodragon Combat Mount"); }}, 40, false, "dragon2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Renard des Ténèbres de combat"); put(Language.EN, "Midnight Fox Couple's Combat Mount"); }}, 40, false, "renard2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Robot Tueur de Combat"); put(Language.EN, "Armored Sabertooth Mount"); }}, 40, false, "tigre0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Scorpion de combat nocturne deux places"); put(Language.EN, "Abyssal Scorpion Couple's Combat Mount"); }}, 40, false, "scorpion2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sprite d'azur de combat"); put(Language.EN, "Azure Sprite Combat Mount"); }}, 40, false, "tank3", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Sprite Gundam Volant"); put(Language.EN, "Flying Sprite Mecha Mount"); }}, 40, false, "robot0", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tank Sprite de combat"); put(Language.EN, "Sprite Tank Combat Mount"); }}, 40, false, "tank2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre des Glaces de Combat"); put(Language.EN, "Ice Blue Tiger Combat Mount"); }}, 40, false, "tigre3", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre des Ombres de Combat"); put(Language.EN, "Shadow Tiger Combat Mount"); }}, 40, false, "tigre5", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre Rouge de Combat"); put(Language.EN, "Red Tiger Combat Mount"); }}, 40, false, "tigre2", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tigre Vert de Combat"); put(Language.EN, "Green Tiger Combat Mount"); }}, 40, false, "tigre4", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Voiture de sport de l'Ombre écarlate"); put(Language.EN, "Red Shadow Sports Car"); }}, 40, false, "voiture1", new Effect[] { new Effect(TypeEffect.Depla, false, 75), }),
			
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Armure Mécanique en Alliage Supérieur Élite"); put(Language.EN, ""); }}, 20, false, "armure", new Effect[] { new Effect(TypeEffect.Depla, false, 40), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Chocobo Ouragan Suprême"); put(Language.EN, ""); }}, 20, false, "chocobo", new Effect[] { new Effect(TypeEffect.Depla, false, 40), }),
			new Ride(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Loup Rapide Élite"); put(Language.EN, ""); }}, 20, false, "loup2", new Effect[] { new Effect(TypeEffect.Depla, false, 40), }),
		};
	}
}
