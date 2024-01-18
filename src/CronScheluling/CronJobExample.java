//package CronScheluling;
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//
//public class CronJobExample {
//
//    public static void main(String[] args) throws SchedulerException {
//        // Create a Scheduler
//        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        scheduler.start();
//
//        // Define the job and tie it to our MyJob class
//        JobDetail job = JobBuilder.newJob(MyJob.class)
//                .withIdentity("myJob", "group1")
//                .build();
//
//        // Define a Trigger that will fire every day at 10:30 AM
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("myTrigger", "group1")
//                .withSchedule(CronScheduleBuilder.cronSchedule("0 30 10 * * ?"))
//                .build();
//
//        // Tell quartz to schedule the job using our trigger
//        scheduler.scheduleJob(job, trigger);
//    }
//
//    public static class MyJob implements Job {
//        @Override
//        public void execute(JobExecutionContext context) throws JobExecutionException {
//            // Your job logic goes here
//            System.out.println("Job executed at " + System.currentTimeMillis());
//        }
//    }
//}
