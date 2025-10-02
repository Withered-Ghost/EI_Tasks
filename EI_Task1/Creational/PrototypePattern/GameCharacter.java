public class GameCharacter implements CharacterPrototype {
    private String name;
    private String type;
    private int health;
    private int attack;

    public GameCharacter(String name, String type, int health, int attack) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
    }

    @Override
    public CharacterPrototype clone() {
        return new GameCharacter(this.name, this.type, this.health, this.attack);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', type='" + type + "', health=" + health + ", attack=" + attack + "}";
    }
}
