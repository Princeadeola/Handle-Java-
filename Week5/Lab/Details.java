package Week5.Lab;

public class Details {
    public void address(String address){

    }
    public void address(String address1, String address2, String address3){

    }
    public void address(String address1, String address2, String address3, int zipCode){

    }

    public static void main(String[] args) {
        Details obj = new Details();
        obj.address("California");
        obj.address("California", "LA", "NY");
        obj.address("California", "LA", "NY", 10001);
    }
}
