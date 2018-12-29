package zhang.task.test_class.test12;

public class BuiltInMemory implements Memory {
    @Override
    public byte[] read(String fileName) {
        System.out.println("内置存储器读入:"+fileName);
        return new byte[]{12,12,123};
    }
}
