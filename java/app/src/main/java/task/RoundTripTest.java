package task;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
//import de.hbrs.ia.model.SalesMan;
import org.bson.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mongodb.client.model.Filters.eq;
import static org.junit.jupiter.api.Assertions.assertEquals;
<<<<<<< HEAD
import java.util.ArrayList;
=======

>>>>>>> 7f97fdbfddd3aff77f8f06d627e187d75da0060d
class RoundTripTest {

    private MongoClient client;
    private MongoDatabase db_task1;
    private MongoCollection<Document> salesmen;
    MongoCollection<Document> evaluationRecordDB;
    MongoCollection<Document> salesmenDB;
    ManagePersonalImpl managePersonal;
    SalesMan salesMan;

    /**
     * Attention: You might update the version of the Driver
     * for newer version of MongoDB!
     * This tests run with MongoDB 4.2.17 Community
     */
    @BeforeEach
    void setUp() {
<<<<<<< HEAD
////        try (MongoClient client = new MongoClient("localhost", 27017);) {
//        client = new MongoClient("localhost", 27017);
//        db_task1 = client.getDatabase("db_task1");
//        evaluationRecordDB = db_task1.getCollection("EvaluationRecord");
//        salesmenDB = db_task1.getCollection("SalesMen");
//        managePersonal = new ManagePersonalImpl();
//        salesMan = new SalesMan("Dominik", "Ocsofszki", 90133);
//        final SocialAttribute socialAttribute = new SocialAttribute("better next time", 5, 4);
//        final SocialPerfomanceRecord socialPerfomanceRecord = new SocialPerfomanceRecord(socialAttribute, 2_000);
//        final Order order = new Order("HooverGo", "TKMax", "A", 200, 20, "last year we had 10 more sold");
//        final Order order2 = new Order("HooverGo", "TKMax", "A", 200, 20, "last year we had 10 more sold");
//        ArrayList<Order> orders = new ArrayList();
//        orders.add(order);
//        orders.add(order);
//        final OrderEvaluation orderEvaluation = new OrderEvaluation(orders, 1_000);
//        final EvaluationRecord evaluationRecord = new EvaluationRecord(socialPerfomanceRecord, orderEvaluation, 1, 3_000, 2023);
//        managePersonal._dropAllSalesMan();
=======
//        try (MongoClient client = new MongoClient("localhost", 27017);) {
        client = new MongoClient("localhost", 27017);
        db_task1 = client.getDatabase("db_task1");
        evaluationRecordDB = db_task1.getCollection("EvaluationRecord");
        salesmenDB = db_task1.getCollection("SalesMen");
        managePersonal = new ManagePersonalImpl();
        salesMan = new SalesMan("Dominik", "Ocsofszki", 90133);
        final SocialAttribute socialAttribute = new SocialAttribute("better next time", 5, 4);
        final SocialPerfomanceRecord socialPerfomanceRecord = new SocialPerfomanceRecord(socialAttribute, 2_000);
        final Order order = new Order("HooverGo", "TKMax", "A", 200, 20, "last year we had 10 more sold");
        final OrderEvaluation orderEvaluation = new OrderEvaluation(order, 1_000);
        final EvaluationRecord evaluationRecord = new EvaluationRecord(socialPerfomanceRecord, orderEvaluation, 1, 3_000, 2023);
        managePersonal._dropAllSalesMan();
>>>>>>> 7f97fdbfddd3aff77f8f06d627e187d75da0060d
    }

    @Test
    void insertSalesMan() {


        // READ (Finding) the stored Documnent
        Document newDocument = this.salesmenDB.find().first();
        System.out.println("Printing the object (JSON): " + newDocument);
        salesMan = new SalesMan("Dominik", "Ocsofszki", 90133);
        managePersonal.createSalesMan(salesMan);
        SalesMan docSalesMan = managePersonal.readSalesMan(90133);

        // Assertion
//        Integer id = (Integer) newDocument.get("id");
        assertEquals(90133, docSalesMan.id);
        // Deletion
//        salesmen.drop();
    }

//    @Test
//    void insertSalesManMoreObjectOriented() {
//        // CREATE (Storing) the salesman business object
//        // Using setter instead
//        SalesMan salesMan = new SalesMan("Leslie", "Malton", 90444);
//
//        // ... now storing the object
//        salesmen.insertOne(salesMan.toDocument());
//
//        // READ (Finding) the stored Documnent
//        // Mapping Document to business object would be fine...
//        Document newDocument = this.salesmen.find().first();
//        System.out.println("Printing the object (JSON): " + newDocument);
//
//        // Assertion
//        Integer id = (Integer) newDocument.get("id");
//        assertEquals(90444, id);
//
//        // Deletion
//        salesmen.drop();
//    }
}