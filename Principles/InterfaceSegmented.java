package Principles;

public class InterfaceSegmented {
    //Iterface should be such,that client should implement only those methods that are of their interest.
    interface RestaurantEmployee{
        public void cookFood();
        public void serveFood();
        public void cleanRestaurant();
    }

    class Waiter implements RestaurantEmployee{

        @Override
        public void cookFood() {
            // Waiter does not cook food
            // braking Interface Segregation Principle
            throw new UnsupportedOperationException("Waiter cannot cook food");
        }

        @Override
        public void serveFood() {
            System.out.println("Waiter is serving food");
        }

        @Override
        public void cleanRestaurant() {
            //np job
            System.out.println("Waiter is cleaning the restaurant");
        }
    }

    interface WaiterRole{
        public void serveFood();
        public void takeOrder();
    }

    interface ChefRole{
        public void cookFood();
        public void decideMenu();
    }

    interface helpRole {
        public void cleanRestaurant();
    }

    class waiterNew implements WaiterRole{

        @Override
        public void serveFood() {
            System.out.println("Waiter is serving food");
        }

        @Override
        public void takeOrder() {
            System.out.println("Waiter is taking order");
        }
    }


}
