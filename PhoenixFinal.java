public class PhoenixFinal extends FlashDirection {

    public PhoenixFinal() {
        super();
        this.description += "Phoenix stands ready to fight!";
    }

    public void display() {
        System.out.println("== PHOENIX LOADOUT ==");
        System.out.println(description);
        System.out.println("======================");
    }
}
