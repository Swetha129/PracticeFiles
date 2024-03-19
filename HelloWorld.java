package ThreadsPractice;

class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorldThread helloThread = new HelloWorldThread();
        helloThread.start();    //HelloWorldUsingThreads
    }
}
