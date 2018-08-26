package Interfaces;

import Elements.*;
import Exceptions.AccessDeniedException;
import Exceptions.UserAlreadyLoggedException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IGestServerRmi extends Remote {
    String ServiceName = "PDGuestServer";

    boolean registUser(String name, String username, String password) throws RemoteException;

    boolean login(String username, String password, IClientRmi rmiInterface) throws RemoteException, UserAlreadyLoggedException;

    void logOut(String username, IClientRmi rmiInterface, ValidationUser validation) throws RemoteException;

    List<User> getLoginUsers(ValidationUser validation) throws RemoteException, AccessDeniedException;

    boolean sendMensage(Message message, ValidationUser validation) throws RemoteException, AccessDeniedException;

    void sendPairInvite(String dest, ValidationUser validation) throws RemoteException, AccessDeniedException;

    void answerPairInvite(User inviter, ValidationUser validationUser, boolean answer) throws RemoteException, AccessDeniedException;

    void endPair(ValidationUser validationUser) throws RemoteException, AccessDeniedException;

    Pair getMyPair(ValidationUser validationUser) throws RemoteException, AccessDeniedException;

    Status getStatus(ValidationUser validationUser) throws RemoteException, AccessDeniedException;

    Status getStatus(String username, ValidationUser validationUser) throws RemoteException, AccessDeniedException;

    String getGameServerIp(ValidationUser validationUser) throws RemoteException,AccessDeniedException;
}
