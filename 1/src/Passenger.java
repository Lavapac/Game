public class Passenger {
	private boolean isInfected;
	private int silhouetteType;
	private int gender;
	private int eye;
	private int hand;
	private ID id;
	public Passenger(boolean i) {
		isInfected = i;
		silhouetteType = 0;
		gender = 0;
		eye = 0;
		hand = 0;
		id = new ID();
	}
}

