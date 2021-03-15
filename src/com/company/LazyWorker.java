package com.company;

public final class LazyWorker {
    private static LazyWorker lazyWorkerInstance;
    public int ID;
    public String name;
    public String company;
    public String job;
    public String type;
    public double salary;

 private LazyWorker(int ID,String name,String company,String job,String type,double salary){
     this.ID = ID;
     this.name =name;
     this.company=company;
     this.job=job;
     this.type=type;
     this.salary=salary;
 }

 public static LazyWorker getInstance(int ID,String name,String company,String job,String type,double salary){
     if (lazyWorkerInstance == null){
        lazyWorkerInstance = new LazyWorker(ID, name, company, job, type, salary);
     }
     return lazyWorkerInstance;
 }
@Override
    public String toString(){
     return "LazyWorker{"+ "ID=" +ID +", name=" +name+", company=" +company+ ", job="+ job + ", type=" +type+", salary=" +salary+"}";
    }
}
