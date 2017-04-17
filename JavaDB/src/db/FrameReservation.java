package db;


import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class FrameReservation extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtHeureDebut;
	private JLabel lblEtat;
	private JButton btnCancel;
	private JButton btnInsert;
	private JTextField txtHeureFin;
	private JLabel lblheurefin;
	private JLabel lblemplacement;
	private JLabel lblClient;
	private JTextField textemail;
	private JTextField textclient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameReservation frame = new FrameReservation();
					
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameReservation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Reservation");
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{1, 33, 66, 48, 94, 94, 0};
		gbl_contentPane.rowHeights = new int[]{1, 34, 20, 20, 23, 20, 71, 0, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		contentPane.setLayout(gbl_contentPane);
				
						lblEtat = new JLabel("");
						GridBagConstraints gbc_lblEtat = new GridBagConstraints();
						gbc_lblEtat.gridwidth = 3;
						gbc_lblEtat.fill = GridBagConstraints.BOTH;
						gbc_lblEtat.insets = new Insets(0, 0, 5, 0);
						gbc_lblEtat.gridx = 3;
						gbc_lblEtat.gridy = 1;
						contentPane.add(lblEtat, gbc_lblEtat);
		
				JLabel lblHeuredebut = new JLabel("Heure de debut:");
				GridBagConstraints gbc_lblHeuredebut = new GridBagConstraints();
				gbc_lblHeuredebut.gridwidth = 2;
				gbc_lblHeuredebut.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblHeuredebut.insets = new Insets(0, 0, 5, 5);
				gbc_lblHeuredebut.gridx = 1;
				gbc_lblHeuredebut.gridy = 2;
				contentPane.add(lblHeuredebut, gbc_lblHeuredebut);
		
				txtHeureDebut = new JTextField();
				GridBagConstraints gbc_txtHeureDebut = new GridBagConstraints();
				gbc_txtHeureDebut.anchor = GridBagConstraints.NORTH;
				gbc_txtHeureDebut.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtHeureDebut.insets = new Insets(0, 0, 5, 5);
				gbc_txtHeureDebut.gridwidth = 3;
				gbc_txtHeureDebut.gridx = 3;
				gbc_txtHeureDebut.gridy = 2;
				contentPane.add(txtHeureDebut, gbc_txtHeureDebut);
				txtHeureDebut.setColumns(10);
		
		lblheurefin = new JLabel("Heure de fin:");
		GridBagConstraints gbc_lblheurefin = new GridBagConstraints();
		gbc_lblheurefin.gridwidth = 2;
		gbc_lblheurefin.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblheurefin.insets = new Insets(0, 0, 5, 5);
		gbc_lblheurefin.gridx = 1;
		gbc_lblheurefin.gridy = 3;
		contentPane.add(lblheurefin, gbc_lblheurefin);
		
		txtHeureFin = new JTextField();
		txtHeureFin.setColumns(10);
		GridBagConstraints gbc_txtHeureFin = new GridBagConstraints();
		gbc_txtHeureFin.anchor = GridBagConstraints.NORTH;
		gbc_txtHeureFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHeureFin.insets = new Insets(0, 0, 5, 5);
		gbc_txtHeureFin.gridwidth = 3;
		gbc_txtHeureFin.gridx = 3;
		gbc_txtHeureFin.gridy = 3;
		contentPane.add(txtHeureFin, gbc_txtHeureFin);
		
		lblemplacement = new JLabel("Emplacement:");
		GridBagConstraints gbc_lblemplacement = new GridBagConstraints();
		gbc_lblemplacement.gridwidth = 2;
		gbc_lblemplacement.anchor = GridBagConstraints.NORTH;
		gbc_lblemplacement.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblemplacement.insets = new Insets(0, 0, 5, 5);
		gbc_lblemplacement.gridx = 1;
		gbc_lblemplacement.gridy = 4;
		contentPane.add(lblemplacement, gbc_lblemplacement);
		
		textemail = new JTextField();
		textemail.setColumns(10);
		GridBagConstraints gbc_textemail = new GridBagConstraints();
		gbc_textemail.anchor = GridBagConstraints.SOUTH;
		gbc_textemail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textemail.insets = new Insets(0, 0, 5, 5);
		gbc_textemail.gridwidth = 3;
		gbc_textemail.gridx = 3;
		gbc_textemail.gridy = 4;
		contentPane.add(textemail, gbc_textemail);
		
		lblClient = new JLabel("Client:");
		GridBagConstraints gbc_lblClient = new GridBagConstraints();
		gbc_lblClient.gridwidth = 2;
		gbc_lblClient.anchor = GridBagConstraints.WEST;
		gbc_lblClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblClient.gridx = 1;
		gbc_lblClient.gridy = 5;
		contentPane.add(lblClient, gbc_lblClient);
		
		textclient = new JTextField();
		textclient.setColumns(10);
		GridBagConstraints gbc_textclient = new GridBagConstraints();
		gbc_textclient.anchor = GridBagConstraints.NORTH;
		gbc_textclient.fill = GridBagConstraints.HORIZONTAL;
		gbc_textclient.insets = new Insets(0, 0, 5, 5);
		gbc_textclient.gridwidth = 3;
		gbc_textclient.gridx = 3;
		gbc_textclient.gridy = 5;
		contentPane.add(textclient, gbc_textclient);
								
										btnInsert = new JButton("Ins\u00E9rer");
										btnInsert.addActionListener(this);
										GridBagConstraints gbc_btnInsert = new GridBagConstraints();
										gbc_btnInsert.insets = new Insets(0, 0, 5, 5);
										gbc_btnInsert.anchor = GridBagConstraints.SOUTH;
										gbc_btnInsert.fill = GridBagConstraints.HORIZONTAL;
										gbc_btnInsert.gridx = 2;
										gbc_btnInsert.gridy = 6;
										contentPane.add(btnInsert, gbc_btnInsert);
						
								btnCancel = new JButton("Annuler");
								btnCancel.addActionListener(this);
								GridBagConstraints gbc_btnCancel = new GridBagConstraints();
								gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
								gbc_btnCancel.anchor = GridBagConstraints.SOUTH;
								gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
								gbc_btnCancel.gridx = 3;
								gbc_btnCancel.gridy = 6;
								contentPane.add(btnCancel, gbc_btnCancel);
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println("on a cliqué");
		if (e.getSource()== btnInsert){
			DemoJdbc.sauverEnBase(txtHeureFin.getText(),txtHeureDebut.getText(),textemail.getText(),textclient.getText());
			txtHeureDebut.setText("");
			txtHeureFin.setText("");
			textemail.setText("");
			textclient.setText("");
			lblEtat.setText("Insertion effectuée "+DemoJdbc.table);
		}
		if (e.getSource()== btnCancel){
			
			txtHeureDebut.setText("");
			txtHeureFin.setText("");
			textemail.setText("");
			textclient.setText("");
			lblEtat.setText("");	
		}
	}
}
