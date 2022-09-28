public class hilo implements Runnable {
private int arg;
public hilo (int n){this.arg = n;}
    public void run() {

        int factorial=1;
        for (int i = 1; i<=arg; i++){
            factorial = factorial * i;


        }
        System.out.println(Thread.currentThread().getName() + factorial);


        }
    }
