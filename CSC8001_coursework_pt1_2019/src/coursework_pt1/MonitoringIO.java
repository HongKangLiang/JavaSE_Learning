package coursework_pt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Description: a MonitoringIO class with a main method.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */
public class MonitoringIO {
    public static void main(String[] args) {

        /**
         * Description: creat six earthquake objects.
         */
        Earthquake e1 = new Earthquake("55.125 N , 1.532 W",9.0,1998);
        Earthquake e2 = new Earthquake("51.459 N , 2.587 W",4.8,1967);
        Earthquake e3 = new Earthquake("29.773 N , 95.391 W",9.0,2019);
        Earthquake e4 = new Earthquake("29.809 N , 93.982 W",6.9,1993);
        Earthquake e5 = new Earthquake("31.477 N , 103.582 E",8.0,2009);
        Earthquake e6 = new Earthquake("22.735 N , 110.342 E",5.0,2019);

        /**
         * Description: creat three observatory objects.
         */
        Observatory observatory_England = new Observatory("England","UK",1967,"30 square kilometres",new ArrayList<Earthquake>());
        Observatory observatory_America = new Observatory("America","USA",1953,"70 square kilometres",new ArrayList<Earthquake>());
        Observatory observatory_China = new Observatory("China","CHN",1978,"90 square kilometres",new ArrayList<Earthquake>());

        /**
         * Description: adding earthquake objects to observatory objects' variable.
         */
        observatory_England.getList_earthquake().add(e1);
        observatory_England.getList_earthquake().add(e2);
        observatory_America.getList_earthquake().add(e3);
        observatory_America.getList_earthquake().add(e4);
        observatory_China.getList_earthquake().add(e5);
        observatory_China.getList_earthquake().add(e6);

        /**
         * Description: creat a monitoring objects.
         */
        Monitoring monitoring = new Monitoring(new ArrayList<Observatory>());

        /**
         * Description: adding observatory objects to monitoring objects' variable.
         */
        monitoring.getList_observatory().add(observatory_China);
        monitoring.getList_observatory().add(observatory_England);
        monitoring.getList_observatory().add(observatory_America);

        /**
         * Description: print a menu function.
         */
        while (true){
            System.out.println("Welcome to Earthquake-Monitoring System:");
            System.out.println("(Please check the function menu below and enter the corresponding number)");
            System.out.println(" ");
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

            /**
             * Description: realize all the functions provided on console by calling variety of methods.
             */
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
                    for(int i = 0; i < monitoring.getList_observatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getList_observatory().get(i).getName_observatory());
                    }
                    System.out.println("please enter the number: ");
                    int input1 = sc.nextInt();
                    Observatory ob3 = monitoring.getList_observatory().get(input1 - 1);
                    System.out.println(ob3.getName_observatory() + ":");
                    System.out.println("Average Magnitude:" + ob3.Average_earthquake(ob3));

                    break;

                case 4:
                    Observatory ob_max = monitoring.MaxAverage_observatory(monitoring);
                    System.out.println("The observatory with the largest average earthquake magnitude: ");
                    System.out.println("--------");
                    System.out.println("Average Magnitude:" + ob_max.Average_earthquake(ob_max));
                    System.out.println("Name_observatory: " + ob_max.getName_observatory());
                    System.out.println("Name_locatedCountry: " + ob_max.getName_locatedCountry());
                    System.out.println("Year_start: " + ob_max.getYear_start());
                    System.out.println("Area_cover: " + ob_max.getArea_cover());
                    break;

                case 5:
                    System.out.println("Please choose the observatory:");
                    for(int i = 0; i < monitoring.getList_observatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getList_observatory().get(i).getName_observatory());
                    }
                    System.out.println("please enter the number: ");
                    int input5 = sc.nextInt();
                    Observatory ob5 = monitoring.getList_observatory().get(input5 - 1);
                    List<Earthquake> list_e = ob5.Max_earthquake(ob5);
                    for (Earthquake eee : list_e) {
                        System.out.println("Earthquake with Max_Magnitude in monitoring: ");
                        System.out.println("Position: " + eee.getPosition());
                        System.out.println("Magnitude: " + eee.getMagnitude());
                        System.out.println("Year_of_event: " + eee.getYear_of_event());
                    }
                    break;

                case 6:
                    List<Earthquake> list_ea = monitoring.MaxALL_earthquake(monitoring);
                    for (Earthquake eee : list_ea) {
                        System.out.println("Earthquake with Max_Magnitude in monitoring: ");
                        System.out.println("Position: " + eee.getPosition());
                        System.out.println("Magnitude: " + eee.getMagnitude());
                        System.out.println("Year_of_event: " + eee.getYear_of_event());
                    }

                    break;

                case 7:
                    System.out.println("Please choose the observatory:");
                    for(int i = 0; i < monitoring.getList_observatory().size(); i++){
                        System.out.println(i+1+"----"+monitoring.getList_observatory().get(i).getName_observatory());
                    }
                    System.out.println("please enter the number: ");
                    int input7 = sc.nextInt();
                    Observatory ob7 = monitoring.getList_observatory().get(input7 - 1);
                    System.out.println("Please enter the magnitude value: ");
                    double input77 = sc.nextDouble();
                    List<Earthquake> list_bigger = ob7.Bigger_mag_earthquake(ob7,input77);
                    if(list_bigger.size() == 0){
                        System.out.println("There is no earthquake which magnitude is higher than enter value!");
                    }else {
                        for (Earthquake e : list_bigger) {
                            System.out.println("Position: " + e.getPosition());
                            System.out.println("Magnitude: " + e.getMagnitude());
                            System.out.println("Year_of_event: " + e.getYear_of_event());
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Please enter the magnitude value: ");
                    double input8 = sc.nextDouble();
                    List<Earthquake> list_Allbigger = monitoring.All_bigger_mag_earthquake(monitoring,input8);
                    if(list_Allbigger.size() == 0){
                        System.out.println("There is no earthquake which magnitude is higher than enter value!" );
                    }else {
                        for (Earthquake e : list_Allbigger) {
                            System.out.println("Position: " + e.getPosition());
                            System.out.println("Magnitude: " + e.getMagnitude());
                            System.out.println("Year_of_event: " + e.getYear_of_event());
                            System.out.println("----------------");
                        }
                    }
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
