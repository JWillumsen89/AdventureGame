public class Adventure {
    public static void main(String[] args) {
        new Adventure().go();
    }

    void go (){
        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();

        Room currentRoom = room1;

        room1.setEast(room2);
        room1.setSouth(room4);

        room2.setWest(room1);
        room2.setEast(room3);

        room3.setWest(room2);
        room3.setSouth(room6);

        room4.setNorth(room1);
        room4.setSouth(room7);

        room5.setSouth(room8);

        room6.setNorth(room3);
        room6.setSouth(room9);

        room7.setEast(room8);
        room7.setNorth(room4);

        room9.setNorth(room6);
        room9.setWest(room8);

        room8.setEast(room9);
        room8.setWest(room7);
        room8.setNorth(room5);


    }

}
