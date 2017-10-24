package deqo.clon;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by christopher on 24/10/2017.
 */
public class StackTest {
    Item e1,e2;
    Stack myStack;
    @Before
    public void setUp() throws Exception {
        this.e1=new Item(5);
        this.e2=new Item(10);
        this.myStack=new Stack();
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(this.myStack.isEmpty(),is(true));
        this.myStack.push(e1);
        assertThat(this.myStack.isEmpty(),is(false));
    }

    @Test
    public void getSize() throws Exception {
        assertThat(this.myStack.getSize(),is(0));
        this.myStack.push(e1);
        assertThat(this.myStack.getSize(),is(1));
    }

    @Test
    public void push() throws Exception {
        assertThat(this.myStack.isEmpty(),is(true));
        assertThat(this.myStack.getSize(),is(0));
        this.myStack.push(e1);
        assertThat(this.myStack.isEmpty(),is(false));
        assertThat(this.myStack.getSize(),is(1));
        assertThat(this.myStack.peek(),is(e1));
    }

/*
    @Test
    public void peekUnEmpty() throws Exception{
        myStack.push(e1);
        myStack.push(e2);
        assertThat(this.myStack.peek(),is(e1));
        assertThat(this.myStack.peek(),is(e2));
    }
*/

    @Test(expected = EmptyStackException.class)
    public void peekEmpty() throws Exception {
        Item nothing=myStack.peek();
    }

    @Test
    public void popNonEmpty() throws Exception{
        myStack.push(e1);
        myStack.push(e2);
        assertThat(this.myStack.pop(),is(e1));
        assertThat(this.myStack.pop(),is(e2));

    }

    @Test(expected = EmptyStackException.class)
    public void popEmpty() throws Exception {
        Item nothing=myStack.pop();
    }




}