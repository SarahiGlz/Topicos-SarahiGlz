package Clases;

public class Preguntas
{
	String[] preguntas = {
	        "�Cu�l es la serie de libros mejor vendida del siglo 21?", "�Cu�l es la canci�n m�s reproducida en Spotify hasta el momento?",
	        "�En qu� a�o se fund� Netflix?",
	        "�Cu�l es el r�o m�s largo del mundo?", "�Cu�l es el lenguaje de programaci�n m�s usado en la actualidad?"
	    };
	    
	   public String getPregunta(int posicion)
	   {
	        return preguntas[posicion];
	   }

}
