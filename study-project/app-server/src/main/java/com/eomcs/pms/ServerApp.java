package com.eomcs.pms;

import java.net.ServerSocket;
import java.net.Socket;
<<<<<<< HEAD
import java.util.Collection;
import java.util.HashMap;
import com.eomcs.pms.table.BoardTable;
import com.eomcs.pms.table.JsonDataTable;
import com.eomcs.pms.table.MemberTable;
=======
import java.util.HashMap;
import com.eomcs.pms.table.BoardTable;
import com.eomcs.pms.table.MemberTable;
import com.eomcs.pms.table.ProjectTable;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.eomcs.server.DataProcessor;
import com.eomcs.server.RequestProcessor;

public class ServerApp {

  public static void main(String[] args) throws Exception {
    System.out.println("[PMS 서버]");

    System.out.println("서버 실행중");
    ServerSocket serverSocket = new ServerSocket(8888);

<<<<<<< HEAD
    Socket socket = serverSocket.accept();
    System.out.println("클라이언트가 접속했음");

=======
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
    // RequestProcessor 가 사용할 DataProcessor 맵 준비
    HashMap<String,DataProcessor> dataProcessorMap = new HashMap<String,DataProcessor>();

    // => 데이터 처리 담당자를 등록한다.
    dataProcessorMap.put("board.", new BoardTable());
    dataProcessorMap.put("member.", new MemberTable());
<<<<<<< HEAD

    RequestProcessor requestProcessor = new RequestProcessor(socket, dataProcessorMap);
    requestProcessor.service();
    requestProcessor.close();


    // => 데이터를 파일에 저장한다.
    Collection<DataProcessor> dataProcessors = dataProcessorMap.values();
    for (DataProcessor dataProcessor : dataProcessors) {
      if (dataProcessor instanceof JsonDataTable) {
        // 만약 데이터 처리 담당자가 JsonDataTable 의 자손이라면,
        ((JsonDataTable<?>)dataProcessor).save();
      }
    }

    System.out.println("서버 종료");
    serverSocket.close();
=======
    dataProcessorMap.put("project.", new ProjectTable());

    while (true) {
      Socket socket = serverSocket.accept();
      System.out.println("클라이언트 접속");

      // 1) 새 실행 흐름 생성
      RequestProcessor requestProcessor = new RequestProcessor(socket, dataProcessorMap);

      // 2) 새로 생성한 실행 흐름을 시작시킨다.
      // => run()이 호출될 것이다.
      // => 시작시킨 후 즉시 리턴한다. 
      //    즉 새로 생성한 실행 흐름이 종료될 때까지 기다리지 않는다.
      requestProcessor.start();
    }

    //    System.out.println("서버 종료");
    //    serverSocket.close();
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
  }
}












