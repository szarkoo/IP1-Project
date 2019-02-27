package ip1_v2;
public class Therapist {
    private String firstName;
    private String lastName;
    private String therapyType;
    private String therapistId;
public Therapist(String firstName,String lastName,String therapyType)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.therapyType = therapyType;
    this.therapistId = setId();
}
public String getFirstName()
{
    return firstName;
}
public String getLastName()
{
    return lastName;
}
public String getTherapyType()
{
    return therapyType;
}
public String getTherapistId()
{
    return therapistId;
}
public void setFirstName(String firstName)
{
    this.firstName = firstName;
}
public void setLastName(String lastName)
{
    this.lastName = lastName;
}
public void setTherapyType(String therapyType)
{
    this.therapyType = therapyType;
}
public void setTherapistId(String therapistId)
{
    this.therapistId = therapistId;
}
public final String setId ()
{
    therapistId = Character.toString(firstName.charAt(0)) + lastName + 
    Character.toString(therapyType.charAt(0)) + Character.toString(therapyType.charAt(1));
    return therapistId;
}
}