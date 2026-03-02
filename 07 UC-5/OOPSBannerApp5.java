public class OOPSBannerApp5 {

    public static void main(String[] args) {

        // Define and initialize banner lines using String.join()
        String[] lines = {

            String.join(" ", "  ***  ", " ***** ", " ***** ", " ***** "),
            String.join(" ", " *   * ", " *   * ", " *   * ", " *     "),
            String.join(" ", "*     *", "*     *", "*     *", "*     "),
            String.join(" ", "*     *", "*     *", "*     *", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "     * "),
            String.join(" ", " *   * ", " *   * ", " *   * ", " *   * "),
            String.join(" ", "  ***  ", " ***** ", " ***** ", " ***** ")
        };

        // Print each line using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
			System.out.println("welcome");
        }
    }
}