package fr.vlik.gfbuilder.page;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.charac.Reinca;
import fr.vlik.grandfantasia.characupgrade.LoveBuff;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.subequip.Anima;
import fr.vlik.grandfantasia.subequip.Bague;
import fr.vlik.grandfantasia.subequip.Souvenir;
import fr.vlik.grandfantasia.subequip.SouvenirEnchantment;
import fr.vlik.uidesign.CustomList;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomComboBox;
import fr.vlik.uidesign.JCustomComboBoxList;
import fr.vlik.uidesign.JCustomPanel;
import fr.vlik.uidesign.JLangLabel;

public class PageOther extends PartialPage {

	private static final long serialVersionUID = 1L;
	private static final String SAVE_NAME = "OTHER";
	private static final PageOther INSTANCE = new PageOther();
	
	private JCustomComboBox<Bague> bague;
	private JCustomComboBox<LoveBuff> loveCo;
	private JCustomComboBox<Anima> anima;
	private JCustomComboBox<Souvenir> souvenir;
	
	private transient JCustomComboBoxList<SouvenirEnchantment> souvenirEnchant;
	
	private ArrayList<JPanel> showAndHide = new ArrayList<>();
	
	public static PageOther getInstance() {
		return INSTANCE;
	}

	private PageOther() {
		super(BoxLayout.Y_AXIS);
		
		this.bague = new JCustomComboBox<>(Bague.class, Bague.getData());
		this.bague.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.loveCo = new JCustomComboBox<>(LoveBuff.class, LoveBuff.getData());
		this.loveCo.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		Anima[] tabAnima = Anima.getData(PageGeneral.getInstance().getLvl());
		this.anima = new JCustomComboBox<>(Anima.class, tabAnima);
		this.anima.addActionListener(e -> {
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		
		this.souvenir = new JCustomComboBox<>(Souvenir.class, Souvenir.getPossibleSouvenir(PageGeneral.getInstance().getLvl()));
		this.souvenir.addActionListener(e -> {
			updateEnchantSouvenir();
			
			setEffects();
			MainFrame.getInstance().updateStat();
		});
		
		this.souvenirEnchant = new JCustomComboBoxList<>(SouvenirEnchantment.class, 3);
		this.souvenirEnchant.setVisible(false);
		
		/* ENCHANT SOUVENIR */
		for(int j = 0; j < 3; j++) {
			int idSouvenir = j;
			
			this.souvenirEnchant.get(idSouvenir).addActionListener(e -> {
				updateSouvenirEnchant(idSouvenir);
				
				setEffects();
				MainFrame.getInstance().updateStat();
			});
		}
		
		createPanel();
		setEffects();
	}
	
	public Bague getBague() {
		return this.bague.getSelectedItem();
	}
	
	public LoveBuff getLoveCo() {
		return this.loveCo.getSelectedItem();
	}
	
	public Anima getAnima() {
		return this.anima.getSelectedItem();
	}
	
	public Souvenir getSouvenir() {
		return this.souvenir.getSelectedItem();
	}
	
	public SouvenirEnchantment getSouvenirEnchantment(int id) {
		return this.souvenirEnchant.get(id).getSelectedItem();
	}
	
	@Override
	protected void setLabel() {
		this.labels.put("Bague", new JLangLabel(Bague.CLASS_NAME, Design.TITLE));
		this.labels.put("LoveCo", new JLangLabel(LoveBuff.CLASS_NAME, Design.TITLE));
		this.labels.put("Anima", new JLangLabel(Anima.CLASS_NAME, Design.TITLE));
		this.labels.put("Souvenir", new JLangLabel(Souvenir.CLASS_NAME, Design.TITLE));
		this.labels.put("SouvenirEnchant", new JLangLabel(SouvenirEnchantment.CLASS_NAME, Design.SUBTITLE));
	}

	@Override
	protected void setEffects() {
		if(!this.allowRefreshEffects) {
			return;
		}
		
		CustomList<Calculable> list = new CustomList<>();
		
		list.addAll(this.getBague());
		list.addAll(this.getLoveCo());
		list.addAll(this.getAnima());
		
		double defBonusCoef = 1;
		for(int i = 0; i < 3; i++) {
			if(this.souvenirEnchant.get(i).isVisible()) {
				if(!this.getSouvenirEnchantment(i).getName(Language.FR).equals(" ")) {
					defBonusCoef += 0.03;
				}
				
				list.addAll(this.getSouvenirEnchantment(i));
			}
		}
		
		Souvenir upgradeSouvenir = new Souvenir(this.getSouvenir());
		upgradeSouvenir.addStarBonus(defBonusCoef);
		list.addAll(upgradeSouvenir);
		
		this.effects = list;
	}
	
	@Override
	protected void createPanel() {
		JCustomPanel page12Elem1 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem1.addAll(this.labels.get("Bague"), Box.createVerticalStrut(10), this.bague, Box.createVerticalStrut(15), this.labels.get("LoveCo"), Box.createVerticalStrut(10), this.loveCo);
		this.showAndHide.add(page12Elem1);
		
		JCustomPanel page12Elem2 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem2.addAll(this.labels.get("Anima"), Box.createVerticalStrut(10), this.anima);
		this.showAndHide.add(page12Elem2);
		
		JCustomPanel page12Elem3 = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		page12Elem3.addAll(this.labels.get("Souvenir"), Box.createVerticalStrut(10), this.souvenir, Box.createVerticalStrut(5), this.labels.get("SouvenirEnchant"));
		
		JCustomPanel enchant = new JCustomPanel(BoxLayout.X_AXIS);
		for(int i = 0; i < 3; i++) {
			enchant.addAll(Box.createHorizontalStrut(10), this.souvenirEnchant.get(i));
		}
		
		page12Elem3.add(enchant);
		
		this.addAll(page12Elem1, Box.createVerticalStrut(10), page12Elem2, Box.createVerticalStrut(10), page12Elem3);
		
		this.labels.get("SouvenirEnchant").setVisible(false);
	}
	
	public void updateMarried() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Bague memoryBague = this.getBague();
		LoveBuff memoryLoveCo = this.getLoveCo();
		
		if(reinca.getLvl() > 0 || lvl >= 20) {
			this.showAndHide.get(0).setVisible(true);
		} else {
			this.showAndHide.get(0).setVisible(false);
			this.bague.setSelectedIndex(0);
			this.loveCo.setSelectedIndex(0);
		}
		
		if(!this.getBague().equals(memoryBague)) {
			MainFrame.getInstance().setRedPane(11);
		}

		if(!this.getLoveCo().equals(memoryLoveCo)) {
			MainFrame.getInstance().setRedPane(11);
		}
	}
	
	public void updateAnima() {
		Reinca reinca = PageGeneral.getInstance().getReinca();
		int lvl = PageGeneral.getInstance().getLvl();
		
		Anima memory = this.getAnima();
		this.anima.setItems(Anima.getData(lvl));
		
		if(reinca.getLvl() > 0 && lvl >= 10) {
			this.showAndHide.get(1).setVisible(true);
		} else {
			this.showAndHide.get(1).setVisible(false);
			this.anima.setSelectedIndex(0);
		}
		
		if(!this.getAnima().equals(memory)) {
			MainFrame.getInstance().setRedPane(11);
		}
	}
	
	public void updateSouvenir() {
		int lvl = PageGeneral.getInstance().getLvl();
		
		Souvenir[] tabSouvenir = Souvenir.getPossibleSouvenir(lvl);
		
		if(!this.souvenir.setItems(tabSouvenir)) {
			MainFrame.getInstance().setRedPane(11);
		}
	}
	
	private void updateEnchantSouvenir() {
		if(this.souvenir.getSelectedIndex() > 0) {
			this.labels.get("SouvenirEnchant").setVisible(true);
			for(int i = 0; i < 3; i++) {
				this.souvenirEnchant.get(i).setVisible(true);
				updateSouvenirEnchant(i);
			}
		} else {
			this.labels.get("SouvenirEnchant").setVisible(false);
			for(int i = 0; i < 3; i++) {
				this.souvenirEnchant.get(i).setVisible(false);
			}
		}
	}
	
	private void updateSouvenirEnchant(int idSouvenir) {
		int ignore1;
		int ignore2;
		
		if(idSouvenir == 0) {
			ignore1 = idSouvenir + 1;
			ignore2 = idSouvenir + 2;
		} else if(idSouvenir == 1) {
			ignore1 = idSouvenir - 1;
			ignore2 = idSouvenir + 1;
		} else {
			ignore1 = idSouvenir - 2;
			ignore2 = idSouvenir - 1;
		}
		
		SouvenirEnchantment choice = this.getSouvenirEnchantment(idSouvenir);
		SouvenirEnchantment memory1 = this.getSouvenirEnchantment(ignore1);
		SouvenirEnchantment memory2 = this.getSouvenirEnchantment(ignore2);
		
		SouvenirEnchantment[] tabSouvenir1 = SouvenirEnchantment.getPossibleSouvenirEnchant(this.getSouvenir(), choice, memory2);
		SouvenirEnchantment[] tabSouvenir2 = SouvenirEnchantment.getPossibleSouvenirEnchant(this.getSouvenir(), choice, memory1);
		
		this.souvenirEnchant.get(ignore1).setItems(tabSouvenir1, memory1);
		this.souvenirEnchant.get(ignore2).setItems(tabSouvenir2, memory2);
	}
	
	@Override
	public String getSaveName() {
		return SAVE_NAME;
	}
	
	@Override
	public Map<String, String> getConfig(Language lang) {
		Map<String, String> config = new LinkedHashMap<>();
		
		config.putAll(this.bague.getSaveConfig());
		config.putAll(this.loveCo.getSaveConfig());
		config.putAll(this.anima.getSaveConfig());
		config.putAll(this.souvenir.getSaveConfig());
		config.putAll(this.souvenirEnchant.getSaveConfig());
		
		return config;
	}
	
	@Override
	public void setConfig(Map<String, String> config, Language lang) {
		allowSetEffect(false);
		
		this.bague.setSelectedItem(Bague.get(config.get("Bague"), lang));
		this.loveCo.setSelectedItem(LoveBuff.get(config.get("LoveBuff")));
		this.anima.setSelectedItem(Anima.get(config.get("Anima")));
		this.souvenir.setSelectedItem(Souvenir.get(config.get("Souvenir")));
		
		for(int i = 0; i < this.souvenirEnchant.size(); i++) {
			this.souvenirEnchant.get(i).setSelectedItem(SouvenirEnchantment.get(this.getSouvenir(), config.get("SouvenirEnchantment" + i)));
		}
		
		allowSetEffect(true);
	}
}
