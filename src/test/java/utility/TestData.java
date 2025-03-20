package utility;

public class TestData 
{
	private String page_url;
	private String standard_user_name;
	private String performance_user_name;
	private String password;
	private String first_name;
	private String last_name;
	private String postal_code;
	
	public TestData(String page_url,String standard_user_name,String performance_user_name,String password, String first_name,String last_name, String postal_code)
	{
		this.page_url=page_url;
		this.standard_user_name=standard_user_name;
		this.performance_user_name=performance_user_name;
		this.password=password;
		this.first_name=first_name;
		this.last_name=last_name;
		this.postal_code=postal_code;
	}
	
	public String getpageurl()
	{
		return page_url;
	}
	
	public void setpageurl(String page_url)
	{
		this.page_url=page_url;
	}
	
	public String getstandard_username()
	{
		return standard_user_name;
	}
	
	public void setstandard_username(String standard_user_name)
	{
		this.standard_user_name=standard_user_name;
	}
	public String getperformance_username()
	{
		return performance_user_name;
	}
	
	public void setperformance_username(String performance_user_name)
	{
		this.performance_user_name=performance_user_name;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getFirstname()
	{
		return first_name;
	}
	public void setFirstname(String first_name)
	{
		this.first_name=first_name;
	}
	public String getLastname()
	{
		return last_name;
	}
	public void setLastname(String last_name)
	{
		this.last_name=last_name;
	}
	public String getPostalcode()
	{
		return postal_code;
	}
	public void setPostalcode(String postal_code)
	{
		this.postal_code=postal_code;
	}
}
