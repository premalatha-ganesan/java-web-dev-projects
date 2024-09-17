public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa){
                this.name = aName;
                this.studentId = aStudentId;
                this.numberOfCredits = aNumberOfCredits;
                this.gpa = aGpa;
        }
        public String getName(){
                return name;
        }
        public void setName(String name){
                this.name = name;
        }

        public int getStudentId(){
                return studentId;
        }
        public void setStudentId(int studentId){
                this.studentId = studentId;
        }

        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa(){
                return gpa;
        }
        public void setStudentId(double gpa){
                this.gpa = gpa;
        }



}
