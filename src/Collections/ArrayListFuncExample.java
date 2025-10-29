package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListFuncExample {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        //add()
        list.add("Apple");
        list.add("150");
        list.add(true);
        list.add(3.14f);
        list.add(1,"orange");

        //remove()
        list.remove("Apple");
        list.remove(2);
        System.out.println(list);
        //Contain()
        System.out.println(list.contains("orange"));
        System.out.println(list.getLast()); //getLast()
        System.out.println(list.size()); //size()
        System.out.println(list.isEmpty());//isEmpty()

        //get()
        System.out.println(list.get(0));
        System.out.println(list);
        //set()
        list.set(0,"Banana");
        System.out.println(list);

        //Retrieval of Data from Arraylist
        //using for loop
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //USing For each
        for (Object element :list){
            System.out.println(element);
        }

        //using Iterator
        Iterator<Object> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }
}
