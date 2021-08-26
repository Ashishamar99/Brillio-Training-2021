package collections_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(10);

        System.out.println(list);
        System.out.println("------------ using index ");
        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("------------ using for each ");
        for (Integer x : list){
            System.out.println(x);
        }
        System.out.println("------------ using Iterator ");

        Iterator<Integer> it = list.iterator();// we should not edit collection
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n +" "+n);
        }
        System.out.println("------------ using lambda expression ");
        list.forEach(System.out::println);
        CollectionDemo obj = new CollectionDemo();

        list.forEach(obj::f1);

        list.add(0,100);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove (new Integer((10)));
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }


    public void f1(Integer x){
        System.out.println(x + "---->" + (x*x));
    }
}

