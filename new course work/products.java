Public class Product {
    Private int productID;
    Private String name;
    Private String category;
    Private double price;
    Private int quantity;

    public Product(int i, java.lang.String string2, java.lang.String string3, double d, int j) {
        //TODO Auto-generated constructor stub
    }

    Public Product(int productID, String name, String category, double price, int quantity) {
        This.productID = productID;
        This.name = name;
        This.category = category;
        This.price = price;
        This.quantity = quantity;
    }

    // Getters and setters
    Public int getProductID() { return productID; }
    Public void setProductID(int productID) { this.productID = productID; }

    Public String getName() { return name; }
    Public void setName(String name) { this.name = name; }

    Public String getCategory() { return category; }
    Public void setCategory(String category) { this.category = category; }

    Public double getPrice() { return price; }
    Public void setPrice(double price) { this.price = price; }

    Public int getQuantity() { return quantity; }
    Public void setQuantity(int quantity) { this.quantity = quantity; }
}

