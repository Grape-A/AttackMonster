import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Description: Object-oriented jobs using Java
 * This program is used to AttackMonsters javadoc.
 * Program Name:AttackMonster
 * Date:20/6/2020
 * @author PuZhang/SF190709
 * @version 1.0
 */
public class AttackMonsters {
    public static void main(String[] args) {
        // 生成怪物
        Monster monster1 = new Monster("小怪A", 50);
        Monster monster2 = new Monster("小怪B", 50);
        Monster monster3 = new Monster("关主", 200);
        Monster monster4 = new Monster("最终Boss", 1000);
        // 生成角色
        Role role = new Role();
        //  武器库
        List<String> weapon = new ArrayList<>();
        weapon.add("WoodSword");
        weapon.add("IronSword");
        weapon.add("MagicSword");

//      将怪兽加入列表
        ArrayList<Monster> monster = new ArrayList<>();
        monster.add(monster1);
        monster.add(monster2);
        monster.add(monster3);
        monster.add(monster4);
        //输入武器，同时判断武器是否合法，合法后设置攻击武器类型
        System.out.println("请选择你使用的武器ID：0-WoodSword，1-IronSword，2-MagicSword；输入对应的整数：");
        Scanner sc = new Scanner(System.in);
        Integer sword_id = sc.nextInt();
        if (sword_id >= 0 && sword_id < 3) {
            role.setWeapon(weapon.get(sword_id));//设置武器类型
        } else {
            System.out.println("武器ID错误，请输入合适的武器ID！");
        }

        int dePoint = 0;
        switch (sword_id) {
            case 0:
                dePoint = 20;
                break;
            case 1:
                dePoint = 50;
                break;
            case 2:
                dePoint = 100;
                break;
            default:
                System.out.println("武器id错误！");

        }

//      循环判断每个怪兽状态，发动对应武器攻击
        for (int i = 0; i < monster.size(); i++) {
            if (monster.get(i).getHealthPoint() <= 0) {
                System.out.println(monster.get(i).getName() + "已死亡。");
                return;
            }

            role.attack(monster.get(i));//攻击怪兽

            if (monster.get(i).getHealthPoint() <= 0) {
                System.out.println(role.getWeapon() + "攻击成功！怪物" + monster.get(i).getName() + "已死亡。");
            } else {

                System.out.println(role.getWeapon() + "攻击成功！怪物" + monster.get(i).getName() + "损失" + dePoint + "个生命点。");
            }

        }
    }
}
