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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

	public class FrmChange extends JFrame{
	
	private JPanelClient panelClient = new JPanelClient();
	private JPanel panelreservation = new JPanelReservation();
	private JTextField textField;
	private JPasswordField passwordField;

	public FrmChange(){
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    initMenu();
	    panelClient.setBackground(Color.WHITE);
	    JButton btntest = new JButton("test");
	    btntest.setBounds(117, 11, 89, 23);
//	    panel1.add(btntest);
	    
	    //panel1.add()
	   //panel1.add(Client, getLayout());
	   //Client.setVisible(true);
	    panelreservation.setBackground(Color.WHITE);
	    
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
	    JMenuItem menuItem1 = new JMenuItem("Client");
	    JMenuItem menuItem2 = new JMenuItem("Reservation");
	    JMenuItem menuItem3 = new JMenuItem("Facture");
	    menubar.add(menu);
	    menu.add(menuItem1);
	    menu.add(menuItem2);
	    menu.add(menuItem3);
	    setJMenuBar(menubar);
	    GridBagLayout gridBagLayout = new GridBagLayout();
	    gridBagLayout.columnWidths = new int[]{89, 89, 89, 0};
	    gridBagLayout.rowHeights = new int[]{23, 0, 0, 0, 0};
	    gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
	    gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	    getContentPane().setLayout(gridBagLayout);
	    
	    JButton btnTest = new JButton("test");
	    btnTest.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.out.println("bravo");
	    	}
	    });
	    GridBagConstraints gbc_btnTest = new GridBagConstraints();
	    gbc_btnTest.anchor = GridBagConstraints.NORTH;
	    gbc_btnTest.fill = GridBagConstraints.HORIZONTAL;
	    gbc_btnTest.insets = new Insets(0, 0, 5, 5);
	    gbc_btnTest.gridx = 0;
	    gbc_btnTest.gridy = 0;
	    getContentPane().add(btnTest, gbc_btnTest);
	    
	    JButton btnInsertion = new JButton("Insertion");
	    GridBagConstraints gbc_btnInsertion = new GridBagConstraints();
	    gbc_btnInsertion.anchor = GridBagConstraints.NORTH;
	    gbc_btnInsertion.fill = GridBagConstraints.HORIZONTAL;
	    gbc_btnInsertion.insets = new Insets(0, 0, 5, 5);
	    gbc_btnInsertion.gridx = 1;
	    gbc_btnInsertion.gridy = 0;
	    getContentPane().add(btnInsertion, gbc_btnInsertion);
	    
	    JButton btnGestion = new JButton("Gestion");
	    GridBagConstraints gbc_btnGestion = new GridBagConstraints();
	    gbc_btnGestion.insets = new Insets(0, 0, 5, 0);
	    gbc_btnGestion.anchor = GridBagConstraints.NORTH;
	    gbc_btnGestion.fill = GridBagConstraints.HORIZONTAL;
	    gbc_btnGestion.gridx = 2;
	    gbc_btnGestion.gridy = 0;
	    getContentPane().add(btnGestion, gbc_btnGestion);
	    
	    JLabel lblLogin = new JLabel("Login :");
	    GridBagConstraints gbc_lblLogin = new GridBagConstraints();
	    gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
	    gbc_lblLogin.anchor = GridBagConstraints.EAST;
	    gbc_lblLogin.gridx = 0;
	    gbc_lblLogin.gridy = 2;
	    getContentPane().add(lblLogin, gbc_lblLogin);
	    
	    textField = new JTextField();
	    GridBagConstraints gbc_textField = new GridBagConstraints();
	    gbc_textField.gridwidth = 2;
	    gbc_textField.insets = new Insets(0, 0, 5, 5);
	    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
	    gbc_textField.gridx = 1;
	    gbc_textField.gridy = 2;
	    getContentPane().add(textField, gbc_textField);
	    textField.setColumns(10);
	    
	    JLabel lblPassword = new JLabel("Password :");
	    GridBagConstraints gbc_lblPassword = new GridBagConstraints();
	    gbc_lblPassword.insets = new Insets(0, 0, 0, 5);
	    gbc_lblPassword.anchor = GridBagConstraints.EAST;
	    gbc_lblPassword.gridx = 0;
	    gbc_lblPassword.gridy = 3;
	    getContentPane().add(lblPassword, gbc_lblPassword);
	    
	    passwordField = new JPasswordField();
	    GridBagConstraints gbc_passwordField = new GridBagConstraints();
	    gbc_passwordField.gridwidth = 2;
	    gbc_passwordField.insets = new Insets(0, 0, 0, 5);
	    gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
	    gbc_passwordField.gridx = 1;
	    gbc_passwordField.gridy = 3;
	    getContentPane().add(passwordField, gbc_passwordField);
	    menuItem1.addActionListener(new MenuAction(panelClient));
	    menuItem2.addActionListener(new MenuAction(panelreservation));
	    menuItem3.addActionListener(new MenuAction(panelreservation));
	}
	
	private void changePanel(JPanel panel) {
	    getContentPane().removeAll();
//	    getContentPane().add(panel, BorderLayout.CENTER);
//	    getContentPane().doLayout();
//	    update(getGraphics());
//	    System.out.println("1");
	    this.setContentPane(panel);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
	    FrmChange frame = new FrmChange();
	    frame.setBounds(200, 200, 450, 300);
	    frame.setVisible(true);
	
	}
}