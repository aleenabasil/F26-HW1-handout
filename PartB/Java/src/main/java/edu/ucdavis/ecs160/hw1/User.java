package edu.ucdavis.ecs160.hw1;

public interface User {
    String getName();

    String getEmail();

    void setEmail(String email);
}

class LoggedUser implements User{
    private final User user;

    public LoggedUser(User user) {
        this.user = user;
    }

    @Override 
    public String getName() {
        System.out.println("[LOG] AdminUser.getName()");
        return user.getName();
    }

    @Override
    public String getEmail() {
        System.out.println("[LOG] AdminUser.getEmail()");
        return user.getEmail();
    }

    @Override
    public void setEmail(String email) {
        System.out.println("[LOG] AdminUser.setEmail(\"" + email + "\")");
        user.setEmail(email);
}
}
