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
	
	//pTeam2 - Objetos
	private ArrayList <JTextField> lstTeam2;
	private JTextField tFTeam2;
	private JButton bAnyadirTeam2;
	
	// Variables de control:
	private int turno;
	
	// Constructor vac�o de la clase
	public FirstWindow() {
		// Inicializamos la ventana:
		this.setTitle("JW Time Line");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecuci�n, con esta l�nea lo paramos
		this.setSize(800,600); //Tama�o de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		
		pFondoIntro = new JPanel();
		pFondoIntro.setLayout(new BorderLayout());
		
		this.setContentPane(pFondoIntro);
		
		setEquipo1();
		pFondoIntro.add(pTeam1, BorderLayout.WEST);
		setEquipo2();
		//pFondoIntro.add(pTeam2, BorderLayout.EAST);
	}

	private void setEquipo1() {
		// Montamos los paneles
		pTeam1 = new JPanel();
		GridBagLayout gBL_pTeam1 = new GridBagLayout();
		pTeam1.setLayout(gBL_pTeam1);
		GridBagConstraints gBC_Team1 = new GridBagConstraints();
		gBC_Team1.gridheight = 2;
		gBC_Team1.gridwidth = 2;
		gBC_Team1.fill = GridBagConstraints.BOTH;
		JLabel lblNameTeam1 = new JLabel("Equipo 1");
		// Aqu� definiremos las normas (constraints) para el elemento lblNameTeam1
		/*
		gBC_Team1.gridx = 0;
		gBC_Team1.gridy = 0;
		gBC_Team1.gridwidth = 3;
		gBC_Team1.fill= GridBagConstraints.BOTH; // Con esto haremos que se rellene el hueco que deja el objeto al no rellenarlo por completo
		gBC_Team1.weightx = 0.5; // Se redimensionan las columnas y se mantiene su relaci�n original
		gBC_Team1.insets = new Insets(2,2,2,2);
		gBC_Team1.anchor = GridBagConstraints.CENTER;
		*/
		pTeam1.add(lblNameTeam1, gBC_Team1);
		// Aqu� definiremos las normas (constraints) para el elemento lblPersonaT1
		JLabel lblPersonaT1 = new JLabel("Nombre: ");
		
		tFTeam1 = new JTextField();
		tFTeam1.setColumns(10);
		bAnyadirTeam1 = new JButton("A�adir");
		bAnyadirTeam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TO-DO 
				// M�TODO QUE AGREGA EL NOMBRE DEL USUARIO A UNA ARRAYLIST DE MIEMBROS DEL EQUIPO
				// ADEM�S, CREAREMOS JLABEL Y MOSTRAREMOS TODOS LOS NOMBRES AGREGADOS DEL EQUIPO
			}
		});
		bEliminarTeam1 = new JButton("Eliminar");
		bEliminarTeam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TO-DO
				
			}
		});
		
		gBL_pTeam1.setConstraints(lblNameTeam1, gBC_Team1);
		pTeam1.add(lblNameTeam1);
		
		GridBagConstraints gbc_lblPersonaT1 = new GridBagConstraints();
		gbc_lblPersonaT1.gridy = 1;
		gbc_lblPersonaT1.gridx = 0;
		gbc_lblPersonaT1.fill = GridBagConstraints.HORIZONTAL;
		pTeam1.add(lblPersonaT1, gbc_lblPersonaT1);
		
		GridBagConstraints gbc_tFTeam1 = new GridBagConstraints();
		gbc_tFTeam1.gridy = 1;
		pTeam1.add(tFTeam1, gbc_tFTeam1);
		
		GridBagConstraints gbc_bAnyadirTeam1 = new GridBagConstraints();
		gbc_bAnyadirTeam1.gridy = 2;
		pTeam1.add(bAnyadirTeam1, gbc_bAnyadirTeam1);
		
		GridBagConstraints gbc_bEliminarTeam1 = new GridBagConstraints();
		gbc_bEliminarTeam1.gridy = 2;
		gbc_bEliminarTeam1.gridx = 1;
		pTeam1.add(bEliminarTeam1, gbc_bEliminarTeam1);
		
	}
	
	private void setEquipo2() {
		
	}
}