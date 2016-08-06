package ng.helloworld.gdg_talk.dependency_inversion;

/**
 * Created by timi on 06/08/2016.
 */
public interface IBusinessLayer {
    boolean isValid(User user);

    void save(User user);
}
