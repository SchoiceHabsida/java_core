public class Task_6_3_10 {
    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Passing a test task.";
        }
        public void study() {
            System.out.println("I'm very busy. " + studying);
        }
    }

    //here your code
}