package Part_5.Part_4;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierFIClass {

    public static void main(String[] args) {

        Supplier<LocalDateTime> localDataTime = () -> LocalDateTime.now();

        System.out.println(localDataTime.get());

        getLocalDateTime(localDataTime);

    }
//    Functional Interfaces can be added as method arguments
    public static void getLocalDateTime(Supplier<LocalDateTime> localDataTime){
        System.out.println(localDataTime.get());
    }
}
