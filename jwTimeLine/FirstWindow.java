package jwTimeLine;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	
	//pTeam2 - Objetos
	private ArrayList <JTextField> lstTeam2;
	private JTextField tFTeam2;
	private JButton bAnyadirTeam2;
	
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
		lblNameTeam1.setHorizontalAlignment(JLabel.CENTER);
		GridBagConstraints gBC_lblNameTeam1 = new GridBagConstraints();
		// Aquí definiremos las normas (constraints) para el elemento lblNameTeam1
		gBC_lblNameTeam1.fill= GridBagConstraints.BOTH; // Con esto haremos que se rellene el hueco que deja el objeto al no rellenarlo por completo
		gBC_lblNameTeam1.weightx = 1.0; // Se redimensionan las columnas y se mantiene su relación original
		gBC_lblNameTeam1.gridwidth = GridBagConstraints.REMAINDER; // Con esto hacemos que solo un elemento ocupe la línea
		
		JLabel lblPersonaT1 = new JLabel("Nombre: ");
		tFTeam1 = new JTextField();
		tFTeam1.setColumns(10);
		bAnyadirTeam1 = new JButton("Añadir");
		bAnyadirTeam1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 
				// MÉTODO QUE AGREGA EL NOMBRE DEL USUARIO A UNA ARRAYLIST DE MIEMBROS DEL EQUIPO
				// ADEMÁS, CREAREMOS JLABEL Y MOSTRAREMOS TODOS LOS NOMBRES AGREGADOS DEL EQUIPO
			}
		});
		
		gBL_pTeam1.setConstraints(lblNameTeam1, gBC_lblNameTeam1);
		pTeam1.add(lblNameTeam1);
		
		pTeam1.add(lblPersonaT1);
		pTeam1.add(tFTeam1);
		
		GridBagConstraints gBC_bAnyadir = new GridBagConstraints();
		gBC_bAnyadir.gridy = 2;
		gBC_bAnyadir.fill= GridBagConstraints.HORIZONTAL;
		gBC_bAnyadir.gridwidth = 2;
		gBL_pTeam1.setConstraints(bAnyadirTeam1, gBC_bAnyadir);
		pTeam1.add(bAnyadirTeam1);
		
	}
	
	private void setEquipo2() {
		pTeam2 = new JPanel();
		GridBagLayout gBL_pTeam2 = new GridBagLayout();
		
		
		pTeam1.setLayout(gBL_pTeam2);
		
		JLabel lblNameTeam2 = new JLabel("Equipo 2");
		lblNameTeam2.setHorizontalAlignment(JLabel.CENTER);
		GridBagConstraints gBC_lblNameTeam2 = new GridBagConstraints();
		// Aquí definiremos las normas (constraints) para el elemento lblNameTeam1
		gBC_lblNameTeam2.fill= GridBagConstraints.BOTH; // Con esto haremos que se rellene el hueco que deja el objeto al no rellenarlo por completo
		gBC_lblNameTeam2.weightx = 1.0; // Se redimensionan las columnas y se mantiene su relación original
		gBC_lblNameTeam2.gridwidth = GridBagConstraints.REMAINDER; // Con esto hacemos que solo un elemento ocupe la línea
		
		JLabel lblPersonaT2 = new JLabel("Nombre: ");
		tFTeam2 = new JTextField();
		tFTeam2.setColumns(10);
		bAnyadirTeam2 = new JButton("Añadir");
		bAnyadirTeam2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 
				// MÉTODO QUE AGREGA EL NOMBRE DEL USUARIO A UNA ARRAYLIST DE MIEMBROS DEL EQUIPO
				// ADEMÁS, CREAREMOS JLABEL Y MOSTRAREMOS TODOS LOS NOMBRES AGREGADOS DEL EQUIPO
			}
		});
		
		gBL_pTeam2.setConstraints(lblNameTeam2, gBC_lblNameTeam2);
		pTeam2.add(lblNameTeam2);
		
		pTeam2.add(lblPersonaT2);
		pTeam2.add(tFTeam2);
		
		GridBagConstraints gBC_bAnyadir = new GridBagConstraints();
		gBC_bAnyadir.gridy = 2;
		gBC_bAnyadir.fill= GridBagConstraints.HORIZONTAL;
		gBC_bAnyadir.gridwidth = 2;
		gBL_pTeam2.setConstraints(bAnyadirTeam2, gBC_bAnyadir);
		pTeam2.add(bAnyadirTeam2);
	}
}