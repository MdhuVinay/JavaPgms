package pattern;

import java.util.ArrayList;

public class ArraylistToArray {
	public static void main(String[] args) {	
		//hbgbbgbgt			
		ArrayList<Object> arrayList = new ArrayList<Object>();
		arrayList.add("Tilak1");
		arrayList.add(1);
		arrayList.add("Tilak3");
		arrayList.add("Tilak4");
		Object[] array = arrayList.toArray();
		for (int i = 0; i < array.length; i++) {
System.out.println(array[i]);
		}
	}
}
