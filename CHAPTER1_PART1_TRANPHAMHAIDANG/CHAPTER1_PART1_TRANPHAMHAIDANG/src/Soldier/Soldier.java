package Soldier;

import java.util.Scanner;

/*
 * Author: Tran Pham Hai Dang
 * Date: 19/08/2016
 * Version: 1.0
 * Class for Soldier
 */
public class Soldier {

	private static Scanner sc = new Scanner(System.in);
	
	public String name;
	public int power;
	public String weapon;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public Soldier(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}

	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Input information of Soldier
	public void inputInformationSoldier() {
		System.out.println("Input name:");
		name = sc.nextLine();
		System.out.println("Input power:");
		power = sc.nextInt();
		sc.nextLine();
		System.out.println("Input weapon:");
		weapon = sc.nextLine();
	}
	
	//Calculate the power of Soldier
	public int fight() {
		return --power;
	}
}
