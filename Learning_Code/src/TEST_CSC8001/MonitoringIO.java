package TEST_CSC8001;


import java.util.ArrayList;
import java.util.Scanner;

public class MonitoringIO {
    public static void main(String[] args) {

        //分别创建三个类的对象
        Monitoring monitoring = new Monitoring();
        Observatory observatory = new Observatory();
        Earthquake earthquake = new Earthquake();

        //通过带参数构造方法创建earthquake的实例对象
        Earthquake e1 = new Earthquake("55.125 N , 1.532 W",5.2,1998);
        Earthquake e2 = new Earthquake("51.459 N , 2.587 W",4.3,1967);
        Earthquake e3 = new Earthquake("29.773 N , 95.391 W",9.0,2019);
        Earthquake e4 = new Earthquake("29.809 N , 93.982 W",6.9,1993);
        Earthquake e5 = new Earthquake("31.477 N , 103.582 E",8.0,2009);
        Earthquake e6 = new Earthquake("22.735 N , 110.342 E",5.0,2019);

        //通过带参数构造方法创建的observatory实例对象
        Observatory observatory_China = new Observatory("Peking","CHN",1978,"90 square kilometres");
        Observatory observatory_England = new Observatory("London","UK",1967,"30 square kilometres");
        Observatory observatory_America = new Observatory("NASA","USA",1953,"70 square kilometres");

        //创建大集合monitoring，嵌套小集合observatory
        ArrayList<ArrayList<Earthquake>> arr_monitoring = new ArrayList<ArrayList<Earthquake>>();
        ArrayList<Observatory> array_monitoring = new ArrayList<Observatory>();
        //创建小集合observatory
        ArrayList<Earthquake> arr_China = new ArrayList<Earthquake>();
        ArrayList<Earthquake> arr_England = new ArrayList<Earthquake>();
        ArrayList<Earthquake> arr_America = new ArrayList<Earthquake>();

        //大集合monitoring添加元素
        arr_monitoring.add(arr_England);
        arr_monitoring.add(arr_America);
        arr_monitoring.add(arr_China);

        array_monitoring.add(observatory_China);
        array_monitoring.add(observatory_England);
        array_monitoring.add(observatory_America);

        //小集合observatory添加元素
        arr_England.add(e1);
        arr_England.add(e2);
        arr_America.add(e3);
        arr_America.add(e4);
        arr_China.add(e5);
        arr_China.add(e6);



        while (true){
            System.out.println("Welcome to Earthquake-Monitoring System");
            System.out.println("1----Observatory Data");
            System.out.println("2----Earthquake Data");
            System.out.println("3----Average magnitude in observatory");
            System.out.println("4----The observatory with the largest average earthquake magnitude");
            System.out.println("5----Largest magnitude value in observatory");
            System.out.println("6----Largest magnitude value in monitoring");
            System.out.println("7----All earthquake which magnitude above input-value in observatory");
            System.out.println("8----All earthquake which magnitude above input-value in monitoring");
            System.out.println("9----Add observatory");
            System.out.println("10----Add earthquake");
            System.out.println("0----exit");
            System.out.println("please enter your choice");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();


            switch (input) {
                case 1:
                    monitoring.check_observatory(array_monitoring);
                    break;

                case 2:
                    monitoring.check_earthquake(arr_monitoring);
                    break;

                case 3:
                    System.out.println("Please choose the observatory:");
                    System.out.println("1-observatory_China");
                    System.out.println("2-observatory_England");
                    System.out.println("3-observatory_America");
                    int input1 = sc.nextInt();
                    switch (input1) {
                        case 1:
                            System.out.println("Observatory: China");
                            System.out.println("Average Magnitude:" + observatory.average_earthquake(arr_China));
                        break;
                        case 2:
                            System.out.println("Observatory: England");
                            System.out.println("Average Magnitude:" + observatory.average_earthquake(arr_England));
                        break;
                        case 3:
                            System.out.println("Observatory: America");
                            System.out.println("Average Magnitude:" + observatory.average_earthquake(arr_America));
                        break;
                    }
                    break;

                case 4:
                    monitoring.maxAverage_observatory(arr_monitoring,array_monitoring);
                    break;
                case 5:
                    System.out.println("Please choose the observatory:");
                    System.out.println("1-observatory_China");
                    System.out.println("2-observatory_England");
                    System.out.println("3-observatory_America");
                    int input5 = sc.nextInt();
                    switch (input5) {
                        case 1:
                            System.out.println("Observatory_China:");
                            observatory.max_earthquake(arr_China);
                            break;
                        case 2:
                            System.out.println("Observatory_England:");
                            observatory.max_earthquake(arr_England);
                            break;
                        case 3:
                            System.out.println("Observatory_America:");
                            observatory.max_earthquake(arr_America);
                            break;
                    }
                    break;
                case 6:
                    monitoring.maxALL_earthquake(arr_monitoring);
                    break;
                case 7:
                    System.out.println("Please choose the observatory:");
                    System.out.println("1-observatory_China");
                    System.out.println("2-observatory_England");
                    System.out.println("3-observatory_America");
                    int input2 = sc.nextInt();
                    switch (input2) {
                        case 1:
                            System.out.println("Observatory_China:");
                            observatory.bigger_mag_earthquake(arr_China);
                            break;
                        case 2:
                            System.out.println("Observatory_England:");
                            observatory.bigger_mag_earthquake(arr_England);
                            break;
                        case 3:
                            System.out.println("Observatory_America:");
                            observatory.bigger_mag_earthquake(arr_America);
                            break;
                    }
                    break;

                case 8:
                    monitoring.All_bigger_mag_earthquake(arr_monitoring);
                    break;
                case 9:
                    monitoring.add_observatory(array_monitoring);
                    break;
                case 10:
                    System.out.println("Please choose the observatory of earthquake: ");
                    System.out.println("1-observatory_China");
                    System.out.println("2-observatory_England");
                    System.out.println("3-observatory_America");
                    int input3 = sc.nextInt();

                    System.out.println("Please fill the details of new earthquake: ");
                    switch(input3) {
                        case 1:
                            observatory.add_earthquake(arr_China);
                            break;
                        case 2:
                            observatory.add_earthquake(arr_England);
                            break;
                        case 3:
                            observatory.add_earthquake(arr_America);
                            break;
                    }
                    break;

                case 0:
                    System.out.println("Thank you for using our system !!!");
                    System.exit(0);
            }
        }

    }

}
