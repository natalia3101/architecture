package ModelElements;

public class Camera {

    public Point3D location;
    public Angle3D angle; 


    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation(){
        return this.location;
    }

    public Angle3D getAngle() {
        return this.angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }
}
