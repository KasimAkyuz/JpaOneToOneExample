package com.akyuz.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.akyuz.pojo.Address;
import com.akyuz.pojo.Customer;

public class TestOneToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("MyPersistenceUnit");
		EntityManager manager = factory.createEntityManager();
		
		Customer customer1 = new Customer("YİĞİT", "AKYUZ");
		Address address1 = new Address("GOP", "İstanbul", 1215542);
		customer1.setAddress(address1);
		
		manager.getTransaction().begin();
		manager.persist(customer1);
		manager.getTransaction().commit();
				
		
	}

}
