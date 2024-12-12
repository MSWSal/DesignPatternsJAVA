public class DecorP {

    public interface Coffee {
        String getDescription();
        double cost();    
    }

    public class BasicCoffee implements Coffee {
        @Override
        public String getDescription(){
            return ("Basic Coffee");                    
        }

        @Override
        public double cost() {
            return 5.00;
        }   
    }

    abstract class CoffeeDecorator implements Coffee {
        private Coffee coffee;

        public CoffeeDecorator(Coffee coffee){
            this.coffee=coffee;
            
        }

        @Override
        public String getDescription(){
            return coffee.getDescription();

        }
    
        @Override
        public double cost(){
            return coffee.cost();

        }
        
    }

    public class MilkDecorator extends CoffeeDecorator {

        public MilkDecorator(Coffee coffee){
            super(coffee);

        }

        @Override
        public String getDescription(){
            return super.getDescription() + "Milk";
        }
    
        @Override
        public double cost(){
            return super.cost() + 0.50;
        }      
    }

    public class SugarDecorator extends CoffeeDecorator {

        public SugarDecorator(Coffee coffee){
            super(coffee);

        }

        @Override
        public String getDescription(){
            return super.getDescription() + "Sugar";
        }
    
        @Override
        public double cost(){
            return super.cost() + 0.25;
        }    
    }

    public static void main(String[] args){

        Coffee myCoffee=new DecorP().new BasicCoffee();
        System.out.println(myCoffee.getDescription() + "Cost = "+ myCoffee.cost());

        myCoffee = new DecorP().new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription()+ "Cost" );


    }
    
}
