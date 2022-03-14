import java.util.Scanner;

public class Adventure {
  Room room1, room2, room3, room4, room5, room6, room7, room8, room9, currentRoom;
  Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    new Adventure().go();
  }

  void go() {
    String name;
    String description;

    gameStartUp();

    //Room1
    name = "CAVE ENTRANCE";
    description = """
        You have entered a dark cage with water dripping from the ceiling, shiny eyes in the distance from, what seems like hundreds of small animals, bats maybe!
        There is also some noise, a distant growling and something that sounds like footsteps, but hard to tell what this is and where its coming from.""";
    room1 = new Room(name, description);

    //Room 2
    name = "SMALL PATH";
    description = """
        Spiderwebs everywhere and you cant barely see anything in the dark.
        You are also stepping in something that seems to be sticking to you boots. Mud, blood or something else disgusting.
        Goosebumps suddenly wanders all over your buddy, a scream from something erupts from nothing in the distance!""";
    room2 = new Room(name, description);

    //Room 3
    name = "DUGOUT AREA";
    description = """
        A small torch, hanging from the wall, brings a little bit of light to this weird, dugout room.
        Rats screaming and running away from almost every small corner or hidden place and leave you with brief silence.
        Theres a small oddly looking table, containing the rest of what seems to have been someones lunch and very small leather bag, someone left in hurry!.
        After looking a round, the silence gets interrupted by the same distant growling you have been hearing earlier""";

    room3 = new Room(name, description);

    //Room 4
    name = "Room 4";
    description = """
        
        """;
    room4 = new Room(name, description);

    //Room 5
    name = "Final room";
    description = "Du er i grottens start";
    room5 = new Room(name, description);

    //Room 6
    name = "WATERFALL";
    description = """
        Water erupting from a small crack in the ceiling creates a small pond that seems to be continuing into a small stream that disappears through the crack in the cave floor.
        By the water there a very oddly skeleton, that thankfully is not alive. Because those pointer teeth and sharp claws, must have injured somebody badly. 
        Thorn fabric and a dagger is beside it. Someone barely escaped this still alive. 
        """;
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
    name = "STAIRWAY";
    description = """
        """;
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

  void gameStartUp() {
    System.out.println("Welcome to this game!");
    System.out.println("Main menu: ");
    System.out.println("1) Start game");
    System.out.println("2) Help");
    System.out.println("3) Exit");
    System.out.print("Enter decision: ");
    int decision = in.nextInt();

    switch (decision) {
      case 1 -> System.out.println("Starting");
      case 2 -> System.out.println("Help menu");//help();
      case 3 -> System.exit(0);

    }
  }

  void help() {
    System.out.println("Help menu:");
    System.out.println();
  }

  void userInterface() {

  }
}
