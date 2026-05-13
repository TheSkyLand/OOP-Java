void main() {
    boolean result = false;

Logger logger = Logger.getLogger();

Logger logger2 = Logger.getLogger();

if(logger == logger2)
{
    result = true;
    logger.Output("true");
}

logger.Output("HI!");
}

public static class Logger {
    private static Logger logger = null;

    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    //приватный конструктор
    public void Output(String message) {
        System.out.println("[LOG] " + message);
    }
}