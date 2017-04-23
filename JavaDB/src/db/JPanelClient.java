package db;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTable;

public class JPanelClient extends JPanel {
	private JButton jButtonOK;
	private JTextField textField;
	private JButton btncancel;

	/**
	 * Create the panel.
	 */
	public JPanelClient() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewClient = new JLabel("Client :");
		GridBagConstraints gbc_lblNewClient = new GridBagConstraints();
		gbc_lblNewClient.gridwidth = 2;
		gbc_lblNewClient.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewClient.gridx = 1;
		gbc_lblNewClient.gridy = 4;
		add(lblNewClient, gbc_lblNewClient);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 6;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		btncancel = new JButton("Cancel");
		GridBagConstraints gbc_btncancel = new GridBagConstraints();
		gbc_btncancel.insets = new Insets(0, 0, 5, 5);
		gbc_btncancel.gridx = 6;
		gbc_btncancel.gridy = 6;
		add(btncancel, gbc_btncancel);
		
		jButtonOK = new JButton("OK");
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.insets = new Insets(0, 0, 5, 5);
		gbc_jButtonOK.gridx = 7;
		gbc_jButtonOK.gridy = 6;
		add(jButtonOK, gbc_jButtonOK);
	}
}