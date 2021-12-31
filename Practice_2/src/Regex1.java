import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    System.out.println(pattern);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    System.out.println(matcher);
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
