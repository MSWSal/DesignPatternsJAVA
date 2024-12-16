public class StrategyP {
    public interface PaymentStrategy {
        void pay();
        
    }

    public class CardPayment implements PaymentStrategy {

        @Override
        public void pay() {
            System.out.println("Paid by card");
        }   
    }

    public class MoneyPayment implements PaymentStrategy {

        @Override
        public void pay() {
            System.out.println("Paid with money");
        }    
    }

    public class ShoppingCart {

        private PaymentStrategy paymentStrategy;

        public void setPayStrategy(PaymentStrategy paymentStrategy){
            this.paymentStrategy=paymentStrategy;

        }

        public void checkout(){
            paymentStrategy.pay();

        }

        public class main {
        
            
        }    
    }
    public static void main(String[] args){
        ShoppingCart shoppingCart=new StrategyP().new ShoppingCart();

        //set card
        shoppingCart.setPayStrategy(new StrategyP().new CardPayment());
        shoppingCart.checkout();

        //money
        shoppingCart.setPayStrategy(new StrategyP().new MoneyPayment());
        shoppingCart.checkout();
    }
    
}
