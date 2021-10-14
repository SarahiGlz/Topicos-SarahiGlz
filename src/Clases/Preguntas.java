package Clases;

public class Preguntas
{
	String[] preguntas = {
	        "¿Cuál es la serie de libros mejor vendida del siglo 21?", "¿Cuál es la canción más reproducida en Spotify hasta el momento?",
	        "¿En qué año se fundó Netflix?",
	        "¿Cuál es el río más largo del mundo?", "¿Cuál es el lenguaje de programación más usado en la actualidad?"
	    };
	    
	   public String getPregunta(int posicion)
	   {
	        return preguntas[posicion];
	   }

}
