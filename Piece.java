import java.util.HashSet;

public class Piece {
    public HashSet<Character> colors = new HashSet<>();

    public boolean isSameAs(Piece x) {
        if (x.colors.size() != this.colors.size()) return false;
        for (Character c : this.colors) {
            if (x.colors.contains(c)) {
                //all good
            } else {
                //System.out.println("passed piece does not contain " + c);
                return false;
            }
        }
        return true;
    }
}
