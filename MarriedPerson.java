public class MarriedPerson extends Person { 
    private int children; 
    public MarriedPerson(String lastname, String firstname, int age, float salary, int children) 
    {     super(lastname, firstname, age, true, salary);     this.children = children;  }
      public int getNoOfChildren() { return children; }    }