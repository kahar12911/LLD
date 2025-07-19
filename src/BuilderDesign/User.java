package BuilderDesign;

public class User {
    private final String name;
    private int age;
    private String address;

    public User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }

    public static class UserBuilder{
        private final String name;
        private int age;
        private String address;

        public UserBuilder(String name){
            this.name = name;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
    @Override
    public String toString(){
        return "{name='"+this.name+"',age="+this.age+",address='"+this.address+"'}";
    }
}
