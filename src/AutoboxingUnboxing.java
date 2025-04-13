import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutoboxingUnboxing {

    public static List<Integer> parseStringToIntegerList(String[] strNumbers) {
        List<Integer> intList = new ArrayList<>();
        for (String str : strNumbers) {
            intList.add(Integer.parseInt(str));
        }
        return intList;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        scanner.close();

        String[] strNumbers = input.split(" ");
        List<Integer> numbers = parseStringToIntegerList(strNumbers);

        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }
}