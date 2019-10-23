package Model;

public class User {
    private String username;
    private String password;
    private String email;
    private User supervisor;
    private ToDoList list;

    public User(String username, String password, String email, User supervisor) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.supervisor = supervisor;
        list = new ToDoList();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(User supervisor) {
        this.supervisor = supervisor;
    }

    public boolean isValidUser(String username, String password) {
        return username.equalsIgnoreCase(this.username) && password.equals(this.password);
    }

    public boolean equals(User user) {
        return this.username.equals(user.username)
                && this.email.equals(user.email)
                && this.password.equals(user.password);
    }
}
