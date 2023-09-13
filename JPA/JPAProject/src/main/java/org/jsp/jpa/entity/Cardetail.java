package org.jsp.jpa.entity;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the cardetails database table.
 * 
 */
@Entity
@Table(name="cardetails")
@NamedQuery(name="Cardetail.findAll", query="SELECT c FROM Cardetail c")
public class Cardetail implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	private String carNumber;
	private String carBrand;
	private String carColor;
	public Cardetail() 
	{
	}
	public String getCarNumber() 
	{
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) 
	{
		this.carNumber = carNumber;
	}
	public String getCarBrand() 
	{
		return this.carBrand;
	}
	public void setCarBrand(String carBrand) 
	{
		this.carBrand = carBrand;
	}
	public String getCarColor() 
	{
		return this.carColor;
	}
	public void setCarColor(String carColor) 
	{
		this.carColor = carColor;
	}
	@Override
	public String toString() 
	{
		return "Cardetail [carNumber=" + carNumber + ", carBrand=" + carBrand + ", carColor=" + carColor + "]";
	}
}