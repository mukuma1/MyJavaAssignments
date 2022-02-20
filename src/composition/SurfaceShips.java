package composition;

public class SurfaceShips {

	String name;
	String pennantNo;
	String dateOfCommission;
	String type;

	public SurfaceShips(String name, String pennantNo, String dateOfCommission, String type) {
		super();
		this.name = name;
		this.pennantNo = pennantNo;
		this.dateOfCommission = dateOfCommission;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getPennantNo() {
		return pennantNo;
	}

	public String getDateOfCommission() {
		return dateOfCommission;
	}

	public String getType() {
		return type;
	}

}
