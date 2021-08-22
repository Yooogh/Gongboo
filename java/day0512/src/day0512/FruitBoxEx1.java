package day0512;

import java.util.ArrayList;

class Fruit				  { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy		          { public String toString() { return "Toy"  ;}}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy>   toyBox   = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}

}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();//어레이리스트안에 타입이 있음
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() { return list.size();}
	public String toString() {return list.toString();}
	}
