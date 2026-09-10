package Study_Brod;

import fileworks.DataExport;
import fileworks.DataImport;

public class ParseFile {
    public static void main(String[] args){
        String path = "data/countries.txt";
        DataImport  di = new DataImport(path);

        /*while (di.hasNext()){
            System.out.println(di.readLine());
        }

        String name;
        String continent;
        long population;
        double avgAge;

        String line = di.readLine();
        String[] tokens = line.split(";");

        name = tokens[0];
        continent = tokens[1];
        population = Long.parseLong( tokens[2]);
        avgAge = Double.parseDouble(tokens[3]);

        Country oneCountry = new Country(name, continent, population, avgAge);

        System.out.println(name);
        System.out.println(continent);
        System.out.println(population);
        System.out.println(avgAge);*/

        //Country czechia = new Country("Czech Republic", "Europe", 10_000_000, 85);

        /*DataExport de = new DataExport("output.txt");

        while(di.hasNext()){

            String line = di.readLine();
            String[] tokens = line.split(";");

            String name = tokens[0];
            String continent = tokens[1];
            long population = Long.parseLong(tokens[2]);
            double avgAge = Double.parseDouble(tokens[3]);

            Country onecountry = new Country(name, continent, population, avgAge);

            System.out.println(onecountry);

            if(onecountry.continent.equals("Europe")) {
                de.writeLine(onecountry.toString());
            }

        }*/

        String nameMaxAvgAge = "";
        double maxAvgAge = 0;
        String nameMinPopulation = "";
        long minPopulation = 0;

        while(di.hasNext()){

            String line = di.readLine();
            String[] tokens = line.split(";");

            String name = tokens[0];
            long population = Long.parseLong(tokens[2]);
            double avgAge = Double.parseDouble(tokens[3]);

            if (maxAvgAge<avgAge) {
                nameMaxAvgAge = name;
                maxAvgAge = avgAge;
            }
            if (minPopulation>population){
                nameMinPopulation = name;
                minPopulation = population;
            }
            else if (minPopulation==0) {
                minPopulation = population;
            }
        }

        System.out.println(nameMinPopulation);
        System.out.println(minPopulation);
        System.out.println(nameMaxAvgAge);
        System.out.println(maxAvgAge);

        //de.finishExport();
        di.finishImport();

    }
}
