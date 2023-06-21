package pl.javastart.task.app;

import pl.javastart.task.model.Room;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(18.5, 24.6, true, 21.0);

        System.out.println(room.info());
        room.lowerTemperature();
        System.out.println(room.info());
        room.lowerTemperature();
        System.out.println(room.info());
        room.lowerTemperature();
        System.out.println(room.info());
        room.lowerTemperature();
        System.out.println(room.info());
        room.lowerTemperature();
        System.out.println(room.info());
    }
}
