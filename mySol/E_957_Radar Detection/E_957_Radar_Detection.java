/*
There is a bunch of radars on a 2D plane(Radar has x, y coordinates, and a radius r which is the range can be detected). Now, there is a car that passes through the range of y = 0 and y = 1 and cannot be detected by the radar. If the car is detected, return YES, otherwise NO.(You can consider that the car is a line segment of length 1 and goes straight from x = 0 to the right)

 Notice
The number of radars is n，n <= 1000。
The radar's coordinate x is a non-negative integer, y is an integer, and r is a positive integer.

Example
Given coordinates = [[0,2]], radius = [1], return "NO".

Explanation:
There is a radar at (0,2) that can detect a circle with a radius of 1 centered on (0,2) and the car will not be detected.
Given coordinates = [[0,2],[1,2]], radius = [1,2], return "YES"。

Explanation:
There is a radar at (0,2) that can detect a circular area with a radius of 2 with a center of (0,2). Radars at (1,2) can detect (1,2) as Center, circular area with 2 radius. The No. 2 radar can detect the passing of the car.
*/

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

import java.util.*;

class Point {
	int x;
	int y;
	Point() { x = 0; y = 0; }
	Point(int a, int b) { x = a; y = b; }
}

public class E_957_Radar_Detection {

    public static void main(String[] args) {

        Point[] coord = {0,2};
        int[] input = {1};
        String output = radarDetection(coord, input);
        System.out.println("input: " + (input) + "\noutput: " + (output));

    }

    /**
     * @param coordinates: The radars' coordinate
     * @param radius: Detection radius of radars
     * @return: The car was detected or not
     */
    public static String radarDetection(Point[] coordinates, int[] radius) {
        // Write your code here
        int flag = 0;
        for(int i = 0; i < coordinates.length; i++) {
            int l = coordinates[i].y - radius[i];
            int r = coordinates[i].y + radius[i];
            if(r > 0 && l < 0 || l < 1 && r > 1) {
                flag = 1;
                break;
            }
        }
        return flag == 0 ? "NO":"YES";
    }

}
