import java.lang.*;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("=========\nHello, World\n=========");
        while (true) {
            System.out.println("Wait for JMX connection...");
            Thread.sleep(1000);
        }
    }
}
