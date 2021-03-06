package com.myspace.ejemploe;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "cliente")
public class Cliente implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "CLIENTE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "CLIENTE_ID_GENERATOR", sequenceName = "CLIENTE_ID_SEQ")
	@org.kie.api.definition.type.Label("ID")
	@javax.persistence.Column(name = "ID", table = "cliente", unique = true)
	private java.lang.Long id;

	@javax.persistence.Column(name = "NOMBRE", table = "cliente")
	private java.lang.String nombre;

	@javax.persistence.Column(name = "APELLIDO", table = "cliente")
	private java.lang.String apellido;

	@javax.persistence.Column(name = "NUM_DOC")
	private java.lang.String numDoc;

	@javax.persistence.Column(name = "CORREO", table = "cliente")
	private java.lang.String correo;

	public Cliente() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getApellido() {
		return this.apellido;
	}

	public void setApellido(java.lang.String apellido) {
		this.apellido = apellido;
	}

	public java.lang.String getNumDoc() {
		return this.numDoc;
	}

	public void setNumDoc(java.lang.String numDoc) {
		this.numDoc = numDoc;
	}

	public java.lang.String getCorreo() {
		return this.correo;
	}

	public void setCorreo(java.lang.String correo) {
		this.correo = correo;
	}

	public Cliente(java.lang.Long id, java.lang.String nombre,
			java.lang.String apellido, java.lang.String numDoc,
			java.lang.String correo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numDoc = numDoc;
		this.correo = correo;
	}

}