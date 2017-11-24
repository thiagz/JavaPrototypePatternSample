/*
 * This is the cache that holds Monster objects
 * 
 *
 */
package org.thiagz.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Thiagz
 */
public class MonsterCache {

    public static Map<Integer, Monster> monsterMap = new HashMap<>();

    public static void loadCache() {
        Monster flyMonster = new FlyingMonster();
        flyMonster.setPositionX(12);
        flyMonster.setPositionY(12);
        flyMonster.setId(1);
        monsterMap.put(flyMonster.getId(), flyMonster);

        Monster crawlMonster = new CrawlingMonster();
        crawlMonster.setPositionX(14);
        crawlMonster.setPositionY(15);
        crawlMonster.setId(2);
        monsterMap.put(crawlMonster.getId(), crawlMonster);
    }

    public static Monster getMonster(int monsterId) throws CloneNotSupportedException {
        Monster cachedMonster = monsterMap.get(monsterId);
        return cachedMonster.clone();
    }
}
