package Ventana;
import Clases.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana_Cuestionario extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					Ventana_Cuestionario frame = new Ventana_Cuestionario();
					frame.setVisible(true);
					
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	
	 int posicion = 0;
	    Respuestas r = new Respuestas();
	    Preguntas p = new Preguntas();
	    Object[] select = {"","","","",""};
	    public JButton btnResultados;
	    private JButton btnSiguiente_1;
	    private JLabel lblPregunta;
	    private JRadioButton radRespuesta1;
	    private JRadioButton radRespuesta2;
	    private JRadioButton radRespuesta3;
	    private JRadioButton radRespuesta4;
	    private ButtonGroup bg= new ButtonGroup();
	
	
	
	
	/**
	 * Create the frame.
	 */
	public Ventana_Cuestionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		bg.add(radRespuesta1);
		bg.add(radRespuesta2);
		bg.add(radRespuesta3);
		bg.add(radRespuesta4);
		
		lblPregunta = new JLabel("¿Cuál es la serie de libros mejor vendida del siglo 21?");
		lblPregunta.setBounds(17, 21, 368, 49);
		contentPane.add(lblPregunta);
		
		radRespuesta1 = new JRadioButton("Harry potter");
		radRespuesta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				select[posicion]=radRespuesta1.getText();
			}
		});
		radRespuesta1.setBounds(17, 92, 343, 23);
		contentPane.add(radRespuesta1);
		
		radRespuesta2 = new JRadioButton("los juegos del hambre");
		radRespuesta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				select[posicion]=radRespuesta2.getText();
			}
		});
		radRespuesta2.setBounds(17, 118, 343, 23);
		contentPane.add(radRespuesta2);
		
		radRespuesta3 = new JRadioButton("50 sombras de Grey");
		radRespuesta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				select[posicion]=radRespuesta3.getText();
			}
		});
		radRespuesta3.setBounds(17, 142, 343, 23);
		contentPane.add(radRespuesta3);
		
		radRespuesta4 = new JRadioButton("Angeles y demonios");
		radRespuesta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				select[posicion]=radRespuesta4.getText();
			}
		});
		radRespuesta4.setBounds(17, 167, 343, 23);
		contentPane.add(radRespuesta4);
		
		
		//--------------------------------------
		JButton btnAnterior = new JButton("<-Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(posicion == 0){
					btnAnterior.setEnabled(false);
		        }
			        
			        if(posicion > -1){
			            posicion--;
			            btnSiguiente_1.setEnabled(true);
			            lblPregunta.setText(p.getPregunta(posicion));
			            String[] a = r.setRespuestas(posicion);
			            bg.clearSelection();
			            radRespuesta2.setText(a[1]);
			            radRespuesta3.setText(a[2]);
			            radRespuesta4.setText(a[3]);
			            radRespuesta1.requestFocus();
			        }else{
			            
			        }
				
			}
		});
		btnAnterior.setBounds(15, 208, 125, 23);
		contentPane.add(btnAnterior);
		
		
		//----------------------------------------------
		JButton btnSalir = new JButton("Salir ");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(17, 242, 123, 23);
		contentPane.add(btnSalir);
		
		
		//-------------------------------------------
		btnResultados = new JButton("Resultados");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				int resultado=0;
				
				for(int i=0; i<5; i++)
				{
					if(select[i].equals(r.getRespuesta(i)))
					{
						resultado=resultado+1;
					}
				}
				
				resultado= resultado*20;
				
				JOptionPane.showMessageDialog(null, "Tu resultado es: "+resultado);
			}
		});
		btnResultados.setBounds(189, 242, 125, 23);
		contentPane.add(btnResultados);
		
		
		
		//-------------------------------------------
		btnSiguiente_1 = new JButton("Siguiente->");
		btnSiguiente_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if(posicion == 3){
					 btnSiguiente_1.setEnabled(false);
			          btnResultados.setEnabled(true);
			        }
				
				if(posicion<5)
				{
					btnAnterior.setEnabled(true);
					posicion++;
					lblPregunta.setText(p.getPregunta(posicion));
					String[]a=r.setRespuestas(posicion);
					  bg.clearSelection();
					radRespuesta1.setText(a[0]);
					radRespuesta2.setText(a[1]);
					radRespuesta3.setText(a[2]);
					radRespuesta4.setText(a[3]);
					
					radRespuesta1.requestFocus();
				}
				else
				{
					
				}
				
			}
		});
		btnSiguiente_1.setBounds(189, 208, 125, 23);
		contentPane.add(btnSiguiente_1);
	}
}
