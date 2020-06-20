public class Role {

    private String name = "";
    private String weapon = "";

    public Role() {
    }

    public Role(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    //减少HP放在对应的Weapon中，死亡判断放在AttackMonsters中；attack执行判断武器类别并攻击动作
    public void attack(Monster monster) {

        switch (this.getWeapon()) {
            case "WoodSword":
                WoodWeapon woodWeapon = new WoodWeapon();
                woodWeapon.attackMonster(monster);
                break;
            case "IronSword":
                IronWeapon ironWeapon = new IronWeapon();
                ironWeapon.attackMonster(monster);
                break;
            case "MagicSword":
                MagicWeapon magicWeapon = new MagicWeapon();
                magicWeapon.attackMonster(monster);
                break;
            default:
                System.out.println("角色手里没有武器，无法攻击！");
        }
    }
}


