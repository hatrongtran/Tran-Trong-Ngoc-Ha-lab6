public class highPriorityConcreteCreator extends RequestCreator {

    @Override
    public Request createRequest() {
      highPriorityConcrete request = new highPriorityConcrete();
     
      request.setExpire();;
      request.setPriority();
      request.setStatus();
      return new Request(request.getPriority(), request.getExpireDay(),request.getStatus());
    }

 

}
