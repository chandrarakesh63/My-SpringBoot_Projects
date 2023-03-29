package StreamPojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TickateBooking {
	
	String pname;
	String gender;
	String email;
	double tickatePrice;
	double distance;
	int age;
	public TickateBooking(String pname, String gender, String email, double tickatePrice, double distance, int age) {
		super();
		this.pname = pname;
		this.gender = gender;
		this.email = email;
		this.tickatePrice = tickatePrice;
		this.distance = distance;
		this.age = age;
	}
	
	public static void main(String[] args) {
		List<TickateBooking> list=new ArrayList<>();
		
		list.add(new TickateBooking("rakesh","male","rakesh13@.com",690.0,48.0,23));
		list.add(new TickateBooking("babul","male","babul13@.com",400.0,49.0,24));
		list.add(new TickateBooking("Abhilash","male","rakesh13@.com",502.0,34.0,25));		
		list.add(new TickateBooking("Bikash","male","rakesh13@.com",600.0,54.0,23));
		
		System.out.println("Travelers Name ");
		list.stream().filter(t ->t.getDistance()<500). map(t -> {
			t.setTickatePrice(t.getTickatePrice()-(int)(0.1*t.getTickatePrice()));
			return t;
		}).forEach(t -> System.out.println(t.getPname()));
		
		double secondHighest =list.stream().map(t -> t.getTickatePrice())
				.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("SecondHighest ticket is" +secondHighest);
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTickatePrice() {
		return tickatePrice;
	}

	public void setTickatePrice(double tickatePrice) {
		this.tickatePrice = tickatePrice;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
