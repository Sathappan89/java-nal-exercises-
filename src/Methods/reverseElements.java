package Methods;

import java.util.Arrays;

/*Method with Return Value (Object[]) and with Parameters (Object[]):
Assignment: Write a method to reverse the order of elements in an Object array and return the
reversed array.
Signature: public Object[] reverseArray(Object[] array)*/
public class reverseElements {

	public Object[] reverseArray(Object[] array) {
		
		int len = array.length;
		Object[] reversedArray = new Object[len];
		int count = 0;
		for(int i=array.length-1;i>=0;i--) {
			reversedArray[count]=array[i];
				count++;
		}
		
		
		return reversedArray;
	}
	
	public static void main(String[] args) {
		Object[] originalArray = {1, 2, 3, 4, 5};
		
		reverseElements t1=new reverseElements();
		
		Object[] result=t1.reverseArray(originalArray);
		
		System.out.println(Arrays.toString(result));

	}

}
