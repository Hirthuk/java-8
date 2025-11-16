package Part_7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise4A {
//    From List<User> users where User{String city; int age;}, produce Map<String, List<User>> grouped
    public static void main(String[] args) {
//        Collectors groupingBy returns Map<K(Type used for grouping), List<K>> which takes key wrapper which will be used to group.
        Users user1 = new Users("Sharan", "Bengaluru");
        Users user2 = new Users("Gayathri", "Bengaluru");
        Users user3 = new Users("Thippu", "Madurai");

        List<Users> userList = List.of(user1,user2,user3);

//        Grouping based on the city - Return Map of city then the List of users Map<String, List<Users>>
        Map<String, List<Users>> groupByCity = userList.stream().collect(Collectors.groupingBy(users -> users.getCity()));

       groupByCity.forEach((key, value) -> {
           System.out.println(key);
           value.forEach((user) -> System.out.println(user.getName()));
       });
    }
}
