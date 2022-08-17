import java.util.Arrays;

public class Jenkins {
    public static void main(String[] args) {
        String str = "Java is a Programming Language";
        String arr[] = str.split(" ");
        for (String string : arr) {
            System.out.print(string + "\n");
        }
        System.out.println("--------------------End of line-----------------------");
    }

}