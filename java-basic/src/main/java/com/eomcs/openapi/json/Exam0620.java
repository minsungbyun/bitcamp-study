// JSON 문자열 --> 객체 : 다른 객체를 여러 개 포함하는 경우
package com.eomcs.openapi.json;

import java.lang.reflect.Type;
import java.util.Collection;
import com.google.gson.Gson;
<<<<<<< HEAD
=======
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e
import com.google.gson.reflect.TypeToken;

public class Exam0620 {
  public static void main(String[] args) {

    String jsonStr = "[{\"position\":\"대리\",\"fax\":\"02-1111-2222\",\"no\":101,\"name\":\"홍길동\",\"email\":\"hong@test.com\",\"registeredDate\":\"9월 16, 2021\"},{\"major\":\"컴퓨터공학\",\"hourPay\":10000,\"no\":103,\"name\":\"안창호\",\"email\":\"ahn@test.com\",\"registeredDate\":\"9월 16, 2021\"}]";

<<<<<<< HEAD
    Type collectionType = TypeToken.getParameterized(Collection.class, Member.class).getType();
    Collection<Member> list = new Gson().fromJson(jsonStr, collectionType);
=======
    Gson gson = new GsonBuilder()
        .registerTypeAdapter(Member.class, new JsonDeserializer<Member>() {
          @Override
          public Member deserialize(JsonElement json, Type typeOfT,
              JsonDeserializationContext context) throws JsonParseException {

            JsonObject jsonObject = json.getAsJsonObject();

            if (jsonObject.get("position") != null) {
              return context.deserialize(jsonObject, Manager.class);
            } else {
              return context.deserialize(jsonObject, Teacher.class);
            }
          }
        })
        .create();


    Type collectionType = TypeToken.getParameterized(Collection.class, Member.class).getType();
    Collection<Member> list = gson.fromJson(jsonStr, collectionType);
>>>>>>> 886ee553016373303f00227ad3df6ce8b9a8886e

    for (Member m : list) {
      System.out.println(m);
    }
  }
}





