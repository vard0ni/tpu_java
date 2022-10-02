package classes;

public class Task {
	public static void main(String[] args) {

		AutoShow autoShow1 = new AutoShow("Ford");
		System.out.println("AutoShow - " + autoShow1.getName());

		CarModel carModel1 = new CarModel("Ford Edge", 5, 36145, 311, true);
		CarModel carModel2 = new CarModel("Ford Mustang", 2, 27205, 571, true);

		autoShow1.addNewCar(carModel1);
		autoShow1.addNewCar(carModel2);

		System.out.println("Available cars: " + autoShow1.getCars());

		OrderStand order1 = new OrderStand("Albert Abraham", "1720059", carModel1);
		OrderStand order2 = new OrderStand("Dennis Jackson", "1720059", carModel1);
		OrderDelay order3 = new OrderDelay("Dim Dimich", "9191634", carModel1, 10);

		carModel1.addNewOrderStand(order1);
		carModel1.addNewOrderStand(order2);
		carModel1.addNewOrderDelay(order3);

		System.out.println(carModel1.getOrders());

		for (int i = 0; i < carModel1.getOrders().size(); i++) {
			Order order = carModel1.getOrders().get(i);

			System.out.println(order.CalcOrderPrice(carModel1));
		}
	}
}
