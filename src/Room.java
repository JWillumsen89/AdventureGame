public class Room {
    private String roomName;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    Room(String roomName, String description) {

    }


    void setRoomName (String roomName){
        this.roomName = roomName;
    }

    String getRoomName (){
        return roomName;
    }

    void setNorth (Room north){
        this.north = north;
    }

    Room getNorth (){
        return north;
    }

    void setSouth (Room south){
        this.south = south;
    }

    Room getSouth (){
        return south;
    }

    void setEast (Room east){
        this.east = east;
    }

    Room getEast (){
        return east;
    }

    void setWest (Room west){
        this.west = west;
    }

    Room getWest (){
        return west;
    }

    void setDescription () {
        this.description = description;
    }

    String getDescription (){
        return description;
    }



}
