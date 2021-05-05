// This Class represents the attributes of the Jobs in File CSV
public class JobDetails
{
    // Define attributes
    private String title;
    private String company;
    private String location;
    private String type;
    private String level;
    private String yearsExp;
    private String country;
    private String skills;


    // Define Constructor
    public JobDetails(String title, String company,String location,String type
              ,String level,String yearsExp,String country, String skills  )
    {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsExp = yearsExp;
        this.country = country;
        this.skills = skills;

    }


    // Setter Functions
    public void setTitle(String userTitle)
    {
        this.title = userTitle;
    }
    public void setCompany(String userCompany)
    {
        this.company = userCompany;
    }
    public void setLocation(String userLocation)
    {
        this.location = userLocation;
    }
    public void setType(String userType)
    {
        this.type = userType;
    }
    public void setLevel(String userLevel)
    {
        this.level = userLevel;
    }
    public void setYearsExp(String userYearsExp)
    {
        this.yearsExp = userYearsExp;
    }
    public void setCountry(String userCountry)
    {
        this.country = userCountry;
    }
    public void setSkills(String userSkills)
    {
        this.skills = userSkills;
    }


    // Getters Functions
    public String getTitle()
    {
       return title;
    }
    public String getCompany()
    {
        return company;
    }
    public String getLocation()
    {
        return location;
    }
    public String getType()
    {
        return type;
    }
    public String getLevel()
    {
        return level;
    }
    public String getYearsExp()
    {
       return yearsExp;
    }
    public String getCountry()
    {
        return country;
    }
    public String getSkills()
    {
        return skills;
    }


    // Style Printing
    @Override
    public String toString()
    {

        return "Job {" + "Job Title = " + title
                + ", Job Company = " + company
                +", Job Location = " + location
                + ", Job Type = " + type
                + ", Job Level = " + level
                + " Years Exp = " + yearsExp
                + " Country = " + country
                + " Skills = " + skills + '}';
    }


}
