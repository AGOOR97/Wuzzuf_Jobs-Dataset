import java.util.List;

public class TestWuzzufJobs
{

    // this Function calls to do all Jobs required
    // Coded By MOHAMMED AGOOR
    public void test()
    {
        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

        // This Function Calls to print Csv File
        System.out.println("==================== Read CSV File =====================");
        IO readCsv = new IO();
        List<JobDetails> allJobsReturned = readCsv.readCSVFile("Wuzzuf_Jobs.csv");
        for(JobDetails job :allJobsReturned)
        {
            System.out.println(job);
        }

        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

        // This Function Calls JobDataService , printing Title with Number of Frequencies of Title
        System.out.println("================ Filter Jobs By Title =================");
        JobDataService jobsTitle = new JobDataService();
        jobsTitle.FilterJobsByTitle("Wuzzuf_Jobs.csv");

        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

        // This Function Calls JobDataService , printing Country with Number of Frequencies of Country
        System.out.println("================ Filter Jobs By Country =================");
        JobDataService jobsCountry = new JobDataService();
        jobsCountry.FilterJobsByCountry("Wuzzuf_Jobs.csv");

        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

        // This Function Calls JobDataService , printing Levels with Number of Frequencies of levels
        System.out.println("================ Filter Jobs By Levels =================");
        JobDataService jobsLevels = new JobDataService();
        jobsLevels.FilterJobsByLevel("Wuzzuf_Jobs.csv");

        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

        // This Function Calls JobDataService , printing YearsExp with Number of Frequencies of levels
        // making sorting by frequencies and removing dublicates
        System.out.println("================ Sorted Year Exp and Filter =================");
        JobDataService yearsExp = new JobDataService();
        jobsLevels.FilterJobsByYearsExp("Wuzzuf_Jobs.csv");

        System.out.println("================ CODED BY MOHAMMED AGOOR =================");
        System.out.println("");

    }
}
