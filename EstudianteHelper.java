import static java.lang.System.out;

public class EstudianteHelper
{
	private int edadMinima = 0; 
	private int edadMaxima = 0; 
	private int edadPromedio = 0;
	private Estudiante[] estudiantes;
	
	public EstudianteHelper(Estudiante[] estudiantes)
	{
		this.estudiantes = estudiantes;

		Calculate();
	}

	private void Calculate()
	{
		for(Estudiante estudiante : estudiantes)
		{ 
			if(edadMinima > estudiante.getEdad() | edadMinima == 0)
				edadMinima = estudiante.getEdad();

			if(edadMaxima < estudiante.getEdad() | edadMaxima == 0)
				edadMaxima = estudiante.getEdad();

			edadPromedio += estudiante.getEdad();
		}

		edadPromedio = edadPromedio / getTotalEstudiante();
	}

    public int getEdadMinima()
	{  
		return edadMinima;
	}

	public int getEdadMixima()
	{ 
		return edadMaxima;
	}

	public int getEdadPromedio()
	{ 
		return edadPromedio;
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