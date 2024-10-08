package com.aurionpro.solution.test;

import java.util.Iterator;
import java.util.List;

import com.aurionpro.solution.model.Builder;
import com.aurionpro.solution.model.Guitar;
import com.aurionpro.solution.model.GuitarSpec;
import com.aurionpro.solution.model.Inventory;
import com.aurionpro.solution.model.Type;
import com.aurionpro.solution.model.Wood;

public class FindGuitarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		intializeInventory(inventory);
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Strastocaster", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin you must like this guitars ");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getGuitarSpec();
				System.out.println("We have a "+spec.getBuilder()+" "+spec.getModel()+" "+spec.getType()+" "+" guitar:\n "+spec.getBackWood()+" back and sides, \n"+spec.getTopWood()+" top.\n You have it for only $"+guitar.getPrice() + "!\n -----");			
			}
			return;
		}
		System.out.println("Sorry, Guitar is not found");
	}
	private static void intializeInventory(Inventory inventory) {
		//Add items
		inventory.addGuitars("V95693", 1499.95, Builder.FENDER, "Strastocaster", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitars("V9512", 1549.95, Builder.FENDER, "Strastocaster", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		inventory.addGuitars("V9514", 15.95, Builder.FENDER, "XYZ", Type.ACOUSTIC, 12, Wood.ADIRONDACK, Wood.ALDER);
		inventory.addGuitars("V9514", 15.95, Builder.ANY, "WER", Type.ACOUSTIC, 12, Wood.ADIRONDACK, Wood.ALDER);
	}
}
