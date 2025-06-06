/*
 
3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3

*/

/*

Concept: Which Layer Am I In?
Each cell (i, j) belongs to a "layer".

Outer cells → layer 0 → print n = 3

Next inner border → layer 1 → print 2

Center cell → layer 2 → print 1

So how do we calculate which layer a cell belongs to?

We ask:
How far is this cell from the top, bottom, left, and right edge?

Then take the minimum of those — that’s your layer number.

Let's say you're at cell (i, j):
For a grid of size size = 2n - 1,

the four distances from edges are:

| Direction | Distance       |
| --------- | -------------- |
| Top       | `i`            |
| Left      | `j`            |
| Right     | `size - 1 - j` |
| Bottom    | `size - 1 - i` |

Then:

int minDist = Math.min(Math.min(i, size - 1 - i), Math.min(j, size - 1 - j));
int value = n - minDist;

This works because:

If you’re near the edge → minDist = 0 → print n

Move one step inside → minDist = 1 → print n-1

And so on…



*/

import java.util.Scanner;

public class J22_ConcentricSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int size = 2*n-1;
            for(int i = 0; i < size; i++)
            {
                for(int j = 0; j < size; j++)
                {
                    int minDist = Math.min(Math.min(i, size-1-i), Math.min(j, size-1-j));
                    int val = n - minDist;
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            
        }finally{
            sc.close();
        }
    }
}
// // Good Question!!!