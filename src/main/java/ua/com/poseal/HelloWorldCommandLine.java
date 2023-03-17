package ua.com.poseal;

public class HelloWorldCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("HelloWorldCommandLine");
        }
    }
}
