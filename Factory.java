public class Factory {

    public interface Product {
        void display();
    }

    public class ProductA implements Product{

        public void display(){
            System.out.println("Product A created");
        }    
    }

    public class ProductB implements Product {
        public void display(){
            System.out.println("Product B created");
        }    
    }

    abstract class Creator {
        public abstract Product createProduct();        
    }

    public class CreatorA extends Creator {

        @Override
        public Product createProduct() {
            return new ProductA();   
        }    
    }

    public class CreatorB extends Creator {

        @Override
        public Factory.Product createProduct() {
            return new ProductB();
        }   
    }

    public static void main(String[] args){
        Creator crA = new Factory().new CreatorA();
        crA.createProduct().display();

        Creator crB = new Factory().new CreatorB();
        crB.createProduct().display();
    }
    
}
