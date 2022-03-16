package POJOs;

public class Enemy {
//enemy fields
    private int attack;
    private int defense;
    private int specialAttk;
    private int specialDef;
    private int agility;
    private int hp;
    private int luck;
//enemy constructor
    public Enemy(int attack, int defense, int specialAttk, int specialDef, int agility, int hp, int luck) {
        this.attack = attack;
        this.defense = defense;
        this.specialAttk = specialAttk;
        this.specialDef = specialDef;
        this.agility = agility;
        this.hp = hp;
        this.luck = luck;
    }
//enemy getters
    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialAttk() {
        return specialAttk;
    }

    public int getSpecialDef() {
        return specialDef;
    }

    public int getAgility() {
        return agility;
    }

    public int getHp() {
        return hp;
    }

    public int getLuck() {
        return luck;
    }

//TODO enemy methods


}
