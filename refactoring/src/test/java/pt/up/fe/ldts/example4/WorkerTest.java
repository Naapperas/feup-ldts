package pt.up.fe.ldts.example4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testWorker() {
        Worker worker = new Supervisor("John Doe", "+1 222-22222", "john", "secret");
        assertEquals("John Doe", worker.getName());
        assertEquals("+1 222-22222", worker.getPhone());
        assertFalse(worker.login("john", "wrong"));
        assertTrue(worker.login("john", "secret"));
    }

    @Test
    public void testSupervisor() {
        Supervisor supervisor = new Supervisor("John Doe", "+1 222-22222", "john", "secret");

        Worker minion1 = new Worker("Minion 1", "+1 123-12345");
        Worker minion2 = new Worker("Minion 2", "+1 123-12345");
        supervisor.addSupervisee(minion1);

        assertEquals("John Doe", supervisor.getName());
        assertEquals("+1 222-22222", supervisor.getPhone());
        assertFalse(supervisor.login("john", "wrong"));
        assertTrue(supervisor.login("john", "secret"));
        assertTrue(supervisor.isSupervisee(minion1));
        assertFalse(supervisor.isSupervisee(minion2));
    }

    @Test
    public void testClient() {
        Client client = new Client("John Doe", "+1 222-22222");
        assertEquals("John Doe", client.getName());
        assertEquals("+1 222-22222", client.getPhone());
    }
}