package com.aride;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger log = Logger.getLogger(App.class);
    public static void main( String[] args ) throws InterruptedException
    {
        log.info("starting the application..." );

        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                log.info("received shutdown signal");
                SharedState.receivedShutdownSignal = true;
                try
                {
                    log.info("preparing for shutdown...");
                    // application shutdown activity goes here
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                log.info("exiting  the application...");
            }
        });

        while(!SharedState.receivedShutdownSignal)
        {
            Thread.sleep(2000);
            log.info("application is running");
        }

    }
}
