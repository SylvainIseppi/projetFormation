package com.formation.vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.text.Element;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
public class Connexion {

	private JFrame frame;
	private JTextField login;
	private JPasswordField password;
	/**
	 * @wbp.nonvisual location=93,69
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connexion window = new Connexion();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.textHighlight);
		panel.setBounds(10, 49, 394, 159);
		panel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel TxtLogin = new JLabel("nom d'utilisateur");
		TxtLogin.setHorizontalAlignment(SwingConstants.LEFT);
		TxtLogin.setIcon(new ImageIcon(Connexion.class.getResource("/images/connection/Windows-8-Login-16.png")));
		TxtLogin.setBounds(10, 11, 113, 14);
		panel.add(TxtLogin);
		
		login = new JTextField();
		TxtLogin.setLabelFor(login);
		login.setBounds(139, 8, 113, 20);
		panel.add(login);
		login.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(139, 39, 113, 20);
		panel.add(password);
		
		JLabel TxtMdp = new JLabel("mot de passe");
		TxtMdp.setBounds(10, 42, 94, 14);
		panel.add(TxtMdp);
		
		JEditorPane dtrpnVeuillezSaisirLe = new JEditorPane();
		dtrpnVeuillezSaisirLe.setEnabled(false);
		dtrpnVeuillezSaisirLe.setEditable(false);
		dtrpnVeuillezSaisirLe.setText("veuillez saisir le nom de l'utilisateur et le mot de passe pour acceder a l'application");
		dtrpnVeuillezSaisirLe.setBounds(10, 67, 113, 81);
		panel.add(dtrpnVeuillezSaisirLe);
	}
}
