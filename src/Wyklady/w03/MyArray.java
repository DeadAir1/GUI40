package Wyklady.w03;

public
    class MyArray<T> {

    private T[] myData;
    private int elementsCount;

    public MyArray() {
        this.myData = (T[])(new Object[10]);
        this.elementsCount = 0;
    }

    public void addElement(T obj){
        if(elementsCount >= this.myData.length){
            System.out.println("Out of space");
            return;
        }
        this.myData[this.elementsCount++] = obj;
    }

    public T getElement(int index){
        if(index > this.elementsCount){
            System.out.println("out of range index");
            return null;
        }
        return this.myData[index];
    }
}
