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
import javax.swing.text.Caret;
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
import javax.swing.BorderFactory;
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
	private JFormattedTextField CampoNombres, CampoApellidos, CampoCedulas;
	private JButton BotonFoto, botonAyuda1, botonAyuda2, botonAyuda3, botonSalir;
	private JLabel EtiquetaNombre, EtiquetaApellido, EtiquetaCedula, EtiquetaIcono, EtiquetaLogo;
<<<<<<< HEAD
	private JTabbedPane ContenedorPestaña;
	private MaskFormatter Filtro;
	
=======
	private JTabbedPane ContenedorPesta�a;
	private MaskFormatter Filtro1, Filtro2, Filtro3;
	private JPanel PanelApellido , PanelCedula;

>>>>>>> e5fecd7... Version 0.2
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
		PanelFondo.setBackground(new Color(7, 105, 255));

		EtiquetaIcono = new JLabel(new ImageIcon("Imagenes/estudiante.png"));
		EtiquetaIcono.setBounds(44, 46, 118, 93);
		PanelFondo.add(EtiquetaIcono);

		/*
		 * 
		 * Metodo encagado de crear el contenedor que contiene los componetes de mi
		 * interfaz grafica con las pestañas.
		 * 
		 */

<<<<<<< HEAD
		ContenedorPestaña = new JTabbedPane(JTabbedPane.TOP);
		ContenedorPestaña.setBounds(55, 192, 426, 257);
		PanelFondo.add(ContenedorPestaña);
	

		Panel Pestaña1 = new Panel();
		ContenedorPestaña.addTab("Dato de Usuario", null, Pestaña1, null);
		Pestaña1.setLayout(null);
=======
		ContenedorPesta�a = new JTabbedPane(JTabbedPane.TOP);
		ContenedorPesta�a.setBounds(48, 166, 451, 283);
		ContenedorPesta�a.setBackground(Color.white);
		PanelFondo.add(ContenedorPesta�a);
		

		Panel Pesta�a1 = new Panel();
		ContenedorPesta�a.addTab("Dato de Usuario", null, Pesta�a1, null);
		Pesta�a1.setBackground(Color.white);
		Pesta�a1.setLayout(null);
>>>>>>> e5fecd7... Version 0.2

		// Boton encargado de cargar cualquier imagen gif y jpg del Sistema Operatio.

		BotonFoto = new JButton(new ImageIcon("Imagenes/usuario.png"));
		BotonFoto.setBounds(193, 0, 120, 84);
		BotonFoto.setBackground(Color.white);
		BotonFoto.setBorderPainted(false);
		BotonFoto.setFocusPainted(false);
		BotonFoto.addKeyListener(EventoTeclado);
		BotonFoto.addActionListener(EventoClick);
<<<<<<< HEAD
		Pestaña1.add(BotonFoto);
=======

		PanelApellido = new JPanel();
		PanelApellido.setBackground(Color.BLUE);
		PanelApellido.setBounds(154, 187, 228, 2);
		Pesta�a1.add(PanelApellido);

		PanelCedula = new JPanel();
		PanelCedula.setBackground(Color.BLUE);
		PanelCedula.setBounds(154, 240, 101, 2);
		Pesta�a1.add(PanelCedula);

		JPanel PanelNombre = new JPanel();
		PanelNombre.setBackground(Color.BLUE);
		PanelNombre.setBounds(152, 139, 230, 2);
		Pesta�a1.add(PanelNombre);
		Pesta�a1.add(BotonFoto);
>>>>>>> e5fecd7... Version 0.2

		EtiquetaNombre = new JLabel("Nombre del Estudiante");
<<<<<<< HEAD
		EtiquetaNombre.setBounds(10, 101, 132, 14);
		Pestaña1.add(EtiquetaNombre);
=======
		EtiquetaNombre.setBounds(154, 102, 137, 14);
		Pesta�a1.add(EtiquetaNombre);
>>>>>>> e5fecd7... Version 0.2

		
		Filtro1 = new MaskFormatter("?????????????????????????");
		CampoNombres = new JFormattedTextField(Filtro1);
		CampoNombres.setColumns(10);
		CampoNombres.setFont(new Font("Arial", Font.BOLD, 12));
		CampoNombres.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoNombres.addKeyListener(EventoTeclado);
<<<<<<< HEAD
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

=======
		CampoNombres.setBounds(152, 120, 230, 19);
		Pesta�a1.add(CampoNombres);

		
		EtiquetaApellido = new JLabel("Apellido del Estudiante");
		EtiquetaApellido.setBounds(154, 148, 132, 14);
		Pesta�a1.add(EtiquetaApellido);
>>>>>>> e5fecd7... Version 0.2
		
		
		Filtro2 = new MaskFormatter("?????????????");
		CampoApellidos = new JFormattedTextField(Filtro2);
		CampoApellidos.setColumns(10);
		CampoApellidos.setFont(new Font("Arial", Font.BOLD, 12));
		CampoApellidos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoApellidos.addKeyListener(EventoTeclado);
<<<<<<< HEAD
		CampoApellidos.addKeyListener(EventoTipoLetra);
		CampoApellidos.setBounds(152, 132, 230, 26);
		Pestaña1.add(CampoApellidos);
=======
		CampoApellidos.setBounds(154, 167, 230, 19);
		Pesta�a1.add(CampoApellidos);
>>>>>>> e5fecd7... Version 0.2

		
		EtiquetaCedula = new JLabel("Cedula del Estudiante");
<<<<<<< HEAD
		EtiquetaCedula.setBounds(10, 175, 145, 14);
		Pestaña1.add(EtiquetaCedula);
		
		
	        Filtro = new MaskFormatter(" # - ### - ### - #");
		Filtro.setPlaceholderCharacter('_');
		
		
		CampoCedulas = new JFormattedTextField(Filtro);
=======
		EtiquetaCedula.setBounds(154, 196, 145, 14);
		Pesta�a1.add(EtiquetaCedula);
		
		
		Filtro3 = new MaskFormatter(" # - ### - ### - #");
		Filtro3.setPlaceholderCharacter('_');
		CampoCedulas = new JFormattedTextField(Filtro3);
>>>>>>> e5fecd7... Version 0.2
		CampoCedulas.setColumns(10);
		CampoCedulas.setFont(new Font("Arial", Font.BOLD, 12));
		CampoCedulas.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoCedulas.addKeyListener(EventoTeclado);
<<<<<<< HEAD
		CampoCedulas.setBounds(152, 169, 102, 26);
		Pestaña1.add(CampoCedulas);

=======
		CampoCedulas.setBounds(153, 214, 102, 26);
		Pesta�a1.add(CampoCedulas);
		
>>>>>>> e5fecd7... Version 0.2
		/*
		 * Estos botones de ayuda son encargado de mostrarle al usuario un mensaje De
		 * debe de rellena un JTextField cuando estan vacios por defecto estan Por
		 * defecto estos botones estan desativados.
		 */
		
		

		botonAyuda1 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda1.setBackground(Color.WHITE);
		botonAyuda1.setBounds(392, 115, 29, 26);
		botonAyuda1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		botonAyuda1.setVisible(false);
		Pestaña1.add(botonAyuda1);

		
		botonAyuda2 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda2.setBackground(Color.WHITE);
		botonAyuda2.setBounds(392, 167, 29, 26);
		botonAyuda2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		botonAyuda2.setVisible(false);
		Pestaña1.add(botonAyuda2);

		
		botonAyuda3 = new JButton(new ImageIcon("Imagenes/Pregunta.png"));
		botonAyuda3.setBackground(Color.WHITE);
		botonAyuda3.setBounds(265, 221, 29, 26);
		botonAyuda3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		botonAyuda3.setVisible(false);
<<<<<<< HEAD
		Pestaña1.add(botonAyuda3);
=======
		Pesta�a1.add(botonAyuda3);
		Pesta�a1.setBackground(Color.white);
>>>>>>> e5fecd7... Version 0.2

		
		Panel Pestaña2 = new Panel();
		ContenedorPestaña.addTab("Nacionalidad", null, Pestaña2, null);
		Pestaña2.setLayout(null);

		
		EtiquetaLogo = new JLabel(new ImageIcon("Imagenes/Logo.png"));
		EtiquetaLogo.setBounds(10, 11, 137, 110);
<<<<<<< HEAD
		Pestaña2.add(EtiquetaLogo);
		
		
	        botonSalir = new JButton("X");
	        botonSalir.setForeground(Color.BLACK);
=======
		Pesta�a2.add(EtiquetaLogo);

		
		botonSalir = new JButton("X");
		botonSalir.setForeground(Color.WHITE);
>>>>>>> e5fecd7... Version 0.2
		botonSalir.setBounds(496, 11, 55, 23);
		botonSalir.setBackground(new Color(7, 105, 255));
		botonSalir.setBorderPainted(false);
		botonSalir.setFocusPainted(false);
		PanelFondo.add(botonSalir);

	}

	KeyAdapter EventoTeclado = new KeyAdapter() {

		@Override
		public void keyPressed(java.awt.event.KeyEvent e) {

			if (CampoNombres.isEditValid() == false) {

				CampoNombres.setBackground(Color.yellow);
				botonAyuda1.setVisible(true);
			}

			if (!CampoNombres.isEditValid() == false) {

				CampoNombres.setBackground(Color.white);
				botonAyuda1.setVisible(false);
			}

			if (CampoApellidos.isEditValid() == false) {

				CampoApellidos.setBackground(Color.yellow);
				botonAyuda2.setVisible(true);
			}

			if (!CampoApellidos.isEditValid() == false) {

				CampoApellidos.setBackground(Color.white);
				botonAyuda2.setVisible(false);
			}

			if (CampoCedulas.isEditValid() == false) {

				CampoCedulas.setBackground(Color.yellow);
				botonAyuda3.setVisible(true);
			}

			else {

				CampoCedulas.setBackground(Color.white);
				botonAyuda3.setVisible(false);
			}
		};
	};

<<<<<<< HEAD
	
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
	
	
	
=======
>>>>>>> e5fecd7... Version 0.2
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
