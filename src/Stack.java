public interface Stack<T> {
    //获得栈的大小
    int getSize();
    //栈是否为空
    boolean isEmpty();
    //入栈
    void push(T t);
    // 出栈
    T pop();
    //获得栈顶元素
    T peek();
}
