package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	public Accueil() {
		setTitle("Accueil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAction = new JPanel();
		panelAction.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelAction, BorderLayout.WEST);
		
		JLabel lblSociete = new JLabel("SARL Luna");
		lblSociete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQuitter.setIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48.png")));
		GroupLayout gl_panelAction = new GroupLayout(panelAction);
		gl_panelAction.setHorizontalGroup(
			gl_panelAction.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAction.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelAction.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panelAction.createSequentialGroup()
							.addComponent(btnQuitter)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panelAction.createSequentialGroup()
							.addComponent(lblSociete)
							.addGap(29))))
		);
		gl_panelAction.setVerticalGroup(
			gl_panelAction.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelAction.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSociete)
					.addPreferredGap(ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
					.addComponent(btnQuitter)
					.addGap(28))
		);
		panelAction.setLayout(gl_panelAction);
		
		JPanel panelBoutons = new JPanel();
		contentPane.add(panelBoutons, BorderLayout.CENTER);
		panelBoutons.setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		JButton btnArticle = new JButton("");
		btnArticle.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Product-128.png")));
		panelBoutons.add(btnArticle, "cell 1 0");
		
		JButton btnClient = new JButton("");
		btnClient.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		panelBoutons.add(btnClient, "cell 0 1");
		
		JButton btnStatistique = new JButton("");
		btnStatistique.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		panelBoutons.add(btnStatistique, "cell 1 1");
		
		JButton btnCommande = new JButton("");
		btnCommande.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		panelBoutons.add(btnCommande, "cell 2 1");
		
		JButton btnParametres = new JButton("");
		btnParametres.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Settings-02-128.png")));
		panelBoutons.add(btnParametres, "cell 1 2");
	}
}
