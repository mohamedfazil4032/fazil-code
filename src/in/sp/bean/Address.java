package in.sp.bean;

public class Address {
	private String city;
	private int houseno;
	private int pincode;
	
	public Address(String city,int houseno,int pincode  ) {
		this.city=city;
		this.houseno=houseno;
		this.pincode=pincode;
	}
	
	
	public void display() {

		System.out.println("City : "+city);
		System.out.println("HouseNo : "+houseno);

		System.out.println("PinCode : "+pincode);
	}

	
//	@Override
//	public String toString() {
//		return "Address [city=" + city + ", houseno=" + houseno + ", pincode=" + pincode + "]";
//	}

	
}
