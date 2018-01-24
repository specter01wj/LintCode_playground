/*
Implement a Rectangle class which include the following attributes and methods:

1.Two public attributes width and height.
2.A constructor which expects two parameters width and height of type int.
3.A method getArea which would calculate the size of the rectangle and return.
*/

/*
Thoughts:
While loop through. Maintain a parent, so it can be used to skip current node.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class N_454_Rectangle_Area {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(3, 4);
        rec.getArea(); // should get 12
        int res = rec.getArea();
        System.out.println("input: [3,4]" + "\noutput: " + res);

    }

    public static class Rectangle {
        /*
         * Define two public attributes width and height of type int.
         */
        // write your code here
        private int width;  
        private int height;  
        /*
         * Define a constructor which expects two parameters width and height here.
         */
        // write your code here
        public Rectangle(int w, int h){  
            super();  
            width = w;  
            height = h;  
        }  
        /*
         * Define a public method `getArea` which can calculate the area of the
         * rectangle and return.
         */
        // write your code here
        public int getArea(){  
            return width * height;  
        }  
    }

}
