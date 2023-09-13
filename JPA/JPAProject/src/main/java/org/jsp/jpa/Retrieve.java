package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.jpa.entity.MobilePhones;

//Retrieve Data
public class Retrieve 
{
	public static void main(String[] args) 
	{
		//Jpa Template
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAProject");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	//Retrieve Data Based on Mobile Price
    	Scanner scan = new Scanner(System.in);
    	entityManager.getTransaction().begin();
    	System.out.println("Enter Mobile Price : ");
    	int price = scan.nextInt();
    	//MobilePhones mobilePhones = entityManager.find(MobilePhones.class, 10000);
    	MobilePhones mobilePhones = entityManager.find(MobilePhones.class, price);
    	if (mobilePhones != null) 
    	{
    		System.out.println("Mobile Name : "+mobilePhones.getName());
    		System.out.println("Mobile Processor : "+mobilePhones.getProcessor());
    		System.out.println("Mobile Camera : "+mobilePhones.getCamera());
    		System.out.println("Mobile Price : "+mobilePhones.getPrice());
		}
    	else
    	{
    		System.out.println("No Records Found...");
    	}
    	entityManager.getTransaction().commit();
    	entityManager.close();
    	entityManagerFactory.close();
	}
}
