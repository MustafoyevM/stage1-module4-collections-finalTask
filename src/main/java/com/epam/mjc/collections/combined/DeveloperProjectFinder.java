package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

       //iterate map, if value contains D - save project
        projects.forEach((key, value) -> {
            if (value.contains(developer)) {
                result.add(key);
            }
        });

        result.sort((o1, o2) -> {
            if (o1.length() > o2.length()) return -1;
            else if (o1.length() < o2.length()) return 1;
            else {
               int temp =  o1.compareTo(o2) < 0 ?  1 : -1;
               if (temp < 0) {
                   return -1;
               } else if (temp > 0) {
                   return 1;
               }
               else {
                   return 0;
               }
            }
        });
       return result;
    }
}
