package Domain.Profile;

public class Profile {
    private String accessLevel;


    private Profile() {
    }

    private Profile(Builder builder) {
        this.accessLevel = builder.accessLevel;

    }

    public String getAccessLevel() {
        return accessLevel;
    }


    public static class Builder {

        private String accessLevel;

        public Builder accessLevel(String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        public Profile build() {
            return new Profile(this);
        }

    }

    @Override
    public String toString() {
        return "Access level {" + accessLevel +
                "}";
    }
}
