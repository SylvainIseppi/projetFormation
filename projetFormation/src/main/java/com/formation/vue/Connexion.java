package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import com.formation.requete.RequeteConnexion;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Connexion extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion frame = new Connexion();
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
	public Connexion() {
		setTitle("SARL LUNA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConnexionAuProgramme = new JLabel("Connexion au programme");
		lblConnexionAuProgramme.setBounds(5, 5, 424, 48);
		lblConnexionAuProgramme.setHorizontalAlignment(SwingConstants.CENTER);
		lblConnexionAuProgramme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConnexionAuProgramme.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Shopping-Cart-05-48.png")));
		contentPane.add(lblConnexionAuProgramme);
		
		JPanel panelBoutons = new JPanel();
		panelBoutons.setBounds(5, 199, 424, 57);
		contentPane.add(panelBoutons);
		panelBoutons.setLayout(null);
		
		JButton btnParamtres = new JButton("Param\u00E8tres");
		btnParamtres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnParamtres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnParamtres.setBounds(0, 0, 149, 57);
		btnParamtres.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Customize-01-48.png")));
		panelBoutons.add(btnParamtres);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQuitter.setBounds(169, 0, 130, 57);
		btnQuitter.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Stop-48.png")));
		panelBoutons.add(btnQuitter);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mdp="";
				for (char unchar : passwordField.getPassword()) {
					mdp+=unchar;
				}
				RequeteConnexion.getUser(textUser.getText(),mdp);
			}
		});
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnValider.setBounds(301, 0, 123, 57);
		btnValider.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Power-48.png")));
		btnValider.setForeground(Color.WHITE);
		btnValider.setHorizontalTextPosition(SwingConstants.LEADING);
		panelBoutons.add(btnValider);
		
		JPanel panelGlobal = new JPanel();
		panelGlobal.setBounds(0, 53, 434, 141);
		contentPane.add(panelGlobal);
		panelGlobal.setLayout(null);
		
		JLabel lblUser = new JLabel("Nom d'utilisateur");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(10, 11, 126, 17);
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelGlobal.add(lblUser);
		
		JLabel lblUser2 = new JLabel("");
		lblUser2.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		lblUser2.setBounds(137, 11, 16, 20);
		panelGlobal.add(lblUser2);
		
		textUser = new JTextField();
		textUser.setBounds(163, 11, 251, 20);
		panelGlobal.add(textUser);
		textUser.setColumns(10);
		
		JLabel lblPassword = new JLabel("Mot de passe");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(10, 39, 143, 17);
		panelGlobal.add(lblPassword);
		
		JLabel lblPassword2 = new JLabel("");
		lblPassword2.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Key-16.png")));
		lblPassword2.setBounds(137, 39, 16, 20);
		panelGlobal.add(lblPassword2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(163, 42, 251, 20);
		panelGlobal.add(passwordField);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setForeground(Color.GRAY);
		txtpnInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnInfo.setText("Veuillez saisir\r\nle nom de l'utilisateur et le mot de passe\r\npour acc\u00E9der \u00E0 l'application");
		txtpnInfo.setBounds(20, 67, 394, 68);
		panelGlobal.add(txtpnInfo);
		
		JPanel panelGlobal2 = new JPanel();
		panelGlobal2.setBorder(new EmptyBorder(14, 14, 14, 14));
		panelGlobal2.setBackground(Color.WHITE);
		panelGlobal2.setBounds(10, 0, 414, 135);
		panelGlobal.add(panelGlobal2);
		panelGlobal2.setLayout(null);
	
	}
	public  void erreurCo(){
		JOptionPane.showMessageDialog(this,"Erreur de connexion");
	}
}
