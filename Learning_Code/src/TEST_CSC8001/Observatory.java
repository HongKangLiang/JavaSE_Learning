package TEST_CSC8001;


import java.util.ArrayList;
import java.util.Scanner;

public class Observatory {
    private String name_observatory;
    private String name_locatedCountry;
    private int year_start;
    private String area_cover;

    public Observatory() {
    }

    public Observatory(String name_observatory, String name_locatedCountry, int year_start, String area_cover) {
        this.name_observatory = name_observatory;
        this.name_locatedCountry = name_locatedCountry;
        this.year_start = year_start;
        this.area_cover = area_cover;
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


    //定义方法，实现返回一个observatory中的平均地震值

    public static double average_earthquake(ArrayList<Earthquake> array_observatory) {
        Earthquake e = new Earthquake();
        double sum = e.getMagnitude();
        for (int i = 0; i < array_observatory.size(); i++) {
            Earthquake ea = array_observatory.get(i);
            sum += ea.getMagnitude();
        }
        double ave = sum / array_observatory.size();
        return ave;
    }

    //定义方法：实现在一个observatory中，找出最大地震值对应的地震

    public static void max_earthquake(ArrayList<Earthquake> array_observatory) {
        Earthquake e = array_observatory.get(0);
        for (int i = 1; i < array_observatory.size(); i++) {
            Earthquake eq = array_observatory.get(i);
            if (eq.getMagnitude() > e.getMagnitude()) {
                e = array_observatory.get(i);
            }
        }
        System.out.println("Earthquake with Max_Magnitude in observatory: ");
        System.out.println("Position: " + e.getPosition());
        System.out.println("Magnitude: " + e.getMagnitude());
        System.out.println("Year_of_event: " + e.getYear_of_event());
    }


    //定义方法：查看指定observatory中所有earthquake的信息
    public static void check_earthquak_observatory(ArrayList<Earthquake> array_observatory) {
        for (Earthquake e : array_observatory) {
            System.out.println("Position: " + e.getPosition());
            System.out.println("Magnitude: " + e.getMagnitude());
            System.out.println("Year_of_event: " + e.getYear_of_event());
        }
    }


    //定义方法，实现当在控制台输入一个地震值的时候，返回一个新的列表，
    //这个列表包含在这个observatory中地震值大于想要输入值的所有地震元素。

    public static ArrayList<Earthquake> bigger_mag_earthquake(ArrayList<Earthquake> array_observatory) {
        ArrayList<Earthquake> arr_bigger = new ArrayList<Earthquake>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the magnitude value: ");
        double magnitude_input = sc.nextDouble();
        for (int i = 0; i < array_observatory.size(); i++) {
            Earthquake e = array_observatory.get(i);
            if (e.getMagnitude() > magnitude_input) {
                arr_bigger.add(e);
            }
        }
        for (Earthquake e : arr_bigger) {
            System.out.println("Position: " + e.getPosition());
            System.out.println("Magnitude: " + e.getMagnitude());
            System.out.println("Year_of_event: " + e.getYear_of_event());
            System.out.println("----------------");
        }
        return arr_bigger;
    }

    //定义方法：实现在控制台新添加地震信息

    public static void add_earthquake(ArrayList<Earthquake> array_observatory) {
        Scanner sc = new Scanner(System.in);
        Earthquake earthquake = new Earthquake();

        System.out.println("Please set the position of earthquake: ");
        System.out.println("( For example: 35.897 N , 12.234 W ) ");
        String input_position = sc.nextLine();
        earthquake.setPosition(input_position);
        System.out.println("Please set the magnitude of earthquake: ");
        double input_magnitude = sc.nextDouble();
        earthquake.setMagnitude(input_magnitude);
        System.out.println("Please set the year of earthquake: ");
        int input_year_of_event = sc.nextInt();
        earthquake.setYear_of_event(input_year_of_event);
        array_observatory.add(earthquake);
        System.out.println("Add finished");

    }


}
