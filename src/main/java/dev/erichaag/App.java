package dev.erichaag;

public class App {

    public String getGreeting() {
        return """
            Hello world!
        """.trim();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
