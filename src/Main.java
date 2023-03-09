import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is an example");

        // Skapa ett JSON object
        JSONObject jsonOb = new JSONObject();

        //Spara väeswn u JSONobject
        jsonOb.put("namn", "Marcus");
        jsonOb.put("age", 34);

        //Skriva ut värden
        System.out.println("Mitt namn är " + jsonOb.get("namn"));
        System.out.println("Jag är " + jsonOb.get("age") + " år gammal");
    }
}