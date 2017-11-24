/*
 * This is the client game application that will create multiple monsters
 * from the actual copy's list
 * 
 */
package org.thiagz.prototype;

/**
 *
 * @author Thiagz
 */
public class MonsterGameClient {

    public static void main(String args[]) {
        
        MonsterCache.loadCache();
        
        try {
            Monster cloneMonster1 = MonsterCache.getMonster(1);
            cloneMonster1.setPositionX(12);
            cloneMonster1.setPositionX(17);
            System.out.println("Position of Monster1: x="
                    + MonsterCache.monsterMap.get(1).getPositionX() + " y="
                    + MonsterCache.monsterMap.get(1).getPositionY());
            MonsterCache.monsterMap.get(1).action();
            System.out.println("Position of ClonedMonster1: x="
                    + cloneMonster1.getPositionX() + " y="
                    + cloneMonster1.getPositionY());
            cloneMonster1.action();
            
            Monster cloneMonster2 = MonsterCache.getMonster(2);
            cloneMonster2.setPositionX(15);
            cloneMonster2.setPositionX(13);
            System.out.println("Position of Monster2: x="
                    + MonsterCache.monsterMap.get(2).getPositionX() + " y="
                    + MonsterCache.monsterMap.get(2).getPositionY());
            MonsterCache.monsterMap.get(2).action();
            System.out.println("Position of ClonedMonster2: x="
                    + cloneMonster2.getPositionX() + " y="
                    + cloneMonster2.getPositionY());
            cloneMonster2.action();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
