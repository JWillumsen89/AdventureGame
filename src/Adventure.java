import java.io.IOException;
import java.util.Scanner;

public class Adventure {
  private Room currentRoom;
  private String playerName;
  Scanner in = new Scanner(System.in);
  private boolean gameRunning = true;


  public static void main(String[] args) throws IOException {
    new Adventure().go();
  }

  void go() throws IOException {
    createRooms();
    gameStartUp();
    mainMenu();
    while (gameRunning) {
      userInterface();
    }
  }

  void createRooms() throws IOException {
    String name;
    String description;
    Environment environment = new Environment();
    gameStartUp();

    //Room1
    name = "CAVE ENTRANCE";
    description = environment.descripRoom1();
    Room room1 = new Room(name, description);

    //Room 2
    name = "SMALL PATH";
    description = environment.descripRoom2();
    Room room2 = new Room(name, description);

    //Room 3
    name = "DUGOUT AREA";
    description = environment.descripRoom3();
    Room room3 = new Room(name, description);

    //Room 4
    name = "SLOPE INTO THE DARK";
    description = environment.descripRoom4();
    Room room4 = new Room(name, description);

    //Room 5
    name = "CEREMONIAL ROOM";
    description = environment.descripRoom5();
    Room room5 = new Room(name, description);

    //Room 6
    name = "WATERFALL";
    description = environment.descripRoom6();
    Room room6 = new Room(name, description);

    //Room 7
    name = "SKELETON ROOM";
    description = environment.descripRoom7();
    Room room7 = new Room(name, description);

    //Room 8
    name = "CAVE AND CAGES";
    description = environment.descripRoom8();
    Room room8 = new Room(name, description);

    //Room 9
    name = "STAIRWAY";
    description = environment.descripRoom9();
    Room room9 = new Room(name, description);


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

    currentRoom = room1;
  }

  void gameStartUp() {
    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO: ");
    System.out.println("""
         _______  _______ _________ _______  _______        _______  ______            _______  _       _________          _______  _______\s
        (  ____ )(  ____ \\\\__   __/(  ____ )(  ___  )      (  ___  )(  __  \\ |\\     /|(  ____ \\( (    /|\\__   __/|\\     /|(  ____ )(  ____ \\
        | (    )|| (    \\/   ) (   | (    )|| (   ) |      | (   ) || (  \\  )| )   ( || (    \\/|  \\  ( |   ) (   | )   ( || (    )|| (    \\/
        | (____)|| (__       | |   | (____)|| |   | |      | (___) || |   ) || |   | || (__    |   \\ | |   | |   | |   | || (____)|| (__   \s
        |     __)|  __)      | |   |     __)| |   | |      |  ___  || |   | |( (   ) )|  __)   | (\\ \\) |   | |   | |   | ||     __)|  __)  \s
        | (\\ (   | (         | |   | (\\ (   | |   | |      | (   ) || |   ) | \\ \\_/ / | (      | | \\   |   | |   | |   | || (\\ (   | (     \s
        | ) \\ \\__| (____/\\   | |   | ) \\ \\__| (___) |      | )   ( || (__/  )  \\   /  | (____/\\| )  \\  |   | |   | (___) || ) \\ \\__| (____/\\
        |/   \\__/(_______/   )_(   |/   \\__/(_______)      |/     \\|(______/    \\_/   (_______/|/    )_)   )_(   (_______)|/   \\__/(_______/""");

    helpText();
  }

  void mainMenu() {
    System.out.println("Main menu: \n");
    System.out.println("Start game [start]");
    System.out.println("Exit game [exit]");
    System.out.print("\nEnter decision: ");
    String decision = in.nextLine();
    decision = decision.toLowerCase();

    switch (decision) {
      case "start", "s" -> {
        playerName();
        System.out.println("\nGrab your sword and lets go!!");
        userInterface();
      }
      case "exit", "e" -> exit();
      default -> {
        invalidAnswer();
        mainMenu();
      }
    }
  }

  void playerName() {
    System.out.print("Warrior! Whats your name: ");
    playerName = in.nextLine();
    playerName = playerName.toUpperCase();
  }

  void helpText() {
    System.out.println("""
                
        Throughout the game you can write the following commands:
                
        look      = Looking around at the current location
        go east   = Moves player towards east
        go west   = Moves player towards west
        go north  = Moves player towards north
        go south  = Moves player towards south
        help      = Opens help menu
        exit      = Game terminates
                
        """);

  }

  void helpMenu() {
    System.out.println("\nHelp menu:");
    helpText();
    System.out.println("""
        Return to Game [game]
        Return to Main menu [main]
        Exit Game [exit]""");
    System.out.print("\nEnter decision:");
    String helpMenuDecision = in.nextLine();
    helpMenuDecision = helpMenuDecision.toLowerCase();
    switch (helpMenuDecision) {
      case "game", "g" -> userInterface();
      case "main", "m" -> mainMenu();
      case "exit", "e" -> exit();
      default -> invalidAnswer();
    }
  }

  void exit() {

    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tTHANK YOU FOR PLAYING: ");
    System.out.println("""
         _______  _______ _________ _______  _______        _______  ______            _______  _       _________          _______  _______\s
        (  ____ )(  ____ \\\\__   __/(  ____ )(  ___  )      (  ___  )(  __  \\ |\\     /|(  ____ \\( (    /|\\__   __/|\\     /|(  ____ )(  ____ \\
        | (    )|| (    \\/   ) (   | (    )|| (   ) |      | (   ) || (  \\  )| )   ( || (    \\/|  \\  ( |   ) (   | )   ( || (    )|| (    \\/
        | (____)|| (__       | |   | (____)|| |   | |      | (___) || |   ) || |   | || (__    |   \\ | |   | |   | |   | || (____)|| (__   \s
        |     __)|  __)      | |   |     __)| |   | |      |  ___  || |   | |( (   ) )|  __)   | (\\ \\) |   | |   | |   | ||     __)|  __)  \s
        | (\\ (   | (         | |   | (\\ (   | |   | |      | (   ) || |   ) | \\ \\_/ / | (      | | \\   |   | |   | |   | || (\\ (   | (     \s
        | ) \\ \\__| (____/\\   | |   | ) \\ \\__| (___) |      | )   ( || (__/  )  \\   /  | (____/\\| )  \\  |   | |   | (___) || ) \\ \\__| (____/\\
        |/   \\__/(_______/   )_(   |/   \\__/(_______)      |/     \\|(______/    \\_/   (_______/|/    )_)   )_(   (_______)|/   \\__/(_______/""");

    gameRunning = false;
  }

  void invalidAnswer() {
    System.out.println("\nYOU ENTERED AN INVALID ANSWER!! TRY AGAIN");

  }

  void userInterface() {
    String newLoc = "\n" + playerName + ", You walked into a new location!";
    String cantGo = "you can't go that way";

    System.out.print("\n" + playerName + ", what do you want to do: ");
    String playerDecision = in.nextLine();
    playerDecision = playerDecision.toLowerCase();
    switch (playerDecision) {
      case "look", "l" -> System.out.println("\n" + currentRoom);
      case "go north", "north", "go n", "n" -> {
        if (currentRoom.getNorth() != null) {
          System.out.println(newLoc);
          currentRoom = currentRoom.getNorth();
        } else {
          System.out.println(cantGo);
        }
      }
      case "go south", "south", "go s", "s" -> {
        if (currentRoom.getSouth() != null) {
          System.out.println(newLoc);
          currentRoom = currentRoom.getSouth();
        } else {
          System.out.println(cantGo);
        }
      }
      case "go west", "west", "go w", "w" -> {
        if (currentRoom.getWest() != null) {
          System.out.println(newLoc);
          currentRoom = currentRoom.getWest();
        } else {
          System.out.println(cantGo);
        }
      }
      case "go east", "east", "go e", "e" -> {
        if (currentRoom.getEast() != null) {
          System.out.println(newLoc);
          currentRoom = currentRoom.getEast();
        } else {
          System.out.println(cantGo);
        }
      }
      case "help", "h" -> helpMenu();
      case "exit" -> exit();
      default -> invalidAnswer();
    }
  }
}
