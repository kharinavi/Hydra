package ru.kharina.study.hydra;

import java.util.ArrayList;
import java.util.List;

public class Hydra {
    private String name;
    private List<Head> headList = new ArrayList<>();

    public Hydra(String name) {
        this.name = name;
    }

    public void setHeadList(List<Head> headList) {
        this.headList = headList;
    }

    public void printHeadList() {
        for (Head head : headList)
            System.out.println(head.printProperties());
    }
}
