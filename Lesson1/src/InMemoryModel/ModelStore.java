package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements iModelChanger{

    public PoligonalModel models;

    public Scene scenes;

    public Flash flashes;

    public Camera cameras;

    private iModelChangeObserver changeObserver;

    public iModelChangeObserver getChangeObserver() {
        return changeObserver;
    }

    public void setChangeObserver(iModelChangeObserver changeObserver) {
        this.changeObserver = changeObserver;
    }

    public ModelStore(iModelChangeObserver changeObserver){
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel();
        this.cameras = new Camera(null, null);
        this.flashes = new Flash(null, null, null, null);
        this.scenes = new Scene();

    }

    public Scene getScena(int n){
        return this.scenes;
    }

    @Override
    public void notifyChange(iModelChanger sender){

    }


}
