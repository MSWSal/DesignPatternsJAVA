public class singleton {

    private static singleton singleton;

    private singleton(){
        String s= "Hi Im Singleton";
        System.out.println(s);
        
    }

    public static singleton getInstance(){
        if (singleton==null) {
            singleton= new singleton();    
        }
        return singleton;
    }

    public static void main(String[] args){
        singleton x, y, z;
        x = singleton.getInstance();
        y = singleton.getInstance();
        z = singleton.getInstance();

    }
    
}

