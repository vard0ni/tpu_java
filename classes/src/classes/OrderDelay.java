package classes;

public class OrderDelay extends Order {

	private int DiscountPct;

	public OrderDelay(String customer, String phone, CarModel carModel, int DiscountPct) {
		super(customer, phone, carModel);
		this.DiscountPct = DiscountPct;
	}

	public int getDiscountPct() {
		return DiscountPct;
	}

	public void setDiscountPct(int DiscountPct) {
		this.DiscountPct = DiscountPct;
	}

	@SuppressWarnings("null")
	@Override
	public int CalcOrderPrice(CarModel carModel) {
		try {
			if (carModel.getOrders().size() == 0) {
				throw new KolichestvoAvtomobileyException("num of cars in the application = 0");
			} else {
				return carModel.getPrice() - (carModel.getPrice() * DiscountPct / 100);
			}

		} catch (KolichestvoAvtomobileyException ex) {
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
			return (Integer) null;
		}
	}
}
