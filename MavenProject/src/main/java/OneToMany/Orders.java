package OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import OneToOneProject.Costumet;
@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int orderId;
	private int orderAmount;
	private int orderTracking;
	@ManyToOne
	@JoinColumn(name="MappedId")
	
	private Costumet cust;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderTracking() {
		return orderTracking;
	}
	public void setOrderTracking(int orderTracking) {
		this.orderTracking = orderTracking;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderAmount=" + orderAmount + ", orderTracking=" + orderTracking + "]";
	}
	
	
	
}
