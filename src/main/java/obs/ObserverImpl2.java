package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history=new ArrayList<>();
    @Override
    public void update(/*int state*/Observable observable) {
        if(observable instanceof  ObservableImpl) {
            if (history.size() < 600) {
                int state = ((ObservableImpl) observable).getState();
                System.out.println("----------OBS2------------");
                history.add(state);
                double sum = 0;
                for (Integer h : history) {
                    sum = sum + h;
                }
                System.out.println("Stage AVG =>" + sum / history.size());
                System.out.println("----------------------");
            }
        }
    }
}
