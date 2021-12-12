package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Worker {
    protected final String name;
    protected final String phone;

    public Worker(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public boolean login(String username, String password) { return false; };

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(name, worker.name) &&
                Objects.equals(phone, worker.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
