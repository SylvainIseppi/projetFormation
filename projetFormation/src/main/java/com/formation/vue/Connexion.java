package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Connexion {

	private JFrame frmSarlLuna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion window = new Connexion();
					window.frmSarlLuna.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSarlLuna = new JFrame();
		frmSarlLuna.setTitle("SARL Luna");
		frmSarlLuna.setIconImage(Toolkit.getDefaultToolkit().getImage(Connexion.class.getResource("/images/Moon-32.png")));
		frmSarlLuna.setBounds(100, 100, 450, 300);
		frmSarlLuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSarlLuna.getContentPane().setLayout(null);
		
		JLabel lblConnexionAuProgramme = new JLabel("Connexion au programme");
		lblConnexionAuProgramme.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConnexionAuProgramme.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Shopping-Cart-05-48.png")));
		lblConnexionAuProgramme.setBounds(87, 11, 238, 48);
		frmSarlLuna.getContentPane().add(lblConnexionAuProgramme);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.CYAN, 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 70, 414, 144);
		frmSarlLuna.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d'utilisateur");
		lblNomDutilisateur.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		lblNomDutilisateur.setBounds(10, 11, 112, 23);
		panel.add(lblNomDutilisateur);
	}

}
