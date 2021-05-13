public class StringInterleaving {
    public static void stringInterleaving(String x, String y, int xLength, int yLength, String output) {
        if (xLength == 0 && yLength == 0) {
            System.out.println(output);
        }

        if (xLength != 0) {
            stringInterleaving(x.substring(1), y, xLength-1, yLength, output+x.charAt(0));
        }

        if (yLength != 0) {
            stringInterleaving(x, y.substring(1), xLength, yLength-1, output+y.charAt(0));
        }
    }

    public static void main(String[] args) {
        stringInterleaving("AB", "CD", "AB".length(), "CD".length(), "");
    }
}
