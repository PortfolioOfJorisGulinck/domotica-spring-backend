package be.jorisgulinck.domoticaspringbackend.domain.models.building;

import javax.persistence.*;

@Entity
@Table(name = "dimensions")
public class Dimension {

    @Id
    @Column(name = "dimension_id")
    private int id;

    @Column(name = "dimension_width")
    private int width;

    @Column(name = "dimension_height")
    private int height;

    public Dimension() {
    }

    public Dimension(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
