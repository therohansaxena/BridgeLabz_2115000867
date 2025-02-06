class Product {
    char[] name;

    Product(char[] name) {
        this.name = name;
    }
}

class Order {
    Product[] products;
    int count = 0;

    Order(int size) {
        products = new Product[size];
    }

    void addProduct(Product p) {
        products[count] = p;
        count++;
    }
}

class Customer {
    void placeOrder(Order o, Product p) {
        o.addProduct(p);
    }
}

class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        Order o = new Order(1);
        Product p = new Product(new char[]{'P', '1'});
        c.placeOrder(o, p);
    }
}

