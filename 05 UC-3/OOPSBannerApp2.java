public class OOPSBannerApp2 {

    public static void main(String[] args) {
        // Use System.out.println() to print each line of the OOPS banner to create
        // the visual effect for the message "OOPS". Construct each line using
        // String.join() method for better readability and efficiency.
        // Each line corresponds to a row in the banner for the letters O, O, P, S.

        System.out.println(String.join(" ",  " * ", " * ", " ** ", " *** "));
        System.out.println(String.join(" ", "* *", "* *", "* *", "** "));
        System.out.println(String.join(" ", "* *", "* *", "* *", "** "));
        System.out.println(String.join(" ", "* *", "* *", "** ", " ** "));
        System.out.println(String.join(" ", "* *", "* *", "* ", "   *"));
        System.out.println(String.join(" ", "* *", "* *", "* ", "   *"));
        System.out.println(String.join(" ", " * ", " * ", "* ", "* "));
    }
}