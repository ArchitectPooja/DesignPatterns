package Observer;

public class User1 implements IUserUpdate {
    @Override
    public void update(String msg) {
        System.out.println("User 1 " + msg);
    }
}
