import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void  main(String[] args){
        ObservableImpl observable=new ObservableImpl();
        observable.setState(99);
        observable.setState(99);
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(76);
        observable.setState(50);
        observable.setState(60);
        observable.unsubscribe(observer1);
        System.out.println("*************************************");
        observable.setState(44);

      /*  observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                  System.out.println("===================");
                  System.out.println("Prévision = "+Math.cos(state*2.66)*Math.log(state*state));
                  System.out.println("==================");
            }
        });

        observable.subscribe(state -> {

                System.out.println("=========.........==========");
                System.out.println("Tendance => "+((state>50)?"Positif":"negatif"));
                System.out.println("========..........==========");
        });*/

        observable.setState(65);
        observable.setState(44);

     /*   Button button=new Button("OK");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
     while (true){
         observable.setState((int)(Math.random()*7600));
     }
    }
}
