package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();
        UserRepository.save(user);
    }
    private static UserRepository userRepository;

    public static UserRepository getUserRepository() {
        return userRepository;
    }

    public static void setUserRepository(UserRepository userRepository) {
        Main.userRepository = userRepository;
    }

    static {
        userRepository = (UserRepository) new UserRepositoryImpl();
}}