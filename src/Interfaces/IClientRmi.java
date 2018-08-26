package Interfaces;

import Elements.Message;
import Elements.User;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClientRmi extends Remote {
    void sendMensage(Message message) throws RemoteException;

    int getCode() throws RemoteException;

    void refreshLoginUsers() throws RemoteException;

    void recivePairInvite(User user) throws RemoteException;

    void answerPairInvite(User inviter, boolean answer) throws RemoteException;

    void refreshStatus() throws RemoteException;

    void setReadyToPlay(boolean ready) throws RemoteException;
}
