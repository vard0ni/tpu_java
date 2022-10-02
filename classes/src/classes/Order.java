package classes;

public abstract class Order {
	private String customer;
	private String phone;
	private CarModel carModel;

	public Order(String customer, String phone, CarModel carModel) {
		this.customer = customer;
		this.phone = phone;
		this.carModel = carModel;
	}

	public String getCustomer() {
		return customer;
	}

	public String getPhone() {
		return phone;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public String toString() {
		return "Order{customer=" + customer + ", phone=" + phone + "}";

	}

	public abstract int CalcOrderPrice(CarModel carModel);

}
