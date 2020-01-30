package TEST2_CSC8001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monitoring {
    private List<Observatory> observatory = new ArrayList<Observatory>();

    public Monitoring() {
    }

    public Monitoring(List<Observatory> observatory) {
        this.observatory = new ArrayList<Observatory>(observatory);
    }

    public List<Observatory> getObservatory() {
        return observatory;
    }

    public void setObservatory(List<Observatory> observatory) {
        this.observatory = new ArrayList<Observatory>(observatory);
    }
    //定义方法：查看所有的observatory信息

    public static void Check_observatory(Monitoring monitoring) {

        for (Observatory ob_check : monitoring.getObservatory()) {
            System.out.println("Name_observatory: " + ob_check.getName_observatory());
            System.out.println("Name_locatedCountry: " + ob_check.getName_locatedCountry());
            System.out.println("Year_start: " + ob_check.getYear_start());
            System.out.println("Area_cover: " + ob_check.getArea_cover());
            System.out.println("-------");
        }
    }

    //定义方法：查看所有的earthquake信息
    public static void Check_earthquake(Monitoring monitoring) {
        for (Observatory ob : monitoring.getObservatory()) {
            if(ob.getEarthquake() != null) {
                for (Earthquake e : ob.getEarthquake()) {
                    System.out.println("Position: " + e.getPosition());
                    System.out.println("Magnitude: " + e.getMagnitude());
                    System.out.println("Year_of_event: " + e.getYear_of_event());
                    System.out.println("Recorded by " + ob.getName_observatory());
                    System.out.println("----------------");
                }
            }
        }
    }

    //定义方法：返回具有平均地震值最大的observatory

    public static void MaxAverage_observatory(Monitoring monitoring) {
        Observatory observatory_max = new Observatory();
        double max = 0;
        for (Observatory ob: monitoring.getObservatory() ) {
                if(ob.Average_earthquake(ob) > max) {
                    max = ob.Average_earthquake(ob);
                    observatory_max = ob;
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

    public static void MaxALL_earthquake(Monitoring monitoring) {
        Earthquake max = new Earthquake();
        List<Earthquake> list_e = new ArrayList<Earthquake>();
        for (Observatory ob : monitoring.getObservatory()) {
            for (int i = 0; i < ob.getEarthquake().size(); i++) {
                Earthquake e = ob.getEarthquake().get(i);
                if (e.getMagnitude() >= max.getMagnitude()) {
                    max = e;
                }
            }
        }
        for (Observatory ob1: monitoring.getObservatory()) {
            for (Earthquake ee: ob1.getEarthquake()) {
                if(ee.getMagnitude() >= max.getMagnitude()) {
                    list_e.add(ee);
                }
            }
        }
        for (Earthquake eee : list_e) {
            System.out.println("Earthquake with Max_Magnitude in monitoring: ");
            System.out.println("Position: " + eee.getPosition());
            System.out.println("Magnitude: " + eee.getMagnitude());
            System.out.println("Year_of_event: " + eee.getYear_of_event());
        }

    }

    //定义方法：输入一个地震值，返回所有记录的地震值大于输入值的地震信息

    public static void All_bigger_mag_earthquake(Monitoring monitoring) {
        ArrayList<Earthquake> list_bigger = new ArrayList<Earthquake>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the magnitude value: ");
        double magnitude_input = sc.nextDouble();
        for (Observatory ob : monitoring.getObservatory()) {
            for (int i = 0; i < ob.getEarthquake().size(); i++) {
                Earthquake e = ob.getEarthquake().get(i);
                if(e.getMagnitude() > magnitude_input) {
                    list_bigger.add(e);
                }
               /* if (e.getMagnitude() > magnitude_input) {
                    System.out.println("Position: " + e.getPosition());
                    System.out.println("Magnitude: " + e.getMagnitude());
                    System.out.println("Year_of_event: " + e.getYear_of_event());
                    System.out.println("----------------");
                }*/
            }
        }
        if(list_bigger.size() == 0){
            System.out.println("There is no earthquake which magnitude is higher than: " + magnitude_input);
        }else {
            for (Earthquake e : list_bigger) {
                System.out.println("Position: " + e.getPosition());
                System.out.println("Magnitude: " + e.getMagnitude());
                System.out.println("Year_of_event: " + e.getYear_of_event());
                System.out.println("----------------");
            }
        }
    }

    //定义方法：添加新的observatory信息

    public static void Add_observatory(Monitoring monitoring) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Observatory ob = new Observatory();

        System.out.println("Please set the name of observatory: ");
        String input_name = sc.nextLine();
        ob.setName_observatory(input_name);

        System.out.println("Please set the country of observatory: ");
        String input_country = sc.nextLine();
        ob.setName_locatedCountry(input_country);

        System.out.println("Please set the started year of observatory: ");
        int input_year_start = sc.nextInt();
        ob.setYear_start(input_year_start);

        System.out.println("Please set the covered area of observatory: ");
        String input_area = sd.nextLine();
        ob.setArea_cover(input_area);

        ob.setEarthquake(new ArrayList<Earthquake>());
        System.out.println("--------");
        monitoring.getObservatory().add(ob);
        System.out.println("Add finished");




    }

    //定义方法：实现在控制台新添加地震信息

    public static void Add_earthquake(Monitoring monitoring) {
        Scanner sc = new Scanner(System.in);
        Earthquake e = new Earthquake();

        System.out.println("Please set the position of earthquake: ");
        System.out.println("( For example: 35.897 N , 12.234 W ) ");
        String input_position = sc.nextLine();
        e.setPosition(input_position);
        System.out.println("Please set the magnitude of earthquake: ");
        double input_magnitude = sc.nextDouble();
        e.setMagnitude(input_magnitude);
        System.out.println("Please set the year of earthquake: ");
        int input_year_of_event = sc.nextInt();
        e.setYear_of_event(input_year_of_event);
        System.out.println("Please select the number of observatory: ");
        for(int i = 0; i < monitoring.getObservatory().size(); i++) {
            System.out.println(i+1 + "----" + monitoring.getObservatory().get(i).getName_observatory());
        }
        int input_observatory = sc.nextInt();
        monitoring.getObservatory().get(input_observatory-1).getEarthquake().add(e);
        System.out.println("Add finished");

    }

}
