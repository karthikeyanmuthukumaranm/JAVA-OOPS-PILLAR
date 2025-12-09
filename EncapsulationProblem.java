class Student{
    private String Name;
    private int Age;

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
}

public class EncapsulationProblem {
    public static void main(String[] args){
        Student s = new Student();

        s.setName("Karthikeyan");
        s.setAge(21);

        System.out.println("Name : "+s.getName());
        System.out.println("Age : "+s.getAge());
    }
}
