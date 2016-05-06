package evaluacion;

public enum Categorias {
	//Funcionabilidad
	SEGURIDAD_ACCESO("Seguridad de acceso"),
	EXACTITUD_RESULTADOS("Exactitud de los resultados"),
	//Eficiencia
	UTILIZACION_RECURSOS("Utilizacion de recursos"),
	COMPORTAMIENTO_FRENTE_AL_TIEMPO("Comportamiento frente al tiempo"),
	//Fiabilidad
	TOLERANCIA_FALLOS("Tolerancia a fallos"),
	RECUPERACION_ERRORES("Recuperacion de errores"),
	//Mantenibilidad
	CAPACIDAD_ANALISIS_CODIGO("Capacidad del codigo de ser analizado"),
	CAPACIDAD_CAMBIOS_CODIGO("Capacidad del codigo de ser cambiado"),
	ESTABILIDAD("Estabilidad"),
	//Usabilidad
	CAPACIDAD_ENTENDIMIENTO("Capacidad de ser entendido"),
	CAPACIDAD_OPERACION("Capacidad de ser operado"),
	CAPACIDAD_ATRACTIVO("Capacidad de ser atractivo"),
	//Portabilidad
	ADAPTABILIDAD("Adaptabilidad"),
	INSTALABILIDAD("Instalabilidad"),
	;
	private String valor;
	private Categorias(String v) {
		valor = v;
	}
	public String getValue() {
		return valor;
	}
}
