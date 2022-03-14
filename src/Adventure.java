public class Adventure {
  Room room1, room2, room3, room4, room5, room6, room7, room8, room9, currentRoom;

  public static void main(String[] args) {
    new Adventure().go();
  }

  void go() {
    String name;
    String description;

    //Room1
    name = "Rum 1";
    description = "Du er i grottens start";
    room1 = new Room(name, description);

    //Room 2
    name = "Rum 2";
    description = "Du er i grottens start";
    room2 = new Room(name, description);

    //Room 3
    name = "Rum 3";
    description = "Du er i grottens start";
    room3 = new Room(name, description);

    //Room 4
    name = "Rum 4";
    description = "Du er i grottens start";
    room4 = new Room(name, description);

    //Room 5
    name = "Rum 5";
    description = "Du er i grottens start";
    room5 = new Room(name, description);

    //Room 6
    name = "Rum 6";
    description = "Du er i grottens start";
    room6 = new Room(name, description);

    //Room 7
    name = "Rum 7";
    description = "Du er i grottens start";
    room7 = new Room(name, description);

    //Room 8
    name = "Rum 8";
    description = "Du er i grottens start";
    room8 = new Room(name, description);

    //Room 9
    name = "Rum 9";
    description = "Du er i grottens start";
    room9 = new Room(name, description);


    currentRoom = room1;
    //room 1
    room1.setNorth(null);
    room1.setEast(room2);
    room1.setSouth(room4);
    room1.setWest(null);

    //room 2
    room2.setNorth(null);
    room2.setSouth(null);
    room2.setWest(room1);
    room2.setEast(room3);

    //room 3
    room3.setNorth(null);
    room3.setEast(null);
    room3.setWest(room2);
    room3.setSouth(room6);

    //room 4
    room4.setEast(null);
    room4.setWest(null);
    room4.setNorth(room1);
    room4.setSouth(room7);

    //room 5
    room5.setNorth(null);
    room5.setWest(null);
    room5.setEast(null);
    room5.setSouth(room8);

    //room 6
    room6.setEast(null);
    room6.setWest(null);
    room6.setNorth(room3);
    room6.setSouth(room9);

    //room 7
    room7.setWest(null);
    room7.setSouth(null);
    room7.setNorth(room4);
    room7.setEast(room8);

    //room 8
    room8.setSouth(null);
    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);

    //room 9
    room9.setEast(null);
    room9.setSouth(null);
    room9.setWest(room8);
    room9.setNorth(room6);

  }
}
