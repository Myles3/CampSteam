public class Data
{
    String firstName;
    String lastName;
    String phoneNumber;
    String address; 
    int age;
    Data [] relations;

    //CONSTRUCTOR
    public Data(){
        relations = new Data[10];
    }

    public String getfirstName(){
        return firstName;
    }
    public void setFirstName(String first_name){
        firstName = first_name;
    }
    public String getlastName(){
        return lastName;
    }
    public void setLastName(String last_name){
        lastName = last_name;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phone_number){
        phoneNumber = phone_number;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String home_address){
        address = home_address;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int current_age){
        age = current_age;
    }
    public Data [] setRelations(){
        return relations;
    }
    public void getRelations(Data [] user_relations){
        relations = user_relations;
    }
}
