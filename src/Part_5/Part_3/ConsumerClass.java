package Part_5.Part_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

    public static void main(String[] args){

//        Functionality to convert the elements to UpperCase
//        No return void is the return type - sysout is not return
        Consumer<String> consumerUpperCase = str -> System.out.println(str.toUpperCase());

        consumerUpperCase.accept("Sharan");

//        Used with List foreach function because it expects a Consumer function
        List<String> list = List.of("Sharan","Gayathri","Thippu");
        List<String> upperCaseList = new ArrayList<>();
        Consumer<String> consumerAddData = str -> upperCaseList.add(str.toUpperCase());


        list.forEach(consumerAddData);
//        Converted to UpperCase
        System.out.println(upperCaseList);
    }
}
