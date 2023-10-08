package Observer;

public class User2 implements IUserUpdate {
    @Override
    public void update(String msg) {
        System.out.println("User 2 " + msg);
    }
}
