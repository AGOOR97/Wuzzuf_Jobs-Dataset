import java.util.*;
import java.io.*;

public class IO
{
    // Define empty Constructor
    public IO(){}

    // this Function is to return new Object of the Class JobDetails
    public JobDetails createOneJob(String[] jobData)
    {
        String title = jobData[0];
        String company = jobData[1];
        String location =  jobData[2];
        String type = jobData[3];
        String level = jobData[4];
        String yearsExp =  jobData[5];
        String country = jobData[6];
        String skills =  jobData[7];

        // Create and return Job of this jobData
        return new JobDetails(title, company, location,type,level,yearsExp,country,skills);
    }


    // this Function is to get All Jobs Calling the above Function which create each One Job
    public List<JobDetails> readCSVFile(String fileName)
    {
        List<JobDetails> allJobs = new ArrayList<>();

        // create an instance of BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            // read the first line from the text file which will be head column
            // read first line

            String line = br.readLine();
            if (line != null)
            {
                line = br.readLine();
            }

            line = br.readLine();
            while (line != null)
            {

                String [] attributes  = line.split(",");
                JobDetails eachOneJob = createOneJob(attributes);
                allJobs.add(eachOneJob);
                line = br.readLine();
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }

        return allJobs;
    }


}
