package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<PoligonalModel> models;

    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    private List<Flash> flashes;
    
    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    private List<Camera> cameras;

    public List<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
    }

    public Scene() {
        models = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }
}
