package com.controller.ComparatorAndComparable;

import java.util.Comparator;

public class CourseComparator implements Comparator <CurseComparable> {
     @Override
    public int compare(CurseComparable o1, CurseComparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
