public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
         MutableStudent FirstStudent = new MutableStudent("Sally", 5);

        // TODO: Display the student's original information.
        FirstStudent.displayInfo();

        // TODO: Use the setter methods to change the student's data.
        FirstStudent.setName("Mary");
        FirstStudent.setAge(33);

        // TODO: Display the student again.
        FirstStudent.displayInfo();
        // Question: Did the SAME object change?
        // The info did infact change once i used the setter methods

        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent SecondStudent = new ImmutableStudent("Greg", 69);

        // TODO: Display the student's information.
        SecondStudent.displayInfo();

        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods?


        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable?
        // 2. Which class is immutable?
        // 3. What is the biggest difference you noticed?
    }
}
