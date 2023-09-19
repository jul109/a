import static java.lang.Math.floor;

public class Main {

    public static int hashFunction3(int k){
        return  k %6 ;
    }
    public static void main(String[] args) {
        int keys[]={14,6,2,28};
        for (int i = 0; i <keys.length ; i++) {
            System.out.println("Elemento: "+(i+1)+" key: "+ keys[i]);
            System.out.println("h(k) = "+ keys[i]+" mod "+6);
            System.out.println("h(k) = "+ hashFunction3(keys[i]));
        }
    }
}