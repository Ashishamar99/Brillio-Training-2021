package thread_demo;

public class TickTockThread {
    synchronized public void f1(){
        try{
            notify();
            System.out.print("Tick - ");
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void f2(){
        try{
            notify();
            System.out.println("Tock ");
            wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Player1 extends Thread{
    TickTockThread obj;

    public Player1(TickTockThread obj) {
        this.obj = obj;
    }

    public Player1(){
        this.obj = null;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            obj.f1();
        }
    }
}

class Player2 extends Thread{
    TickTockThread obj;

    public Player2(TickTockThread obj) {
        this.obj = obj;
    }

    public Player2(){
        this.obj = null;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            obj.f2();
        }
    }
}
