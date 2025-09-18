package model;

public class User {
    private int id;
    private String userName;
    private String name;
    private String email;
    private String password;

    //Construtores
    public User(){
        //Construtor padrão
    }
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public User(int id, String userName, String name, String email, String password){
        this(userName, password);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //ALT + Insert (Getter / Setter)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
