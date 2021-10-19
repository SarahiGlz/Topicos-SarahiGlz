package ComprobarParentesis;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class VentanaAnalizaExpresion extends JFrame {

	private JPanel contentPane;
	private JTextField txtExpresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAnalizaExpresion frame = new VentanaAnalizaExpresion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	/**
	 * Create the frame.
	 */
	public VentanaAnalizaExpresion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 263);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExpresion = new JLabel("Eval\u00FAa tu expresi\u00F3n");
		lblExpresion.setBackground(new Color(119, 136, 153));
		lblExpresion.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblExpresion.setBounds(36, 11, 276, 31);
		contentPane.add(lblExpresion);
		
		txtExpresion = new JTextField();
		txtExpresion.setBackground(new Color(240, 248, 255));
		txtExpresion.setFont(new Font("MS UI Gothic", Font.BOLD, 18));
		txtExpresion.setBounds(36, 57, 276, 45);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JButton btnComprobar = new JButton("Evaluar");
		btnComprobar.setBackground(new Color(216, 191, 216));
		btnComprobar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				String expresion=txtExpresion.getText();
				char[] exp=expresion.toCharArray();
				
				Stack<Character> pila= new Stack<>();
				boolean error=false;
				
				for(int i=0; i<exp.length; i++ )
				{
					if(exp[i]=='(')
					{
						pila.push('(');
					}
					else
						if(exp[i]==')')
						{
							if(pila.empty())
							{
								error= true;
								break;
							}
							else
								pila.pop();
						}
				}
				
				if(error)
				{
					JOptionPane.showMessageDialog(null, expresion +" "+ "es una expresión incorrecta");
				}
				else
					if(!pila.empty())
					{
						JOptionPane.showMessageDialog(null, expresion +" "+ "es una expresión incorrecta");
					}
					else
					{
						JOptionPane.showMessageDialog(null, expresion +" "+ "es una expresión correcta");
					}
				
				
			
				
			}
		});
		btnComprobar.setBounds(36, 138, 115, 37);
		contentPane.add(btnComprobar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(216, 191, 216));
		btnSalir.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(216, 138, 89, 37);
		contentPane.add(btnSalir);
	}
}
