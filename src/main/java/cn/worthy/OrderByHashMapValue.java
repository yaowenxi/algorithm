package cn.worthy;


import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.collect.Maps.newHashMap;

/**
 * Author: Yaowenxi
 * Date: 18-4-2
 * <p>
 * 根据map的value进行排序
 */
public class OrderByHashMapValue {


    public static void main(String[] args) {
        Map<String, Integer> map = newHashMap();
        map.put("aaa", 345);
        map.put("bbb", 234);
        map.put("ccc", 1009);
        map.put("ddd", 32445);
        map.put("eee", 1);
        List<Map.Entry<String, Integer>> hashList = map.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue())).collect(Collectors.toList());

        for (int i = 0; i < 3; i++) {
            System.out.println(hashList.get(i).getKey());
        }

    }

}
