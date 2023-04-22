package java_ex;

import java.util.ArrayList;
import java.util.Collections;

public class test1 {

	public static void main(String[] args) {
		Integer[] data1 = {11,22,33,44,55};
		Integer[] data2 = {8,10,11,19,44};
		
		try {	
			arry ar = new arry();
			ar.dataarry(data1,data2);
		} catch (Exception e) {
			System.out.println("메소드 오류");
			e.printStackTrace();
		}

	}

}
class arry{
	ArrayList<Integer> arrayAlign2;
	public void dataarry(Integer[] a,Integer[] b) throws Exception {
		arrayAlign2 = new ArrayList<>();
		int count = 0;
		int count1 = 0;
		while(true) {
			
			if(count == 5) {
				break;
			}
			if(!arrayAlign2.contains(a[count])) {	
				arrayAlign2.add(a[count]);
				
				if(!arrayAlign2.contains(b[count1])) {
					arrayAlign2.add(b[count1]);
				}
			}
			count++;
			count1++;
		}
		Collections.sort(arrayAlign2);
		System.out.println(arrayAlign2);
	}
}