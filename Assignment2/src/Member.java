class Member
{
    private String name;
    private int age;
    private float salary;

    public Member(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public float getSalary()
    {
        return salary;
    }
}

class Member_Variable
{
    public static void main(String args[])
    {
        Member m =new Member("Kalpesh",22,24000);

        System.out.println("Member Name : " + m.getName());
        System.out.println("Member Age : " + m.getAge());
        System.out.println("Member Salary : " + m.getSalary());
    }
}