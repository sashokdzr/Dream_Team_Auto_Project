class Block {
    int width;
    int length;
    int height;
    public Block(int[] arr) {
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return height * length * width;
    }
    public int getSurfaceArea(){
        return (height*length+length*width+height*width)<<1;
    }
    }
class main{
    public static void main(String[] args) {
        Block b = new Block(new int[]{2,2,2});
        System.out.println(b.getLength());
        System.out.println(b.getWidth());
    }
}
