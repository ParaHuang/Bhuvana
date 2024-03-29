package day2_factory;

//factory method
//we create different object by different factory
public class Main2 {
    public static void main(String[] args) {
        ReaderFactory factory = new JPEGFactory();
        Reader reader1 = factory.getReader();
        reader1.read();
        System.out.println();

        ReaderFactory factory2 = new PNGFactory();
        Reader reader2 = factory2.getReader();
        reader2.read();
    }
}

interface Reader{
    void read();
}

class JPEGReader implements Reader{
    @Override
    public void read() {
        System.out.println("reading a jpeg picture");
    }
}

class PNGReader implements Reader{
    @Override
    public void read() {
        System.out.println("reading a png picture");
    }
}

class GifReader implements Reader{
    @Override
    public void read() {
        System.out.println("reading a gif picture");
    }
}

interface ReaderFactory{
    Reader getReader();
}

class JPEGFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new JPEGReader();
    }
}

class PNGFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new PNGReader();
    }
}

