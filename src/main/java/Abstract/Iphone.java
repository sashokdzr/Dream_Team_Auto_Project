package Abstract;

public class Iphone extends Phone implements Photobale{

    public Iphone(int heightSize, int weightSize, int numberOfCameras) {
        super(heightSize, weightSize, numberOfCameras);
    }
    @Override
    public void unblock(){
         System.out.println("Unlock with faceID");
     }

    @Override
    public void takePhoto() {
        System.out.println("Alisa, take a photo");
    }
}
