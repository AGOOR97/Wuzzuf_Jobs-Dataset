# Wuzzuf_Jobs Dataset



-Using  Wuzzuf_Jobs
dataset, This dataset includes 4380 Jobs with attributes such as Title, Company, Location, Type, Level,YearsExp, etc.

https://www.kaggle.com/omarhanyy/wuzzuf-jobs

1- Writing class JobDetails that represent the WUZZUF dataset.



2- Writing a class IO that will perform reading dataset from csv file through the following method:

          a-List<JobDetails> ReadCSVFile(String FileName) which return a list of JobDetails and take a string of file name as an input.



3- Write a class JobsDataService that will perform some  filtering on the Job data through the following methods:  

        a-FilterJobsByTitle(List <JobDetails> jobs) which output the list of Job Titles and Job popularity(i.e. frequency of job titles) in the console.

        b-FilterJobsByCountry(List <JobDetails> jobs) which output the list of Country and Job demand (i.e. frequency of jobs related to country) in the console.

        c-FilterJobsByLevel(List <JobDetails> jobs) which output the list of Level and popularity(i.e. frequency of job Level) in the console.

        d-LinkedHashMap<String, Long> sortMap(Map<String, Long> map) Returns the ascending sorted map by its value of the Map given as an argument.

        e-FilterJobsByYearsExp(List <JobDetails> jobs) which output the a sorted list of YearsExp and popularity(i.e. frequency of job YearsExp) 
                                                          in the console using sortMap function.



 4- Write a class named TestWuzzufJobs with a test() method that will contain the following use cases :

        a-Call to the ReadCSVFile() by passing file location as string, and return the Jobs list.

        b-Call to the FilterJobsByCountry() on the Jobs list that resulted from the ReadCSVFile() call, with output country popularity in the console.

        c-Call to the FilterJobsByLevel() on the Jobs list that resulted from the ReadCSVFile() call, with output Level popularity in the console.

        d-Call FilterJobsByTitle() on the Jobs list that resulted from the ReadCSVFile() call, with output Title popularity in the console.

        e-Call to FilterJobsByYearsExp() on the Jobs list that resulted from the ReadCSVFile() call, with output Yars of Exprience popularity in the console.

 
5-E-Invoke that test() method in the main method of your launcher class.

 
>>>>>>>>> Dataset URL: https://www.kaggle.com/omarhanyy/wuzzuf-jobs?select=Wuzzuf_Jobs.csv
