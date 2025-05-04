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
        view.showSpellResult(character.getName(), result);
        view.showMana(character.getName(), character.getMana());
    }
}