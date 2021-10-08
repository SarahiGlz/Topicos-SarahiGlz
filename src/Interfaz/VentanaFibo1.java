package Interfaz;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class VentanaFibo1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroInicial;
	private JTextField txtNumeroInicial2;
	private JTextField txtNumeroDeIteraciones;
	private JTextArea txtaNumeros;

	public static void main(String[] args) {
		
					VentanaFibo1 frame = new VentanaFibo1();
					frame.setVisible(true);
				}
			

	public VentanaFibo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroInicial = new JLabel("No. Inicial");
		lblNumeroInicial.setBounds(23, 31, 119, 14);
		contentPane.add(lblNumeroInicial);
		
		JLabel lblNumeroInicial2 = new JLabel("No. Inicial 2");
		lblNumeroInicial2.setBounds(23, 63, 107, 14);
		contentPane.add(lblNumeroInicial2);
		
		JLabel lblNumeroDeInteraciones = new JLabel("No. iteraciones");
		lblNumeroDeInteraciones.setBounds(23, 97, 119, 14);
		contentPane.add(lblNumeroDeInteraciones);
		
		txtNumeroInicial = new JTextField();
		txtNumeroInicial.setBounds(166, 28, 39, 20);
		contentPane.add(txtNumeroInicial);
		txtNumeroInicial.setColumns(10);
		
		txtNumeroInicial2 = new JTextField();
		txtNumeroInicial2.setBounds(166, 60, 39, 20);
		contentPane.add(txtNumeroInicial2);
		txtNumeroInicial2.setColumns(10);
		
		txtNumeroDeIteraciones = new JTextField();
		txtNumeroDeIteraciones.setBounds(166, 94, 39, 20);
		contentPane.add(txtNumeroDeIteraciones);
		txtNumeroDeIteraciones.setColumns(10);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String valorUno= txtNumeroInicial.getText();
				String valorDos= txtNumeroInicial2.getText();
				String ciclosUno=txtNumeroDeIteraciones.getText();
				
				int valor1=Integer.parseInt(valorUno);
				int valor2=Integer.parseInt(valorDos);
				int ciclos=Integer.parseInt(ciclosUno);
				
				int suma=0;
				String cadena=""; 
				
				for(int x=1; x<=ciclos; x++)
		        {
		           // System.out.println(valor1);
					
					 cadena=cadena+valor1+"\n";
		            suma=valor1+valor2;
		            valor1=valor2;
		            valor2=suma;
		           
		          
		            
		        }
				txtaNumeros.setText(cadena);
				
		
			}
		});
		btnGenerar.setBounds(53, 142, 89, 23);
		contentPane.add(btnGenerar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(53, 188, 89, 23);
		contentPane.add(btnSalir);
		
		txtaNumeros = new JTextArea();
		txtaNumeros.setBounds(236, 26, 75, 185);
		contentPane.add(txtaNumeros);
	}
}
