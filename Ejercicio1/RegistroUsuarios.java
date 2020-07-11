package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.InternationalFormatter;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class RegistroUsuarios extends JFrame {

	private JPanel PanelFondo;
	private static RegistroUsuarios frame;
	private JTextField CampoNombres, CampoApellidos;
	private JFormattedTextField CampoCedulas;
	private JButton BotonFoto, botonAyuda1, botonAyuda2, botonAyuda3 , botonSalir;
	private JLabel EtiquetaNombre, EtiquetaApellido, EtiquetaCedula, EtiquetaIcono, EtiquetaLogo;
	private JTabbedPane ContenedorPestaña;
	private MaskFormatter Filtro;
	
	public RegistroUsuarios() throws ParseException {

		// metodo encargado de cambiarme el icono de mi aplicacion.
		setIconImage(new ImageIcon(getClass().getResource("estudiante (1).png")).getImage());
		setTitle("Interfaz de Registro de Alumnos");
		setBounds(100, 100, 561, 460);
		setUndecorated(true);
		
		
		PanelFondo = new JPanel();
		PanelFondo.setBorder(new TitledBorder(null, "", TitledBorder.TRAILING, TitledBorder.ABOVE_TOP, null, null));
		setContentPane(PanelFondo);
		PanelFondo.setLayout(null);

		
		EtiquetaIcono = new JLabel(new ImageIcon("Imagenes/estudiante.png"));
		EtiquetaIcono.setBounds(55, 71, 118, 93);
		PanelFondo.add(EtiquetaIcono);

		/*
		 * 
		 * Metodo encagado de crear el contenedor que contiene los componetes de mi
		 * interfaz grafica con las pestañas.
		 * 
		 */

		ContenedorPestaña = new JTabbedPane(JTabbedPane.TOP);
		ContenedorPestaña.setBounds(55, 192, 426, 257);
		PanelFondo.add(ContenedorPestaña);
	

		Panel Pestaña1 = new Panel();
		ContenedorPestaña.addTab("Dato de Usuario", null, Pestaña1, null);
		Pestaña1.setLayout(null);

		// Boton encargado de cargar cualquier imagen gif y jpg del Sistema Operatio.

		BotonFoto = new JButton(new ImageIcon("Imagenes/usuario.png"));
		BotonFoto.setBounds(205, 0, 120, 84);
		BotonFoto.addKeyListener(EventoTeclado);
		BotonFoto.addActionListener(EventoClick);
		Pestaña1.add(BotonFoto);

		
		EtiquetaNombre = new JLabel("Nombre del Estudiante");
		EtiquetaNombre.setBounds(10, 101, 132, 14);
		Pestaña1.add(EtiquetaNombre);

		
		CampoNombres = new JTextField();
		CampoNombres.setColumns(10);
		CampoNombres.setFont(new Font("Arial", Font.BOLD, 12));
		CampoNombres.addKeyListener(EventoTeclado);
		CampoNombres.addKeyListener(EventoTipoLetra);
		CampoNombres.setBounds(152, 95, 230, 26);
		Pestaña1.add(CampoNombres);
		

	    /*
		 * 
		 * Este metodo se encargar de poner un texto descriptivo Transparente en los
		 * JTextField Que No afecta al momento que estas escribiendo en JTextField
		 * 
		 */

		
		TextPrompt placeholder1 = new TextPrompt("Ingrese su Nombre", CampoNombres);

		
		EtiquetaApellido = new JLabel("Apellido del Estudiante");
		EtiquetaApellido.setBounds(10, 138, 132, 14);
		Pestaña1.add(EtiquetaApellido);

		
		CampoApellidos = new JTextField();
		CampoApellidos.setColumns(10);
		CampoApellidos.setFont(new Font("Arial", Font.BOLD, 12));
		CampoApellidos.addKeyListener(EventoTeclado);
		CampoApellidos.addKeyListener(EventoTipoLetra);
		CampoApellidos.setBounds(152, 132, 230, 26);
		Pestaña1.add(CampoApellidos);

		
		TextPrompt placeholder2 = new TextPrompt("Ingrese su Apellido", CampoApellidos);

		
		EtiquetaCedula = new JLabel("Cedula del Estudiante");
		EtiquetaCedula.setBounds(10, 175, 145, 14);
		Pestaña1.add(EtiquetaCedula);
		
		
	    Filtro = new MaskFormatter(" # - ### - ### - #");
		Filtro.setPlaceholderCharacter('_');
		
		
		CampoCedulas = new JFormattedTextField(Filtro);
		CampoCedulas.setColumns(10);
		CampoCedulas.setFont(new Font("Arial", Font.BOLD, 12));
		CampoCedulas.addKeyListener(EventoTeclado);
		CampoCedulas.setBounds(152, 169, 102, 26);
		Pestaña1.add(CampoCedulas);

		/*
		 * Estos botones de ayuda son encargado de mostrarle al usuario un mensaje De
		 * debe de rellena un JTextField cuando estan vacios por defecto estan Por
		 * defecto estos botones estan desativados.
		 */
		
		
		botonAyuda1 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda1.setBounds(392, 95, 29, 26);
		botonAyuda1.setVisible(false);
		Pestaña1.add(botonAyuda1);

		
		botonAyuda2 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda2.setBounds(392, 131, 29, 26);
		botonAyuda2.setVisible(false);
		Pestaña1.add(botonAyuda2);

		
		botonAyuda3 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda3.setBounds(264, 169, 29, 26);
		botonAyuda3.setVisible(false);
		Pestaña1.add(botonAyuda3);

		
		Panel Pestaña2 = new Panel();
		ContenedorPestaña.addTab("Nacionalidad", null, Pestaña2, null);
		Pestaña2.setLayout(null);

		
		EtiquetaLogo = new JLabel(new ImageIcon("Imagenes/Logo.png"));
		EtiquetaLogo.setBounds(10, 11, 137, 110);
		Pestaña2.add(EtiquetaLogo);
		
		
	    botonSalir = new JButton("X");
	    botonSalir.setForeground(Color.BLACK);
		botonSalir.setBounds(496, 11, 55, 23);
		botonSalir.setBackground(new Color(237,237,234));
		botonSalir.setBorderPainted(false);
		botonSalir.setFocusPainted(false);
		PanelFondo.add(botonSalir);
		
	}

	KeyAdapter EventoTeclado = new KeyAdapter() {

		@Override
		public void keyPressed(java.awt.event.KeyEvent e) {
			
			if(CampoNombres.getText().isEmpty()) {
				
				CampoNombres.setBackground(Color.yellow);
				botonAyuda1.setVisible(true);
			}
			
			if(!CampoNombres.getText().isEmpty()) {
				
				CampoNombres.setBackground(Color.white);
				botonAyuda1.setVisible(false);
			}
			
			if(CampoApellidos.getText().isEmpty()) {
				
				CampoApellidos.setBackground(Color.yellow);
				botonAyuda2.setVisible(true);
			}
			
			if(!CampoApellidos.getText().isEmpty()) {
				
				CampoApellidos.setBackground(Color.white);
				botonAyuda2.setVisible(false);
			}
			
			if(CampoCedulas.isEditValid() == false) {
				
				CampoCedulas.setBackground(Color.yellow);
				botonAyuda3.setVisible(true);
			}
			
			else {
				
				CampoCedulas.setBackground(Color.white);
				botonAyuda3.setVisible(false);
			}
		};
	};

	
	/**
	 * 
	   			Este metodo se encarga de validar si el usuario
	  			Ingreso numeros en ves de texto en los campos Nombre y Apellido.
 	 * 
	 */

	
	KeyAdapter EventoTipoLetra =new KeyAdapter() {
		
		public void keyTyped(KeyEvent e) {
			
			if(!Character.isLetter(e.getKeyChar())) {
				
				e.consume();
			}
		}	
	};
	
	
	
	ActionListener EventoClick = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

		}
	};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					frame = new RegistroUsuarios();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}