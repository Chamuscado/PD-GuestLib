package Interfaces;

import Elements.User;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IGestServerRmi extends Remote {
    String ServiceName = "PDGuestServer";
    boolean registUser(String name, String username, String password) throws RemoteException;

    boolean login(String username, String password) throws RemoteException;

    List<User> getLoginUsers() throws RemoteException;

    boolean creatPair(User user0, User user1) throws RemoteException;


}
