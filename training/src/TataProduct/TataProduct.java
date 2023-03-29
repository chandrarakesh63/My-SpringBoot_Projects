package TataProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TataProduct {
	
	String pruductName;
	int pruductId;
	int pruductPrice;
	
	
	public TataProduct(String pruductName,int pruductId,int pruductPrice)
	{
		this.pruductName=pruductName;
		this.pruductId=pruductId;
		this.pruductPrice=pruductPrice;
		
	}
	
	public static void main(String[] args) {
		TataProduct t1=new TataProduct("Riku",12,29000);
		TataProduct t2=new TataProduct("Biku",2,9000);
		TataProduct t3=new TataProduct("tieru",12,2000);
		TataProduct t4=new TataProduct("cinu",42,290000);
		
		ArrayList<TataProduct> tp = new ArrayList<TataProduct>();
		
		tp.add(t3);
		tp.add(t4);
		tp.add(t2);
		tp.add(t1);
		
		System.out.println("This is the assending order ");
		Collections.sort(tp,new BasedOnPrice());
		for (TataProduct gg : tp) {
			System.out.println(gg);
		}
		System.out.println("Desending order");
		Collections.reverse(tp);
		for (TataProduct  gg: tp) {
			System.out.println(gg);
			
		}
		System.out.println("Based on Assending name ");
		Collections.sort(tp,new BasedOnName());
		for (TataProduct gg : tp) {
			System.out.println(gg);
			
		}
		System.out.println(" Desending order ");
		Collections.reverse(tp);
		for (TataProduct gg : tp) {
			System.out.println(gg);
		}
		System.out.println(" Based on  Id");
		Collections.sort(tp,new BasedOnId());
		for (TataProduct gg : tp) {
			System.out.println(gg);
		}
		System.out.println("desending");
		Collections.reverse(tp);
		for (TataProduct gg : tp) {
			System.out.println(gg);
			
		}
	}
	

	@Override
	public String toString() {
		return "TataProduct [pruductName=" + pruductName + ", pruductId=" + pruductId + ", pruductPrice=" + pruductPrice
				+ "]";
	}
	
	
	

}
