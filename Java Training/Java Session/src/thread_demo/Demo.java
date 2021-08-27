package thread_demo;

public class Demo {
    public static void main(String[] args) {

        ThreadDemo td1 = new ThreadDemo();
        ThreadDemo td2 = new ThreadDemo("Wipro", 15);
        ThreadDemo td3 = new ThreadDemo("TCS", 20);

        td1.start();
        td2.start();
        td3.start();

    }

}
