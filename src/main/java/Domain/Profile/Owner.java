package Domain.Profile;

public class Owner {
    private String username;
    private String password;

    private Owner(){}

    private Owner(Builder builder){
        this.username = builder.username;
        this.password = builder.password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{

        private String username;
        private String password;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        }

    }

    @Override
    public String toString() {
        return "Username{" + username + '\'' +
                ", Password" + password + '\'' +
                "}";
    }
}
