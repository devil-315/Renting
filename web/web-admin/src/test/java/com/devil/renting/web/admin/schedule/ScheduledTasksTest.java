package com.devil.renting.web.admin.schedule;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName：ScheduledTasksTest
 *
 * @author: Devil
 * @Date: 2025/2/1
 * @Description:
 * @version: 1.0
 */
@SpringBootTest
class ScheduledTasksTest {
    @Autowired
    private ScheduledTasks scheduledTasks;
    @Test
    public void test(){
        scheduledTasks.checkLeaseStatus();
    }
}