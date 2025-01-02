package Day5.Generics;

public class Array<T>{
    int size;
    T arr[];
    Array(int size,T arr[])
    {
        this.size = size;
        this.arr = arr;
    }
    public void display()
    {
        for(int i =0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String arr[] = {"vishnu","Sayee","Adams","Gogul","Pavi"};
        Integer numarr[] = {1,2,3,4,5};
        Array <String> nameArr = new Array<String>(5,arr);
        nameArr.display();

        Array <Integer> numArr = new Array<Integer>(5,numarr);
        numArr.display();
    }
}
