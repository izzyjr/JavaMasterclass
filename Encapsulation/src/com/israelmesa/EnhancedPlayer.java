package com.israelmesa;

public class EnhancedPlayer {
    private String name;
    private int mana = 100;
    private String weapon;

    public EnhancedPlayer(String name, int mana, String weapon) {
        this.name = name;
        if (mana > 0 && mana <= 100) {
            this.mana = mana;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.mana = this.mana - damage;
        if (this.mana <= 0) {
            System.out.println("Player knocked out");
            //
        }
    }

    public int getMana() {
        return mana;
    }
}
