public class Controller {
    private Character character;
    private View view;

    public Controller(Character c, View v) {
        this.character = c;
        this.view = v;
    }

    public void handleCasting(Spell s) {
        view.showSpellDetails(s);
        boolean result = character.castSpell(s);

        // if(c.spellPower > 5){
        //     System.err.println("Very powerful spell!");
        // }

        // if(c.elementDislike.equals(s.getElement())){
        //     throw new Exception("Not allowed to cast spells of this type!");
        // }
        if (s.getElement().equals("Ice")){
            this.view = new MyJavaFXView();
        }
        view.showSpellResult(character.getName(), result);
        view.showMana(character.getName(), character.getMana());
    }
}