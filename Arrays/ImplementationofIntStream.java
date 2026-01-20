// import java.util.stream.IntStream;

// class ImplementationofIntStream{
//     public static void main(String[] args) {
//         IntStream stream = IntStream.range(10,15);

//         stream.forEach(System.out::println);
//     }
// }

import java.util.stream.IntStream;

class ImplementationofIntStream {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 5;

        // Outer stream for rows
        IntStream.range(0, rows).forEach(i -> {

            // Inner stream for columns
            IntStream.range(0, cols).forEach(j -> System.out.print("* "));

            System.out.println(); // move to next line
        });
    }
}
