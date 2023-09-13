package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jsp.jpa.entity.MobilePhones;

//Insert Data
public class App 
{
    public static void main( String[] args )
    {
    	//Insertion of States of an Object in Table
    	//JPA Template
    	//Access The Connection
    	//Connection connection = DriverManager.getConnection();
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAProject");
    	//Create A Platform
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	//Start the Transaction
    	//EntityTransaction entityTransaction = entityManager.getTransaction();
    	//entityTransaction.begin();
    	entityManager.getTransaction().begin();
    	//Perform Operation
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Mobile Name : ");
    	String name = scan.next();
    	System.out.println("Enter Mobile Processor : ");
    	String processor = scan.next();
    	System.out.println("Enter Mobile Camera : ");
    	int camera = scan.nextInt();
    	System.out.println("Enter Mobile Price : ");
    	int price = scan.nextInt();
    	MobilePhones mobilePhones = new MobilePhones();
    	mobilePhones.setName(name);
    	mobilePhones.setProcessor(processor);
    	mobilePhones.setCamera(camera);
    	mobilePhones.setPrice(price);
    	//To insert States in Table
    	entityManager.persist(mobilePhones);
    	System.out.println("Record Inserted");
    	//Save the Transaction
    	entityManager.getTransaction().commit();
    	//Close the Connections
    	entityManager.close();
    	entityManagerFactory.close();
    }
}
