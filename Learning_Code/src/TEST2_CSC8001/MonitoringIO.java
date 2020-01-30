package TEST2_CSC8001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MonitoringIO {
    public static void main(String[] args) {

        //分别创建三个类的对象


        Earthquake earthquake = new Earthquake();

        //通过带参数构造方法创建earthquake的实例对象
        Earthquake e1 = new Earthquake("55.125 N , 1.532 W",9.0,1998);
        Earthquake e2 = new Earthquake("51.459 N , 2.587 W",4.8,1967);
        Earthquake e3 = new Earthquake("29.773 N , 95.391 W",9.0,2019);
        Earthquake e4 = new Earthquake("29.809 N , 93.982 W",6.9,1993);
        Earthquake e5 = new Earthquake("31.477 N , 103.582 E",8.0,2009);
        Earthquake e6 = new Earthquake("22.735 N , 110.342 E",5.0,2019);

        //初始化一个空的earthquake集合，通过带参构造方法创建observatory对象

        Observatory observatory_England = new Observatory("England","UK",1967,"30 square kilometres");
        Observatory observatory_America = new Observatory("America","USA",1953,"70 square kilometres");
        Observatory observatory_China = new Observatory("China","CHN",1978,"90 square kilometres");


        //将earthquake实例对象作为元素添加到observatory的实例对象的初始变量List中
        observatory_England.getEarthquake().add(e1);
        observatory_England.getEarthquake().add(e2);
        observatory_America.getEarthquake().add(e3);
        observatory_America.getEarthquake().add(e4);
        observatory_China.getEarthquake().add(e5);
        observatory_China.getEarthquake().add(e6);

        //初始化一个空的observatory集合，通过带参构造方法创建monitoring实例对象
        Monitoring monitoring = new Monitoring(new ArrayList<Observatory>());

        //将observatory实例对象作为元素添加到monitoring的实例对象的初始变量List中
        monitoring.getObservatory().add(observatory_China);
        monitoring.getObservatory().add(observatory_England);
        monitoring.getObservatory().add(observatory_America);






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
                    monitoring.Check_observatory(monitoring);
                    break;

                case 2:
                    monitoring.Check_earthquake(monitoring);
                    break;

                case 3:
                    System.out.println("Please choose the observatory:");
                    for(int i = 0; i < monitoring.getObservatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getObservatory().get(i).getName_observatory());
                    }
                    int input1 = sc.nextInt();
                    Observatory ob3 = monitoring.getObservatory().get(input1 - 1);
                    System.out.println(ob3.getName_observatory() + ":");
                    System.out.println("Average Magnitude:" + ob3.Average_earthquake(ob3));

                    break;

                case 4:
                    monitoring.MaxAverage_observatory(monitoring);
                    break;

                case 5:
                    System.out.println("Please choose the observatory:");
                    for(int i = 0; i < monitoring.getObservatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getObservatory().get(i).getName_observatory());
                    }
                    int input5 = sc.nextInt();
                    Observatory ob5 = monitoring.getObservatory().get(input5 - 1);
                    System.out.println(ob5.getName_observatory());
                    ob5.Max_earthquake(ob5);
                    break;

                case 6:
                    monitoring.MaxALL_earthquake(monitoring);
                    break;

                case 7:
                    System.out.println("Please choose the observatory:");
                    for(int i = 0; i < monitoring.getObservatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getObservatory().get(i).getName_observatory());
                    }
                    int input7 = sc.nextInt();
                    Observatory ob7 = monitoring.getObservatory().get(input7 - 1);
                    System.out.println(ob7.getName_observatory());
                    ob7.Bigger_mag_earthquake(ob7);
                    break;

                case 8:
                    monitoring.All_bigger_mag_earthquake(monitoring);
                    break;
                case 9:
                    monitoring.Add_observatory(monitoring);
                    break;
                case 10:
                    monitoring.Add_earthquake(monitoring);
                    break;

                case 0:
                    System.out.println("Thank you for using our system !!!");
                    System.exit(0);
            }
        }

    }

}
