import java.util.HashMap;
import java.util.Objects;

// 👇 Step 1: Create a Student class with id and name
class Student {
    int id;
    String name;

    // Constructor to create Student object
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 👇 Step 2: Override equals() to compare values instead of reference
    @Override
    public boolean equals(Object o) {
        // Step 2.1: Check if both objects point to same memory
        if (this == o) return true;

        // Step 2.2: Check if the incoming object is null or not of type Student
        if (o == null || getClass() != o.getClass()) return false;

        // Step 2.3: Typecast o to Student to access its fields
        Student student = (Student) o; // Make a Student type reference called student, and point it to o, after treating o as Student.

        // Step 2.4: Compare id and name values
        return id == student.id && name.equals(student.name);
    }

    // 👇 Step 3: Override hashCode() to return same hash for same data
    @Override
    public int hashCode() {
        // This ensures that two Students with same id and name go to same bucket
        return Objects.hash(id, name);

            // return Objects.hash(id, name);
            // ↓
            // return Arrays.hashCode(new Object[]{id, name});
            // ↓
            // new Object[]{id, name} ~ ~ Object[] = { 1, "Rishav" }
            // ↓
            // arr = [
            // 0 index → Integer(1)
            // 1 index → String("Rishav")
            // ]
            // ↓
            // int result = 1;
            // for (Object element : array) {
            //     result = 31 * result + (element == null ? 0 : element.hashCode());
            // }
            // return result;
            // ↓ 
            // result = 1
            // → result = 31*1 + 1 = 32
            // → result = 31*32 + "Rishav".hashCode() ~~ result = 31 * 32 + 72440743 = 99666415
            // → final combined hashCode() ~~ 99666415
        
    }
}

public class J3_1Hashing_equal_hashcode {
    public static void main(String[] args) {
        // 👇 Step 4: Create two Student objects with same values
        Student s1 = new Student(1, "Rishav");
        Student s2 = new Student(1, "Rishav");

        // 👇 Step 5: Check equality and hashCodes
        System.out.println("s1 == s2: " + (s1 == s2));               // false (different objects)
        System.out.println("s1.equals(s2): " + s1.equals(s2));       // true (same values)
        System.out.println("s1.hashCode(): " + s1.hashCode());       // same
        System.out.println("s2.hashCode(): " + s2.hashCode());       // same

        // 👇 Step 6: Use HashMap to store and retrieve data
        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "Coder");

        // 👇 Step 7: Try to get value using s2
        String result = map.get(s2);  // ✅ Works now because equals() and hashCode() match
        System.out.println("Result from map.get(s2): " + result); // "Coder"
    }
}

