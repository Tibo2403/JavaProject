package db;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JButton;

	public class FrmChange extends JFrame{
	
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	FrameClient Client = new FrameClient(); 
	
	public FrmChange(){
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    initMenu();
	    panel1.setBackground(Color.BLUE);
	    JButton btntest = new JButton("test");
	    btntest.setBounds(117, 11, 89, 23);
	    panel1.add(btntest);
	    
	    //panel1.add()
	   //panel1.add(Client, getLayout());
	   Client.setVisible(true);
	    panel2.setBackground(Color.RED);
	    
	}
	
	private class MenuAction implements ActionListener {
	
	    private JPanel panel;
	    private MenuAction(JPanel pnl) {
	        this.panel = pnl;    
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	        changePanel(panel);
	
	    }
	
	}
	
	private void initMenu() {
	    JMenuBar menubar = new JMenuBar();
	    JMenu menu = new JMenu("Menu");
	    JMenuItem menuItem1 = new JMenuItem("panel 1");
	    JMenuItem menuItem2 = new JMenuItem("panel 2");
	    menubar.add(menu);
	    menu.add(menuItem1);
	    menu.add(menuItem2);
	    setJMenuBar(menubar);
	    getContentPane().setLayout(null);
	    
	    JButton btnInsertion = new JButton("Insertion");
	    btnInsertion.setBounds(117, 11, 89, 23);
	    getContentPane().add(btnInsertion);
	    
	    JButton btnGestion = new JButton("Gestion");
	    btnGestion.setBounds(216, 11, 89, 23);
	    getContentPane().add(btnGestion);
	    
	    JButton btnTest = new JButton("test");
	    btnTest.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.out.println("bravo");

	    	}
	    });
	    btnTest.setBounds(117, 45, 89, 23);
	    getContentPane().add(btnTest);
	    menuItem1.addActionListener(new MenuAction(panel1));
	    menuItem2.addActionListener(new MenuAction(panel2));
	
	}
	
	private void changePanel(JPanel panel) {
	    getContentPane().removeAll();
	    getContentPane().add(panel, BorderLayout.CENTER);
	    getContentPane().doLayout();
	    update(getGraphics());
	}
	
	public static void main(String[] args) {
	    FrmChange frame = new FrmChange();
	    frame.setBounds(200, 200, 450, 300);
	    frame.setVisible(true);
	
	}
}