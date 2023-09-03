public class Track extends Obstacle {
    int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getInfo(){
        return length;
    }
}
