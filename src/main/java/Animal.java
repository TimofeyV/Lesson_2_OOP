public abstract class Animal extends Object {
    public Animal(String name){
        super(name);
    }

    public Animal() {
    }

    @Override
    public abstract Boolean run(int distance);
    @Override
    public abstract Boolean jump(int distance);
}
