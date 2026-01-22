package com.dcl.cms.repository;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dcl.cms.model.Car;

public class CarRepository {

	Scanner sc = new Scanner(System.in);
	Configuration cfg = new Configuration().configure("cms.xml").addAnnotatedClass(Car.class);

	SessionFactory sf = cfg.buildSessionFactory();

	public void saveCar() {
		Car car = new Car();
		System.out.println("\nEnter Car Details");
		System.out.println("Enter the Car Id:");
		car.setCarId(sc.nextInt());
		System.out.println("Enter Model:");
		car.setModel(sc.next());
		System.out.println("Enter Brand:");
		car.setBrand(sc.next());
		System.out.println("Enter Color:");
		car.setColor(sc.next());
		System.out.println("Enter price:");
		car.setPrice(sc.nextInt());

		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();

		session.save(car);

		tran.commit();
		System.out.println("\nCar object created succesfully");
	}

	public void findCarById() {
		Session session = sf.openSession();

		System.out.println("Enter Car ID:");
		Car car = session.get(Car.class, sc.nextInt());

		if (car != null) {
			System.out.println("Car ID: " + car.getCarId());
			System.out.println("Car Model: " + car.getModel());
			System.out.println("Car Brand: " + car.getBrand());
			System.out.println("Car Color: " + car.getColor());
			System.out.println("Car Price: " + car.getPrice());
		} else {
			System.err.println("Car Not Found");
		}
		session.close();
	}

	public void UpdateCarPrice() {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();

		System.out.println("Enter the Car ID:");
		Car car = session.get(Car.class, sc.nextInt());

		if (car != null) {
			System.out.println("Enter the Updated Price:");
			car.setPrice(sc.nextInt());
			System.out.println("Car Price Updated Sucessfully");
		} else {
			System.err.println("Car Not Found");
		}
		tran.commit();

		session.close();

	}

	public void deleteCar() {

		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();

		System.out.println("Enter the Car ID:");
		Car car = session.get(Car.class, sc.nextInt());

		if (car != null) {
			session.delete(car);
			System.out.println("Car Data Deleted Succesfully");
		} else {

			System.err.println("Car Not Found");
		}
		tran.commit();

		session.close();

	}

}
