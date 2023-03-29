package Evalution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TataPruduct {
	
	String productName;
	int productId;
	int productPrice;
	
	public TataPruduct(String productName,int productId,int productPrice)
	{
		this.productName=productName;
		this.productId=productId;
		this.productPrice=productPrice;
	}

	public static void main(String[] args) {
		TataPruduct tp=new TataPruduct("Rakesh",2,5151);
		TataPruduct tp1=new TataPruduct("Bikash",4,6626);
		TataPruduct tp2=new TataPruduct("Babul",7,5112);
		TataPruduct tp3=new TataPruduct("Babu",5,5864);
		TataPruduct tp4=new TataPruduct("Sinu",3,5867);

		ArrayList<TataPruduct> al=new ArrayList<TataPruduct>();
		al.add(tp4);
		al.add(tp3);
		al.add(tp2);
		al.add(tp1);
		al.add(tp);
		Collections.sort(al,new BasedOnPrice());
		for (TataPruduct tataPruduct : al) {
			System.out.println(tataPruduct);
		}
		System.out.println("Based on price Descendng");
		Collections.reverse(al);
		for (TataPruduct tataPruduct : al) {
			System.out.println(tataPruduct);
		}
		
		System.out.println("This is the assending order by the id ");
		Collections.sort(al,new BasedOnId());
		for (TataPruduct tataPruduct : al) {
			System.out.println(tataPruduct);
		}
		System.out.println("Based on Id Descendng");
		Collections.reverse(al);
		for (TataPruduct tataPruduct : al) {
			System.out.println(tataPruduct);
		}
	}

	@Override
	public String toString() {
		return "TataPruduct [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ "]";
	}
}
