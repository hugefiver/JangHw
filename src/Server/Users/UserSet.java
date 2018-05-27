package Server.Users;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserSet {
    Set<String> names;
    Map<String, User> users;

    public UserSet() {
        names = new HashSet<>();
        users = new HashMap<>();
    }

    protected void add(String name, User user) {
        names.add(name);
        users.put(name, user);
    }

    public void add(User user) {
        add(user.getName(), user);
    }

    public void del(String name) {
        names.remove(name);
        users.remove(name);
    }

    public boolean isIn(String name) {
        return names.contains(name);
    }

    public Set<String> getNames() {
        return new HashSet<String>(names);
    }

    public Set<User> getUsers() {
        return (Set<User>) users.values();
    }
}
