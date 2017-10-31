package com.bvan.oop.lesson9.map.socialnetwor;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, User> idToUserMap = new TreeMap<>();

        idToUserMap.put(100L, new User(100L, "Taras", 25)); // O(1)
        idToUserMap.put(5000L, new User(5000L, "Katya", 18));
        idToUserMap.put(2000L, new User(2000L, "Ivan", 20));
        User prevUser = idToUserMap.put(2000L, new User(2000L, "Vasya", 30));

        User user = idToUserMap.get(2000L); // O(1)
        System.out.println(user);

        System.out.println("prevUser = " + prevUser);

        Set<Long> keys = idToUserMap.keySet();
        Collection<User> values = idToUserMap.values();
        Set<Map.Entry<Long, User>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, User> entry : entries) {
            Long key = entry.getKey();
            User value = entry.getValue();
            System.out.println("k = " + key + ", v = " + value);
        }
    }

}
