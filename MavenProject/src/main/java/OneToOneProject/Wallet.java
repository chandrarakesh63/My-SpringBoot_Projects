package OneToOneProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wallet {
	@Id
	@GeneratedValue
	
	
	
	private int wId;
	private int amount;
	
	public int getwId() {
		return wId;
	}
	@OneToOne
	@JoinColumn(name="fk_costumer")
	private Costumet costumet ;
	
	public void setwId(int wId) {
		this.wId = wId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Wallet [wId=" + wId + ", amount=" + amount + "]";
	}
	public Costumet getCostumet() {
		return costumet;
	}
	public void setCostumet(Costumet costumet) {
		this.costumet = costumet;
	}
}
