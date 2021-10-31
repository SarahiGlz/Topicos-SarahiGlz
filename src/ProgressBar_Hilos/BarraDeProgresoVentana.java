package ProgressBar_Hilos;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class BarraDeProgresoVentana {

	public JFrame ventana;
	public JButton btnIniciar;
	public JProgressBar barraProgreso;
	public Controlador c;
	
	public BarraDeProgresoVentana()
	{
		c=new Controlador();
		ventana= new JFrame("Ventana de progreso usando hilo");
		btnIniciar=new JButton("Iniciar");
		btnIniciar.addActionListener(c);
		barraProgreso= new JProgressBar(0,100);
		barraProgreso.setStringPainted(true);
		ventana.setLayout(new FlowLayout());
		Cargar();
		
	}
	
	public void Cargar()
	{
		ventana.add(barraProgreso);
		ventana.add(btnIniciar);
		ventana.pack();
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class Controlador implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e)
		{
			new Thread(new Hilo()).start();
			
		}
		
	}
	
	
	public class Hilo implements Runnable
	{

		
		public void run() 
		{
			int i = 0;
		     try {
		         while (i <= 100) {
		             Thread.sleep(50);
		             i ++;
		             barraProgreso.setValue(i);
		         }
		     }
		     catch (Exception e) {
		         System.err.println( e.getMessage() );
		     }
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		BarraDeProgresoVentana v= new BarraDeProgresoVentana();
	}

}
