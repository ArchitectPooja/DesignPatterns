package Observer;

public class User3 implements IUserUpdate {
    @Override
    public void update(String msg) {
        System.out.println("User 3 " + msg);
    }
}
