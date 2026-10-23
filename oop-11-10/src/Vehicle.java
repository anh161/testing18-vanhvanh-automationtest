
//tính đóng gói
//private, protected, public
// private: chỉ nội b trong class dùng được, bên ngoài k truy cập đượckể c class con
// public: tất cả class bên ngoài có thể sử dụng được
// protected: chỉ cho class con có thể dùng dduwopwjc, các class khác không thể dùng được
//Nguyên tắc: các thuộc tính Bắt Buộc dùng private, trừ 1 số case thì dùng protected
// hàm kởi tạo bắt buộc dùng public
// trong case thuộc tinh ở private muốn truy cập đến phải dùng getter hoặc  setter


// Tính trừ tượng
// class cha bắt buộc chỉ dùng cho class con kế thừa, không được dùng để tạo đối tượng


abstract public class Vehicle {
    private String id;
    private String name;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Vehicle() {}


    public Vehicle(String id, String name, String model, String color) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;

    }


    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
}
