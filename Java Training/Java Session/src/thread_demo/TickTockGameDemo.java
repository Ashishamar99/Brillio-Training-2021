package thread_demo;

public class TickTockGameDemo {
    public static void main(String[] args) {
        TickTockThread obj = new TickTockThread();

        Player1 p1 = new Player1(obj);
        Player2 p2= new Player2(obj);

        p1.start();
        p2.start();

    }
}
