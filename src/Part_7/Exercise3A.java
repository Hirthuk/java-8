package Part_7;

import java.util.List;

public class Exercise3A {
   public static void main(String[] args) {
       List<String> errorNotes = List.of("Error is occurred", "Error in the database","Error in the system");
//Count words that contain "error" (case-insensitive) from a Stream<String> lines.
       long count =  errorNotes.stream().filter((str) -> str.toLowerCase().contains("error")).count();

       System.out.println("Number of errors in this log is  "+ count);

   }
}
