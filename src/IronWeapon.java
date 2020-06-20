//铁剑攻击
public class IronWeapon implements IWeapon {

    @Override
    public void attackMonster(Monster monster) {
        monster.decreaseHealthPoint(50);//铁剑攻击力50

    }
}
