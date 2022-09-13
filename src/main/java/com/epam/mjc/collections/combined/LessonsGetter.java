package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> list = new HashSet<>();
        for (Map.Entry<String, List<String>> temp: timetable.entrySet()) {
            for (String lesson : temp.getValue()) {
                list.add(lesson);
            }
        }
        return list;
    }
}
