// begin scram connection
import org.mongodb.scala._

val uri: String = "mongodb+srv://<username>:<password>@<cluster-url>/test?retryWrites=true&w=majority"
System.setProperty("org.mongodb.async.type", "netty")
val client: MongoClient = MongoClient(uri)
val db: MongoDatabase = client.getDatabase("test")
// end scram connection