public class Adventure {
    public static void main(String[] args) {
        new Adventure().go();
    }

  void go() {
      String name;
      String description;

    //Room1
      name = "Rum 1";
      description = "Du er i grottens start";
    Room room1 = new Room(name, description);

    //Room 2
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room2 = new Room(name, description);

    //Room 3
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room3 = new Room(name, description);

    //Room 4
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room4 = new Room(name, description);

    //Room 5
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room5 = new Room(name, description);

    //Room 6
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room6 = new Room(name, description);

    //Room 7
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room7 = new Room(name, description);

    //Room 8
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room8 = new Room(name, description);

    //Room 9
    name = "Rum 1";
    description = "Du er i grottens start";
    Room room9 = new Room(name, description);


    Room currentRoom = room1;
    //room 1
    room1.setEast(room2);
    room1.setSouth(room4);

    //room 2
    room2.setWest(room1);
    room2.setEast(room3);

    //room 3
    room3.setWest(room2);
    room3.setSouth(room6);

    //room 4
    room4.setNorth(room1);
    room4.setSouth(room7);

    //room 5
    room5.setSouth(room8);

    //room 6
    room6.setNorth(room3);
    room6.setSouth(room9);

    //room 7
    room7.setNorth(room4);
    room7.setEast(room8);

    //room 8
    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);

    //room 9
    room9.setWest(room8);
    room9.setNorth(room6);

  }
}
