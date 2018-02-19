package Task2;

public class Credentials
{
    private final String name;
    private String password;
    private String[] pastPasswords ;
    private int passwordIndex;

    public Credentials(String name, String password)
    {
        this.name = name;
        this.password = password;
        pastPasswords = new String[100];
        passwordIndex = 0;
        pastPasswords[0] = password;
    }

    public boolean getPassword(String pwd)
    {
        if (pwd.equals(this.password))
            return true;
        else
            return false;
    }

    public String getName()
    {
        return name;
    }

    public boolean setPassword(String currentPassword, String newPassword)
    {
         if(!searchOldPasswords(newPassword) && getPassword(currentPassword))
         {
             this.password = newPassword;
             passwordIndex++;
             pastPasswords[passwordIndex] = newPassword;
             return true;
         }
         else
             return false;
    }

    private boolean searchOldPasswords(String newPassword)
    {
        for (int i = 0; i <= passwordIndex; i++)
        {
            if (this.pastPasswords[i].equals(newPassword))
                return true;
        }
        return false;
    }
}
