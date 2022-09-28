public class PracticaHilos {
    public static void main(String[] args) {
        for(String h: args){
            int n = Integer.parseInt(h);
            Thread H= new Thread(new hilo(n));
            H.start();
        }




}}
