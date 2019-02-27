
package ip1_v2;
import java.util.Date;
public class Patient 
{
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    
public Patient(String firstName,String lastName, Date dateOfBirth)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
}
public String getFirstName()
{
    return firstName;
}
public String getLastName()
{
    return lastName;
}
public Date getDateOfBirth()
{
    return dateOfBirth;
}
public void setFirstName(String firstName)
{
    this.firstName = firstName;
}
public void setLastName(String lastName)
{
    this.lastName = lastName;
}
public void setDateOfBirth(Date dateOfBirth)
{
    this.dateOfBirth = dateOfBirth;
}
}
