package TEST2_CSC8001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Observatory {
    private String name_observatory;
    private String name_locatedCountry;
    private int year_start;
    private String area_cover;
    private List<Earthquake> earthquake;
    public Observatory() {
    }

    public Observatory(String name_observatory, String name_locatedCountry, int year_start, String area_cover) {
        this.name_observatory = name_observatory;
        this.name_locatedCountry = name_locatedCountry;
        this.year_start = year_start;
        this.area_cover = area_cover;
        this.earthquake = new ArrayList<Earthquake>();
    }

    public String getName_observatory() {
        return name_observatory;
    }

    public void setName_observatory(String name_observatory) {
        this.name_observatory = name_observatory;
    }

    public String getName_locatedCountry() {
        return name_locatedCountry;
    }

    public void setName_locatedCountry(String name_locatedCountry) {
        this.name_locatedCountry = name_locatedCountry;
    }

    public int getYear_start() {
        return year_start;
    }

    public void setYear_start(int year_start) {
        this.year_start = year_start;
    }

    public String getArea_cover() {
        return area_cover;
    }

    public void setArea_cover(String area_cover) {
        this.area_cover = area_cover;
    }

    public List<Earthquake> getEarthquake() {
        return earthquake;
    }

    public void setEarthquake(List<Earthquake> earthquake) {
        this.earthquake = new ArrayList<Earthquake>(earthquake);
    }

    //定义方法，实现返回一个observatory中的平均地震值

    public static double Average_earthquake(Observatory observatory) {
        double sum = 0;
        for(Earthquake e : observatory.getEarthquake()) {
            sum += e.getMagnitude();
        }
        double ave = sum/observatory.getEarthquake().size();
        return ave;
    }

    //定义方法：实现在一个observatory中，找出最大地震值对应的地震

    public static void Max_earthquake(Observatory observatory) {
        List<Earthquake> earthquake = observatory.getEarthquake();
        Earthquake max = new Earthquake();
        List<Earthquake> list_e = new ArrayList<Earthquake>();
        for (Earthquake e: earthquake) {
            if (e.getMagnitude() >= max.getMagnitude()) {
                max = e;
            }
        }
        for (Earthquake ee: earthquake) {
            if (ee.getMagnitude() >=max.getMagnitude()){
                list_e.add(ee);
            }
        }

        for (Earthquake eee : list_e) {
            System.out.println("Earthquake with Max_Magnitude in monitoring: ");
            System.out.println("Position: " + eee.getPosition());
            System.out.println("Magnitude: " + eee.getMagnitude());
            System.out.println("Year_of_event: " + eee.getYear_of_event());
        }
    }


    //定义方法：查看指定observatory中所有earthquake的信息
    public static void Check_earthquak_observatory(Observatory observatory) {
        List<Earthquake> earthquake = observatory.getEarthquake();
        for (Earthquake e : earthquake) {
            System.out.println("Position: " + e.getPosition());
            System.out.println("Magnitude: " + e.getMagnitude());
            System.out.println("Year_of_event: " + e.getYear_of_event());
        }
    }


    //定义方法，实现当在控制台输入一个地震值的时候，返回一个新的列表，
    //这个列表包含在这个observatory中地震值大于想要输入值的所有地震元素。

    public static void Bigger_mag_earthquake(Observatory observatory) {
        List<Earthquake> earthquake = observatory.getEarthquake();
        ArrayList<Earthquake> arr_bigger = new ArrayList<Earthquake>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the magnitude value: ");
        double magnitude_input = sc.nextDouble();
        for (int i = 0; i < earthquake.size(); i++) {
            Earthquake e = earthquake.get(i);
            if (e.getMagnitude() > magnitude_input) {
                arr_bigger.add(e);
            }
        }
        if(arr_bigger.size() == 0){
            System.out.println("There is no earthquake which magnitude is higher than: " + magnitude_input);
        }else {
            for (Earthquake e : arr_bigger) {
                System.out.println("Position: " + e.getPosition());
                System.out.println("Magnitude: " + e.getMagnitude());
                System.out.println("Year_of_event: " + e.getYear_of_event());
                System.out.println("----------------");
            }
        }

    }

}

