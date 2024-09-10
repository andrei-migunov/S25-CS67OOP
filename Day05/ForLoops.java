public class ForLoops {
    
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
        
        for (int j=0; j<100; j+=2){
            System.out.println(j);
        }
        
        // the scope of the variable declared in the for loop
        // is confined to be only good in the for loop
        for (int k=10; k>0; k--) {
            System.out.println(k);
        }
        //System.out.println(k);
    }
}
