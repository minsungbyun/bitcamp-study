package com.eomcs.request;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

// 역할
// - 통신 프로토콜에 맞춰 서버에게 요청을 전달하고 응답을 받는 일을 한다.
//
<<<<<<< HEAD
public class RequestAgent {
=======
<<<<<<< HEAD
public class RequestAgent implements AutoCloseable {
=======
public class RequestAgent {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1

  public static final String SUCCESS = "success";
  public static final String FAIL = "fail";

<<<<<<< HEAD
  String ip;
  int port;
=======
<<<<<<< HEAD
  Socket socket;
  PrintWriter out;
  BufferedReader in;
=======
  String ip;
  int port;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1

  String status;
  String jsonData;

  public RequestAgent(String ip, int port) throws Exception {
<<<<<<< HEAD
=======
<<<<<<< HEAD
    socket = new Socket(ip, port);  
    out = new PrintWriter(socket.getOutputStream());
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  }

  public void request(String command, Object value) throws Exception {
    // 서버쪽으로 데이터를 보낸다.
    // - 서버에 명령어를 한 줄 보낸다.
    out.println(command);

    // - 객체를 JSON으로 변환하여 서버에 보낸다.
    if (value != null) {
      out.println(new Gson().toJson(value));
    } else {
      out.println(); // 보낼 객체가 없으면 빈 문자열을 보내 서버에게 알린다.
    }
    out.flush();

    // 서버에서 응답을 받는다.
    status = in.readLine();
    jsonData = in.readLine();
=======
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
    this.ip = ip;
    this.port = port;
  }

  public void request(String command, Object value) throws Exception {
    try (Socket socket = new Socket(ip, port);  
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      out.println(command);

      if (value != null) {
        out.println(new Gson().toJson(value));
      } else {
        out.println(); // 보낼 객체가 없으면 빈 문자열을 보내 서버에게 알린다.
      }
      out.flush();

      // 서버에서 응답을 받는다.
      status = in.readLine();
      jsonData = in.readLine();
    }
<<<<<<< HEAD
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
  }

  public String getStatus() {
    return status;
  }

  // 서버에서 한 개의 객체를 JSON 문자열로 보냈을 경우,
  public <T> T getObject(Class<T> type) {
    return new Gson().fromJson(jsonData, type);
  }

  // 서버에서 여러 개의 객체를 JSON 문자열로 보냈을 경우,
  public <E> Collection<E> getObjects(Class<E> elementType) {
    Type type = TypeToken.getParameterized(Collection.class, elementType).getType(); 
    return new Gson().fromJson(jsonData, type);
  }
<<<<<<< HEAD
=======
<<<<<<< HEAD

  @Override
  public void close() {
    try {out.close();} catch (Exception e) {}
    try {in.close();} catch (Exception e) {}
    try {socket.close();} catch (Exception e) {}
  }
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
>>>>>>> 004703bfd698e931bd53837440cacd072f9016f1
}







