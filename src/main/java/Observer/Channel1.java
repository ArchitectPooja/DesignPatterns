package Observer;

import java.util.ArrayList;

public class Channel1 implements IObserver {

    ArrayList<IUserUpdate> list = new ArrayList<>();
    @Override
    public void register( IUserUpdate uu) {
        list.add(uu);
    }

    @Override
    public void unRegister(IUserUpdate uu) {
        int idx = list.indexOf(uu);
        if(idx > -1){
            list.remove(uu);
        }
    }

    @Override
    public void notifiyMe(String msg) {
        for(IUserUpdate user : list){
            user.update(msg);
        }
    }
}
