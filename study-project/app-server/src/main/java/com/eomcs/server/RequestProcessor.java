package com.eomcs.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
<<<<<<< HEAD
import java.util.Map;
import java.util.Set;
=======
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import com.eomcs.pms.table.JsonDataTable;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.google.gson.Gson;

// 역할
// - 클라이언트와 통신하는 일을 담당한다.
// - 클라이언트 요청이 들어오면 그 요청을 처리할 객체를 찾아 실행하는 일을 한다.
// - 클라이언트 요청 정보를 객체에 보관하고, 응답 기능을 수행할 객체를 만드는 일을 한다.
// 
<<<<<<< HEAD
public class RequestProcessor implements AutoCloseable {
  Socket socket;
  PrintWriter out;
  BufferedReader in; 

=======
public class RequestProcessor extends Thread {
  Socket socket;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  Map<String,DataProcessor> dataProcessorMap;

  public RequestProcessor(Socket socket, Map<String,DataProcessor> dataProcessorMap) throws Exception {
    this.socket = socket;
<<<<<<< HEAD
    out = new PrintWriter(socket.getOutputStream());
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    this.dataProcessorMap = dataProcessorMap; 
  }

  @Override
<<<<<<< HEAD
  public void close() {
    try {out.close();} catch (Exception e) {}
    try {in.close();} catch (Exception e) {}
    try {socket.close();} catch (Exception e) {}
  }

  public void service() throws Exception {

    // 데이터 처리 담당자의 이름 목록 가져오기
    Set<String> dataProcessorNames = dataProcessorMap.keySet();

    while (true) {
=======
  public void run() {
    try (Socket socket = this.socket;
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

      Set<String> dataProcessorNames = dataProcessorMap.keySet();

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      String command = in.readLine();
      Request request = new Request(command, in.readLine());
      Response response = new Response();

      if (command.equalsIgnoreCase("quit")) {
        response.setStatus(Response.SUCCESS);
        response.setValue("goodbye");
<<<<<<< HEAD
        sendResult(response);
        break;
      } 

      // 명령어에 해당하는 데이터 처리 담당자를 찾는다.
=======
        sendResult(response, out);
        return;
      } 

>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
      DataProcessor dataProcessor = null;
      for (String dataProcessorName : dataProcessorNames) {
        if (command.startsWith(dataProcessorName)) {
          dataProcessor = dataProcessorMap.get(dataProcessorName);
          break;
        }
      }

      if (dataProcessor != null) { // 명령어에 해당하는 데이터 처리 담당자가 있으면
        dataProcessor.execute(request, response);

      } else {
        response.setStatus(Response.FAIL);
        response.setValue("해당 명령어를 처리할 수 없습니다.");
      }

<<<<<<< HEAD
      sendResult(response); // 클라이언트에게 실행 결과를 보낸다.
    }
  }

  private void sendResult(Response response) throws Exception {
=======
      sendResult(response, out); // 클라이언트에게 실행 결과를 보낸다.

      saveData();

      System.out.println("클라이언트 접속 종료!");

    } catch (Exception e) {
      System.out.println("클라이언트 요청 처리 중 오류 발생!");
    }
  }

  private void saveData() throws Exception {
    Collection<DataProcessor> dataProcessors = dataProcessorMap.values();
    for (DataProcessor dataProcessor : dataProcessors) {
      if (dataProcessor instanceof JsonDataTable) {
        ((JsonDataTable<?>)dataProcessor).save();
      }
    }
  }

  private void sendResult(Response response, PrintWriter out) throws Exception {
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    // Response 객체에 보관된 실행 결과를 클라이언트에게 보낸다.
    out.println(response.status);
    if (response.getValue() != null) {
      out.println(new Gson().toJson(response.getValue()));
    } else {
      out.println();
    }
    out.flush();
  }

}






