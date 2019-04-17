package Domain.Stock;

public class Equipment {
    private String equipID;


    private Equipment() {
    }

    private Equipment(Builder builder) {
        this.equipID = builder.equipID;

    }

    public String getEquipID() {
        return equipID;
    }


    public static class Builder {

        private String equipID;

        public Builder equipID(String equipID) {
            this.equipID = equipID;
            return this;
        }

        public Equipment build() {
            return new Equipment(this);
        }

    }

    @Override
    public String toString() {
        return "Equipment ID {" + equipID +
                "}";
    }
}
