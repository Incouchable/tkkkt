package fr.vlik.uidesign;

import java.awt.Dimension;
import java.awt.Font;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import fr.vlik.grandfantasia.enums.Language;

public class JLangLabel extends JLabel implements JUpdateLang {
	
	private static final long serialVersionUID = 1L;
	
	private Map<Language, String> lang;
	
	public JLangLabel() {
		setBlackUI();
	}
	
	public JLangLabel(Map<Language, String> lang, Font font) {
		this.lang = lang;
		setBlackUI();
		this.setFont(font);
		this.setAlignmentX(CENTER_ALIGNMENT);
	}
	
	public Map<Language, String> getLang() {
		return this.lang;
	}
	
	public void updateLanguage(Language lang) {
		this.setText(this.lang.get(lang));
	}
	
	public void setBlackUI() {
		this.setForeground(Design.FontColor[0]);
		this.setFont(Design.SUBTITLE);
	}
	
	public static JLabel getSimpleLabel(String text) {
		JLabel label = new JLabel(text);
		label.setFont(Design.TITLE);
		label.setForeground(Design.FontColor[0]);
		label.setAlignmentX(CENTER_ALIGNMENT);
		
		return label;
	}
	
	public static JLabel getStatLabel(int size, int left, int right) {
		JLabel label = new JLabel();
		label.setFont(Design.TITLE);
		label.setBackground(Design.UIColor[0]);
		label.setForeground(Design.FontColor[0]);
		label.setBorder(new EmptyBorder(0, left, 0, right));
		label.setMaximumSize(new Dimension(size, 25));
		label.setOpaque(true);
		
		return label;
	}
	
	public static JLabel getEmptyLabel(int width, int height) {
		JLabel label = new JLabel();
		label.setBackground(Design.UIColor[0]);
		label.setBorder(new EmptyBorder(width, height, 0, 0));
		label.setOpaque(true);
		
		return label;
	}
}
