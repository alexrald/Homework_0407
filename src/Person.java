public class Person {

    // Class fields
    private String name;
    private int age;
    private String hairColor;

    public Person(String name, int age, String hairColor)
    {
        this.name       = name;
        this.age        = age;
        this.hairColor  = hairColor;
    }

    public Person()
    {
        this.name       = "John Doe";
        this.age        = 30;
        this.hairColor  = "brown";
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public String getHairColor()
    {
        return this.hairColor;
    }
}
