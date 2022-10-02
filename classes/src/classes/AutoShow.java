package classes;

import java.util.ArrayList;

public class AutoShow {
	private String name;
	private ArrayList<CarModel> cars;

	public AutoShow(String name) {
		this.name = name;
		this.cars = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addNewCar(CarModel carModel) {
		cars.add(carModel);
	}

	public ArrayList<CarModel> getCars() {
		return cars;
	}
}
