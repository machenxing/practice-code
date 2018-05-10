package ma.common;
import java.util.*;
class House extends Observable{
	private float price;
	public House(float price){
		this.price=price;
	}
	public float getPrice(){
		return this.price;
	}
	public void setPrice(float price){
		super.setChanged();
		super.notifyObservers(price);
		this.price=price;
	}
	public String toString(){
		return "房子的价格为："+this.price;
	}
}
class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){
		this.name=name;
	}
	public void update(Observable o,Object arg){
		if(arg instanceof Float){
			System.out.println(this.name+"观察到的价格为："+((Float)arg).floatValue());
		}
	}
}
public class ObserDemoT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h=new House(1000000);
		HousePriceObserver hpo1=new HousePriceObserver("购房者A");
		HousePriceObserver hpo2=new HousePriceObserver("购房者B");
		HousePriceObserver hpo3=new HousePriceObserver("购房者C");
		h.addObserver(hpo1);
		h.addObserver(hpo2);
		h.addObserver(hpo3);
		System.out.println(h);
		h.setPrice(666666);
		System.out.println(h);

	}

}
