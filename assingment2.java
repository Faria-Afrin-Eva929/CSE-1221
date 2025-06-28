import java.util.Arrays;

public class assingment2{
    public static void main(String[] args) {
        System.out.println("=== First Set of Methods ===");

        // contains()
        String email = "fariaafrin929@gmail.com";
        if (email.contains("@")) {
            System.out.println("1. contains(): Valid email format");
        }

        // substring()
        String receipt = "Order #12345 confirmed";
        String orderNumber = receipt.substring(8, 13);
        System.out.println("2. substring(): Order number: " + orderNumber);

        // join()
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Butter"};
        String recipe = String.join(", ", ingredients);
        System.out.println("3. join(): Ingredients: " + recipe);

        // replace()
        String announcement = "Sale starts on 1/1/2023";
        String updated = announcement.replace("2023", "2024");
        System.out.println("4. replace(): " + updated);

        // replaceAll()
        String phoneNumber = "Call me at (123) 456-7890";
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");
        System.out.println("5. replaceAll(): " + digitsOnly);

        // replaceFirst()
        String logEntry = "ERROR: Disk full. ERROR: Memory low";
        String fixed = logEntry.replaceFirst("ERROR", "WARNING");
        System.out.println("6. replaceFirst(): " + fixed);

        // charAt()
        String password = "s3cr3t";
        char firstChar = password.charAt(0);
        System.out.println("7. charAt(): First character: " + firstChar);

        // getBytes()
        String message = "Hello World";
        byte[] bytes = message.getBytes();
        System.out.println("8. getBytes(): Message in bytes: " + Arrays.toString(bytes));

        // indexOf()
        String url = "https://www.example.com/page";
        int domainStart = url.indexOf("www.");
        int domainEnd = url.indexOf(".com");
        String domain = url.substring(domainStart, domainEnd + 4);
        System.out.println("9. indexOf(): Domain: " + domain);
        
        System.out.println("\n=== Second Set of Methods ===");

        // compareTo()
        String name1 = "Alice";
        String name2 = "Bob";
        int result = name1.compareTo(name2);
        if (result < 0) {
            System.out.println("1. compareTo(): " + name1 + " comes before " + name2);
        } else if (result > 0) {
            System.out.println("1. compareTo(): " + name1 + " comes after " + name2);
        } else {
            System.out.println("1. compareTo(): Names are equal");
        }

        // compareToIgnoreCase()
        String input = "YES";
        if (input.compareToIgnoreCase("yes") == 0) {
            System.out.println("2. compareToIgnoreCase(): User confirmed");
        }

        // trim()
        String userInput = "   hello world   ";
        String cleaned = userInput.trim();
        System.out.println("3. trim(): [" + cleaned + "]");

        // format()
        String formattedReceipt = String.format("4. format(): Total: $%.2f | Items: %d | Date: %s",
                19.99, 3, "2023-05-15");
        System.out.println(formattedReceipt);

        // split()
        String cv = "Faria,Eva,18,Bangladesh";
        String[] data = cv.split(",");
        System.out.println("5. split(): First Name: " + data[0]);
        System.out.println("5. split(): Last Name: " + data[1]);

        // toLowerCase()
        String userCommand = "STOP";
        if (userCommand.toLowerCase().equals("stop")) {
            System.out.println("6. toLowerCase(): System shutting down...");
        }

        // toUpperCase()
        String warning = "system alert";
        System.out.println("7. toUpperCase(): " + warning.toUpperCase());

        // valueOf()
        int age = 25;
        double price = 9.99;
        boolean active = true;
        System.out.println("8. valueOf(): " + String.valueOf(age));
        System.out.println("8. valueOf(): " + String.valueOf(price));
        System.out.println("8. valueOf(): " + String.valueOf(active));

        // toCharArray()
        String secret = "secret";
        char[] chars = secret.toCharArray();
        System.out.print("9. toCharArray(): ");
        for (char c : chars) {
            System.out.print(c + "-");
        }
        System.out.println();

        // matches()
        String testEmail = "test@example.com";
        if (testEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            System.out.println("10. matches(): Valid email address");
        }
    }
}
