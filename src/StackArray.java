/**
 * 动态数组实现栈
 * @param <T>
 */
public class StackArray<T> implements Stack<T> {
    //声明一个动态数组
    ArrayUtils<T> array;
    //构造函数1.如果有入参--》栈的容积
    public StackArray(int size){
        array = new ArrayUtils<>(size);
    }
    //构造函数2.无入参
    public StackArray(){
        array = new ArrayUtils<>();
    }

    //获得栈的大小
    @Override
    public int getSize() {
        return array.getSize();
    }
    //栈是否为空
    @Override
    public boolean isEmpty() {
        return array.getIsEmpty();
    }
    //入栈
    @Override
    public void push(T t) {
        array.add(t);
    }
    // 出栈
    @Override
    public T pop() {
        return null;
    }
    //获得栈顶元素
    @Override
    public T peek() {
        return null;
    }
}
