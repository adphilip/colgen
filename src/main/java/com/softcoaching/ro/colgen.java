package com.softcoaching.ro;
/**
 * Created by adrian on 12/17/16.
 */

import java.util.*;

class colgen {
    public static void main(String args[]) {
        //1.Using ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai2016");
        //list.add(32);//compile time error

        String s = list.get(1);//type casting is not required
        System.out.println("element is: \n" + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        //2. Using Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");

        //Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        System.out.println("\nMap  is: ");

        Iterator<Map.Entry<Integer, String>> itrMap = set.iterator();
        while (itrMap.hasNext()) {
            Map.Entry e = itrMap.next();//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }


        //3. Generic class example
        GenericClass<Integer> m = new GenericClass<Integer>();
        m.add(22222);
        System.out.println("\nClass  element is: ");
        //m.add("vivek");//Compile time error
        System.out.println(m.get());
    }
}
