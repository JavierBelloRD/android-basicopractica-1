import static java.lang.System.out;

public class EstudianteHelper
{
	private int edad = 0; 
	private Estudiante[] estudiantes;
	
	public EstudianteHelper(Estudiante[] estudiantes)
	{
		this.estudiantes = estudiantes;
	}

    public int getEdadMinima()
	{ 
		edad = 0;

		for(Estudiante estudiante : estudiantes)
		{ 
			if(edad > estudiante.getEdad() | edad == 0)
				edad = estudiante.getEdad();
		}

		return edad;
	}

	public int getEdadMixima()
	{
		edad = 0;

		for(Estudiante estudiante : estudiantes)
		{
			if(edad < estudiante.getEdad() | edad == 0)
				edad = estudiante.getEdad();
		}

		return edad;
	}

	public int getEdadPromedio()
	{
		int totalEdad = 0;

		for(Estudiante estudiante : estudiantes)
		{ 
			totalEdad += estudiante.getEdad();
		}

		return totalEdad / getTotalEstudiante();
	}

	public int getTotalEstudiante()
	{
		return estudiantes.length;
	}

	public void imprimirEstudiantes()
	{
		for(Estudiante estudiante : estudiantes)
		{
			out.println("Nombre: " + estudiante.getNombre() + ", Edad:" + estudiante.getEdad());
		}
	}
}