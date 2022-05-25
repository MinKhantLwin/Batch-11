package weed5;
import javax.xml.stream.events.Characters;
import java.util.*;
class Ch9MatchJavaIdentifier {
    private static final String STOP = "STOP";
    private static final String VALID = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";
    private static final String VALID_IDENTIFIER_PATTERN
            = "(09)*25[0-9]{7}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;
        while (true) {
            System.out.print("Identifier: ");
            str = scanner.next();
            if (str.equals(STOP)) break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(str + ": " + reply + "\n");
        }
    }
}
//   class Document{
//
//
//       public static void main(String[] args) {
//           String document;
//    document = "hello"; //assign text to 'document'
//    if (document.matches(".*zen of objects.*")) {
//        System.out.println("Found");
//    }
//    else {
//        System.out.println("Not found");
//        }
//    }
//}
