public class Room {
    private Room roomName;
    private Room north;
    private Room south;
    private Room east;
    private Room west;



    void setRoomName (Room roomName){
        this.roomName = roomName;
    }

    Room getRoomName (){
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



}
