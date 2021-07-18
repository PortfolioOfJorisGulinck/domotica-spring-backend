package be.jorisgulinck.domoticaspringbackend.models.domotica;

import be.jorisgulinck.domoticaspringbackend.models.building.Room;

import javax.persistence.*;

@Entity
public class Schema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String service;
    private String amount;
    private String start;
    private String end;

    @ManyToOne
    @JoinColumn(name = "roomId",
            nullable = false)
    private Room room;

    public Schema() {
    }

    public Schema(int id, String service, String amount, String start, String end, Room room) {
        this.id = id;
        this.service = service;
        this.amount = amount;
        this.start = start;
        this.end = end;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
