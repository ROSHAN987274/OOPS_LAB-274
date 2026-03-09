abstract class fig {
    abstract void area();

static class circle extends fig {
    double r = 5;
    void area(){
        double a = 3.14*r*r;
        System.out.println(a);
    }
}
static class rectangle extends fig{
    double l =5.5 , b=6.5;
    void area(){
        System.out.println(l*b);
    }
}


    public static void main ( String[] args){
        fig[] a = new fig[2];
        a[0] = new circle();
        a[1] = new rectangle();
        for( fig b : a){
            b.area();
        }
        
    }

}