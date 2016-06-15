import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import freemarker.template.Template;
import org.bson.Document;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by kavita on 14/6/16.
 */
public class TempTest {
    public static void main(String[] args) {


        Spark.get(new Route("/") {
                      @Override
                      public Object handle(final Request request,
                                           final Response response) {
                          MongoClient client = new MongoClient();
                          MongoDatabase database = client.getDatabase("school");
                          final MongoCollection<Document> collection = database.getCollection("students");
                          for (Document cur : collection.find()) {
                              List<Document> arr = (List<Document>) cur.get("scores");
                              Document homework1 = arr.get(2);
                              Document homework2 = arr.get(3);
                              int i = 2;
                              i = (Double) homework1.get("score") < (Double) homework2.get("score") ? i : 3;
                              arr.remove(i);
                              collection.updateOne(new Document("_id", cur.get("_id")), new Document("$set", new Document("scores", arr)));

                          }

                          for (Document cur : collection.find()) {
                              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>??????");
                              System.out.println(cur);
                          }
                          return "";
                      }
                  }

        );

    }
}
