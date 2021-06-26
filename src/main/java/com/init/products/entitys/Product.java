package com.init.products.entitys;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//jdbc:mysql://localhost:3306/productos?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC
@Entity
@Table(name = "producto")
public class Product { 

	@Id
	@Column(name = "id_producto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom_producto", nullable = false, length = 30)
	private String nombre;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name = "nom_provedor", length = 30)
	private String  nom_provedor;
	
	@Column(name = "no_modelo", length = 30)
	private String  no_modelo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNom_provedor() {
		return nom_provedor;
	}

	public void setNom_provedor(String nom_provedor) {
		this.nom_provedor = nom_provedor;
	}

	public String getNo_modelo() {
		return no_modelo;
	}

	public void setNo_modelo(String no_modelo) {
		this.no_modelo = no_modelo;
	}
}
