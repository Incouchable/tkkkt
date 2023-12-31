package fr.vlik.gfbuilder.page;

import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Blason;
import fr.vlik.grandfantasia.charac.Blason.BlasonType;
import fr.vlik.grandfantasia.charac.SpriteCost;
import fr.vlik.grandfantasia.charac.SpriteCost.SpriteCostType;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.gamebuff.IslandBuff;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageSprite extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "SPRITE";
	private static final PageSprite INSTANCE = new PageSprite();
	
	private transient JCustomComboBoxList<Blason> blason;
	private transient JCustomComboBoxList<SpriteCost> spriteCost;
	private JCustomComboBox<IslandBuff> islandBuff;
	
	public static PageSprite getInstance() {
		return INSTANCE;
	}

	private PageSprite() {
		super(BoxLayout.Y_AXIS);
		
		this.blason = new JCustomComboBoxList<>();
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			this.blason.add(new JCustomComboBox<>(Blason.class, tabBlason));
		}
		this.blason.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.spriteCost = new JCustomComboBoxList<>();
		for(int i = 0; i < 2; i++) {
			SpriteCost[] tabCost = SpriteCost.getPossibleSpriteCost(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca(), SpriteCostType.values()[i]);
			this.spriteCost.add(new JCustomComboBox<>(SpriteCost.class, tabCost));
		}
		this.spriteCost.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.islandBuff = new JCustomComboBox<>(IslandBuff.class, IslandBuff.getData());
		this.islandBuff.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		createPanel();
		setEffects();
	}
	
	public Blason getBlason(int id) {
		return this.blason.get(id).getSelectedItem();
	}
	
	public SpriteCost getSpriteCost(int id) {
		return this.spriteCost.get(id).getSelectedItem();
	}
	
	public IslandBuff getIsleBuff() {
		return this.islandBuff.getSelectedItem();
	}
	
	@SuppressWarnings("serial")
	protected void setLabel() {
		this.labels.put("Blason", new JLangLabel(Blason.CLASS_NAME, Design.TITLE));
		this.labels.put("Isle", new JLangLabel(IslandBuff.CLASS_NAME, Design.TITLE));
		
		this.labels.put("Type0", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Offensif"); put(Language.EN, "Aggressive"); }}, Design.SUBTITLE));
		this.labels.put("Type1", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Défensif"); put(Language.EN, "Defensive"); }}, Design.SUBTITLE));
		this.labels.put("Costume", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Costume"); put(Language.EN, "Costume"); }}, Design.TITLE));
		this.labels.put("SpriteCost0", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Tête"); put(Language.EN, "Head"); }}, Design.SUBTITLE));
		this.labels.put("SpriteCost1", new JLangLabel(new EnumMap<Language, String>(Language.class) {{ put(Language.FR, "Corps"); put(Language.EN, "Body"); }}, Design.SUBTITLE));
	}

	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		
		for(int i = 0; i < this.blason.size(); i++) {
			list.addAll(this.getBlason(i).getEffects());
		}
		
		for(int i = 0; i < this.spriteCost.size(); i++) {
			list.addAll(this.getSpriteCost(i).getEffects());
		}
		
		list.addAll(this.getIsleBuff());
		
		this.effects = list;
	}

	@Override
	protected void createPanel() {
		JCustomPanel elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem1.add(this.labels.get("Blason"), Box.createVerticalStrut(10));
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel panelBlason = new JCustomPanel(BoxLayout.Y_AXIS);
			panelBlason.addAll(this.labels.get("Type" + i), Box.createVerticalStrut(3), this.blason.get(i), Box.createVerticalStrut(5));
			
			elem1.add(panelBlason);
		}
		
		JCustomPanel elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem2.add(this.labels.get("Costume"), Box.createVerticalStrut(10));
		
		for(int i = 0; i < 2; i++) {
			JCustomPanel panelCost = new JCustomPanel(BoxLayout.Y_AXIS);
			panelCost.addAll(this.labels.get("SpriteCost" + i), Box.createVerticalStrut(3), this.spriteCost.get(i), Box.createVerticalStrut(5));
			
			elem2.add(panelCost);
		}
		
		JCustomPanel elem3 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		elem3.addAll(this.labels.get("Isle"), Box.createVerticalStrut(10), this.islandBuff);
		
		this.addAll(elem1, Box.createVerticalStrut(10), elem2, Box.createVerticalStrut(10), elem3);
	}
	
	public void updateBlason() {
		for(int i = 0; i < 2; i++) {
			Blason[] tabBlason = Blason.getPossibleBlason(PageGeneral.getInstance().getLvl(), BlasonType.values()[i]);
			
			if(!this.blason.get(i).setItems(tabBlason)) {
				MainFrame.getInstance().setRedPane(9);
			}
		}
	}
	
	public void updateSpriteCost() {
		SpriteCost[] tabCost = SpriteCost.getPossibleSpriteCost(PageGeneral.getInstance().getLvl(), PageGeneral.getInstance().getReinca(), SpriteCostType.values()[1]);
		
		if(!this.spriteCost.get(1).setItems(tabCost)) {
			MainFrame.getInstance().setRedPane(9);
		}
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		config.putAll(this.blason.getSaveConfig());
		config.putAll(this.spriteCost.getSaveConfig());
		config.putAll(this.islandBuff.getSaveConfig());
		
		return config;
	}

	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		for(int i = 0; i < this.blason.size(); i++) {
			this.blason.get(i).setSelectedItem(Blason.get(config.get("Blason" + i)));
		}
		
		for(int i = 0; i < this.spriteCost.size(); i++) {
			this.spriteCost.get(i).setSelectedItem(SpriteCost.get(config.get("SpriteCost" + i)));
		}
		
		this.islandBuff.setSelectedItem(IslandBuff.get(config.get(IslandBuff.class.getSimpleName())));
		
		allowSetEffect(true);
	}
}
