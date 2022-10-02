package classes;

public class OrderStand extends Order {
	public OrderStand(String customer, String phone, CarModel carModel) {
		super(customer, phone, carModel);
	}

	@SuppressWarnings("null")
	@Override
	public int CalcOrderPrice(CarModel carModel) {
		try {
			if (carModel.getOrders().size() == 0) {
				throw new KolichestvoAvtomobileyException("num of cars in the application = 0");
			} else {
				return carModel.getPrice();
			}

		} catch (KolichestvoAvtomobileyException ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
			return (Integer) null;
		}

	}
}
