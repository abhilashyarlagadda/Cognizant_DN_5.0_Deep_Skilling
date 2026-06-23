public class Logger {
    private static Logger instance;
    private Logger(){
        System.out.println("Singleton Instance Created");
    }
    public static Logger getInstance()
    {
        if(instance ==null){
            instance =new Logger();
        }
        return instance;
    }
    public void display1()
    {
        System.out.println("Logger1 is Active");
    }
    public void display2()
    {
        System.out.println("Logger2 is Active");
    }

}
