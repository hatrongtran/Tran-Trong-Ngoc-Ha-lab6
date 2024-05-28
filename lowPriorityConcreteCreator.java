public class lowPriorityConcreteCreator extends RequestCreator {

    @Override
    public Request createRequest() {
      lowPriorityConcrete request = new lowPriorityConcrete();
     
      request.setExpire();;
      request.setPriority();
      request.setStatus();
      return new Request(request.getPriority(), request.getExpireDay(),request.getStatus());
    }

 

}
