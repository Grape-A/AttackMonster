//魔剑攻击
public class MagicWeapon implements IWeapon {
    @Override
    public void attackMonster(Monster monster) {
        monster.decreaseHealthPoint(100);//魔剑攻击力100

    }
}
