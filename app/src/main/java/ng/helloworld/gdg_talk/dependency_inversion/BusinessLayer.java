package ng.helloworld.gdg_talk.dependency_inversion;

/**
 * Created by timi on 06/08/2016.
 */

public class BusinessLayer implements IBusinessLayer {

    @Override
    public boolean isValid(User user) {
        return true;
    }


    @Override
    public void save(User user) {

    }
}
