class DynamicArray {
   private int[] arr;
   private int capacity;
   private int size;
    
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return arr[i]; 
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize();
        }
        arr[size] = n;
        size ++;

    }

    public int popback() {
        size --;
        return arr[size];
    }

    private void resize() {
        capacity = capacity*2;
        int[] newarr = new int[capacity];
        for(int i =0; i < size; i++){
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    public int getSize() {
       return size;
    }

    public int getCapacity() {
       return capacity;
    }
}
