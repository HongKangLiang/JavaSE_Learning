package HAHAHA;

import com.sun.deploy.security.SelectableSecurityManager;

public class MaxAndMin {
    private int value;
    private int value_max;
    private int value_min;

    public MaxAndMin(int num_input) {
        value = num_input;
        value_max = num_input;
        value_min = num_input;
    }

    public MaxAndMin() {

    }

    public int getValue() {
        return value;
    }

    public int getValue_max() {
        return value_max;
    }

    public int getValue_min() {
        return value_min;
    }

    public void store(int num_input) {
        if (num_input > value_max) {
            value_max = num_input;
        } else if (num_input < value_min){
            value_min = num_input;
        }
    }
}
