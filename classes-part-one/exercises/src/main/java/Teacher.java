public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String aFirstName, String aLastName, String aSubject,int aYearsTeaching ){
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.subject = aSubject;
        this.yearsTeaching = aYearsTeaching;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

    public void setFirstName(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }
}

