package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.jpa.entity.MobilePhones;

//Delete Data
public class Delete 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAProject");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	//Delete Operation - Based on Mobile Price / Primary Key Value
    	//Delete Record
    	Scanner scan = new Scanner(System.in);
    	entityManager.getTransaction().begin();
    	System.out.println("Enter Mobile Price : ");
    	int price = scan.nextInt();
    	MobilePhones mobilePhones = entityManager.find(MobilePhones.class, price);
    	if (mobilePhones != null) 
    	{
    		//Delete record
    		entityManager.remove(mobilePhones);
    		System.out.println("Record Deleted...");
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
