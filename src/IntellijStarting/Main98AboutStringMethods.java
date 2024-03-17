package IntellijStarting;

public class Main98AboutStringMethods {
    public static void main(String[] args) {
        String birthDate = "12/09/2014";
        int startingIndex = birthDate.indexOf("2014");
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "12", "09", "2104");
        System.out.println("NewDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("09");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2014");
        System.out.println("NewDate = " + newDate);

        newDate = "25" + "/" + "09" + "/" + "2014";
        System.out.println("NewDate = " + newDate);

        newDate = "25".concat("/").concat("09").concat("/").concat("2014");
        System.out.println("NewDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("4" , "00"));

        System.out.println(newDate.replaceFirst("/" , "-"));
        System.out.println(newDate.replaceAll("/" , "---"));

        System.out.print("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.print("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.print("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
}
