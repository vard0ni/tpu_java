package classes;

import java.util.ArrayList;

public class CarModel {

	private String model;
	private int maxNumPassengers;
	private int price;
	private int stockCarQuantity;
	private boolean available;

	private ArrayList<Order> orders;

	public CarModel(String model, int maxNumPassengers, int price, int stockCarQuantity, boolean available) {
		this.model = model;
		this.maxNumPassengers = maxNumPassengers;
		this.price = price;
		this.stockCarQuantity = stockCarQuantity;
		this.available = available;
		this.orders = new ArrayList<>();
	}

	public String getModel() {
		return model;
	}

	public int getMaxNumPassengers() {
		return maxNumPassengers;
	}

	public int getPrice() {
		return price;
	}

	public int getStockCarQuantity() {
		return stockCarQuantity;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMaxNumPassengers(int maxNumPassengers) {
		this.maxNumPassengers = maxNumPassengers;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStockCarQuantity(int stockCarQuantity) {
		this.stockCarQuantity = stockCarQuantity;
	}

	public void Available(boolean available) {
		if ((stockCarQuantity > 0) && (orders.size() != 0)) {
			available = true;
		}
	}

	public String toString() {
		return "Car{model=" + model + ", maxNumPassengers=" + maxNumPassengers + ", price=" + price
				+ ", stockCarQuantity=" + stockCarQuantity + ", available=" + available + "}";

	}

	public void addNewOrderStand(OrderStand order) {
		orders.add(order);
	}

	public void addNewOrderDelay(OrderDelay order) {
		orders.add(order);
	}

	public void removeOrder(Order order) {
		orders.remove(order);
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

}
