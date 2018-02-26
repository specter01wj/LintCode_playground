/*
In the classic problem of Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints:

Only one disk can be moved at a time.
A disk is slid off the top of one tower onto the next tower.
A disk can only be placed on the top of a larger disk.
Write a program to move the disks from the first tower to the last using stacks.
*/

/**
 * Your Tower object will be instantiated and called as such:
 * Tower[] towers = new Tower[3];   
 * for (int i = 0; i < 3; i++) towers[i] = new Tower(i);
 * for (int i = n - 1; i >= 0; i--) towers[0].add(i);   
 * towers[0].moveDisks(n, towers[2], towers[1]);
 * print towers[0], towers[1], towers[2]
*/

import java.util.*;

public class E_227_Mock_Hanoi_Tower_by_Stacks {

    public static void main(String[] args) {

        Tower[] towers = new Tower[3];

    }

    private Stack<Integer> disks;
    /*
    * @param i: An integer from 0 to 2
    */
    public static Tower(int i) {
        // create three towers
        disks = new Stack<Integer>();
    }

    /*
     * @param d: An integer
     * @return: nothing
     */
    public void add(int d) {
        // Add a disk into this tower
        if (!disks.isEmpty() && disks.peek() <= d) {
            System.out.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    /*
     * @param t: a tower
     * @return: nothing
     */
    public void moveTopTo(Tower t) {
        // Move the top disk of this tower to the top of t.
        int v = disks.pop();
        t.add(v);
    }

    /*
     * @param n: An integer
     * @param destination: a tower
     * @param buffer: a tower
     * @return: nothing
     */
    public void moveDisks(int n, Tower destination, Tower buffer) {
        // Move n Disks from this tower to destination by buffer tower
        if (n == 0) {
            return;
        }
        moveDisks(n - 1, buffer, destination);
        moveTopTo(destination);
        buffer.moveDisks(n - 1, destination, this);
    }

    /*
     * @return: Disks
     */
    public Stack<Integer> getDisks() {
        // write your code here
        return disks;
    }

}
