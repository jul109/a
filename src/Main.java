import static java.lang.Math.floor;

public class Main {

    public static int hashFunction3(double k){
        return (int) Math.floor( k * 8);
    }
    public static void main(String[] args) {
        double keys[]={0.683,0.62,0.152,0.549,0.5,0.654,0.91,0.136};
        for (int i = 0; i <keys.length ; i++) {
            System.out.println("Elemento: "+(i+5)+" key: "+ keys[i]);
            System.out.println("h(k) = L" + 8+"*"+keys[i]+"˩");
            System.out.println("h(k) = L" + 8*keys[i]+"˩");
            System.out.println("h(k) = " + hashFunction3(keys[i]));
        }
    }
}