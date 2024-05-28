public abstract class RequestCreator {
    public Request createRequest(){
        return null;
    }
    public Request processRequest(String priority,String expireDay,String status){
        return new Request(priority, expireDay, status);

    }

}
