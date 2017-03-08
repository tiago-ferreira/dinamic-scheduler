package io.redspark.dinamic.scheduler;

import java.time.LocalDateTime;

public class JobSchedulerBuilder {
	
	private JobScheduler jobScheduler = new JobScheduler();
	private final Person person;
	
	public JobSchedulerBuilder(final Person person) {
		this.person = person;
	}
	
	public void morning() {
		String greetings = "Good morning, ";
		LocalDateTime today = LocalDateTime.now().plusMinutes(1);
		jobScheduler.schedule(person, greetings, today.getHour(), today.getMinute());
	}
	
	public void afternoon() {
		String greetings = "Good Afternoon, ";
		LocalDateTime today = LocalDateTime.now().plusMinutes(1);
		jobScheduler.schedule(person, greetings, today.getHour(), today.getMinute());
	}
	
	public void night() {
		String greetings = "Good night, ";
		LocalDateTime today = LocalDateTime.now().plusMinutes(1);
		jobScheduler.schedule(person, greetings, today.getHour(), today.getMinute());
	}
}
