public class Customer {
    private String name;
    private int age;
    // constructor 
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Customer(Customer other) {
        this.name=other.name;
        this.age= other.age;
    }
    //methods Get age 
	public int getAge()
	{
		return age;
	}
	
	// method Sets  age 
	public void setAge(int age)
	{
		this.age = age;
	}
    //method Gets the  name 
	public String getName()
	{
		return name;
	}
	
	// methods Sets the  name 
	public void setName(String name)
	{
		this.name = name;
	}
	

    @Override
    public String toString() {
       return "Customer Name: " + name + ", Age: " + age;
    }
}