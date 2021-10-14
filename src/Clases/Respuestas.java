package Clases;

import java.util.StringTokenizer;

public class Respuestas {
	String[] respuestas = {
		      "1","2","3","4","5"
		    };
		    
		    String[] radioR = {
		        "Harry potter, los juegos del hambre, 50 sombras de Grey, Angeles y demonios" ,
		        "Shape of You, Rockstar, Dance Monkey, Blinding Lights ",
		        "1997, 2001, 2009, 2015",
		        "Río Nilo, Río amazonas,  Río Yangtsé, Río Mississippi ",
		        "Python, Java, C#,  PHP ",
		    };
		    
		    
		    public String getRespuesta(int posicion)
		    {
		        return respuestas[posicion];
		    }
		    
		    public String[] separar(String cadena, String separador){
		        StringTokenizer token = new StringTokenizer(cadena,separador);
		        
		        String[] a = new String[4];
		        int i = 0;
		        
		        while(token.hasMoreTokens())
		        {
		            a[i] = token.nextToken(); 
		            i++;
		        }
		        
		        return a;
		    }
		    
		    public String[] setRespuestas(int posicion){
		        String s1 = radioR[posicion];
		        String[] s2 = separar(s1,",");
		        return s2;
		    }

}
