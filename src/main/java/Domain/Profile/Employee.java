package Domain.Profile;

public class Employee {
    private String username;
    private String password;

    private Employee(){}

    private Employee(Builder builder){
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

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Username{" + username + '\'' +
                ", Password" + password + '\'' +
                "}";
    }
}
