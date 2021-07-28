package model;

public class Student {

    private String sName;
    private String sGender;
    private int sAge;
    private int sId;

    public String getName(){
        return sName;
    }

    public String getGender(){
        return sGender;
    }

    public int getAge(){
        return sAge;
    }

    public int getId(){
        return sId;
    }

    public void setName(String sName){
        this.sName = sName;
    }

    public void setGender(String sGender){
        this.sGender = sGender;
    }

    public void setAge(int sAge){
        this.sAge = sAge;
    }

    public void setId(int sId){
        this.sId = sId;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Jan Kyle Zulueta");
        s1.setGender("Male");
        s1.setAge(23);
        s1.setId(01);

        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getAge());
        System.out.println(s1.getId());

    }


}

