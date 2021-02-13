package Action;

import com.company.Cat;

public class play  implements  Action {
    @Override
    public void makeAction(Cat c) {
        if (c.getAge()>1&&c.getAge()<5){
           c.setMood(c.getMood()+7);
           c.setHealth(c.getHealth()+7);
           c.setSatiety(c.getSatiety()-3);
        }else if (c.getAge()>6&&c.getAge()<10){
            c.setMood(c.getMood()+5);
            c.setHealth(c.getHealth()+5);
            c.setSatiety(c.getSatiety()-5);
        }else {
            c.setMood(c.getMood()+4);
            c.setHealth(c.getHealth()+4);
            c.setSatiety(c.getSatiety()-6);
        }
    }

}
