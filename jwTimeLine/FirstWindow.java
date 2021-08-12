package jwTimeLine;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{
// Atributos de la clase

	//Jpanels:
	private JPanel pFondoIntro;
	private JPanel pTeam1;
	private JPanel pTeam2;
	private JPanel pGame;
	
	//pTeam1 - Objetos
	private ArrayList <JTextField> lstTeam1;
	private JTextField tFTeam1;
	private JButton bAnyadirTeam1;
	private JButton bEliminarTeam1;
	private JPanel pDePruebaTest;
	
	//pTeam2 - Objetos
	private ArrayList <JTextField> lstTeam2;
	private JTextField tFTeam2;
	private JButton bAnyadirTeam2;
	private JButton bEliminarTeam2;
	
	// Variables de control:
	private int turno;
	
	// Constructor vacío de la clase
	public FirstWindow() {
		// Inicializamos la ventana:
		this.setTitle("JW Time Line");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecución, con esta línea lo paramos
		this.setSize(800,600); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		
		pFondoIntro = new JPanel();
		pFondoIntro.setLayout(new BorderLayout());
		
		this.setContentPane(pFondoIntro);
		
		setEquipo1();
		pFondoIntro.add(pTeam1, BorderLayout.WEST);
		setEquipo2();
		pFondoIntro.add(pTeam2, BorderLayout.EAST);
	}

	private void setEquipo1() {
		// Montamos los paneles
		pTeam1 = new JPanel();
		GridBagLayout gBL_pTeam1 = new GridBagLayout();
		pTeam1.setLayout(gBL_pTeam1);
		
		JLabel lblNameTeam1 = new JLabel("Equipo 1");
		JLabel lblPersonaT1 = new JLabel("Nombre: ");
		tFTeam1 = new JTextField();
		tFTeam1.setColumns(10);
		bAnyadirTeam1 = new JButton("Añadir");
		bAnyadirTeam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TO-DO 
				// MÉTODO QUE AGREGA EL NOMBRE DEL USUARIO A UNA ARRAYLIST DE MIEMBROS DEL EQUIPO
				// ADEMÁS, CREAREMOS JLABEL Y MOSTRAREMOS TODOS LOS NOMBRES AGREGADOS DEL EQUIPO
			}
		});
		bEliminarTeam1 = new JButton("Eliminar");
		bEliminarTeam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TO-DO
				
			}
		});
		// Definimos las constraints de los objetos - Posicionamiento
		GridBagConstraints gBC_Team1 = new GridBagConstraints();
		gBC_Team1.gridy = 0;
		gBC_Team1.insets = new Insets(5, 5, 5, 5);
		gBC_Team1.gridwidth = 2;
		gBC_Team1.fill = GridBagConstraints.BOTH;
		pTeam1.add(lblNameTeam1, gBC_Team1);
		
		GridBagConstraints gbc_lblPersonaT1 = new GridBagConstraints();
		gbc_lblPersonaT1.insets = new Insets(5, 5, 5, 5);
		gbc_lblPersonaT1.gridy = 1;
		gbc_lblPersonaT1.gridx = 0;
		gbc_lblPersonaT1.fill = GridBagConstraints.HORIZONTAL;
		pTeam1.add(lblPersonaT1, gbc_lblPersonaT1);
		
		GridBagConstraints gbc_tFTeam1 = new GridBagConstraints();
		gbc_tFTeam1.insets = new Insets(5, 5, 5, 5);
		gbc_tFTeam1.gridy = 1;
		pTeam1.add(tFTeam1, gbc_tFTeam1);
		
		GridBagConstraints gbc_bAnyadirTeam1 = new GridBagConstraints();
		gbc_bAnyadirTeam1.insets = new Insets(5, 5, 5, 5);
		gbc_bAnyadirTeam1.gridy = 2;
		pTeam1.add(bAnyadirTeam1, gbc_bAnyadirTeam1);
		
		GridBagConstraints gbc_bEliminarTeam1 = new GridBagConstraints();
		gbc_bEliminarTeam1.insets = new Insets(5, 5, 5, 5);
		gbc_bEliminarTeam1.gridy = 2;
		gbc_bEliminarTeam1.gridx = 1;
		pTeam1.add(bEliminarTeam1, gbc_bEliminarTeam1);
		
	}
	
	private void setEquipo2() {
		pTeam2 = new JPanel();
		GridBagLayout gBL_pTeam2 = new GridBagLayout();
		pTeam2.setLayout(gBL_pTeam2);
		
		JLabel lblNameTeam2 = new JLabel("Equipo 2");
		JLabel lblPersonaT2 = new JLabel("Nombre: ");
		tFTeam2 = new JTextField();
		tFTeam2.setColumns(10);
		bAnyadirTeam2 = new JButton("Añadir");
		bAnyadirTeam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TO-DO 
				// MÉTODO QUE AGREGA EL NOMBRE DEL USUARIO A UNA ARRAYLIST DE MIEMBROS DEL EQUIPO
				// ADEMÁS, CREAREMOS JLABEL Y MOSTRAREMOS TODOS LOS NOMBRES AGREGADOS DEL EQUIPO
			}
		});
		bEliminarTeam2 = new JButton("Eliminar");
		bEliminarTeam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TO-DO
				
			}
		});
		// Definimos las constraints de los objetos - Posicionamiento
		GridBagConstraints gBC_Team2 = new GridBagConstraints();
		gBC_Team2.gridy = 0;
		gBC_Team2.insets = new Insets(5, 5, 5, 5);
		gBC_Team2.gridwidth = 2;
		gBC_Team2.fill = GridBagConstraints.BOTH;
		pTeam2.add(lblNameTeam2, gBC_Team2);
		
		GridBagConstraints gbc_lblPersonaT2 = new GridBagConstraints();
		gbc_lblPersonaT2.insets = new Insets(5, 5, 5, 5);
		gbc_lblPersonaT2.gridy = 1;
		gbc_lblPersonaT2.gridx = 0;
		gbc_lblPersonaT2.fill = GridBagConstraints.HORIZONTAL;
		pTeam2.add(lblPersonaT2, gbc_lblPersonaT2);
		
		GridBagConstraints gbc_tFTeam2 = new GridBagConstraints();
		gbc_tFTeam2.insets = new Insets(5, 5, 5, 5);
		gbc_tFTeam2.gridy = 1;
		pTeam2.add(tFTeam2, gbc_tFTeam2);
		
		GridBagConstraints gbc_bAnyadirTeam2 = new GridBagConstraints();
		gbc_bAnyadirTeam2.insets = new Insets(5, 5, 5, 5);
		gbc_bAnyadirTeam2.gridy = 2;
		pTeam2.add(bAnyadirTeam2, gbc_bAnyadirTeam2);
		
		GridBagConstraints gbc_bEliminarTeam2 = new GridBagConstraints();
		gbc_bEliminarTeam2.insets = new Insets(5, 5, 5, 5);
		gbc_bEliminarTeam2.gridy = 2;
		gbc_bEliminarTeam2.gridx = 1;
		pTeam2.add(bEliminarTeam2, gbc_bEliminarTeam2);
	}
}