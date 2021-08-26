package collections_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Set<Integer> setobj = new HashSet<Integer>();
		setobj.add(20);
		setobj.add(40);
		setobj.add(10);
		setobj.add(10);
		
		System.out.println(setobj);
		
        System.out.println("------------ using for each ");
        for (Integer x : setobj){
            System.out.println(x);
        }
        System.out.println("------------ using Iterator ");

        Iterator<Integer> it = setobj.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }
        
        setobj.add(30);
        System.out.println(setobj);
        
        setobj.remove(20);
        System.out.println(setobj);
        
        
        setobj.clear();
        System.out.println(setobj + "After Clear");
        System.out.println("IS NULL = " + (setobj == null));
        
        setobj.removeAll(setobj);
        System.out.println(setobj + "After removeall");
        System.out.println("IS NULL = " + (setobj == null)); 		
	}
}
