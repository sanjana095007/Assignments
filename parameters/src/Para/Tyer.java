package Para;

class Tyre extends Rubber{
    @Override
    public void expand(){
        System.out.println("running expand method in tyer which extends rubber");
    }
    public void Compress(){
        System.out.println("running the compress method");
    }
}
