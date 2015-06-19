public class Directory{

    public static void main(String [] args){
        Data betterMyles = new Data("Myles", "Jefefrson",12);
        System.out.println(betterMyles.getFirstName() + " " + betterMyles.getLastName() + " " + betterMyles.getAge());
        
        Data myles = new Data();
        myles.setFirstName("Myles"); 
        myles.setLastName("Jefferson");
    
        Data ethan = new Data();
        ethan.setFirstName("Ethan");
        ethan.setLastName("Jefferson");

        Data stan = new Data();
        stan.setFirstName("Stan");
        stan.setLastName("Jefferson");
        
        Data peter = new Data();
        peter.setFirstName("Peter");
        peter.setLastName("Jefferson");
    
        Data [] myles_relations = new Data [3];
        myles_relations[0] = ethan;
        myles_relations[1] = stan;
        myles_relations[2] = peter;
        myles.setRelations(myles_relations);

        System.out.println();
        System.out.println("Myles' Relations: ");
        
        for(Data data: myles.getRelations()){
            System.out.println(data.getFirstName());
        }
    }   
}
