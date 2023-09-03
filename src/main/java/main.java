import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args){

        Object[] objects = {new Human("Человек"),new Cat("Кот"), new Robot("Робот")};

        Obstacle[] obstacles = {new Track(100), new Track(200), new Wall(5), new Wall(2)};

        for (Obstacle obstacle : obstacles) {
            for (Object object : objects) {
                if(obstacle instanceof Track) {
                    if (object.run(obstacle.getInfo()) == Boolean.FALSE){
                        List<Object> list =  new ArrayList<>(Arrays.asList(objects));
                        list.remove(object);
                        objects = list.toArray(new Object[list.size()]);
                    }
                }
                else if (obstacle instanceof Wall) {
                    if (object.jump(obstacle.getInfo()) == Boolean.FALSE){
                        List<Object> list =  new ArrayList<>(Arrays.asList(objects));
                        list.remove(object);
                        objects = list.toArray(new Object[list.size()]);
                    }
                }
            }
            System.out.println();
        }
    }
}
