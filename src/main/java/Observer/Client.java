package Observer;

public class Client {
    public static void main(String[] args) {
        IUserUpdate u1 = new User1();
        IUserUpdate u2 = new User2();
        IUserUpdate u3 = new User3();

        IObserver obs1 = new Channel1();
        obs1.register(u1);
        obs1.register(u2);

        obs1.notifiyMe("Channel 1 released a new video.");

        IObserver obs2 = new Channel2();
        obs2.register(u1);
        obs2.register(u2);
        obs2.register(u3);

        obs2.notifiyMe("Channel 2 released a new video.");
    }
}
