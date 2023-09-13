package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.jpa.entity.MobilePhones;

//Update Data
public class Update 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAProject");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	//Update Operation - Based on Mobile Price / Primary Key Value
    	//Retrieve Record
    	Scanner scan = new Scanner(System.in);
    	entityManager.getTransaction().begin();
    	System.out.println("Enter Mobile Price : ");
    	int price = scan.nextInt();
    	MobilePhones mobilePhones = entityManager.find(MobilePhones.class, price);
    	if (mobilePhones != null) 
    	{
    		//Update Record
    		System.out.println("Enter Mobile Processor : ");
    		mobilePhones.setProcessor(scan.next());
    		//Update Camera
    		System.out.println("Enter Mobile Camera : ");
    		mobilePhones.setCamera(scan.nextInt());
    	}
    	else
    	{
    		System.out.println("Invalid Mobile Price...");
    	}
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	entityManagerFactory.close();
	}
}
