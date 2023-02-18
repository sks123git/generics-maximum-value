//Program to test maximum among 3 values using generics
public class TestMaximum<T extends Comparable<T>> {
    private T value1,value2,value3;
    public TestMaximum(T value1,T value2, T value3){
        this.value1=value1;
        this.value2=value2;
        this.value3=value3;
        maximum(value1,value2,value3);
    }
    public static <T extends Comparable<T>> T maximum(T value1, T value2, T value3){
        T max = value1;
        if(value2.compareTo(max)>0){
            max = value2;
        }
        if (value3.compareTo(max)>0){
            max=value3;
        }
        System.out.println("Max of "+value1+" "+value2+" "+value3+" is "+max);
        return max;
    }
    public static void main(String[] args) {
        new TestMaximum<>(10,30,20);
        new TestMaximum<>(20.23,23.22,10.2);
    }
}