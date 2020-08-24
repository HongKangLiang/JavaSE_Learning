package StudentSupportApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

/**
 * Class Description: This is a class to encapsulate smart card number.
 *
 * @author Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */
public final class SmartCardNumber {

    //use a map to store all studentID to guarantee that no two students have the same ID
    //references are constant during initialization
    private static final HashMap<String,SmartCardNumber> SCMAP = new HashMap<>();
    //the first name of the student with the initial of the last name of the student
    private final String init_name;
    //year of issue of the card
    private final int year;
    //an arbitrary serial number
    private final int number;
    //the final format of smart card number
    //e.g JS-2018-10
    private final String card_number;

    /**
     * Method Description: Constructor with parameters.
     */
    public SmartCardNumber(String init_name, int year, int number) {
        this.init_name = init_name;
        this.year = year;
        this.number = number;
        this.card_number = init_name + "-" + year + "-" + number;
    }

    /**
     * Method Description: Automatically generate an instance of SmartCardNumber
     * @return SmartCardNumber
     */
    public final static SmartCardNumber generateSMCN(Name name, Date issue){
        final String init_name = String.valueOf(name.getFirst_name().charAt(0)).toUpperCase() + String.valueOf(name.getLast_name().charAt(0)).toUpperCase();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(issue);
        final int year = calendar.get(Calendar.YEAR);
        //according to the 'Effective Java', after seeding from 47, the random number generated more reflects the randomness
        Random random = new Random();
        final int number = random.nextInt(65535);
        final String card_number = init_name + "-" + year + "-" + number;
        if (SCMAP.containsKey(card_number)){
            return generateSMCN(name,issue);
        }
        SCMAP.put(card_number,new SmartCardNumber(init_name,year,number));
        return SCMAP.get(card_number);

    }

    /**
     * Method Description: get first component of smart card number.
     */
    public String getInit_name() {
        return init_name;
    }

    /**
     * Method Description: get second component of smart card number.
     */
    public int getYear() {
        return year;
    }

    /**
     * Method Description: get third component of smart card number.
     */
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return init_name + "-" + year + "-" + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj instanceof SmartCardNumber){
            SmartCardNumber smartCardNumber = (SmartCardNumber) obj;
            if ((smartCardNumber.getInit_name().equals(this.init_name))&&(smartCardNumber.getNumber()==this.number)&&(smartCardNumber.getYear()==this.year)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = result * 31 + (init_name == null ? 0 : init_name.hashCode());
        result = result * 31 + year;
        result = result * 31 + number;
        return result;
    }
}
