public abstract class Object {
    protected String name;
    public Object(String name) {
        this.name = name;
    }

    public Object(){
    }

    public abstract Boolean run(int distance);
    public abstract Boolean jump(int distance);
}
