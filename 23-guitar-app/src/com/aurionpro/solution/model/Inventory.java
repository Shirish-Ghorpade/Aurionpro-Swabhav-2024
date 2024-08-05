package com.aurionpro.solution.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	private List guitars;

	public Inventory() {
		this.guitars = new ArrayList<>();
	}

	public void addGuitars(String serialNumber, double price, Builder builder, String model, Type type, int numString,
			Wood backWood, Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price,
				new GuitarSpec(builder, model, type, numString, backWood, topWood));
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List search(GuitarSpec searchGuitarSpec) {

		List matchingGuitars = new ArrayList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			GuitarSpec guitarSpec = guitar.getGuitarSpec();
			if (searchGuitarSpec.getBuilder()!= guitarSpec.getBuilder())
				continue;

			String model = searchGuitarSpec.getModel().toLowerCase();
			if ((model != null) && (!model.equals("")) && !model.equals(guitarSpec.getModel().toLowerCase()))
				continue;

			if (searchGuitarSpec.getType() != guitarSpec.getType())
				continue;

			if (searchGuitarSpec.getBackWood() != guitarSpec.getBackWood())
				continue;

			if (searchGuitarSpec.getTopWood() != guitarSpec.getTopWood())
				continue;

			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	@Override
	public String toString() {
		return "Inventory [guitars=" + guitars + "]";
	}

}
