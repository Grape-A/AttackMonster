//木剑攻击
public class WoodWeapon implements IWeapon {

    @Override
    public void attackMonster(Monster monster) {
        monster.decreaseHealthPoint(20);//木剑攻击力20

    }
}
