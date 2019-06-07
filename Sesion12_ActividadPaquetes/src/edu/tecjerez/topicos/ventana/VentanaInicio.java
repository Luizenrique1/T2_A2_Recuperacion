package edu.tecjerez.topicos.ventana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.tecjerez.topicos.dosdimensiones.Circulo;
import edu.tecjerez.topicos.dosdimensiones.Elipse;
import edu.tecjerez.topicos.dosdimensiones.Rombo;
import edu.tecjerez.topicos.tresdimensiones.Cono;
import edu.tecjerez.topicos.tresdimensiones.Piramide;




public class VentanaInicio extends JFrame implements ActionListener{
	
	JTextField radio,resultadoCirculoArea , resultadoCirculoPer, radioMayor, radioMenor, resultadoAreaElipse, resultadoPerElipse,
	ladoRombo,diagonalMayor, diagonalMenor, resultadoAreaRombo, resultadoPerRombo, radioCono, alturaCono, radioPiramide,
	alturaPiramide, volumenC, volumenP;
	JCheckBox todos;
	JRadioButton  areaCirculo,perimetroCirculo, areaElipse,perimetroElipse, areaRombo, perimetroRombo,  volumenCono, 
	volumenPiramide;
	public VentanaInicio () {
		
		//configuracion ventana
		setSize(800,250);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Area, perimetro y volumen");
		setVisible(true);
		
		
		
		//componentes graficos 
		JPanel panelCirculo = new JPanel(new FlowLayout());
		panelCirculo.setBackground(Color.gray);
		
		panelCirculo.setPreferredSize(new Dimension(150, 200));
		
		panelCirculo.add(new JLabel ("CIRCULO              "));
		panelCirculo.add(new JLabel("Ingresa radio"));
		radio = new JTextField(4);
		panelCirculo.add(radio);
		
		
		ButtonGroup bg = new ButtonGroup();
		areaCirculo = new JRadioButton("Area");
		bg.add(areaCirculo);
		panelCirculo.add(areaCirculo);
		areaCirculo.addActionListener(this);
		resultadoCirculoArea = new JTextField(4);
		panelCirculo.add(resultadoCirculoArea);
		
		
		perimetroCirculo = new JRadioButton("Perimetro");
		bg.add(perimetroCirculo);
		panelCirculo.add(perimetroCirculo);
		perimetroCirculo.addActionListener(this);
		resultadoCirculoPer = new JTextField(4);
		panelCirculo.add(resultadoCirculoPer);
		
		add(panelCirculo);
		
		JPanel panelElipse = new JPanel(new FlowLayout());
		panelElipse.setBackground(Color.white);
		panelElipse.setPreferredSize(new Dimension(150, 200));
		panelElipse.add(new JLabel ("ELIPSE             "));
		
		panelElipse.add(new JLabel("Radio mayor"));
		radioMayor = new JTextField(4);
		panelElipse.add(radioMayor);
		
		panelElipse.add(new JLabel("Radio menor"));
		radioMenor = new JTextField(4);
		panelElipse.add(radioMenor);
		
	
		areaElipse = new JRadioButton("Area");
		bg.add(areaElipse);
		panelElipse.add(areaElipse);
		areaElipse.addActionListener(this);
		resultadoAreaElipse = new JTextField(4);
		panelElipse.add(resultadoAreaElipse);
		
		
		perimetroElipse = new JRadioButton("Perimetro");
		bg.add(perimetroElipse);
		panelElipse.add(perimetroElipse);
		perimetroElipse.addActionListener(this);
		resultadoPerElipse = new JTextField(4);
		panelElipse.add(resultadoPerElipse);
		
		add(panelElipse);
		
		JPanel panelRombo = new JPanel(new FlowLayout());
		panelRombo.setBackground(Color.gray);
		panelRombo.setPreferredSize(new Dimension(150, 200));
		panelRombo.add(new JLabel ("ROMBO             "));
		
		panelRombo.add(new JLabel("Ingresa lado"));
		ladoRombo = new JTextField(4);
		panelRombo.add(ladoRombo);
		
		panelRombo.add(new JLabel("Diadonal mayor"));
		diagonalMayor = new JTextField(4);
		panelRombo.add(diagonalMayor);
		
		panelRombo.add(new JLabel("Diagonal menor"));
		diagonalMenor = new JTextField(4);
		panelRombo.add(diagonalMenor);
		
		areaRombo = new JRadioButton("Area");
		bg.add(areaRombo);
		panelRombo.add(areaRombo);
		areaRombo.addActionListener(this);
		resultadoAreaRombo = new JTextField(4);
		panelRombo.add(resultadoAreaRombo);
		
		
		perimetroRombo = new JRadioButton("Perimetro");
		bg.add(perimetroRombo);
		panelRombo.add(perimetroRombo);
		perimetroRombo.addActionListener(this);
		resultadoPerRombo = new JTextField(4);
		panelRombo.add(resultadoPerRombo);
		add(panelRombo);
		
		JPanel panelCono = new JPanel(new FlowLayout());
		panelCono.setBackground(Color.white);
		panelCono.setPreferredSize(new Dimension(140, 200));
		panelCono.add(new JLabel ("            CONO                "));
		
		panelCono.add(new JLabel("  Radio"));
		radioCono = new JTextField(4);
		panelCono.add(radioCono);
		
		panelCono.add(new JLabel("    Altura"));
		alturaCono = new JTextField(4);
		panelCono.add(alturaCono);
		
		volumenCono = new JRadioButton("Volumen");
		bg.add(volumenCono);
		panelCono.add(volumenCono);
		volumenCono.addActionListener(this);
		volumenC = new JTextField(4);
		panelCono.add(volumenC);
		
		add(panelCono);
		
		
		JPanel panelPiramide = new JPanel(new FlowLayout());
		panelPiramide.setBackground(Color.gray);
		panelPiramide.setPreferredSize(new Dimension(150, 200));
		panelPiramide.add(new JLabel ("PIRAMIDE            "));
		
		panelPiramide.add(new JLabel("      Radio"));
		radioPiramide = new JTextField(4);
		panelPiramide.add(radioPiramide);
		
		panelPiramide.add(new JLabel("    Altura"));
		alturaPiramide = new JTextField(4);
		panelPiramide.add(alturaPiramide);
		
		volumenPiramide = new JRadioButton("Volumen");
		bg.add(volumenPiramide);
		panelPiramide.add(volumenPiramide);
		volumenPiramide.addActionListener(this);
		volumenP = new JTextField(4);
		panelPiramide.add(volumenP);
		add(panelPiramide);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Circulo c = new Circulo();
		Elipse elipse = new Elipse();
		Rombo rombo = new Rombo();
		Cono cono = new Cono();
		Piramide piramide = new Piramide();
		
		
	 if (e.getSource() == areaCirculo) {
		 double dato =  Double.parseDouble(radio.getText());
		 c.areaCirculo(dato);
		 resultadoCirculoArea.setText(String.valueOf(c.areaCirculo(dato)));
		}else if (e.getSource() == perimetroCirculo) {
			double dato =  Double.parseDouble(radio.getText());
			c.perimetroCirculo(dato);
			resultadoCirculoPer.setText(String.valueOf(c.perimetroCirculo(dato)));
		}
	 
	 
	 
	 if (e.getSource()==areaElipse ) {
		 double a =  Double.parseDouble(radioMayor.getText());
		 double b =  Double.parseDouble(radioMenor.getText());
			elipse.areaElipse(a, b);
			resultadoAreaElipse.setText(String.valueOf(elipse.areaElipse(a, b)));
		}else if (e.getSource()==perimetroElipse) {
			/*double a =  Double.parseDouble(radioMayor.getText());
			 double b =  Double.parseDouble(radioMenor.getText());
			elipse.perimetroElipse(a, b);
			resultadoPerElipse.setText(String.valueOf(elipse.perimetroElipse(a, b)));*/
		}
	 
	 
	 
	 if (e.getSource()==areaRombo) {
		 double ladoR =  Double.parseDouble(ladoRombo.getText());
		 double diagonaMa =  Double.parseDouble(diagonalMayor.getText());
		 double diagonalMe =  Double.parseDouble(diagonalMenor.getText());
		rombo.areaRombo(diagonalMe, diagonaMa);
		resultadoAreaRombo.setText(String.valueOf(rombo.areaRombo(diagonalMe, diagonaMa)));
	 	}else if (e.getSource() == perimetroRombo) {
	 		/*double ladoR =  Double.parseDouble(ladoRombo.getText());
	 		 double diagonaMa =  Double.parseDouble(diagonalMayor.getText());
	 		 double diagonalMe =  Double.parseDouble(diagonalMenor.getText());
			//rombo.perimetroRombo(ladoR);
			//resultadoPerRombo.setText(String.valueOf(rombo.perimetroRombo(ladoR)));*/
		}
	 
	 
	 if (e.getSource()==volumenCono) {
		 double baseC=  Double.parseDouble(radioCono.getText());
		 double alturaC =  Double.parseDouble(alturaCono.getText());
		cono.volumenCono(baseC, alturaC);
		volumenC.setText(String.valueOf(cono.volumenCono(baseC, alturaC)));
	}
	 
	
	 
	 if (e.getSource()==volumenPiramide) {
		 double radioP=  Double.parseDouble(radioPiramide.getText());
		 double alturaP =  Double.parseDouble(alturaPiramide.getText());
			piramide.volumenPiramide(radioP, alturaP);
			volumenP.setText(String.valueOf(piramide.volumenPiramide(radioP, alturaP)));
		}
	}
}
