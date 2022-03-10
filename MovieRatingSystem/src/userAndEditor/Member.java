package userAndEditor;

import java.io.Serializable;

public class Member implements Serializable {

    private String name;
    private String password;

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name + ",\nPassword:" + password + "\n";
    }
    
    
}
