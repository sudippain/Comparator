package com.source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

public static void main(String[] args) {
		
		List<ComputerFeature> l = new ArrayList<ComputerFeature>();
        l.add(new ComputerFeature("Asus", 16, 400000));
        l.add(new ComputerFeature("Sony", 4, 600000));
        l.add(new ComputerFeature("Dell", 8, 50000));
        
        Comparator<ComputerFeature> c = new Comparator<ComputerFeature>() {

			@Override
			public int compare(ComputerFeature o1, ComputerFeature o2) {
				if(o1.getRam()>o2.getRam())
					return 1;
				else
					return -1;
			}
		};
        
        Collections.sort(l, c);
        
        l.stream().forEach(i -> System.out.println(i));
        
	}
}
