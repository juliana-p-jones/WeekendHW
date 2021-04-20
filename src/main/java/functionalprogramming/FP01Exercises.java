package functionalprogramming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersInListFunctional(numbers);
        printSquaresofEvenNumbersInListFunctional(numbers);
        printCubeOfOddNumbersInListFunctional(numbers);
        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices",
                        "AWS", "PCF", "Azure", "Docker");
        courses.stream()
                .forEach(System.out::println);
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        courses.stream()
                .filter(course -> course.length() >=4)
                .forEach(System.out::println);
        courses.stream()
                //for each course print the number of characters of each course
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
               // .filter(FP01Functional::isEven) //add filter - only allows even numbers
               .filter(number -> number%2 !=0) //lambda expression
                .forEach(System.out::println);
    } private static void printSquaresofEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 ==0) //lambda expression
                //mapping - x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);
    }
    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number%2 !=0) //lambda expression
                //mapping - x -> x * x
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .forEach(System.out::println);
    }
}
