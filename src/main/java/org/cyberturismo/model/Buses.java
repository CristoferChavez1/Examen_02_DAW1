package org.cyberturismo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_buses")
public class Buses {
	
	@Id
	@Column(name = "cod_bus")
	private String codigo;
	@Column(name = "nom_bus")
	private String nombre;
	@Column(name = "num_placa")
	private String placa;
	@Column(name = "capacidad")
	private int capac;
	@Column(name = "cod_chofer")
	private int codchofer;
	@Column(name = "cod_ruta")
	private int codruta;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getCapac() {
		return capac;
	}
	public void setCapac(int capac) {
		this.capac = capac;
	}
	public int getCodchofer() {
		return codchofer;
	}
	public void setCodchofer(int codchofer) {
		this.codchofer = codchofer;
	}
	public int getCodruta() {
		return codruta;
	}
	public void setCodruta(int codruta) {
		this.codruta = codruta;
	}
	
	@Override
	public String toString() {
		return "Buses [codigo=" + codigo + ", nombre=" + nombre + ", placa=" + placa + ", capac=" + capac
				+ ", codchofer=" + codchofer + ", codruta=" + codruta + "]";
	}
	
	
	
	
}
