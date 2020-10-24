package modelo;

public enum Error {
	ERROR_ISBN_EXISTENTE("Ese ISBN ya existe"),
	ERROR_CAMPOSINCORRECTOS("Validaci�n de campos incorrecta"),
	ERROR_ILOCALIZABLE("LIBRO NO ENCONTRADO"),
	ERROR_NOSELECCIONADO("NO HA SELECCIONADO NING�N LIBRO")
	;

	private String mensaje;

	private Error(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	
}
