package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(/*int state*/Observable observable) {
        if(observable instanceof  ObservableImpl) {
            int state = ((ObservableImpl) observable).getState();
            System.out.println("**********OBS1********");
            System.out.println("State Value=" + state);
            System.out.println("**********************");
        }
    }
}
