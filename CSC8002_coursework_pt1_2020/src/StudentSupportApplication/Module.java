package StudentSupportApplication;

/**
 * Class Description: This is a class to encapsulate module.
 *
 * @author  Hongkang Liang
 * @version 1.0
 * @Date 2020.2.29
 */

public class Module {
    private String module_code;
    private String module_name;
    private int module_credit;

    /**
     * Method Description: Constructor with parameters.
     */
    public Module(String module_code, String module_name, int module_credit) {
        this.module_code = module_code;
        this.module_name = module_name;
        this.module_credit = module_credit;
    }

    /**
     * Method Description: get the module's code of an instance of module.
     */
    public String getModule_code() {
        return module_code;
    }

    /**
     * Method Description: get the module's name of an instance of module.
     */
    public String getModule_name() {
        return module_name;
    }

    /**
     * Method Description: get the module's credit of an instance of module.
     */
    public int getModule_credit() {
        return module_credit;
    }


    @Override
    public String toString() {
        return module_code + ", " + module_name + ", " + module_credit;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Module) && (this.module_name.equals(((Module) obj).getModule_name())) && (this.module_code.equals(((Module) obj).getModule_code())) && (this.module_credit==((Module) obj).getModule_credit());
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = result * 31 + (module_code == null ? 0 : module_code.hashCode());
        result = result * 31 + (module_name == null ? 0 : module_name.hashCode());
        result = result * 31 + module_credit;
        return result;
    }
}
