package D;

public class ClassicComputer {
    
    private StandardKeyboard keyboard;
    private Monitor monitor;

    public ClassicComputer() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor("CRT", 15);
    }

}
