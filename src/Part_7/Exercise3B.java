package Part_7;

import java.util.List;
import java.util.Optional;

public class Exercise3B {
    public static void main(String[] args) {
//        From List<Integer> nums, find max using reduce and then using max(Comparator).
        List<Integer> nums = List.of(1,2,3,4,5,6,7,5,9,10);

//        Using Reduce function
//        returns Optional because result might be empty
//        returned argument taken as Identity(numb1) and will be compared with numb2 again and again. Take accumulator
//        FI which is an Instance of BinaryOperations

//        *** Additional Notes ***
//        reduce(BinaryOperator<T>) → No identity given, so stream may be empty.
//        Hence return type = Optional<T>
//        num1 = previous accumulated value
//        num2 = next element in stream
//        This lambda checks which integer is greater and keeps the max.
        Optional<Integer> result  = nums.stream().reduce((num1, numb2) -> num1 > numb2 ? num1 : numb2 );

        if(result.isPresent()) {
            System.out.println(result.get());
        }

//        Simpler solution Integer class has max method it seems
        Integer.max(5,10); //THis also takes two arguments so we can use that method reference inside reduce

//        *** Additional Notes ***
//        Integer::max is a method reference to static method max(int a, int b)
//        reduce(Integer::max) works same as above lambda: keeps the maximum of two values
//        Still uses Optional because no identity value given.
        Optional<Integer> reduceMax = nums.stream().reduce(Integer :: max);

        if(reduceMax.isPresent()) {
            System.out.println(reduceMax.get());
        }

//        We can use reduce with identity which means that is the default and initial value..
        // identity = 0 → starting value for comparison
        // accumulator compares identity with each number in the stream
        // return type is NON-Optional because identity ensures a result always exists
        int result1 = nums.stream().reduce(0,(nums1, nums2) -> nums1 > nums2 ? nums1 : nums2);
        System.out.println(result1);

//        Using Max Terminal operator - This take Comparator Interface as an argument.. ( Not natural sorting)
//        Comparable for natural.. Comparator interface have one abstract method called comparatorTo0..
//        we have implement it in max.. explain this

//        *** Additional Notes ***
//        max(Comparator) → terminal operation that finds maximum using a comparator
//        Integer::compareTo is an instance method reference of Integer
//        compareTo returns:
//              +1 if first > second
//               0 if equal
//              -1 if first < second
//        Stream.max() uses this comparator to decide ordering.
//        Return type = Optional because stream may be empty.
        Optional<Integer> result2 = nums.stream().max(Integer :: compareTo);
        System.out.println(result2.get());
    }
}
