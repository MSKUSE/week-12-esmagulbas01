public class StackItem <T>{

    private T data;
    private StackItem<T> next;
    public StackItem(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StackItem<T> getNext() {
        return next;
    }

    public void setNext(StackItem<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackItem{" +
                "data=" + data +
                '}';
    }
}




/*
    private Object data;
    private StackItem next;
    public StackItem(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

 */
}
