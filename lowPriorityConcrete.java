public class lowPriorityConcrete implements requestProductBuilder {

    private String priority;
    private String expireDay;
    private String status;
 
    @Override
    public void setExpire() {
       this.expireDay="28/05/2024";
        
    }
    @Override
    public void setPriority() {
       this.priority="Ignore";
        
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getExpireDay() {
        return expireDay;
    }
    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public void setStatus() {
        this.status="Done";
        
    }
    @Override
    public void processRequest() {
       System.out.println("Request denied");
    }
    

}
