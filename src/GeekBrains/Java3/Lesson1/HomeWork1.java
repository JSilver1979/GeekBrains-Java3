package GeekBrains.Java3.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
        Integer[] testInteger = {3,5,99,121};
        String[] testStr = {"first","second","third","fourth","fifth"};

        changeArray(testInteger,0,3);
        changeArray(testStr,1,0);

        System.out.println("-----------");

        System.out.println("Integer Array: " + testInteger.getClass() + " | Array: " + Arrays.toString(testInteger));
        List<Integer> integerList = convertToArrayList(testInteger);
        integerList.add(100);
        System.out.println("Integer Arraylist: " + integerList.getClass() + " | Array: " + integerList);
        System.out.println("String Array: " + testStr.getClass()  + " | Array: " + Arrays.toString(testStr));
        List<String> stringList = convertToArrayList(testStr);
        stringList.remove(0);
        System.out.println("String Arraylist: " + stringList.getClass() + " | Array: " + stringList);

        System.out.println("-----------");

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> appleBox = new Box<>(apple1,apple2, apple3);
        System.out.println("Weight of box with apples: " + appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>(orange1,orange2);
        System.out.println("Weight of box with oranges: " + orangeBox.getWeight());

        System.out.println(appleBox.compareTo(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        appleBox.changeBox(newAppleBox);
        System.out.println("Weight of new apple box: " + newAppleBox.getWeight());
        System.out.println("Weight of the old apple box: " + appleBox.getWeight());


    }

    public static <T> void changeArray (T[] arr, int index1, int index2){
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) {
            T temp = arr[index1];
            System.out.println(Arrays.toString(arr));
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Indexes out of bounds of Array!");
        }

    }

    public static <E> List convertToArrayList(E[] arr){
        List<E> list = new ArrayList<>(arr.length);
        Collections.addAll(list,arr);
        return list;
    }

}
