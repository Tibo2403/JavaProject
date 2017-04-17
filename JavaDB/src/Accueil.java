import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class Accueil extends JFrame {
  
    private JPanel contentPane;
  
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Accueil frame = new Accueil();
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
     // objet fenetres créée
    Place Consultation = new Place();
    Creation Creation = new Creation();
    FrameClient Client = new FrameClient(); 
    private JTextField Emplacement;
    private JTextField textField_2;
    private JPasswordField passwordField;
    
    public Accueil() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 100, 450, 300);
        setTitle("Reservation");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        // ajout fenetre design system
        try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (InstantiationException e1) {

			e1.printStackTrace();
		} catch (IllegalAccessException e1) {

			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {

			e1.printStackTrace();
		}
        JButton btnCration = new JButton("Client");
        btnCration.setBounds(51, 10, 73, 23);
        btnCration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	//ouvre fenetre pour creation
                System.out.println("Bravo, Création");
                Client.setVisible(true);
            }
        });
        contentPane.setLayout(null);
        contentPane.add(btnCration);
          
        JButton btnConsultation = new JButton("Facture");
        btnConsultation.setBounds(129, 10, 93, 23);
        btnConsultation.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                //ouvre fenetre pour consultation
            	System.out.println("Bravo, Consultation");
                Consultation.setVisible(true);
            }
        });
        contentPane.add(btnConsultation);
          
        JButton btnGestion = new JButton("Reservation");
        btnGestion.setBounds(227, 10, 93, 23);
        btnGestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bravo, Gestion");
                
            }
        });
        contentPane.add(btnGestion);
          
        JButton btnHistorique = new JButton("Parking");
        btnHistorique.setBounds(326, 10, 81, 23);
        btnHistorique.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// ouvre fenetre pour historique reservation
                System.out.println("Bravo, Historique, petit bonhomme");
            }
        });
        contentPane.add(btnHistorique);
        
        JLabel lbllogin = new JLabel("login :");
        lbllogin.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lbllogin.setBounds(50, 50, 74, 23);
        contentPane.add(lbllogin);
        
        Emplacement = new JTextField();
        Emplacement.setBounds(129, 51, 124, 20);
        contentPane.add(Emplacement);
        Emplacement.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(129, 113, 124, 20);
        contentPane.add(textField_2);
        
        JLabel lblpassword = new JLabel("password :");
        lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblpassword.setBounds(50, 85, 74, 23);
        contentPane.add(lblpassword);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(129, 82, 124, 20);
        contentPane.add(passwordField);
        
        JLabel lblServeur = new JLabel("serveur :");
        lblServeur.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblServeur.setBounds(50, 116, 74, 23);
        contentPane.add(lblServeur);
    }
}