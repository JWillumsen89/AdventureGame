//Not used for now!
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Environment {

  Path descripRoom1 = Path.of("RoomDescription\\room1.txt");
  Path descripRoom2 = Path.of("RoomDescription\\room2.txt");
  Path descripRoom3 = Path.of("RoomDescription\\room3.txt");
  Path descripRoom4 = Path.of("RoomDescription\\room4.txt");
  Path descripRoom5 = Path.of("RoomDescription\\room5.txt");
  Path descripRoom6 = Path.of("RoomDescription\\room6.txt");
  Path descripRoom7 = Path.of("RoomDescription\\room7.txt");
  Path descripRoom8 = Path.of("RoomDescription\\room8.txt");
  Path descripRoom9 = Path.of("RoomDescription\\room9.txt");


  public String descripRoom1() throws IOException {
    String str = Files.readString(descripRoom1);
    System.out.println(str);
    return str;
  }


  public String descripRoom2() throws IOException {
    String str = Files.readString(descripRoom2);
    System.out.println(str);
    return str;
  }


  public String descripRoom3() throws IOException {
    String str3 = Files.readString(descripRoom3);
    System.out.println(str3);
    return str3;
  }


  public String descripRoom4() throws IOException {
    String str34 = Files.readString(descripRoom4);
    System.out.println(str34);
    return str34;
  }


  public String descripRoom5() throws IOException {
    String str5 = Files.readString(descripRoom5);
    System.out.println(str5);
    return str5;
  }


  public String descripRoom6() throws IOException {
    String str6 = Files.readString(descripRoom6);
    System.out.println(str6);
    return str6;
  }


  public String descripRoom7() throws IOException {
    String str7 = Files.readString(descripRoom7);
    System.out.println(str7);
    return str7;
  }


  public String descripRoom8() throws IOException {
    String str8 = Files.readString(descripRoom8);
    System.out.println(str8);
    return str8;
  }


  public String descripRoom9() throws IOException {
    String str9 = Files.readString(descripRoom9);
    System.out.println(str9);
    return str9;
  }

}
