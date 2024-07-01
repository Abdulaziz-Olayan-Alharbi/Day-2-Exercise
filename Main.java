import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);

        /*1. Develop a program that takes the weight (in kilograms) and height (in meters) as
        input and calculates the BMI, then prints it.*/
        System.out.println("Enter the weight (in kilograms) : ");
        float weight = scan.nextFloat();
        System.out.println("Enter the height (in meters) : ");
        float height = scan.nextFloat();
        float BMI = (weight / (height * height));
        System.out.println("BMI = : "+BMI);
        System.out.println("****************************************************");

        /*2. Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.*/
        System.out.println("Enter the obtained marks: ");
        float obtained_marks = scan.nextFloat();
        System.out.println("Enter the total marks: ");
        float total_marks = scan.nextFloat();
        float percentage = ((obtained_marks / total_marks)*100);
        System.out.println("the percentage is: "+percentage);
        System.out.println("*******************************************");

        /*3. Create a program that takes an amount in one currency and an exchange rate as
        input, then converts and prints the amount in another currency.*/
        System.out.println("Current currency: ");
        String currency = scan.next();
        System.out.println("convert to : ");
        String convert_to = scan.next();
        System.out.println("Enter the exchange rate : ");
        float exchange_rate = scan.nextFloat();
        System.out.println("Enter the amount of "+currency+" to convert to "+convert_to);
        float amount = scan.nextFloat();
        System.out.println("Enter the amount of "+convert_to+" is "+(amount*exchange_rate));
        System.out.println("********************************************************");

        /*4. Create a program that takes a string as input, calculates its length, and then reverses
        the string using the StringBuilder class, finally printing both the length and reversed
        string.*/
        System.out.println("Enter a String: ");
        String input_string = scan.next();
        StringBuilder input = new StringBuilder();
        input.append(input_string);

        System.out.println("Length of the String: "+input_string.length()+", Reversed String: "+input.reverse().toString());
        System.out.println("*******************************************************");

        /*5. Develop a program that takes a sentence as input and extracts a substring from it,
                then prints the extracted substring.*/
        System.out.println("Enter a String: ");
        String input_string_2 = scan.next();
        System.out.println("Enter Start index: ");
        int start_index = scan.nextInt();
        System.out.println("Enter End index: ");
        int end_index = scan.nextInt();
        System.out.println("The extracted substring: "+input_string_2.substring(start_index,end_index));
        System.out.println("******************************************************");

        /*6. Write a program that takes a sentence and a keyword as input, then check if the
        keyword is present in the sentence and prints the result.*/
        System.out.println("Enter a Sentence: ");
        String input_string_3 = scan.next();
        System.out.println("Enter the keyword: ");
        String keyword = scan.next();
        System.out.println("it is "+input_string_3.contains(keyword)+" that "+keyword+" is present in the sentence");
        System.out.println("******************************************************");

        /*7. Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified
        sentence.*/

        System.out.println("Enter a Sentence: ");
        String input_string_4 = scan.next();
        System.out.println("Enter a word to replace: ");
        String replace = scan.next();
        System.out.println("Enter the replacement word: ");
        String replacement = scan.next();
        System.out.println(input_string_4.replace(replace,replacement));
        System.out.println("******************************************************");

        /*8. Write a program that takes two strings as input and check if they are equal, ignoring
        the case, then prints whether they are equal or not.*/

        System.out.println("Enter the first string: ");
        String first = scan.next();
        System.out.println("Enter the second string: ");
        String second = scan.next();
        System.out.println("it is "+first.equalsIgnoreCase(second)+" that they are equals ");

















    }
}