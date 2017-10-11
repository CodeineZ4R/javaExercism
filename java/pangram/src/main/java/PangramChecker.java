import java.util.regex.Matcher;
import java.util.HashSet;

public class PangramChecker {

        public boolean isPangram(String input) {
                HashSet<String> hSet = new HashSet<>();

                for (String s : input.split("")) {
                        if ( s.matches("[a-zA-Z]") ) {
                                hSet.add(s.toLowerCase());

                        }
                }

                if (hSet.size() < 26) {
                        return false;
                }else {
                        return true;
                }

        }

}
