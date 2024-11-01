package Entities;

public interface User {
    public String getEmail();
    public void setEmail();
    public void setSenha();
    public boolean login();
    public boolean logout();
}
