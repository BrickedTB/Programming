package printname;

    public class Name 
    {
    String first;
    String last;
    String middle;
    

public Name()
{
    first = " ";
    last = " ";
    middle = " ";
}

public Name(String firstName, String lastName, String middleName)
{
    first = firstName;
    last = lastName;
    middle = middleName;
}

public String getFirstName()
{
return first;
}

public String getMiddleName()
{
return middle;
}

public String getLastName()
{
return last;
}
}
      
