package deqo.clon;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by christopher on 19/10/2017.
 */
public class Stack implements SimpleStack {
    private ArrayList<Item> l;

    public Stack(){
        l=new ArrayList<Item>();
    }

    public boolean isEmpty() {
        return l.size()==0;
    }

    public int getSize() {
        return l.size();
    }

    public void push(Item item) {
        l.add(item);
    }

    public Item peek() throws EmptyStackException {
        if(l.size()>0){
            return l.get(0);
        }else{
            throw new EmptyStackException();
        }
    }

    public Item pop() throws EmptyStackException {
        if(l.size()>0){
            return l.remove(0);
        }else{
            throw new EmptyStackException();
        }
    }
}
