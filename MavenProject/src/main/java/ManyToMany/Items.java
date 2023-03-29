package ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import OneToOneProject.Costumet;

@Entity
public class Items {
	@Id
	@GeneratedValue
	private int iId;
	private String brand;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	private List<Costumet> cus;
    

	public int getiId() {
		return iId;
	}


	public void setiId(int iId) {
		this.iId = iId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Costumet> getCus() {
		return cus;
	}


	public void setCus(List<Costumet> cus) {
		this.cus = cus;
	}

	@Override
	public String toString() {
		return "Items [iId=" + iId + ", brand=" + brand + ", cus=" + cus + "]";
	}

}
