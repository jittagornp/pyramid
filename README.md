# Pyramid

<h3>Example1</h3>

```java
package com.blogspot.na5cent.pyramid;

import java.util.Scanner;

/**
 * @author redcrow
 */
public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = n * (n + 1) / 2;
        int bigSpace = (n - 1) / 2;

        for (int i = 1; i <= size; i++) {
            int numb = i % n;
            int space = bigSpace - i / n;

            boolean star = numb > space && numb <= (n - space);
            System.out.print(star ? "*" : " ");
            System.out.print(numb == 0 ? "\n" : "");
        }
    }
}
```
result : input 9
```java
    *    
   ***   
  *****  
 ******* 
*********
```
<h3>Example2</h3>
```java
package com.blogspot.na5cent.pyramid;

/**
 * @author redcrow
 */
public class Example2 {

    private static void walk(int max, int running, boolean deep) {
        if (deep) {
            walk(running, 1, false);
        } else {
            System.out.print(running + " ");
        }

        if (running == max) {
            if (!deep) {
                System.out.println("");
            }
            return;
        }

        walk(max, ++running, deep);
        if (deep) {
            walk(running - 1, 1, false);
        }
    }

    public static void main(String[] args) {
        walk(7, 1, true);
    }
}
```
result
```java
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```
