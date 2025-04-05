package Abstract;

public class Android extends Phone implements Photobale {
    public Android(int heightSize, int weightSize, int numberOfCameras) {
        super(heightSize, weightSize, numberOfCameras);
    }
    @Override
    public void unblock(){
        System.out.println("Unlock with cipher code");
    }

    @Override
    public void takePhoto() {
        System.out.println("Hi Google, take a photo");
    }
}
