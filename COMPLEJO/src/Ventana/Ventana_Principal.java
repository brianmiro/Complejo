package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.Format;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

import Package_Complejo.Complejo;
import Package_Complejo.Complejo2;

import javax.swing.JComboBox;

public class Ventana_Principal {

	private JFrame frmComplejos;
	private JTextField textFieldReal;
	private JTextField textFieldImg;
	private JButton btnCargar;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnMultiplica;
	private JTextField textFieldSuma;
	private JTextField textFieldResta;
	private JTextField textFieldMult;
	private JLabel lblParteReal;
	private JLabel lblParteImg;
	private JTextField textFieldReal2;
	private JTextField textFieldImg2;
	private JButton btnLimpiar;
	private JLabel lblComplejo;
	private JLabel lblComplejo_1;
	private JButton btnNewButton;
	private JTextField textFieldDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal window = new Ventana_Principal();
					window.frmComplejos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComplejos = new JFrame();
		frmComplejos.setTitle("Operaciones con Complejos");
		frmComplejos.setBounds(100, 100, 477, 442);
		frmComplejos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComplejos.getContentPane().setLayout(null);
		Complejo2 comp1 = new Complejo2 ();
		Complejo2 comp2 = new Complejo2 ();
		Complejo2 comp3 = new Complejo2 ();
		
		textFieldReal = new JTextField();
		textFieldReal.setBounds(140, 31, 73, 23);
		frmComplejos.getContentPane().add(textFieldReal);
		textFieldReal.setColumns(10);
		
		textFieldImg = new JTextField();
		textFieldImg.setBounds(140, 62, 73, 23);
		frmComplejos.getContentPane().add(textFieldImg);
		textFieldImg.setColumns(10);
		
		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String cad1=textFieldReal.getText();
				 String cad2=textFieldImg.getText();
				 int x1=Integer.parseInt(cad1);
				 int x2=Integer.parseInt(cad2);
				 String cad3=textFieldReal2.getText();
				 String cad4=textFieldImg2.getText();
				 int x3=Integer.parseInt(cad3);
				 int x4=Integer.parseInt(cad4);
				comp1.setReal(x1);
				comp1.setImaginaria(x2);
				comp2.setReal(x3);
				comp2.setImaginaria(x4);
				
			}
		});
		btnCargar.setBounds(172, 96, 89, 23);
		frmComplejos.getContentPane().add(btnCargar);
		
		btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comp3.suma(comp1, comp2);
				String total=String.valueOf((int)comp3.getReal());
				String total2=String.valueOf((int)comp3.getImaginaria());
				if(comp3.getImaginaria()<0){
					textFieldSuma.setText(total+""+total2+"i");
				}else{
					textFieldSuma.setText(total+" +"+total2+"i");
				}
	            
				
			}
		});
		btnSuma.setBounds(22, 123, 89, 23);
		frmComplejos.getContentPane().add(btnSuma);
		
		btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp3.resta(comp1, comp2);
				String total=String.valueOf((int)comp3.getReal());
				String total2=String.valueOf((int)comp3.getImaginaria());
				if(comp3.getImaginaria()<0){
					textFieldResta.setText(total+""+total2+"i");
				}else{
					textFieldResta.setText(total+" +"+total2+"i");
				}
				
			}
		});
		btnResta.setBounds(22, 157, 89, 23);
		frmComplejos.getContentPane().add(btnResta);
		
		btnMultiplica = new JButton("Multiplica");
		btnMultiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp3.multiplica(comp1, comp2);
				String total=String.valueOf((int)comp3.getReal());
				String total2=String.valueOf((int)comp3.getImaginaria());
				if(comp3.getImaginaria()<0){
					textFieldMult.setText(total+""+total2+"i");
				}else{
					textFieldMult.setText(total+" +"+total2+"i");
				}
			}
		});
		btnMultiplica.setBounds(22, 191, 89, 23);
		frmComplejos.getContentPane().add(btnMultiplica);
		
		textFieldSuma = new JTextField();
		textFieldSuma.setBounds(140, 123, 72, 23);
		frmComplejos.getContentPane().add(textFieldSuma);
		textFieldSuma.setColumns(10);
		
		textFieldResta = new JTextField();
		textFieldResta.setColumns(10);
		textFieldResta.setBounds(140, 157, 72, 23);
		frmComplejos.getContentPane().add(textFieldResta);
		
		textFieldMult = new JTextField();
		textFieldMult.setColumns(10);
		textFieldMult.setBounds(141, 191, 72, 23);
		frmComplejos.getContentPane().add(textFieldMult);
		
		lblParteReal = new JLabel("Parte Real:");
		lblParteReal.setBounds(42, 26, 63, 32);
		frmComplejos.getContentPane().add(lblParteReal);
		
		lblParteImg = new JLabel("Parte Img:");
		lblParteImg.setBounds(42, 62, 63, 23);
		frmComplejos.getContentPane().add(lblParteImg);
		
		JLabel lblParteReal_1 = new JLabel("Parte Real:");
		lblParteReal_1.setBounds(259, 23, 73, 38);
		frmComplejos.getContentPane().add(lblParteReal_1);
		
		JLabel lblParteImg_1 = new JLabel("Parte Img:");
		lblParteImg_1.setBounds(259, 62, 73, 23);
		frmComplejos.getContentPane().add(lblParteImg_1);
		
		textFieldReal2 = new JTextField();
		textFieldReal2.setColumns(10);
		textFieldReal2.setBounds(357, 31, 73, 23);
		frmComplejos.getContentPane().add(textFieldReal2);
		
		textFieldImg2 = new JTextField();
		textFieldImg2.setColumns(10);
		textFieldImg2.setBounds(357, 63, 73, 23);
		frmComplejos.getContentPane().add(textFieldImg2);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldReal.setText(null);
				textFieldImg.setText(null);
				textFieldReal2.setText(null);
				textFieldImg2.setText(null);
			
			}
		});
		btnLimpiar.setBounds(289, 96, 89, 23);
		frmComplejos.getContentPane().add(btnLimpiar);
		
		lblComplejo = new JLabel("Complejo 1");
		lblComplejo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblComplejo.setBounds(29, 11, 82, 14);
		frmComplejos.getContentPane().add(lblComplejo);
		
		lblComplejo_1 = new JLabel("Complejo 2");
		lblComplejo_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblComplejo_1.setBounds(259, 11, 82, 14);
		frmComplejos.getContentPane().add(lblComplejo_1);
		
		btnNewButton = new JButton("Divide");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp3.divide(comp1, comp2);
				String total=String.valueOf((int)comp3.getReal());
				String total2=String.valueOf((int)comp3.getImaginaria());
				if(comp3.getImaginaria()<0){
					textFieldDivide.setText(total+""+total2+"i");
				}else{
					textFieldDivide.setText(total+" +"+total2+"i");
				}
			}
				
			
		});
		btnNewButton.setBounds(22, 229, 89, 23);
		frmComplejos.getContentPane().add(btnNewButton);
		
		textFieldDivide = new JTextField();
		textFieldDivide.setColumns(10);
		textFieldDivide.setBounds(141, 230, 72, 23);
		frmComplejos.getContentPane().add(textFieldDivide);
	}
}
