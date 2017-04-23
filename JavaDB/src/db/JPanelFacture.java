package db;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class JPanelFacture extends JPanel {
	private JButton jButtonOK;

	/**
	 * Create the panel.
	 */
	public JPanelFacture() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		jButtonOK = new JButton("OK");
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 4;
		gbc_jButtonOK.gridy = 3;
		add(jButtonOK, gbc_jButtonOK);

	}

}
