package OneToOneProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

import ManyToMany.Items;
import OneToMany.Orders;

@Entity
public class Costumet {

	@Id
	@GeneratedValue
		
	private int cId;
	private int mobileNo;
	private String cName;
	
	@OneToOne(mappedBy = "costumet",cascade = CascadeType.ALL)
	private Wallet wallet ;
	
	@OneToMany(mappedBy = "cust",cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	@ManyToMany(mappedBy = "cus",cascade = CascadeType.ALL)
	//@JoinTable(name = "sdfgh")
	private List<Items> items; 
	
	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	public int getcId() {
		return cId;
	}
	
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	@Override
	public String toString() {
		return "Costumet [cId=" + cId + ", mobileNo=" + mobileNo + ", cName=" + cName + "]";
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	

	
}
