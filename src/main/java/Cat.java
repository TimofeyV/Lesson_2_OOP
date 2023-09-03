public class Cat extends Animal {
        public static final int canRun = 500;
        public static final int canJump = 5;

        public Cat(String name){
            super(name);
        }
        @Override
        public Boolean run(int distance){
            if(distance > canRun) {
                System.out.println(name + " не пробежал");
                return Boolean.FALSE;
            }
            else {
                System.out.println(name + " пробежал " + distance);
                return Boolean.TRUE;
            }
        }
        @Override
        public Boolean jump(int distance){
            if(distance > canJump) {
                System.out.println(name + " не перепрыгнул");
                return Boolean.FALSE;
            }
            else {
                System.out.println(name + " перепрыгнул " + distance);
                return Boolean.TRUE;
            }
        }

}
