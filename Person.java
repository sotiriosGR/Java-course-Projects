public class Person {  private String lastname;
    private String firstname;  
    private int age;
    private boolean married;
    private float salary;    
    public Person (String lastname, String firstname, int age, boolean married, float salary) 
    {    this.lastname = new String(lastname);
        this.firstname = new String(firstname);
        this.age = age;    this.married = married; 
        this.salary = salary;  }   
        public String getLastName() { return lastname; } 
        public String getFirstName() { return firstname; } 
        public int getAge() { return age; }  
        public boolean isMarried() { return married; } 
 public float getSalary() { return salary; }  }