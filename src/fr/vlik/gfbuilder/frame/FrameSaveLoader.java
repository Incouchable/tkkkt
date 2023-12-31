package fr.vlik.gfbuilder.frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.gfbuilder.Overlay;
import fr.vlik.gfbuilder.SaveConfig;
import fr.vlik.gfbuilder.page.PageOption;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomButton;
import fr.vlik.uidesign.JCustomPanel;

public class FrameSaveLoader extends JCustomFrame {
	
	private static final long serialVersionUID = 1L;
	private static final FrameSaveLoader INSTANCE = new FrameSaveLoader();
	private static boolean blocker = false;
	
	private JCustomButton load;
	private JCustomButton delete;
	private JCustomButton cancel;
	
	public static FrameSaveLoader getInstance() {
		return INSTANCE;
	}
	
	private FrameSaveLoader() {
		super(new BorderLayout());
		this.labels = Lang.getDataLabel(3);
		
		try {
			this.setIconImage(ImageIO.read(FrameSaveOnQuit.class.getResource("/fr/vlik/gfbuilder/itemIcon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setSize(450, 120);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				MainFrame.getInstance().setEnabled(true);
				MainFrame.getInstance().toFront();
			}
		});
		
		this.load = new JCustomButton(this.labels[1].getLang(), Design.GREEN_COLOR);
		this.load.addActionListener(e -> {
			PageOption.getInstance().updateSave();
			MainFrame.getInstance().updateStat();
			Overlay.getInstance().setSave(true);
			MainFrame.getInstance().resetStatusPane();
			
			close();
		});
		
		this.delete = new JCustomButton(this.labels[2].getLang(), Design.RED_COLOR);
		this.delete.addActionListener(e -> {
			SaveConfig.deleteData(PageOption.getInstance().getSave());
			PageOption.getInstance().refreshSave();
			
			close();
		});
		
		this.cancel = new JCustomButton(this.labels[3].getLang(), Design.YELLOW_COLOR);
		this.cancel.addActionListener(e -> close() );
		
		this.components.add(this.load);
		this.components.add(this.delete);
		this.components.add(this.cancel);
		
		JCustomPanel pageLoad = new JCustomPanel(BoxLayout.Y_AXIS, new EmptyBorder(10, 10, 10, 10));
		pageLoad.setBackground(Design.UIColor[2]);
		pageLoad.add(this.labels[0]);
		this.labels[0].setFont(Design.TITLE);
		
		JCustomPanel buttons = new JCustomPanel(new GridLayout(1, 3, 10, 10), new EmptyBorder(10, 10, 10, 10));
		buttons.setBackground(Design.UIColor[2]);
		buttons.addAll(this.load, this.delete, this.cancel);
		
		pageLoad.add(buttons);
		
		this.add(pageLoad);
	}
	
	@Override
	public void popup() {
		MainFrame.getInstance().setEnabled(false);
		this.setVisible(true);
	}
	
	public void close() {
		MainFrame.getInstance().toFront();
		MainFrame.getInstance().setEnabled(true);
		this.setVisible(false);
	}
	
	public static boolean isBlocked() {
		return blocker;
	}
	
	public static void setBlocker(boolean enabled) {
		blocker = enabled;
	}
}
