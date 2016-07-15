

public class LoginDao {
	public boolean IsvalidUser(String uname,String pwd)
	{
		if(uname.equals(pwd))
			return true;
		else 
			return false;
	}

}
