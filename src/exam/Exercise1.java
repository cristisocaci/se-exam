package exam;

class C{}

class F{
    public void metA(){}
}

class E extends C{
    private F f;
    public E(){
        f = new F();
    }

    public void metG(int i){}
}

class A{}

class D{}

class B{
    private long t;
    private E e;
    private D d;
    public B(E e, D d, long t){
        this.e = e;
        this.d = d;
        this.t = t;
    }
    public void f(){}
    public void metJ(A j){}
}



public class Exercise1 {

    public static void main(String[] args) {

    }
}
