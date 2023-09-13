package org.jsp.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilePhones 
{
	private String name;
	private String processor;
	private int camera;
	@Id
	private int price;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getProcessor() 
	{
		return processor;
	}
	public void setProcessor(String processor) 
	{
		this.processor = processor;
	}
	public int getCamera() 
	{
		return camera;
	}
	public void setCamera(int camera) 
	{
		this.camera = camera;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "MobilePhones [name=" + name + ", processor=" + processor + ", camera=" + camera + ", price=" + price
				+ "]";
	}
}
