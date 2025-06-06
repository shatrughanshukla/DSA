import java.util.Scanner;
public class NotesnCharTrafficLight {
    public static void main(String[] str)
    {
        Scanner Sc = new Scanner(System.in);
        try{
            char col = Sc.next().charAt(0);
            if(col == 'G')
            {
                System.out.println("Go Green");
            }
            else if(col == 'Y')
            {
                System.out.println("Wait");
            }
            else if(col == 'R')
            {
                System.out.println("Stop");
            }
            else{
                System.out.println("Not a valid colour for traffic light");
            }
        }finally{
            Sc.close();
        }
    }
}
/*
 * The `Scanner` class in Java provides several methods to read different types of input. Below is a complete explanation of all the major `next` methods available in `Scanner`, along with when and where to use them.

---

## 📝 **Scanner Methods and Their Usage**
| **Method**        | **Data Type Read** | **Stops at** | **When to Use?** |
|------------------|-----------------|------------|----------------|
| `next()`         | String (single word) | Space, tab, newline | When reading a **single word** input |
| `nextLine()`     | String (entire line) | Newline (`\n`) | When reading a **full sentence or paragraph** |
| `nextInt()`      | int (integer) | Space, newline | When reading an **integer number** |
| `nextLong()`     | long (large integer) | Space, newline | When reading a **large integer number** |
| `nextFloat()`    | float (decimal) | Space, newline | When reading a **small decimal number** (single precision) |
| `nextDouble()`   | double (decimal) | Space, newline | When reading a **large decimal number** (double precision) |
| `nextBoolean()`  | boolean (`true` or `false`) | Space, newline | When reading a **boolean value** (like a yes/no response) |
| `nextByte()`     | byte (-128 to 127) | Space, newline | When reading a **small integer value** (1-byte) |
| `nextShort()`    | short (-32,768 to 32,767) | Space, newline | When reading a **small integer** (2-byte) |

---

## 📌 **1️⃣ `next()` – Read a Single Word**
- Reads a single **word** (token).
- Stops reading at **space, tab, or newline**.
- Does **not** include spaces.

### ✅ **Example Usage:**
```java
import java.util.Scanner;

public class NextExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.next();  // Reads only the first word
        
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
```
🔹 **Best for:** Reading **one-word** inputs like first name, single-word commands.

❌ **Problem:** If you enter `"John Doe"`, it will only read `"John"` and ignore `"Doe"`.

---

## 📌 **2️⃣ `nextLine()` – Read a Full Line**
- Reads an **entire line** including spaces.
- Stops reading when the user **presses Enter** (`\n`).

### ✅ **Example Usage:**
```java
import java.util.Scanner;

public class NextLineExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();  // Reads the entire line

        System.out.println("Hello, " + fullName + "!");
        sc.close();
    }
}
```
🔹 **Best for:** Full names, addresses, sentences, multiline inputs.

❗ **Common Issue:** If `nextLine()` is used **after `nextInt()`, `nextDouble()`**, etc., it may skip input. Use `sc.nextLine()` **after numeric inputs** to consume the leftover newline.

---

## 📌 **3️⃣ `nextInt()` – Read an Integer**
- Reads an **integer number** (`int`).
- Stops at **space, tab, or newline**.
- Will throw **InputMismatchException** if a non-integer is entered.

### ✅ **Example Usage:**
```java
import java.util.Scanner;

public class NextIntExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Reads an integer

        System.out.println("You are " + age + " years old.");
        sc.close();
    }
}
```
🔹 **Best for:** Age, quantity, count-based inputs.

❗ **Common Issue:** If you enter `"25 years"`, it will throw an error because `"years"` is not an integer.

✅ **Fix:** Use `sc.hasNextInt()` before reading:
```java
if (sc.hasNextInt()) {
    int age = sc.nextInt();
}
```

---

## 📌 **4️⃣ `nextLong()` – Read a Large Integer**
- Reads a **large integer** (`long`).
- Used when `int` is **not big enough**.

### ✅ **Example Usage:**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your phone number: ");
long phone = sc.nextLong();
System.out.println("Phone Number: " + phone);
sc.close();
```
🔹 **Best for:** Phone numbers, large IDs.

---

## 📌 **5️⃣ `nextFloat()` and `nextDouble()` – Read Decimal Numbers**
- `nextFloat()` is for **small decimal values** (single precision, ~7 digits).
- `nextDouble()` is for **large decimal values** (double precision, ~15 digits).

### ✅ **Example Usage:**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your height in meters: ");
float height = sc.nextFloat();
System.out.println("Height: " + height + " meters.");
sc.close();
```
🔹 **Best for:** Heights, weights, percentages.

---

## 📌 **6️⃣ `nextBoolean()` – Read Boolean (`true`/`false`)**
- Accepts **`true` or `false`** as input.
- Will **throw an error** if input is not `true` or `false`.

### ✅ **Example Usage:**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Are you a student? (true/false): ");
boolean isStudent = sc.nextBoolean();
System.out.println("Student status: " + isStudent);
sc.close();
```
🔹 **Best for:** Yes/No choices.

---

## 📌 **7️⃣ `nextByte()` and `nextShort()` – Read Small Integers**
- `nextByte()` reads small values (`-128 to 127`).
- `nextShort()` reads slightly larger values (`-32,768 to 32,767`).

### ✅ **Example Usage:**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter a small number: ");
byte smallNumber = sc.nextByte();
System.out.println("You entered: " + smallNumber);
sc.close();
```
🔹 **Best for:** Small memory-efficient number inputs.

---

## 🔥 **Common Issues & Fixes**
### ❗ **Issue: `nextLine()` Skipping Input After `nextInt()`**
```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter age: ");
int age = sc.nextInt(); 
System.out.print("Enter name: ");
String name = sc.nextLine();  // This gets skipped!
```
✅ **Fix:** Use `sc.nextLine()` to consume the leftover newline.
```java
int age = sc.nextInt();
sc.nextLine();  // Consume the newline
String name = sc.nextLine();
```

---

## 🎯 **Final Summary**
| **Method** | **Best for** |
|-----------|-------------|
| `next()` | Single word inputs (name, city, command) |
| `nextLine()` | Full sentences, addresses, multi-word input |
| `nextInt()` | Whole numbers (age, count, year) |
| `nextLong()` | Large whole numbers (phone, IDs) |
| `nextFloat()` | Small decimal numbers (height, CGPA) |
| `nextDouble()` | Large decimal numbers (salary, distance) |
| `nextBoolean()` | Yes/No type inputs (true/false) |
| `nextByte()` | Very small numbers (-128 to 127) |
| `nextShort()` | Small numbers (-32,768 to 32,767) |

Let me know if you need any clarifications! 🚀
 */