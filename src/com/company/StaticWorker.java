package com.company;

public final class StaticWorker {
    public  static StaticWorker staticWorkerInstance;
    public static int ID;
    public static String name;
    public static String company;
    public static String job;
    public static String type;
    public static double salary;

    private StaticWorker(int ID,String name,String company,String job,String type,double salary){
        this.ID = ID;
        this.name =name;
        this.company=company;
        this.job=job;
        this.type=type;
        this.salary=salary;
    }

    static
    {

        staticWorkerInstance = new StaticWorker(ID, name, company, job, type, salary);
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company=company;
    }
    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job=job;
    }
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public String toString(){
        return "StaticWorker{"+ "ID=" +ID +", name=" +name+", company=" +company+ ", job="+ job + ", type=" +type+", salary=" +salary+"}";
    }
}
