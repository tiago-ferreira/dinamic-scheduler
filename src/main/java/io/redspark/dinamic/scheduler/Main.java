package io.redspark.dinamic.scheduler;

import org.quartz.SchedulerException;

public class Main {

	public static void main(String[] args) throws SchedulerException {
		Person person = new Person("Tiago");
		JobSchedulerBuilder jobSchedulerBuilder = new JobSchedulerBuilder(person);
		jobSchedulerBuilder.morning();
		jobSchedulerBuilder.afternoon();
		jobSchedulerBuilder.night();
	}
}
