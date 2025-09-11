package Principles;

public class SingleResponsibility {
    // A class should have only one reason to change, meaning it should only have one job or responsibility.
    // This principle helps to keep the codebase clean, maintainable, and easier to understand.

    // Example of a class that violates the Single Responsibility Principle
    class Marker{
        private String name;
        private String color;
        private int year;
        private int price;
        public Marker(String name, String color, int year, int price) {
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

    class InVoice{
        private Marker marker;
        private int quantity;
        public InVoice(Marker marker, int quantity) {
                this.marker=marker;
                this.quantity=quantity;
        }

        public int calculateTotalPrice(){
            return marker.price * quantity;
        }

//        public void printInvoice(){
//            System.out.println("Marker: " + marker.name);
//            System.out.println("Color: " + marker.color);
//            System.out.println("Year: " + marker.year);
//            System.out.println("Price: " + marker.price);
//            System.out.println("Quantity: " + quantity);
//            System.out.println("Total Price: " + calculateTotalPrice());
//        }
//
//        public void saveToDatabase(){
//            // Code to save invoice to database
//        }
//        Now it has multiple reasons to change: if the invoice format changes, if the database schema changes, etc.
    }

//    class InvoiceDao{
//        private InVoice invoice;
//
//        public InvoiceDao(InVoice invoice) {
//            this.invoice = invoice;
//        }
//
//        public void saveToDatabase(){
//            // Code to save invoice to database
//        }
//    }
    class InvoicePrinter{
        private InVoice invoice;

        public InvoicePrinter(InVoice invoice) {
            this.invoice = invoice;
        }

        public void printInvoice(){
            System.out.println("Marker: " + invoice.marker.name);
            System.out.println("Color: " + invoice.marker.color);
            System.out.println("Year: " + invoice.marker.year);
            System.out.println("Price: " + invoice.marker.price);
            System.out.println("Quantity: " + invoice.quantity);
            System.out.println("Total Price: " + invoice.calculateTotalPrice());
        }
    }

    interface InvoiceDao{
        public void save(InVoice invoice);
    }

    class DatabaseInvoiceDao implements InvoiceDao{
        @Override
        public void save(InVoice invoice) {
            // Code to save invoice to database
        }
    }

    class FileInvoiceDao implements InvoiceDao{
        @Override
        public void save(InVoice invoice) {
            // Code to save invoice to file
        }
    }
}
