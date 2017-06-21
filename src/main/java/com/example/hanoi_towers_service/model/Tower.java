package com.example.hanoi_towers_service.model;

import java.util.Stack;

/**
 * Created by esuarezv on 21/06/2017.
 */
public class Tower {

    private Stack<Disk> discs;

    public Tower(Stack<Disk> discs) {
        this.discs = discs;
    }

    public Stack<Disk> getDiscs() {
        return discs;
    }

    public void setDiscs(Stack<Disk> discs) {
        this.discs = discs;
    }
}
