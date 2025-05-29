public interface Stack <T>{

    void push(T item);
    T pop() throws MyEmptyStackException;
    void peek();
    boolean isEmpty();







/*
    void push(Object item);
    Object pop();
    void peek();
    boolean isEmpty();
*/

}
