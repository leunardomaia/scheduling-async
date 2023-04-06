package org.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    private static final Logger log = LoggerFactory.getLogger(SchedulerService.class);

    @Async
    public void async() {
        try {
            Thread.sleep(4000);
            System.out.println();
            log.info("Async task done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sync() {
        try {
            Thread.sleep(4000);
            log.info("Sync task done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
