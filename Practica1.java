import static java.lang.System.out;

public class Practica1
{ 
    public static void main(String[] args) 
	{  
		Estudiante[] estudiantes = {
			new Estudiante("Juan",24),
			new Estudiante("Erica",20),
			new Estudiante("Emilio",23),
			new Estudiante("Karina",21),
			new Estudiante("Eduardo",24),
			new Estudiante("Tomas",25),
		};
		
		EstudianteHelper estudianteHeper = new EstudianteHelper(estudiantes);
		out.println("1. Total de estudiantes");
		out.println("Total: " + estudianteHeper.getTotalEstudiante());
		out.println("");
		out.println("2. Edad minima");
		out.println("Edad: " + estudianteHeper.getEdadMinima());
		out.println("");
		out.println("3. Edad maxima");
		out.println("Edad: " + estudianteHeper.getEdadMixima());
		out.println("");
		out.println("4. Edad Promedio");
		out.println("Promedio: " + estudianteHeper.getEdadPromedio());
		out.println("");
		out.println("5. Imprimir todos los estudiantes");
		estudianteHeper.imprimirEstudiantes();
    } 
}	