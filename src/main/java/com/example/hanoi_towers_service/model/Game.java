package com.example.hanoi_towers_service.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by esuarezv on 21/06/2017.
 */
public class Game {

    private String user;
    private String status;
    private int numberOfDisks;
    private Map<Integer, Tower> towers;

    private final int DISK_HEIGHT = 5;
    private final int DISK_RADIUS = 10;

    public Game(String user, Integer numberOfDisks) {
        this.user = user;
        this.numberOfDisks = numberOfDisks;
        this.startNewGame(numberOfDisks);
    }

    private void startNewGame(Integer numberOfDisks) {
        // Generate a stack of disks in radius desc order, e.g 30, 20, 10
        Stack<Disk> disks = new Stack<>();
        for (int i = numberOfDisks; i >= 1; i--) {
            disks.push(new Disk(i * DISK_RADIUS, DISK_HEIGHT));
        }

        // Sets one tower with the disks and the other ones empty.
        towers = new HashMap<>();
        towers.put(1, new Tower(disks));
        towers.put(2, new Tower(new Stack<>()));
        towers.put(3, new Tower(new Stack<>()));

        // Sets the status game
        this.status = GameStatus.CREATED.name();
    }

    public String getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public Map<Integer, Tower> getTowers() {
        return towers;
    }
}
