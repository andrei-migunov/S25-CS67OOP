public class ForLoopsAndStrings {
    
    public static void main(String[] args) {
        String greeting = "hello there";
        for (int i=0; i<greeting.length(); i++) {
            System.out.print(greeting.charAt(i));
        }
        System.out.println();

        for (int i=1; i<=greeting.length(); i++) {
            System.out.print(greeting.charAt(greeting.length() - i));
        }
        System.out.println();
    }
}
