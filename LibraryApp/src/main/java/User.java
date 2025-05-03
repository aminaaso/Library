public class User {
    private int id;
    private String name;
    private UserCategory userCategory;

    public User (int constId, String constName, UserCategory constUserCategory){
        id = constId;
        name = constName;
        userCategory = constUserCategory;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public UserCategory getUserCategory(){
        return userCategory;
    }


}
