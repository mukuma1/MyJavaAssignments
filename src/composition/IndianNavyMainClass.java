package composition;

public class IndianNavyMainClass {

	public static void main(String[] args) {
		SurfaceShips ships1 = new SurfaceShips("Vikramaditya", "R 33", "16 Nov 2013", "Aircraf Carrier");
		SurfaceShips ships2 = new SurfaceShips("Delhi Class", "D 60", "02 June 1999", "Destroyers");
		SurfaceShips ships3 = new SurfaceShips("Shivalik Class", "F 47", "29 April 2010", "Frigates");
		IndianNavy navy = new IndianNavy();
		navy.setShips(ships1);
		System.out.println(navy.getShips().getName());
		navy.setShips(ships2);
		System.out.println(navy.getShips().getName());
		navy.setShips(ships3);
		System.out.println(navy.getShips().getName());

	}

}
