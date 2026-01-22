package com.dcl.cms;

import java.util.Scanner;

import com.dcl.cms.repository.CarRepository;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarRepository cr = new CarRepository();

		while (true) {
			System.out.println("\nCar Management System\n");
			System.out.println("====================================");
			System.out.println("1.Save the Car Details");
			System.out.println("2.Find the Car Details By Id");
			System.out.println("3.Update the Car Price");
			System.out.println("4.Delete the Car Details");
			System.out.println("5.Exit ");
			System.out.println("=================================");
			System.out.println("Enter Your Choice:");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				cr.saveCar();
				break;

			case 2:
				cr.findCarById();
				break;

			case 3:
				cr.UpdateCarPrice();
				break;

			case 4:
				cr.deleteCar();
				break;

			case 5:
				System.out.println("Exiting the application");
				break;

			default:
				System.err.println("Invalid Choice! Try Again");
			}

		}
	}
}
