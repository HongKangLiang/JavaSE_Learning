package Q1;

public final class CarRegistrationID {
    private final String prefix;
    private final int num;

    public CarRegistrationID(String prefix, int num) {
        if (prefix.isEmpty()) throw new IllegalArgumentException();

        this.prefix = prefix;
        this.num = num;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CarRegistrationID) {
            CarRegistrationID carRegistrationID = (CarRegistrationID) obj;
            if ((carRegistrationID.getPrefix().equals(this.prefix)) && (carRegistrationID.getNum() == this.num)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + (prefix == null ? 0 : prefix.hashCode());
        result = result * 31 + num;
        return result;
    }

    @Override
    public String toString() {
        return prefix + num;
    }
}