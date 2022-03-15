
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Environment {
  Path descripRoom1 = Path.of("RoomDescription\\room1.txt");

  public String descripRoom1() throws IOException {
    String str = Files.readString(descripRoom1);
    System.out.println(str);
    return str;
  }
}
