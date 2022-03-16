package POJOs;

public class Player {

//player fields
    private int attack;
    private int defense;
    private int specialAttk;
    private int specialDef;
    private int agility;
    private int hp;
    private int luck;
    private int exp;
    private int skillPoints;
    private int level;

//player constructor
    public Player(int attack, int defense, int specialAttk, int specialDef, int agility, int hp, int luck, int exp, int skillPoints, int level) {
        this.attack = attack;
        this.defense = defense;
        this.specialAttk = specialAttk;
        this.specialDef = specialDef;
        this.agility = agility;
        this.hp = hp;
        this.luck = luck;
        this.exp = exp;
        this.skillPoints = skillPoints;
        this.level = level;
    }

    //player getters
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

    public int getExp() {
        return exp;
    }

    public int getSkillPoints() {
        return skillPoints;
    }
    //TODO player methods





}
