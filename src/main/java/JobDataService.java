import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class JobDataService
{


    // this Function filter all Job Titles ,    removing Duplicates
    // Printing each Title with Number of its frequencies
    public void FilterJobsByTitle(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[0]);

            }

            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));

                System.out.println(addList.get(i) + " with Number of Frequencies =  " + frequency);

                for (int j = 1 ; j < addList.size(); j++)
                {

                    // after getting title and frequency , remove it from list
                    if(addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);

                    }
                }
            }


            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }



    // this Function filter all Country  ,    removing Duplicates
    // Printing each Country with Number of its frequencies
    public void FilterJobsByCountry(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[6]);
            }


            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));
                System.out.println(addList.get(i) + " with Number of Frequencies =  " + frequency);

                for (int j = addList.size() - 1; j > i; j--)
                {
                    if (j == i)
                    {
                        continue;
                    }

                    // after getting country and frequency , remove it from list
                    if (addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);
                    }

                }

            }

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }


    }


    // this Function filter all Levels  ,    removing Duplicates
    // Printing each Level with Number of its frequencies
    public void FilterJobsByLevel(String CSVFile)
    {
        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[4]);
            }


            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));


                for (int j = addList.size() - 1; j > i; j--)
                {
                    if (j == i)
                    {
                        continue;
                    }

                    // after getting country and frequency , remove it from list
                    if (addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);
                    }
                    if(addList.get(j-i).equals(" San Stefano"))
                    {
                        addList.remove(" San Stefano");

                    }
                    if(addList.get(j-i).equals(" Cairo"))
                    {
                        addList.remove(" Cairo");
                    }
                    if(addList.get(j-i).equals("...\""))
                    {
                        addList.remove("...\"");
                    }
                    if(addList.get(j-i).equals(" Giza"))
                    {
                        addList.remove(" Giza");
                    }
                    if(addList.get(j-i).equals(" Nasr City"))
                    {
                        addList.remove(" Nasr City");
                    }




                }

                System.out.println(addList.get(i) + " >>==  " + frequency);
            }

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }




    }



    // this Function is to sort the required
    public void sortMapFunction(Map<String,Integer> givenToSort)
    {
        Map<String,Integer> toBeSorted = givenToSort;

        Map<String, Integer> newMap =
                toBeSorted.entrySet().stream().collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> entry.getValue()));

        // Sorting HashMap according to Population
        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String,Integer>>(newMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {


            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        for(Map.Entry<String,Integer> item:list)
        {
            System.out.println(item);
        }


    }



    // this Function filter all YearsExp  ,    removing Duplicates
    // Printing each YearsExp with Number of its frequencies
    // Sorting the Years Exp. ascending
    public void FilterJobsByYearsExp(String CSVFile)
    {

        String[] array;
        List<String> addList = new ArrayList<>();
        try
        {
            File file = new File(CSVFile);
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : lines)
            {
                array = line.split(",");
                addList.add(array[5]);

            }

            Map<String,Integer> yearExp = new HashMap<>();
            int frequency = 0;
            for (int i = 1; i < addList.size(); i++)
            {
                frequency = Collections.frequency(addList, addList.get(i));
                yearExp.put(addList.get(i),frequency);

                for (int j = addList.size() - 1; j > i; j--)
                {
                    if (j == i)
                    {
                        continue;
                    }

                    // after getting country and frequency , remove it from list
                    if (addList.get(i).equals(addList.get(j)))
                    {
                        addList.remove(j);
                    }

                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Freelance / Project"))
                    {
                        addList.remove("Freelance / Project");
                    }
                    if(addList.get(j-i).equals("Student"))
                    {
                        addList.remove("Student");
                    }
                    if(addList.get(j-i).equals("Manager"))
                    {
                        addList.remove("Manager");
                    }
                    if(addList.get(j-i).equals("Experienced"))
                    {
                        addList.remove("Experienced");
                    }
                    if(addList.get(j-i).equals("Internship"))
                    {
                        addList.remove("Internship");
                    }
                    if(addList.get(j-i).equals("Full Time"))
                    {
                        addList.remove("Full Time");
                    }
                    if(addList.get(j-i).equals("Senior Management"))
                    {
                        addList.remove("Senior Management");
                    }
                    if(addList.get(j-i).equals("Entry Level"))
                    {
                        addList.remove("Entry Level");
                    }
                    if(addList.get(j-i).equals("Triptab"))
                    {
                        addList.remove("Triptab");
                    }
                }

            }

            sortMapFunction(yearExp);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }




}
