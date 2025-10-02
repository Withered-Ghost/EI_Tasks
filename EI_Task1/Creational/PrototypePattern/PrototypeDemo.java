public class PrototypeDemo {
    public static void main(String[] args) {
        GameCharacter archerPrototype = new GameCharacter("DefaultArcher", "Archer", 100, 15);

        GameCharacter player1 = (GameCharacter) archerPrototype.clone();
        player1.setName("Legolas");
        player1.setAttack(20);

        GameCharacter player2 = (GameCharacter) archerPrototype.clone();
        player2.setName("Robin Hood");

        System.out.println(archerPrototype);
        System.out.println(player1);
        System.out.println(player2);

        System.out.println("archerPrototype == player1 ? " + (archerPrototype == player1));
    }
}
