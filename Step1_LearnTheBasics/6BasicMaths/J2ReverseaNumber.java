/*
 * 7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1
 */

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int sum = 0;
        while(x != 0)
        {
            int rem = x % 10;
            if(sum > Integer.MAX_VALUE / 10 || sum == Integer.MAX_VALUE && rem > 7)
            {
                return 0;
            }
            if(sum < Integer.MIN_VALUE / 10 || sum == Integer.MIN_VALUE && rem < -8)
            {
                return 0;
            }
            sum = (sum * 10) + rem;
            x /= 10;
            rem = 0;
        }
        return sum;
    }
}

public class J2ReverseaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            Solution n = new Solution();
            int rev = n.reverse(num);
            System.out.println(rev);
        }finally{
            sc.close();
        }
    }
}


/*
## 🤯 THE MAIN PROBLEM:

We’re reversing an integer like `1534236469`. But Java’s `int` can hold **only**:

```
-2,147,483,648  to  2,147,483,647
```

To avoid overflow, we **pre-check** before this line runs:

```java
rev = rev * 10 + digit;
```

Because multiplying `rev` by 10 and adding `digit` might cross the int limits.

---

## ✅ FIRST LINE:

```java
if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7))
    return 0;
```

### 🔍 Breakdown:

### 💡 `Integer.MAX_VALUE = 2147483647`

Now `Integer.MAX_VALUE / 10 = 214748364`

So:

#### 🔹 Case 1:

```java
if (rev > 214748364)
```

→ If `rev` is more than `214748364`, then `rev * 10` is already bigger than `2147483640`, and **adding anything (even 0) will overflow**.

#### 🔹 Case 2:

```java
else if (rev == 214748364 && digit > 7)
```

→ Even if `rev * 10` is `2147483640`, adding **any digit > 7** makes it go beyond `2147483647`.

Hence, we `return 0` before actual overflow happens.

---

## ✅ SECOND LINE:

```java
if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8))
    return 0;
```

### 💡 `Integer.MIN_VALUE = -2147483648`

Now `Integer.MIN_VALUE / 10 = -214748364`

#### 🔹 Case 1:

```java
if (rev < -214748364)
```

→ `rev * 10` is already less than `-2147483640`, and any `digit` added will push it past the lower limit (more negative).

#### 🔹 Case 2:

```java
else if (rev == -214748364 && digit < -8)
```

→ We're about to go from `-2147483640` to something like `-2147483649`, which is invalid in Java.

*/