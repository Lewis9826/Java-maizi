package zhang.task.test_class.test11;

public class App {
    public static void main(String[] args) {
        // 新建一堆实现类的实例
        Paino paino = new Paino();
        Guitar guitar = new Guitar();
        Harmonica harmonica = new Harmonica();

        Musician musician = new Musician();
        musician.play(paino);
        musician.play(guitar);
        musician.play(harmonica);
    }
}
