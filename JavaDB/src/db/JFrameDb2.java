package db;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameDb2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtPersonne;
	private JLabel lblEtat;
	private JButton btnCancel;
	private JButton btnInsert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameDb2 frame = new JFrameDb2();
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
	public JFrameDb2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);

		JLabel lblPersonne = new JLabel("Personne:");
		GridBagConstraints gbc_lblPersonne = new GridBagConstraints();
		gbc_lblPersonne.anchor = GridBagConstraints.EAST;
		gbc_lblPersonne.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonne.gridx = 1;
		gbc_lblPersonne.gridy = 1;
		contentPane.add(lblPersonne, gbc_lblPersonne);

		txtPersonne = new JTextField();
		GridBagConstraints gbc_txtPersonne = new GridBagConstraints();
		gbc_txtPersonne.insets = new Insets(0, 0, 5, 0);
		gbc_txtPersonne.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPersonne.gridx = 2;
		gbc_txtPersonne.gridy = 1;
		contentPane.add(txtPersonne, gbc_txtPersonne);
		txtPersonne.setColumns(10);

		btnInsert = new JButton("Insert");
		btnInsert.addActionListener(this);

		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(this);
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 2;
		contentPane.add(btnCancel, gbc_btnCancel);
		GridBagConstraints gbc_btnInsert = new GridBagConstraints();
		gbc_btnInsert.insets = new Insets(0, 0, 5, 0);
		gbc_btnInsert.gridx = 2;
		gbc_btnInsert.gridy = 2;
		contentPane.add(btnInsert, gbc_btnInsert);

		lblEtat = new JLabel("");
		GridBagConstraints gbc_lblEtat = new GridBagConstraints();
		gbc_lblEtat.gridx = 2;
		gbc_lblEtat.gridy = 3;
		contentPane.add(lblEtat, gbc_lblEtat);
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println("on a cliqué");
		if (e.getSource()== btnInsert){
			// a verifier pour inserer dans la base de données
			DemoJdbc.sauverEnBase(txtPersonne.getText(), txtPersonne.getText(),txtPersonne.getText(),txtPersonne.getText());
			txtPersonne.setText("");
			lblEtat.setText("Insertion effectuée");
		}
		if (e.getSource()== btnCancel){
			
			txtPersonne.setText("");
			lblEtat.setText("");
		
		}

	}

}
