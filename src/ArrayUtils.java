

public class ArrayUtils<T> {
    private T[] data ;//定义一个指定长度的数组
    private int size;//数组长度

    //初始化一个容量为len的数组
    public ArrayUtils(int len){
        data = (T[]) new Object[len];
        size = 0;//默认数组长度为0
    }
    public ArrayUtils(){//无参构造函数,默认容量为10
        this(10);
    }

    //获取数组中元素个数
    public int getSize(){
        return size;
    }
    //获取数组容量
    public int getLength(){
        return data.length;
    }
    //数组末尾添加一个元素e
    public void add(T e){//添加一个元素e
        if(size != data.length){//若果数组未满
            data[size] = e;//原数组最后一个元素为data[size--]
            size++;
        }
    }
    //数组指定位置添加一个元素e,subscript为数组下标，e为添加的元素
    public void splice(int subscript, T e){
        if(subscript>size) throw new IllegalArgumentException("向数组指定位置插入元素失败，下标超出了数组长度");

        for(int i = 0 ; i< size;i++){
            if(i == subscript){
                for(int j = 0 ; j< size;j++){
                    if(j==i){//所有元素都向后移一位
                        data[j+1] = data[j];
                    }
                }
                data[i] = e;
                size++;

            }
        }
    }
    //删除指定元素e
    public void removeObj(T e){
        for(int i = 0 ; i< size;i++){
            if(data[i] == e){
                data[i] = data[i+1];
                size--;
            }
        }
    }
    //删除下标为index的元素
    public void remove(int index){
        for(int i = 0 ; i< size;i++){
            if(i == index){
                data[i] = data[i+1];
                size--;
            }
        }
    }

    //数组是否为空
    public Boolean getIsEmpty(){
        return size == 0;
    }
    //将数组输出为[a,b,c]格式的字符串
    public String toString(){
        String s = "[";
        for(int i = 0;i<size;i++){
            if (i!=(size-1)){//数组最后一个元素不需要加逗号分隔符
                s+=data[i].toString()+",";
            }else {
                s+=data[i];
            }
        }
        s+="]";
        return s ;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhangsan");
        student.setScore(15.5d);
        ArrayUtils arrayUtils = new ArrayUtils<Student>(15);
        arrayUtils.add(student);
        arrayUtils.remove(1 );
        System.out.println("数组长度："+arrayUtils.getSize());
        System.out.println("数组为："+arrayUtils.toString());
    }
}
