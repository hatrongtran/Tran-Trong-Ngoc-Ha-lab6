public class midPriorityConcreteCreator extends RequestCreator {

    @Override
    public Request createRequest() {
      midPriorityConcrete request = new midPriorityConcrete();
     
      request.setExpire();;
      request.setPriority();
      request.setStatus();
      return new Request(request.getPriority(), request.getExpireDay(),request.getStatus());
    }

 

}
