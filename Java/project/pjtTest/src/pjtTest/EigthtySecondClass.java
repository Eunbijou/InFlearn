package pjtTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EigthtySecondClass {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�~~");

			socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����~~");
			System.out.println("socket: " + socket);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (serverSocket != null)
					serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}