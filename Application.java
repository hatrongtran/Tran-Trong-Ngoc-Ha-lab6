public class Application {
    public static void main(String[] args) {
        lowPriorityConcreteCreator reqCreator = new lowPriorityConcreteCreator();
        Request request = reqCreator.createRequest();
        System.out.println(request.getStatus());
    }

}
