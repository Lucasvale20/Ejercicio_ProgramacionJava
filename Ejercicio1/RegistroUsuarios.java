package Ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.Caret;
import javax.swing.text.InternationalFormatter;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ButtonGroup;
import java.awt.Label;
import javax.swing.SwingConstants;

public class RegistroUsuarios extends JFrame {

	private JPanel PanelFondo;
	private JTextField CampoNombres, CampoApellidos;
	private JFormattedTextField CampoCedulas;
	private JButton BotonFoto, botonAyuda1, botonAyuda2, botonAyuda3, botonSalir;
	private JLabel EtiquetaNombre, EtiquetaApellido, EtiquetaCedula, EtiquetaIcono;
	private JTabbedPane ContenedorPestaña;
	private MaskFormatter Filtro;
	private JPanel PanelApellido, PanelCedula, PanelNombre;
	private Panel Pestaña1, Pestaña2;

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
		EtiquetaIcono.setBounds(48, 43, 118, 93);
		PanelFondo.add(EtiquetaIcono);

		/*
		 * 
		 * Metodo encagado de crear el contenedor que contiene los componetes de mi
		 * interfaz grafica con las pestañas.
		 * 
		 */

		ContenedorPestaña = new JTabbedPane(JTabbedPane.TOP);
		ContenedorPestaña.setBounds(48, 150, 490, 299);
		ContenedorPestaña.setBackground(Color.white);
		PanelFondo.add(ContenedorPestaña);

		Pestaña1 = new Panel();
		ContenedorPestaña.addTab("Dato de Usuario", null, Pestaña1, null);
		ContenedorPestaña.setBackgroundAt(0, Color.WHITE);
		Pestaña1.setLayout(null);

		// Boton encargado de cargar cualquier imagen gif y jpg del Sistema Operatio.

		BotonFoto = new JButton(new ImageIcon("Imagenes/usuario.png"));
		BotonFoto.setForeground(Color.WHITE);
		BotonFoto.setBounds(193, 0, 120, 84);
		BotonFoto.setBackground(Color.WHITE);
		BotonFoto.setBorderPainted(false);
		BotonFoto.setFocusPainted(false);
		BotonFoto.addActionListener(EventoClick);
		Pestaña1.add(BotonFoto);

		EtiquetaNombre = new JLabel("Nombre del Estudiante");
		EtiquetaNombre.setBounds(154, 102, 137, 14);
		Pestaña1.add(EtiquetaNombre);

		CampoNombres = new JTextField();
		CampoNombres.setColumns(10);
		CampoNombres.addKeyListener(EventoTipo);
		CampoNombres.setFont(new Font("Arial", Font.BOLD, 12));
		CampoNombres.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoNombres.addKeyListener(EventoTeclado);
		CampoNombres.setBounds(152, 120, 230, 19);
		Pestaña1.add(CampoNombres);

		PanelNombre = new JPanel();
		PanelNombre.setBackground(Color.BLUE);
		PanelNombre.setBounds(152, 139, 230, 2);
		Pestaña1.add(PanelNombre);

		EtiquetaApellido = new JLabel("Apellido del Estudiante");
		EtiquetaApellido.setBounds(154, 148, 132, 14);
		Pestaña1.add(EtiquetaApellido);

		CampoApellidos = new JTextField();
		CampoApellidos.setColumns(10);
		CampoApellidos.addKeyListener(EventoTipo);
		CampoApellidos.setFont(new Font("Arial", Font.BOLD, 12));
		CampoApellidos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoApellidos.addKeyListener(EventoTeclado);
		CampoApellidos.setBounds(154, 167, 230, 19);
		Pestaña1.add(CampoApellidos);

		PanelApellido = new JPanel();
		PanelApellido.setBackground(Color.BLUE);
		PanelApellido.setBounds(154, 187, 228, 2);
		Pestaña1.add(PanelApellido);

		EtiquetaCedula = new JLabel("Cedula del Estudiante");
		EtiquetaCedula.setBounds(154, 196, 145, 14);
		Pestaña1.add(EtiquetaCedula);

		Filtro = new MaskFormatter(" # - ### - ### - #");
		Filtro.setPlaceholderCharacter('_');
		CampoCedulas = new JFormattedTextField(Filtro);
		CampoCedulas.setColumns(10);
		CampoCedulas.setFont(new Font("Arial", Font.BOLD, 12));
		CampoCedulas.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), 2));
		CampoCedulas.addKeyListener(EventoTeclado);
		CampoCedulas.setBounds(153, 214, 102, 26);
		Pestaña1.add(CampoCedulas);

		PanelCedula = new JPanel();
		PanelCedula.setBackground(Color.BLUE);
		PanelCedula.setBounds(154, 240, 101, 2);
		Pestaña1.add(PanelCedula);

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
		Pestaña1.add(botonAyuda3);
		Pestaña1.setBackground(Color.white);

		Pestaña2 = new Panel();
		ContenedorPestaña.addTab("Sexo Nacionalidad", null, Pestaña2, null);
		ContenedorPestaña.setEnabledAt(1, false);
		Pestaña2.setLayout(null);
		VentanaSexoNacionalidad ventana2 = new VentanaSexoNacionalidad(Pestaña2);

		botonSalir = new JButton("X");
		botonSalir.setForeground(Color.WHITE);
		botonSalir.setBounds(496, 11, 55, 23);
		botonSalir.setBackground(new Color(7, 105, 255));
		botonSalir.setBorderPainted(false);
		botonSalir.setFocusPainted(false);
		botonSalir.addActionListener(EventoClick);
		PanelFondo.add(botonSalir);

	}

	KeyAdapter EventoTeclado = new KeyAdapter() {

		@Override
		public void keyReleased(java.awt.event.KeyEvent e) {

			/*
			 * 
			 * Estos if validan si los campos Nombre , Apellido, Cedula estan vacios y si
			 * estan vacios los pinta De color amarillo indicandoles que debe de rellenar
			 * Esos Campos y ademas hace visible los botones de Ayuda Para Mas Informacion.
			 * 
			 */

			if (CampoNombres.getText().isEmpty()) {

				CampoNombres.setBackground(Color.yellow);
				botonAyuda1.setVisible(true);

			}

			if (!CampoNombres.getText().isEmpty()) {

				CampoNombres.setBackground(Color.white);
				botonAyuda1.setVisible(false);
			}

			if (CampoApellidos.getText().isEmpty()) {

				CampoApellidos.setBackground(Color.yellow);
				botonAyuda2.setVisible(true);

			}

			if (!CampoApellidos.getText().isEmpty()) {

				CampoApellidos.setBackground(Color.white);
				botonAyuda2.setVisible(false);

			}

			if (CampoCedulas.isEditValid() == false) {

				CampoCedulas.setBackground(Color.yellow);
				botonAyuda3.setVisible(true);
			}

			if (!CampoCedulas.isEditValid() == false) {

				CampoCedulas.setBackground(Color.white);
				botonAyuda3.setVisible(false);

			}

		};
	};

	/*
	 * 
	 * Este metodo se encarga de validar si el usuario Ingresa Un caracter que no
	 * sea letra en CampoNombre y CampoApellido Y lo elimina.
	 * 
	 */

	KeyAdapter EventoTipo = new KeyAdapter() {

		public void keyTyped(KeyEvent e) {

			if (!Character.isLetter(e.getKeyChar()) && e.getKeyCode() != KeyEvent.VK_DELETE) {

				e.consume();
			}
		};

	};

	
	
	ActionListener EventoClick = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == BotonFoto) {

				JFileChooser ventanaFile = new JFileChooser();
				FileNameExtensionFilter FiltoVentana = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
				ventanaFile.setFileFilter(FiltoVentana);

				int Seleccion = ventanaFile.showOpenDialog(getParent());

				if (Seleccion == ventanaFile.APPROVE_OPTION) {

					BotonFoto.setIcon(new ImageIcon(ventanaFile.getSelectedFile().toString()));

				}
			}

			if (e.getSource() == botonSalir) {

				System.exit(0);
			}

		}
	};

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					RegistroUsuarios frame = new RegistroUsuarios();
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