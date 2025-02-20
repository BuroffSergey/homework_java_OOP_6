package homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }

    public void save() {
        System.out.println("Save user:" + getName());
    }

    public void save(UserRepositoryImpl userRepositoryImpl) {
        userRepositoryImpl.save(this);
    }
}
