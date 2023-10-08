package Observer;

public interface IObserver {
    void register(IUserUpdate uu);
    void unRegister(IUserUpdate uu);
    void notifiyMe(String msg);
}
