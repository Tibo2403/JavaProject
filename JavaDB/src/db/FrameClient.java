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

public class FrameClient extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPersonne;
	private JLabel lblEtat;
	private JButton btnCancel;
	private JButton btnInsert;
	private JTextField txtnom;
	private JLabel lblnom;
	private JLabel lblEmail;
	private JLabel lblLangue;
	private JTextField textemail;
	private JTextField textlangue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameClient frame = new FrameClient();
					
					
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
	public FrameClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Client");
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
		
				JLabel lblPersonne = new JLabel("Prenom:");
				GridBagConstraints gbc_lblPersonne = new GridBagConstraints();
				gbc_lblPersonne.gridwidth = 2;
				gbc_lblPersonne.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblPersonne.insets = new Insets(0, 0, 5, 5);
				gbc_lblPersonne.gridx = 1;
				gbc_lblPersonne.gridy = 2;
				contentPane.add(lblPersonne, gbc_lblPersonne);
		
				txtPersonne = new JTextField();
				GridBagConstraints gbc_txtPersonne = new GridBagConstraints();
				gbc_txtPersonne.anchor = GridBagConstraints.NORTH;
				gbc_txtPersonne.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPersonne.insets = new Insets(0, 0, 5, 5);
				gbc_txtPersonne.gridwidth = 3;
				gbc_txtPersonne.gridx = 3;
				gbc_txtPersonne.gridy = 2;
				contentPane.add(txtPersonne, gbc_txtPersonne);
				txtPersonne.setColumns(10);
		
		lblnom = new JLabel("Nom:");
		GridBagConstraints gbc_lblnom = new GridBagConstraints();
		gbc_lblnom.gridwidth = 2;
		gbc_lblnom.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnom.insets = new Insets(0, 0, 5, 5);
		gbc_lblnom.gridx = 1;
		gbc_lblnom.gridy = 3;
		contentPane.add(lblnom, gbc_lblnom);
		
		txtnom = new JTextField();
		txtnom.setColumns(10);
		GridBagConstraints gbc_txtnom = new GridBagConstraints();
		gbc_txtnom.anchor = GridBagConstraints.NORTH;
		gbc_txtnom.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtnom.insets = new Insets(0, 0, 5, 5);
		gbc_txtnom.gridwidth = 3;
		gbc_txtnom.gridx = 3;
		gbc_txtnom.gridy = 3;
		contentPane.add(txtnom, gbc_txtnom);
		
		lblEmail = new JLabel("Email:");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.gridwidth = 2;
		gbc_lblEmail.anchor = GridBagConstraints.NORTH;
		gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 4;
		contentPane.add(lblEmail, gbc_lblEmail);
		
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
		
		lblLangue = new JLabel("Langue:");
		GridBagConstraints gbc_lblLangue = new GridBagConstraints();
		gbc_lblLangue.gridwidth = 2;
		gbc_lblLangue.anchor = GridBagConstraints.WEST;
		gbc_lblLangue.insets = new Insets(0, 0, 5, 5);
		gbc_lblLangue.gridx = 1;
		gbc_lblLangue.gridy = 5;
		contentPane.add(lblLangue, gbc_lblLangue);
		
		textlangue = new JTextField();
		textlangue.setColumns(10);
		GridBagConstraints gbc_textlangue = new GridBagConstraints();
		gbc_textlangue.anchor = GridBagConstraints.NORTH;
		gbc_textlangue.fill = GridBagConstraints.HORIZONTAL;
		gbc_textlangue.insets = new Insets(0, 0, 5, 5);
		gbc_textlangue.gridwidth = 3;
		gbc_textlangue.gridx = 3;
		gbc_textlangue.gridy = 5;
		contentPane.add(textlangue, gbc_textlangue);
								
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
						
						JButton btnConnect = new JButton("Connexion");
						btnConnect.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								System.out.println("connection");
								DemoJdbc.Connection = JOptionPane.showInputDialog("Server to connect");
								lblEtat.setText("Connecté "+DemoJdbc.Connection );
							}
						});
						GridBagConstraints gbc_btnConnect = new GridBagConstraints();
						gbc_btnConnect.insets = new Insets(0, 0, 5, 0);
						gbc_btnConnect.anchor = GridBagConstraints.SOUTHWEST;
						gbc_btnConnect.gridwidth = 2;
						gbc_btnConnect.gridx = 5;
						gbc_btnConnect.gridy = 6;
						contentPane.add(btnConnect, gbc_btnConnect);
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println("on a cliqué");
		if (e.getSource()== btnInsert){
			DemoJdbc.sauverEnBase(txtnom.getText(),txtPersonne.getText(),textemail.getText(),textlangue.getText());
			txtPersonne.setText("");
			txtnom.setText("");
			textemail.setText("");
			textlangue.setText("");
			lblEtat.setText("Insertion effectuée "+DemoJdbc.table);
		}
		if (e.getSource()== btnCancel){
			
			txtPersonne.setText("");
			txtnom.setText("");
			textemail.setText("");
			textlangue.setText("");
			lblEtat.setText("");	
		}
	}
}
