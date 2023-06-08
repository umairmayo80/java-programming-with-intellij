public class Car{
    public static void main(String[] args){
        CarClass car = new CarClass("honda","hv12",1300);
        System.out.println(car);
    }
}




class CarClass{
    private String brand;
    private String model;
    private float price;

    // Default Constructor
    CarClass(){
        this.brand = "";
        this.model = "";
        this.price = 0;
    }

    // Parameterized Constructor
    CarClass(String brand, String model, float price){
        setCar(brand,model,price);
    }


    // setter function
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public void setCar(String brand, String model, float price){
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
