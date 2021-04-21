package Lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Problema2 {

	
	public static void main (String args[]) {
		
		double temp[]= {36.2,37.5,36,37,37.2,36.8,37.3};
		
		List <Temperatura> tempNorm = new ArrayList<Temperatura>();
		List <Temperatura> tempAnorm = new ArrayList<Temperatura>();
		
		
		for (int i=0;i<temp.length;i++) {
			if(temp[i]<37.0)
				tempNorm.add(new Temperatura(i,temp[i]));
			else
				tempAnorm.add(new Temperatura(i,temp[i]));		
		}
		
		for (Temperatura t : tempNorm) 
			System.out.print(t.getTemp()+ "/" + t.getId() + " ");
		

		System.out.println();
	
		for (Temperatura t : tempAnorm) 
			System.out.print(t.getTemp()+ "/" + t.getId() + " ");
		
	}
	
	
	
}
