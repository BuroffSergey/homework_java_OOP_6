package homework;

public class UserRepositoryImpl implements UserRepository {



    private User user;

    public UserRepositoryImpl(User user) {
    }

    public UserRepositoryImpl() {
        //TODO Auto-generated constructor stub
    }

    public User getUser() {
        return getUser();
    }

    public void setUser(User user) {
    }

    @Override
    public void save(User user) {
        this.user = user;
        save(user);
    }

}
