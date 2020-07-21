package Ejercicio1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class VentanaSexoNacionalidad {

	private JRadioButton RadioSexoHombre, RadioSexoMujer, RadioLocalidadMontevideo, RadioLocalidadCanelones,
			RadioLocalidadRocha, RadioLocalidadTacurembo;

	private JLabel EtiquetaSexo, EtiquetaLocalidades, EtiquetaLogo, EtiquetaDescriptiva;
	private ButtonGroup buttonGroup1, buttonGroup2;
	private JButton BotonCofirmar;
	
	public VentanaSexoNacionalidad(Panel Pestaña2 ) {
	
		
		EtiquetaLogo = new JLabel(new ImageIcon("Imagenes/Logo.png"));
		EtiquetaLogo.setBounds(0, 0, 130, 124);
		Pestaña2.add(EtiquetaLogo);

		
		EtiquetaDescriptiva = new JLabel("Selecione su Sexo y Nacionalidad para Confirmar ");
		EtiquetaDescriptiva.setFont(new Font("Arial", Font.BOLD, 14));
		EtiquetaDescriptiva.setBounds(137, 29, 348, 22);
		Pestaña2.add(EtiquetaDescriptiva);

		
		EtiquetaSexo = new JLabel("Sexo");
		EtiquetaSexo.setBounds(51, 120, 62, 22);
		Pestaña2.add(EtiquetaSexo);

		
		buttonGroup1 = new ButtonGroup();
		RadioSexoHombre = new JRadioButton("Hombre");
		RadioSexoHombre.setBackground(Color.WHITE);
		buttonGroup1.add(RadioSexoHombre);
		RadioSexoHombre.setBounds(21, 148, 109, 23);
		Pestaña2.add(RadioSexoHombre);

		
		RadioSexoMujer = new JRadioButton("Mujer");
		RadioSexoMujer.setBackground(Color.WHITE);
		buttonGroup1.add(RadioSexoMujer);
		RadioSexoMujer.setBounds(21, 174, 109, 23);
		Pestaña2.add(RadioSexoMujer);

		
		EtiquetaLocalidades = new JLabel("Localidad");
		EtiquetaLocalidades.setBounds(300, 120, 62, 22);
		Pestaña2.add(EtiquetaLocalidades);

		
		buttonGroup2 = new ButtonGroup();
		RadioLocalidadMontevideo = new JRadioButton("Montevideo");
		RadioLocalidadMontevideo.setBackground(Color.WHITE);
		buttonGroup2.add(RadioLocalidadMontevideo);
		RadioLocalidadMontevideo.setBounds(243, 148, 96, 23);
		Pestaña2.add(RadioLocalidadMontevideo);

		
		RadioLocalidadCanelones = new JRadioButton("Canelones");
		RadioLocalidadCanelones.setBackground(Color.WHITE);
		buttonGroup2.add(RadioLocalidadCanelones);
		RadioLocalidadCanelones.setBounds(344, 148, 93, 23);
		Pestaña2.add(RadioLocalidadCanelones);

		
		RadioLocalidadRocha = new JRadioButton("Rocha");
		RadioLocalidadRocha.setBackground(Color.WHITE);
		buttonGroup2.add(RadioLocalidadRocha);
		RadioLocalidadRocha.setBounds(243, 174, 101, 23);
		Pestaña2.add(RadioLocalidadRocha);

		
		RadioLocalidadTacurembo = new JRadioButton("Tacurembo");
		RadioLocalidadTacurembo.setBackground(Color.WHITE);
		buttonGroup2.add(RadioLocalidadTacurembo);
		RadioLocalidadTacurembo.setBounds(344, 174, 93, 23);
		Pestaña2.add(RadioLocalidadTacurembo);

		
		
		BotonCofirmar = new JButton("Confirmar");
		BotonCofirmar.setForeground(Color.WHITE);
		BotonCofirmar.setBackground(Color.GRAY);
		BotonCofirmar.addActionListener(EventoClick);
		BotonCofirmar.setBounds(172, 231, 96, 29);
		Pestaña2.add(BotonCofirmar);

	}

	ActionListener EventoClick = new ActionListener() {

		
		@Override
		public void actionPerformed(ActionEvent e) {

			
			if (buttonGroup1.isSelected(null) || buttonGroup2.isSelected(null)) {

				JOptionPane.showMessageDialog(null, "Debes selecionar un check box de el area sexo y localidad .");
				
			}else {
				
				JOptionPane.showMessageDialog(null, "hola como estas ");
			}

		};
	};
	
	
	public static void LeerArchivo() {
	
	}

	public static void GuardarArchivo() {
		
	}
}
