package Facade;

public class HomeThreaterFacade {
    RoomLight roomLight;
    Television television;
    SoundSystem soundSystem;

    HomeThreaterFacade(RoomLight roomLight, Television tv, SoundSystem sound){
        this.roomLight = roomLight;
        this.television = tv;
        this.soundSystem = sound;
    }

    void WatchTV(){
        roomLight.setRoomLightDim();
        television.SwitchOnTV();
        soundSystem.SoundSystemOn();
    }

    void StopWatchingTV(){
        roomLight.setRoomLightBright();
        television.SwitchOffTV();
        soundSystem.SoundSystemOff();
    }
}
