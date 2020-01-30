package TEST_CSC8001;

import java.util.ArrayList;
import java.util.Scanner;

public class Monitoring {


    //定义方法：查看所有的observatory信息

    public static void check_observatory(ArrayList<Observatory> array_Monitoring) {

        for (Observatory ob_check : array_Monitoring) {
            System.out.println("Name_observatory: " + ob_check.getName_observatory());
            System.out.println("Name_locatedCountry: " + ob_check.getName_locatedCountry());
            System.out.println("Year_start: " + ob_check.getYear_start());
            System.out.println("Area_cover: " + ob_check.getArea_cover());
            System.out.println("-------");
        }
    }

    //定义方法：查看所有的earthquake信息
    public static void check_earthquake(ArrayList<ArrayList<Earthquake>> arr_Monitoring) {
        for (ArrayList<Earthquake> arr_observatory : arr_Monitoring) {
            for (Earthquake e : arr_observatory) {
                System.out.println("Position: " + e.getPosition());
                System.out.println("Magnitude: " + e.getMagnitude());
                System.out.println("Year_of_event: " + e.getYear_of_event());
                System.out.println("----------------");
            }
        }
    }

    //定义方法：返回具有平均地震值最大的observatory(！！！！！)

    public static void maxAverage_observatory(ArrayList<ArrayList<Earthquake>> array_Monitoring,ArrayList<Observatory> array_monitoring ) {
        ArrayList<Earthquake> arr_observatory = new ArrayList<Earthquake>();
        Observatory observatory_max = new Observatory();
        Observatory observatory = new Observatory();
        double max = 0;
        for(int i = 0; i < array_Monitoring.size(); i++) {
            if(observatory.average_earthquake(array_Monitoring.get(i)) > max) {
                max = observatory.average_earthquake(array_Monitoring.get(i));
                observatory_max = array_monitoring.get(i);
            }
        }
        System.out.println("The observatory with the largest average earthquake magnitude: ");
        System.out.println("--------");
        System.out.println("Average Magnitude:" + max);
        System.out.println("Name_observatory: " + observatory_max.getName_observatory());
        System.out.println("Name_locatedCountry: " + observatory_max.getName_locatedCountry());
        System.out.println("Year_start: " + observatory_max.getYear_start());
        System.out.println("Area_cover: " + observatory_max.getArea_cover());
    }


    //定义方法：返回所有记录的最大的地震值地震信息

    public static void maxALL_earthquake(ArrayList<ArrayList<Earthquake>> array_Monitoring) {
        Earthquake max = new Earthquake();
        for (ArrayList<Earthquake> array : array_Monitoring) {
            for (int i = 0; i < array.size(); i++) {
                Earthquake e = array.get(i);
                if (e.getMagnitude() > max.getMagnitude()) {
                    max = e;
                }
            }
        }
        System.out.println("Earthquake with Max_Magnitude in monitoring: ");
        System.out.println("Position: " + max.getPosition());
        System.out.println("Magnitude: " + max.getMagnitude());
        System.out.println("Year_of_event: " + max.getYear_of_event());

    }

    //定义方法：输入一个地震值，返回所有记录的地震值大于输入值的地震信息

    public static void All_bigger_mag_earthquake(ArrayList<ArrayList<Earthquake>> array_Monitoring) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the magnitude value: ");
        double magnitude_input = sc.nextDouble();
        for (ArrayList<Earthquake> array : array_Monitoring) {
            for (int i = 0; i < array.size(); i++) {
                Earthquake e = array.get(i);
                if (e.getMagnitude() > magnitude_input) {
                    System.out.println("Position: " + e.getPosition());
                    System.out.println("Magnitude: " + e.getMagnitude());
                    System.out.println("Year_of_event: " + e.getYear_of_event());
                    System.out.println("----------------");
                }
            }
        }
    }

    //定义方法：添加新的observatory信息

    public static Observatory add_observatory(ArrayList<Observatory> array_Monitoring) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Observatory observatory = new Observatory();

        System.out.println("Please set the name of observatory: ");
        String input_name = sc.nextLine();
        observatory.setName_observatory(input_name);

        System.out.println("Please set the country of observatory: ");
        String input_country = sc.nextLine();
        observatory.setName_locatedCountry(input_country);

        System.out.println("Please set the started year of observatory: ");
        int input_year_start = sc.nextInt();
        observatory.setYear_start(input_year_start);

        System.out.println("Please set the covered area of observatory: ");
        String input_area = sd.nextLine();
        observatory.setArea_cover(input_area);

        System.out.println("--------");
        array_Monitoring.add(observatory);
        System.out.println("Add finished");

        return observatory;

    }

}
