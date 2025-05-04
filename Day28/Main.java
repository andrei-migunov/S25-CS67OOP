public class Main {
    public static void main(String[] args) {
        Character mage = new Character("Elowen", 50, "Fire");
        Spell fireball = new Spell("Fireball", 30, "Fire");

        Spell ice_shard = new Spell("Ice Shard", 10, "Ice");

        View view = new View();
        Controller controller = new Controller(mage, view);

        controller.handleCasting(fireball);
        controller.handleCasting(ice_shard);
    }
}