package restAaauredTest;

import io.restassured.path.json.JsonPath;


import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class Reqres {

    /*
    given() -- (precondition) We keep BaseURI,header,query parameter,authentication
    when() -- (Action)the get/post/put/delete Method with endpoints + body(payload)
    then() -- (Validation) We can log all in the response body + we can extract...


    Q/A -- What is Serializatiion?
    Ans: Converting Java object into Json object, we use Jackson-Databind dependency to
    convert java to json.

    Q/A -- What is Deserialization?
    Ans: Converting Json Response to Java Object

     */

public void listUsers(){
    Response res = given()
            .baseUri("https://reqres.in")
            .queryParam("page",2)
            .when()  //Action
            .get("/api/users")
            .then()
         //   .log()
         //   .all()
            .assertThat()
            .statusCode(200)
            .extract().response();

            /*
            We have to parse the data after extraction...
            For data parsing tool (break the code), I use is called JsonPath.
            JsonPath is a class from restAssured
             */
    JsonPath js = res.jsonPath(); // JsonPath will break/parse the response

    String number = js.getString("page");
    // System.out.println(number);
   // Assert.assertEquals("3",number);

    SoftAssert soft = new SoftAssert();

    soft.assertEquals(number,2);

    String total = js.getString("total");
    soft.assertEquals(total,11);

    System.out.println("Ending of soft assert");
    soft.assertAll();
}


public void singleUser(){
    given()
            .baseUri("https://reqres.in")

            .when()
            .get("/api/users/2")
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(200);
}


public void singleUserNotFound(){
    given()
            .baseUri("https://reqres.in")

            .when()
            .get("/api/users/23")
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(404);
}


public void listResouces(){
    given()
            .baseUri("https://reqres.in")

            .when()
            .get("/api/unknown")
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(200);
}

public void createUsingJsonFile(){
    given()    //pre-condition
            .baseUri("https://reqres.in")
            .when()
            .body(new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\main\\resources\\reqresPayload.json"))
            .post("/api/users")  //Action (means I am clicking send button and getting response)
            .then() //validation
            .log().body()
            .assertThat()
            .statusCode(201);
}

public void createUsingHashMap(){
    Map<String, String> user = new HashMap<>();

    user.put("name","morpheus");
    user.put("job","leader");

    given()    //pre-condition
            .baseUri("https://reqres.in")
            .when()
            .body(user)
            //.body(new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\main\\resources\\reqresPayload.json"))
            .post("/api/users")  //Action (means I am clicking send button and getting response)
            .then() //validation
            .log().body()
            .assertThat()
            .statusCode(201);
}

public void registerSuccessful(){
    given()
            .baseUri("https://reqres.in")

            .when()
            .body(new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\main\\resources\\registerSuccessful.json"))
            .post("/api/register")
            .then()
            .log().body()
            .assertThat()
            .statusCode(200);


}

public void registerUnsuccessful(){
    given()
            .baseUri("https://reqres.in")
            .when()
            .body(new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\main\\resources\\reqresPayload.json"))
            .post("/api/register")
            .then()
            .log().all()
            .assertThat()
            .statusCode(400);
}
@Test
public void loginSuccessful(){
    given()
            .baseUri("https://reqres.in")
            .when()
            .body(new File("C:\\Users\\razia\\IdeaProjects\\My_Cucumber_Project\\src\\main\\resources\\loginSuccessful.json"))
            .post("/api/login")
            .then()
            .log().body()
            .assertThat()
            .statusCode(200);
}
}
