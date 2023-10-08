package Facade;

public class Client {
    public static void main(String[] args) {

        RoomLight roomLight = new RoomLight();
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();

        HomeThreaterFacade homeThreaterFacade = new HomeThreaterFacade(roomLight, television, soundSystem);
        homeThreaterFacade.WatchTV();
        homeThreaterFacade.StopWatchingTV();
    }
}
