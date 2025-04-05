package Abstract;

public abstract class Phone implements Photobale{
    private int heightSize;

    private int weightSize;

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(int numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    private int numberOfCameras;

    public Phone(int heightSize, int weightSize, int numberOfCameras) {
        this.heightSize = heightSize;
        this.weightSize = weightSize;
    }

    public int getWeightSize() {
        return weightSize;
    }

    public void setWeightSize(int weightSize) {
        this.weightSize = weightSize;
    }

    public abstract void unblock();

    public void setHeightSize(int heightSize){
        this.heightSize = heightSize;
    }

    public int getHeightSize(){
        return this.heightSize;
    }

    public final void getDisplaySize(){
        System.out.println("Size is " + heightSize + "*" + weightSize);
    }

}
