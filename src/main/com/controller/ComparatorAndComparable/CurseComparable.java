package com.controller.ComparatorAndComparable;

public class CurseComparable implements Comparable <CurseComparable> {
    private int index;
    private String name;

    public CurseComparable() {
    }


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CurseComparable(int index, String name) {
        this.index = index;
        this.name = name;
    }


    @Override
    public int compareTo(CurseComparable o) {
        return this.index - o.index;
    }

}
