import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<Fruit> fruits = new LinkedList<Fruit>();

		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Mandarin"));
		fruits.add(new Fruit("Banana"));

		System.out.println(fruits);

		fruits.addFirst(new Fruit("Pineapple"));
		fruits.addLast(new Fruit("Strawbarries"));

		System.out.println(fruits);
	}
}