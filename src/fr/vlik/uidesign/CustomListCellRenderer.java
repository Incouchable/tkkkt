package fr.vlik.uidesign;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.grandfantasia.Tools;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Colorable;
import fr.vlik.grandfantasia.interfaces.Iconable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class CustomListCellRenderer extends DefaultListCellRenderer {
	
	private static final long serialVersionUID = 1L;
	private static Language lang = Language.FR;
	
	public CustomListCellRenderer() {
		super();
	}
	
	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
		JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		
		if(value instanceof Colorable c) {
			renderer.setForeground(c.getColor());
		} else {
			renderer.setForeground(Design.FontColor[0]);
		}
		
		if(value instanceof Iconable i) {
			renderer.setIcon(i.getIcon());
		}
		
		if(value instanceof Writable w) {
			renderer.setText(w.getSelectorInfo(CustomListCellRenderer.lang));
			renderer.setToolTipText(w.getFullInfo(CustomListCellRenderer.lang));
		}
		
		if(value instanceof Integer) {
			renderer.setText(value.toString());
			
			if(index > 15) {
				renderer.setForeground(Tools.speColor[2]);
			} else if(index > 10) {
				renderer.setForeground(Tools.speColor[1]);
			} else {
				renderer.setForeground(Tools.speColor[0]);
			}
		} else if(value instanceof SaveConfig save) {
			renderer.setText(save.getBuildName());
		}
		
		if (cellHasFocus || isSelected) {
			renderer.setBackground(Design.UIColor[1]);
		} else {
			renderer.setBackground(Design.UIColor[0]);
		}
		
		return renderer;
	}
	
	public static void setLang(Language lang) {
		CustomListCellRenderer.lang = lang;
	}
}
