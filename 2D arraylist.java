import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		//Arraylist is goArrayList<E>loacating mmory 

		ArrayList<ArrayList> all = new ArrayList();
		
		
		ArrayList<String> wa = new ArrayList();
		wa.add("Abiodun");
		wa.add("Waris");
		wa.add("Kazeem");
		wa.add(2, "Bolanle");
		wa.set(3, "Kehinde");
		wa.add("Taye");
		
		ArrayList<String> Car = new ArrayList();
		Car.add("BMW");
		Car.add("Camero");
		Car.add("Tesla");
		Car.add("BEnz");
		Car.add("Toyota");
		
		ArrayList<Integer> age = new ArrayList();
		age.add(98);
		age.add(34);
		age.add(23);
		age.add(34);
		age.add(56);
		
		ArrayList<Character> grade = new ArrayList();
		grade.add('A');
		grade.add('B');
		grade.add('C');
		grade.add('D');
		grade.add('E');
		
		ArrayList<String>  food = new ArrayList();
		food.add("Pizza");
		food.add("hamburger");
		food.add("hotdog");
		food.add("Rice");
		food.add("Chicken and chips");
		food.clear();
		
		
	//	System.out.println(all.get(2).get(1));
//		System.out.println(wa);
//		int i = 0;
//		while(i < age.size())
//		{
//			System.out.print("   " +age.get(i) +"\t");
//			i++;
//		}
//		System.out.println();
//		i = 0;
//		while(i < grade.size())
//		{
//			System.out.print("   " +grade.get(i) +"\t");
//			i++;
//		}
	
		//Using a 2D method
        all.add(wa);
		all.add(age);
		all.add(food);
		all.add(grade);
		all.add(Car);
		for (int i = 0; i < all.size(); i++)
		{
			System.out.println(all.get(i));
		}
		
	}

}
