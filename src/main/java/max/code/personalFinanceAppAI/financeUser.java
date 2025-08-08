package max.code.personalFinanceAppAI;

import jakarta.persistence.Entity;


@Entity
public class financeUser {

    private Integer id;
    private String name;
    private String password;
    private String email;

    public financeUser(){

    }

    public financeUser(Integer id, String name, String password, String email){
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
