package deqo.clon;

import java.util.EmptyStackException;

/**
 * Created by christopher on 19/10/2017.
 */
public interface SimpleStack {

    public boolean isEmpty();
/**
 * Returns the number of items in this stack.
 */
        public int getSize();
/**
 * Pushes an item onto the top of this stack.
 * null item is allowed.
 */
        public void push(Item item);
/**
 * Looks at the object at the top of this stack without removing it from the stack.
 */
    public Item peek() throws EmptyStackException;
/**
 * Removes the object at the top of this stack and returns that object as the value of this function.
 * @throws​ EmptyStackException if this stack is empty.
 */
    public Item pop() throws EmptyStackException;

}
